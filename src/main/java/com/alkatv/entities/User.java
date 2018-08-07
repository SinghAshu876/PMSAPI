package com.alkatv.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "sequence", sequenceName = "PMS_SEQUENCE", initialValue = 2000, allocationSize = 1)
public class User {

	// CREATE MEMORY TABLE PUBLIC.USER(ID INTEGER NOT NULL PRIMARY KEY,CUSTOMERNAME
	// VARCHAR(200),STREET VARCHAR(200),SECTOR VARCHAR(200),DOC DATE,MOBNUMBER
	// VARCHAR(200),SETTOPBOX VARCHAR(200),ACTIVE VARCHAR(1),CONNECTIONCHARGE
	// INTEGER,CASNUMBER VARCHAR(20),QRNO INTEGER,BACK_DUES INTEGER);

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	private Integer id;

	@Column(name = "CUSTOMERNAME", length=200)
	private String customerName;

	@Column(name = "STREET", length=200)
	private String street;

	@Column(name = "SECTOR", length=200)
	private String sector;

	@Temporal(TemporalType.DATE)
	@Column(name = "DOC")
	private Date doc;

	@Column(name = "MOBNUMBER", length=200)
	private String mobNumber;

	@Column(name = "SETTOPBOX", length=200)
	private String setTopBox;

	@Column(name = "ACTIVE", length=1)
	private String active;

	@Column(name = "CONNECTIONCHARGE")
	private Integer connectionCharge;

	@Column(name = "CASNUMBER", length=20)
	private String casNumber;

	@Column(name = "QRNO")
	private Integer qrNo;

	@Column(name = "BACK_DUES")
	private Integer backDues;

	@OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<DisconnectReconnectDetails> discoRecoDetailsList;
	
	@OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<AllFeesDetails> allFeesDetailsList;

	@OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private List<FeesHistory> feesHistoryList;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Date getDoc() {
		return doc;
	}

	public void setDoc(Date doc) {
		this.doc = doc;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getSetTopBox() {
		return setTopBox;
	}

	public void setSetTopBox(String setTopBox) {
		this.setTopBox = setTopBox;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public Integer getConnectionCharge() {
		return connectionCharge;
	}

	public void setConnectionCharge(Integer connectionCharge) {
		this.connectionCharge = connectionCharge;
	}

	public String getCasNumber() {
		return casNumber;
	}

	public void setCasNumber(String casNumber) {
		this.casNumber = casNumber;
	}

	public Integer getQrNo() {
		return qrNo;
	}

	public void setQrNo(Integer qrNo) {
		this.qrNo = qrNo;
	}

	public Integer getBackDues() {
		return backDues;
	}

	public void setBackDues(Integer backDues) {
		this.backDues = backDues;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<DisconnectReconnectDetails> getDiscoRecoDetailsList() {
		return discoRecoDetailsList;
	}

	public void setDiscoRecoDetailsList(List<DisconnectReconnectDetails> discoRecoDetailsList) {
		this.discoRecoDetailsList = discoRecoDetailsList;
	}

	public List<AllFeesDetails> getAllFeesDetailsList() {
		return allFeesDetailsList;
	}

	public void setAllFeesDetailsList(List<AllFeesDetails> allFeesDetailsList) {
		this.allFeesDetailsList = allFeesDetailsList;
	}

	public List<FeesHistory> getFeesHistoryList() {
		return feesHistoryList;
	}

	public void setFeesHistoryList(List<FeesHistory> feesHistoryList) {
		this.feesHistoryList = feesHistoryList;
	};

}
