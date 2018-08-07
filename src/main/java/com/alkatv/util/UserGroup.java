package com.alkatv.util;

public enum UserGroup {

	ADMIN("ADMIN"),
	GUEST("GUEST"),
	PAYMENT_COLLECTOR("PAYMENT_COLLECTOR");
	
	private String desc;

	UserGroup(String desc) {
		this.setDesc(desc);
	}
	
	public String getCode() {
		return this.name();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
