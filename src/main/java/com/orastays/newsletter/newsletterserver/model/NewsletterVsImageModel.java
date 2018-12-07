package com.orastays.newsletter.newsletterserver.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class NewsletterVsImageModel extends CommonModel {

	private String nliId;
	private String imageUrl;
	private NewsletterModel newsletterModel;

}
