package io.onedev.server.web.behavior.sortable;

import javax.annotation.Nullable;

import org.apache.wicket.Component;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.attributes.AjaxRequestAttributes;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnLoadHeaderItem;
import org.apache.wicket.request.cycle.RequestCycle;

import io.onedev.server.web.asset.jqueryui.JQueryUIResourceReference;
import io.onedev.server.web.behavior.AbstractPostAjaxBehavior;

public abstract class SortBehavior extends AbstractPostAjaxBehavior {

	private static final long serialVersionUID = 1L;

	private String sortable;
	
	private String handle;
	
	private String items;
	
	private String connectWith;
	
	private String placeholder;
	
	private int distance = 5;
	
	private String startScript;
	
	private String changeFunction;
	
	private String updateFunction;
	
	private String stopScript;
	
	private String helperClass;
	
	private String listIndex = "ui.item.parent().index()";
	
	private String itemIndex = "ui.item.index()";

	public SortBehavior connectWith(String connectWith) {
		this.connectWith = connectWith;
		return this;
	}
	
	public SortBehavior handle(String handle) {
		this.handle = handle;
		return this;
	}
	
	public SortBehavior items(String items) {
		this.items = items;
		return this;
	}
	
	public SortBehavior placeholder(String placeholder) {
		this.placeholder = placeholder;
		return this;
	}
	
	public SortBehavior startScript(String startScript) {
		this.startScript = startScript;
		return this;
	}
	
	public SortBehavior changeFunction(String changeFunction) {
		this.changeFunction = changeFunction;
		return this;
	}
	
	public SortBehavior updateFunction(String updateFunction) {
		this.updateFunction = updateFunction;
		return this;
	}
	
	public SortBehavior stopScript(String stopScript) {
		this.stopScript = stopScript;
		return this;
	}
	
	public SortBehavior helperClass(String helperClass) {
		this.helperClass = helperClass;
		return this;
	}
	
	public SortBehavior listIndex(String listIndex) {
		this.listIndex = listIndex;
		return this;
	}
	
	public SortBehavior itemIndex(String itemIndex) {
		this.itemIndex = itemIndex;
		return this;
	}
	
	public SortBehavior sortable(@Nullable String sortable) {
		this.sortable = sortable;
		return this;
	}
	
	public SortBehavior sortable() {
		return sortable(null);
	}
	
	public SortBehavior distance(int distance) {
		this.distance = distance;
		return this;
	}

	protected abstract void onSort(AjaxRequestTarget target, SortPosition from, SortPosition to);

	@Override
	protected void updateAjaxAttributes(AjaxRequestAttributes attributes) {
		super.updateAjaxAttributes(attributes);
		
		attributes.getDynamicExtraParameters().add("return {"
				+ "'fromList': fromList, "
				+ "'toList': toList, "
				+ "'fromItem': fromItem, "
				+ "'toItem': toItem}");
	}

	@Override
	public boolean getStatelessHint(Component component) {
		return false;
	}

	@Override
	protected void respond(AjaxRequestTarget target) {
		int fromList = RequestCycle.get().getRequest().getPostParameters()
				.getParameterValue("fromList").toInt();
		int fromItem = RequestCycle.get().getRequest().getPostParameters()
				.getParameterValue("fromItem").toInt();
		int toList = RequestCycle.get().getRequest().getPostParameters()
				.getParameterValue("toList").toInt();
		int toItem = RequestCycle.get().getRequest().getPostParameters()
				.getParameterValue("toItem").toInt();
		if (fromList != toList || fromItem != toItem) {
			onSort(target, new SortPosition(fromList, fromItem), new SortPosition(toList, toItem));
			String script = String.format("onedev.server.form.markDirty($('#%s').closest('form.leave-confirm'));", 
					getComponent().getMarkupId(true));
			target.appendJavaScript(script);
			
			for (Component each: target.getComponents()) {
				if (each == getComponent()) {
					target.appendJavaScript(getSortScript());
					break;
				}
				if (each instanceof MarkupContainer) {
					MarkupContainer container = (MarkupContainer) each;
					if (container.contains(getComponent(), true)) {
						target.appendJavaScript(getSortScript());
						break;
					}
				}
			}
		}
	}

	@Override
	public void renderHead(Component component, IHeaderResponse response) {
		super.renderHead(component, response);
		response.render(JavaScriptHeaderItem.forReference(new JQueryUIResourceReference()));
		response.render(CssHeaderItem.forReference(new SortableCssResourceReference()));
		response.render(OnLoadHeaderItem.forScript(getSortScript()));
	}
	
	private String getSortScript() {
		StringBuffer script = new StringBuffer();
		script.append("var container=$('#" + getComponent().getMarkupId() + "');");
		if (sortable != null) 
			script.append("container=container.find('" + sortable + "');");
		script.append("container.sortable({");
		if (handle != null)
			script.append("handle:'" + handle + "',");
		if (items != null)
			script.append("items:'" + items + "',");
		if (connectWith != null)
			script.append("connectWith:'" + connectWith + "',");
		script.append("distance:" + distance + ",");
		script.append("cursor:'move',");
		if (placeholder != null)
			script.append("placeholder:'" + placeholder + "',");
		if (helperClass != null)
			script.append("helper:function(event,item){return item.addClass('" + helperClass + "');},");
		script.append("start:function(event,ui) {" +
				"ui.item.fromList=" + listIndex + ";" +
				"ui.item.fromItem=" + itemIndex + ";");
		if (startScript != null) 
			script.append(startScript);
		script.append("},");
		if (changeFunction != null)
			script.append("change:" + changeFunction + ",");
		if (updateFunction != null)
			script.append("update:" + updateFunction + ",");
		script.append("stop:function(event, ui) {");
		if (helperClass != null)
			script.append("ui.item.removeClass('" + helperClass + "');");			
		script.append("var fromList=ui.item.fromList; var fromItem=ui.item.fromItem;" +
				"var toList=" + listIndex + "; var toItem=" + itemIndex + ";" +
				"ui.item.toList = toList; ui.item.toItem = toItem;" + 
				getCallbackScript() + ";");
		if (stopScript != null)
			script.append(stopScript);
		script.append("}});");
		
		return script.toString();
	}
	
}
