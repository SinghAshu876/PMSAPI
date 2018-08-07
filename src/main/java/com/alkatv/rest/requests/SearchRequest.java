package com.alkatv.rest.requests;

import static com.alkatv.messages.ValidationMessages.*;

import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class SearchRequest extends APIRequest {

	@Size(min = 1, max = 20, message = SIZE_REGISTRATION_NAME)
	private String customerName;

	@Positive(message = POSITIVE_NUMBER)
	private Integer qrNo;

	@Positive(message = POSITIVE_NUMBER)
	private Integer id;

	@Size(min = 10, max = 10, message = SIZE_REGISTRATION_MOBNO)
	private String mobNumber;

	public Integer getQrNo() {
		return qrNo;
	}

	public void setQrNo(Integer qrNo) {
		this.qrNo = qrNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
