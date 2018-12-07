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
@Table(name = "master_subscriber")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SubscriberEntity extends CommonEntity {

	private static final long serialVersionUID = 114747539166795015L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sub_id")
	private Long subId;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "name")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subscriberEntity", cascade = { CascadeType.ALL })
	private List<SubscriberVsNewsletterLogEntity> subscriberVsNewsletterLogEntities;

	@Override
	public String toString() {
		return Long.toString(subId);

	}
}
