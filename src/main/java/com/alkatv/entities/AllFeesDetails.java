package com.alkatv.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AllFeesDetails {

	// CREATE MEMORY TABLE PUBLIC.ALL_FEES_DETAILS(ID INTEGER,YEAR INTEGER,MONTH
	// VARCHAR(200),FEES_INSERTION_DATE DATE,FEES_PAID INTEGER,DISCOUNT
	// INTEGER,MONTH_SEQUENCE integer,PRIMARY KEY(ID,YEAR, MONTH),CONSTRAINT
	// FK_ALL_FEES_DETAILS_USER FOREIGN KEY(ID) REFERENCES PUBLIC.USER(ID));

	@EmbeddedId
	private AllFeesDetailsPK allFeesDetailsPK;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FEES_INSERTION_DATE")
	private Date feesInsertionDate;
	
	@Column(name="FEES_PAID")
	private String feesPaid;
	
	@Column(name="DISCOUNT")
	private Integer discount;
	
	@Column(name="MONTH_SEQUENCE")
	private Integer monthSequence;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "id", name = "id", nullable = false)
	private User user;
	
	
	public Date getFeesInsertionDate() {
		return feesInsertionDate;
	}

	public String getFeesPaid() {
		return feesPaid;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setFeesInsertionDate(Date feesInsertionDate) {
		this.feesInsertionDate = feesInsertionDate;
	}

	public void setFeesPaid(String feesPaid) {
		this.feesPaid = feesPaid;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getMonthSequence() {
		return monthSequence;
	}

	public void setMonthSequence(Integer monthSequence) {
		this.monthSequence = monthSequence;
	}

	public AllFeesDetailsPK getAllFeesDetailsPK() {
		return allFeesDetailsPK;
	}

	public void setAllFeesDetailsPK(AllFeesDetailsPK allFeesDetailsPK) {
		this.allFeesDetailsPK = allFeesDetailsPK;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
