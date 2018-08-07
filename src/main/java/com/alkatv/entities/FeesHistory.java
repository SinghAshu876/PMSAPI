package com.alkatv.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class FeesHistory {

	// CREATE MEMORY TABLE PUBLIC.FEES_HISTORY(ID INTEGER,FROM_DATE DATE,TO_DATE
	// DATE, FEES INTEGER,CONSTRAINT FK_FEES_HISTORY_USER FOREIGN KEY(ID) REFERENCES
	// PUBLIC.USER(ID));

	// NOTE :If your table has no unique columns at all, you can use all of the
	// columns as the Id.

	@EmbeddedId
	private FeesHistoryPK feesHistoryPK;

	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "id")
	private User user;

	/** DUMMY PROPERTIES TO HOLD EXTRACTED VALUE */
	@Transient
	private Integer fromYear;
	@Transient
	private Integer toYear;
	@Transient
	private Integer toMonth;
	@Transient
	private Integer fromMonth;

	public Integer getFromYear() {
		return fromYear;
	}

	public void setFromYear(Integer fromYear) {
		this.fromYear = fromYear;
	}

	public Integer getToYear() {
		return toYear;
	}

	public void setToYear(Integer toYear) {
		if (toYear.intValue() == 0) {
			this.toYear = null;
		} else {
			this.toYear = toYear;
		}

	}

	public Integer getToMonth() {
		return toMonth;
	}

	public void setToMonth(Integer toMonth) {
		if (toMonth.intValue() == 0) {
			this.toMonth = null;
		} else {
			this.toMonth = toMonth;
		}
	}

	public Integer getFromMonth() {
		return fromMonth;
	}

	public void setFromMonth(Integer fromMonth) {
		this.fromMonth = fromMonth;
	}

	public FeesHistoryPK getFeesHistoryPK() {
		return feesHistoryPK;
	}

	public void setFeesHistoryPK(FeesHistoryPK feesHistoryPK) {
		this.feesHistoryPK = feesHistoryPK;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
