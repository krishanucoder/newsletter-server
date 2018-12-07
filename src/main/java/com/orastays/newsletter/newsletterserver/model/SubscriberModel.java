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
public class SubscriberModel extends CommonModel {

	private String subId;
	private String emailId;
	private String name;
	private List<SubscriberVsNewsletterLogModel> subscriberVsNewsletterLogModels;

}
