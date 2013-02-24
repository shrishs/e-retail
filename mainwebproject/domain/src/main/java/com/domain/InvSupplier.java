package com.domain;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Time;


/**
 * The persistent class for the inv_supplier database table.
 * 
 */
@Entity
@Table(name="inv_supplier")
@NamedQueries({
 @NamedQuery(name = "InvSupplier.findByLocAndServiceCatID",query = "SELECT invSuppliers FROM InvSupplier invSuppliers WHERE invSuppliers.suppCatId = :suppCatId and invSuppliers.suppLocId=:suppLocId")
})
public class InvSupplier implements Serializable {
	private static final long serialVersionUID = 1L;
	private int suppId;
	private String suppAddress1;
	private String suppAddress2;
	private int suppCatId;
	private Time suppClosingHours;
	private String suppEmail;
	private int suppEmailRequired;
	private int suppHomeDelivery;
	private int suppHomeDeliveryMinAmount;
	private int suppLocId;
	private int suppMonthlyCreditPossible;
	private String suppName;
	private int suppNightServiceAvailable;
	private Time suppOpeningHours;
	private int suppPaymentCreditCard;
	private int suppPersPhone;
	private int suppPincode;
	private String suppShopName;
	private int suppSmsPhone;
	private int suppSmsRequired;
	private String suppUniqueName;
	private int suppUserId;

    public InvSupplier() {
    }


	@Id
	@Column(name="supp_id", unique=true, nullable=false)
	public int getSuppId() {
		return this.suppId;
	}

	public void setSuppId(int suppId) {
		this.suppId = suppId;
	}


	@Column(name="supp_address1", length=100)
	public String getSuppAddress1() {
		return this.suppAddress1;
	}

	public void setSuppAddress1(String suppAddress1) {
		this.suppAddress1 = suppAddress1;
	}


	@Column(name="supp_address2", length=100)
	public String getSuppAddress2() {
		return this.suppAddress2;
	}

	public void setSuppAddress2(String suppAddress2) {
		this.suppAddress2 = suppAddress2;
	}


	@Column(name="supp_cat_id")
	public int getSuppCatId() {
		return this.suppCatId;
	}

	public void setSuppCatId(int suppCatId) {
		this.suppCatId = suppCatId;
	}


	@Column(name="supp_closing_hours")
	public Time getSuppClosingHours() {
		return this.suppClosingHours;
	}

	public void setSuppClosingHours(Time suppClosingHours) {
		this.suppClosingHours = suppClosingHours;
	}


	@Column(name="supp_email", length=50)
	public String getSuppEmail() {
		return this.suppEmail;
	}

	public void setSuppEmail(String suppEmail) {
		this.suppEmail = suppEmail;
	}


	@Column(name="supp_email_required")
	public int getSuppEmailRequired() {
		return this.suppEmailRequired;
	}

	public void setSuppEmailRequired(int suppEmailRequired) {
		this.suppEmailRequired = suppEmailRequired;
	}


	@Column(name="supp_home_delivery")
	public int getSuppHomeDelivery() {
		return this.suppHomeDelivery;
	}

	public void setSuppHomeDelivery(int suppHomeDelivery) {
		this.suppHomeDelivery = suppHomeDelivery;
	}


	@Column(name="supp_home_delivery_min_amount")
	public int getSuppHomeDeliveryMinAmount() {
		return this.suppHomeDeliveryMinAmount;
	}

	public void setSuppHomeDeliveryMinAmount(int suppHomeDeliveryMinAmount) {
		this.suppHomeDeliveryMinAmount = suppHomeDeliveryMinAmount;
	}


	@Column(name="supp_loc_id")
	public int getSuppLocId() {
		return this.suppLocId;
	}

	public void setSuppLocId(int suppLocId) {
		this.suppLocId = suppLocId;
	}


	@Column(name="supp_monthly_credit_possible")
	public int getSuppMonthlyCreditPossible() {
		return this.suppMonthlyCreditPossible;
	}

	public void setSuppMonthlyCreditPossible(int suppMonthlyCreditPossible) {
		this.suppMonthlyCreditPossible = suppMonthlyCreditPossible;
	}


	@Column(name="supp_name", length=50)
	public String getSuppName() {
		return this.suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}


	@Column(name="supp_night_service_available")
	public int getSuppNightServiceAvailable() {
		return this.suppNightServiceAvailable;
	}

	public void setSuppNightServiceAvailable(int suppNightServiceAvailable) {
		this.suppNightServiceAvailable = suppNightServiceAvailable;
	}


	@Column(name="supp_opening_hours")
	public Time getSuppOpeningHours() {
		return this.suppOpeningHours;
	}

	public void setSuppOpeningHours(Time suppOpeningHours) {
		this.suppOpeningHours = suppOpeningHours;
	}


	@Column(name="supp_payment_credit_card")
	public int getSuppPaymentCreditCard() {
		return this.suppPaymentCreditCard;
	}

	public void setSuppPaymentCreditCard(int suppPaymentCreditCard) {
		this.suppPaymentCreditCard = suppPaymentCreditCard;
	}


	@Column(name="supp_pers_phone")
	public int getSuppPersPhone() {
		return this.suppPersPhone;
	}

	public void setSuppPersPhone(int suppPersPhone) {
		this.suppPersPhone = suppPersPhone;
	}


	@Column(name="supp_pincode")
	public int getSuppPincode() {
		return this.suppPincode;
	}

	public void setSuppPincode(int suppPincode) {
		this.suppPincode = suppPincode;
	}


	@Column(name="supp_shop_name", length=50)
	public String getSuppShopName() {
		return this.suppShopName;
	}

	public void setSuppShopName(String suppShopName) {
		this.suppShopName = suppShopName;
	}


	@Column(name="supp_sms_phone")
	public int getSuppSmsPhone() {
		return this.suppSmsPhone;
	}

	public void setSuppSmsPhone(int suppSmsPhone) {
		this.suppSmsPhone = suppSmsPhone;
	}


	@Column(name="supp_sms_required")
	public int getSuppSmsRequired() {
		return this.suppSmsRequired;
	}

	public void setSuppSmsRequired(int suppSmsRequired) {
		this.suppSmsRequired = suppSmsRequired;
	}


	@Column(name="supp_unique_name", length=20)
	public String getSuppUniqueName() {
		return this.suppUniqueName;
	}

	public void setSuppUniqueName(String suppUniqueName) {
		this.suppUniqueName = suppUniqueName;
	}


	@Column(name="supp_user_id")
	public int getSuppUserId() {
		return this.suppUserId;
	}

	public void setSuppUserId(int suppUserId) {
		this.suppUserId = suppUserId;
	}

}