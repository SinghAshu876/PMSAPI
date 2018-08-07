package com.alkatv.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author ashutosh.tct@gmail.com
 * 
 */
@Entity(name = "DISCO_RECO_DETAILS")
public class DisconnectReconnectDetails {

	// CREATE MEMORY TABLE PUBLIC.DISCO_RECO_DETAILS(ID VARCHAR(200) PRIMARY
	// KEY,USERID INTEGER,DODC DATE,DORC DATE,CONSTRAINT FK_DISCO_RECO_USER FOREIGN
	// KEY(USERID) REFERENCES PUBLIC.USER(ID));

	@Id
	@Column(name = "id", length = 200)
	private String id;

	@Temporal(TemporalType.DATE)
	@Column(name = "DODC")
	private Date dateOfDisconnection;

	@Temporal(TemporalType.DATE)
	@Column(name = "DORC")
	private Date dateOfReconnection;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id", name = "userid", nullable = false)
	private User user;

	public Date getDateOfDisconnection() {
		return dateOfDisconnection;
	}

	public void setDateOfDisconnection(Date dateOfDisconnection) {
		this.dateOfDisconnection = dateOfDisconnection;
	}

	public Date getDateOfReconnection() {
		return dateOfReconnection;
	}

	public void setDateOfReconnection(Date dateOfReconnection) {
		this.dateOfReconnection = dateOfReconnection;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
