package io.onedev.server.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;

@Entity
@Table(indexes={
		@Index(columnList="o_issue_id"), @Index(columnList="o_user_id")})
public class IssueComment extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	public static final int MAX_CONTENT_LEN = 15000;
	
	public static final String PROP_CONTENT = "content";
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Issue issue;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=false)
	private User user;
	
	@Column(nullable=false)
	private Date date = new Date();
	
	@Column(nullable=false, length=MAX_CONTENT_LEN)
	private String content;

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = StringUtils.abbreviate(content, MAX_CONTENT_LEN);
	}

	public String getAnchor() {
		return getClass().getSimpleName() + "-" + getId();
	}

}
