package com.capgemini.entities;

public class Vendor_Address {
	private int vendorAddressId;
	private String vendorCity;
	private String vendorState;
	private long vendorPincode;

	public Vendor_Address(int vendorAddressId, String vendorCity, String vendorState, long vendorPincode) {
		super();
		this.vendorAddressId = vendorAddressId;
		this.vendorCity = vendorCity;
		this.vendorState = vendorState;
		this.vendorPincode = vendorPincode;
	}

	public Vendor_Address() {

	}

	public int getVendorAddressId() {
		return vendorAddressId;
	}

	public void setVendorAddressId(int vendorAddressId) {
		this.vendorAddressId = vendorAddressId;
	}

	public String getVendorCity() {
		return vendorCity;
	}

	public void setVendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}

	public String getVendorState() {
		return vendorState;
	}

	public void setVendorState(String vendorState) {
		this.vendorState = vendorState;
	}

	public long getVendorPincode() {
		return vendorPincode;
	}

	public void setVendorPincode(long vendorPincode) {
		this.vendorPincode = vendorPincode;
	}

	@Override
	public String toString() {
		return "Vendor_Address [vendorAddressId=" + vendorAddressId + ", vendorCity=" + vendorCity + ", vendorState="
				+ vendorState + ", vendorPincode=" + vendorPincode + "]";
	}

}
