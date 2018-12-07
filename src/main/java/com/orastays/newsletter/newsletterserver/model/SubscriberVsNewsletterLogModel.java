package com.orastays.newsletter.newsletterserver.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class SubscriberVsNewsletterLogModel extends CommonModel {

	private String snlId;
	private NewsletterModel newsletterModel;
	private SubscriberModel subscriberModel;

}
