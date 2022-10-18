package io.onedev.server.web.component.pullrequest.review;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebComponent;
import org.apache.wicket.model.LoadableDetachableModel;

import io.onedev.server.model.PullRequestReview.Status;
import io.onedev.server.web.asset.icon.IconScope;
import io.onedev.server.web.component.svg.SpriteImage;

@SuppressWarnings("serial")
public abstract class ReviewStatusIcon extends WebComponent {
	
	private final boolean opposite;
	
	public ReviewStatusIcon(String id, boolean opposite) {
		super(id);
		this.opposite = opposite;
	}

	@Override
	public void onComponentTagBody(final MarkupStream markupStream, final ComponentTag openTag) {
		String icon;
		String cssClass = "icon review-status review-status-";
		if (getStatus() == Status.PENDING) {
			icon = opposite?"clock-o":"clock";
			cssClass += "pending";
		} else if (getStatus() == Status.APPROVED) {
			icon = opposite?"tick-circle-o":"tick-circle";
			cssClass += "approved";
		} else {
			icon = opposite?"diff-o":"diff";
			cssClass += "request-for-changes";
		}
		
		String versionedIcon = SpriteImage.getVersionedHref(IconScope.class, icon);

		replaceComponentTagBody(markupStream, openTag, 
				String.format("<svg class='%s'><use xlink:href='%s'></use></svg>", cssClass, versionedIcon));
	}
	
	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(AttributeAppender.append("title", new LoadableDetachableModel<String>() {

			@Override
			protected String load() {
				switch (getStatus()) {
				case PENDING:
					return "Pending review";
				case APPROVED:
					return "Approved";
				case REQUESTED_FOR_CHANGES:
					return "Requested for changes";
				default:
					throw new IllegalStateException("Unexpected review status: " + getStatus());
				}
			}
			
		}));
		
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		response.render(CssHeaderItem.forReference(new ReviewCssResourceReference()));
	}

	protected abstract Status getStatus();
	
}
