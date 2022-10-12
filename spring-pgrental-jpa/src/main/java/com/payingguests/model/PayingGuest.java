package com.payingguests.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PayingGuest {
	@Id
	@Column(name="pgId")
	private Integer payingGuestId;
	@Column(name="pgName")
	private String payingGuestName;
	private String location;
	private String category;

	public PayingGuest() {
		super();
	}

	public PayingGuest(Integer payingGuestId, String payingGuestName, String location, String category) {
		super();
		this.payingGuestId = payingGuestId;
		this.payingGuestName = payingGuestName;
		this.location = location;
		this.category = category;
	}

	public Integer getPayingGuestId() {
		return payingGuestId;
	}

	public void setPayingGuestId(Integer payingGuestId) {
		this.payingGuestId = payingGuestId;
	}

	public String getPayingGuestName() {
		return payingGuestName;
	}

	public void setPayingGuestName(String payingGuestName) {
		this.payingGuestName = payingGuestName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "PayingGuest [payingGuestId=" + payingGuestId + ", payingGuestName=" + payingGuestName + ", location="
				+ location + ", category=" + category + "]";
	}

}
