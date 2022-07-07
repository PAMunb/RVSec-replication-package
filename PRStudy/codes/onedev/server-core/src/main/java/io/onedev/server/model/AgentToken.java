package io.onedev.server.model;

import static io.onedev.server.model.AgentToken.PROP_VALUE;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(indexes={@Index(columnList=PROP_VALUE)})
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class AgentToken extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;

	public static final String PROP_VALUE = "value";
	
	@OneToMany(mappedBy="token")
	private Collection<Agent> agents;
	
	@Column(nullable=false, unique=true)
	private String value;
	
	public Collection<Agent> getAgents() {
		return agents;
	}

	public void setAgents(Collection<Agent> agents) {
		this.agents = agents;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
