package com.capgemini.entities;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private long vendorContact;
	private String vendorUsername;
	private String vedorPassword;

	private Menu foodMenu;
	private Vendor_Address vendorAddress;

	public Vendor(int vendorId, String vendorName, long vendorContact, String vendorUsername, String vedorPassword) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorContact = vendorContact;
		this.vendorUsername = vendorUsername;
		this.vedorPassword = vedorPassword;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public long getVendorContact() {
		return vendorContact;
	}

	public void setVendorContact(long vendorContact) {
		this.vendorContact = vendorContact;
	}

	public String getVendorUsername() {
		return vendorUsername;
	}

	public void setVendorUsername(String vendorUsername) {
		this.vendorUsername = vendorUsername;
	}

	public String getVedorPassword() {
		return vedorPassword;
	}

	public void setVedorPassword(String vedorPassword) {
		this.vedorPassword = vedorPassword;
	}

	public Menu getFoodMenu() {
		return foodMenu;
	}

	public void setFoodMenu(Menu foodMenu) {
		this.foodMenu = foodMenu;
	}

	public Vendor_Address getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(Vendor_Address vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorContact=" + vendorContact
				+ ", vendorUsername=" + vendorUsername + ", vedorPassword=" + vedorPassword + ", foodMenu=" + foodMenu
				+ ", vendorAddress=" + vendorAddress + "]";
	}

}
