package com.orastays.newsletter.newsletterserver.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_newsletter")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class NewsletterEntity extends CommonEntity {

	private static final long serialVersionUID = 8933116961411371435L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "newsletter_id")
	private Long newsletterId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "language_id")
	private Long languageId;

	@Column(name = "parent_id")
	private Long parentId;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "newsletterEntity", cascade = { CascadeType.ALL })
	private List<NewsletterVsImageEntity> newsletterVsImageEntities;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "newsletterEntity", cascade = { CascadeType.ALL })
	private List<SubscriberVsNewsletterLogEntity> subscriberVsNewsletterLogEntities;

	@Override
	public String toString() {
		return Long.toString(newsletterId);

	}
}
