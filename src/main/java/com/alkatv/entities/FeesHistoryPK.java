package com.alkatv.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class FeesHistoryPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1218038792914512542L;

	@Temporal(TemporalType.DATE)
	@Column(name = "FROM_DATE")
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "TO_DATE")
	private Date toDate;

	@Column(name = "FEES")
	private Integer fees;

	public Date getFromDate() {
		return fromDate;
	}

	public Date getToDate() {
		return toDate;
	}


	public Integer getFees() {
		return fees;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fees == null) ? 0 : fees.hashCode());
		result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeesHistoryPK other = (FeesHistoryPK) obj;
		if (fees == null) {
			if (other.fees != null)
				return false;
		} else if (!fees.equals(other.fees))
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}

}
