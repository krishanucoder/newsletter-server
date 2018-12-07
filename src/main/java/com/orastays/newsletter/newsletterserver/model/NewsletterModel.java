package com.orastays.newsletter.newsletterserver.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class NewsletterModel extends CommonModel {

	private String newsletterId;
	private String title;
	private String description;
	private String languageId;
	private String parentId;
	private List<NewsletterVsImageModel> newsletterVsImageModels;
	private List<SubscriberVsNewsletterLogModel> subscriberVsNewsletterLogModels;

}
