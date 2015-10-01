package com.payments.connect;
import java.util.Date;

import com.datastax.driver.mapping.annotations.*;



@Table(keyspace="payments_testing", name="payment_transaction")



//@Entity
//@Table(name="payment_transaction", schema="payments_testing")

public class Payment
{
	//@Id
	
	
	@Column(name="payment_transaction_id")
	private java.util.UUID payment_transaction_id;
	
	@Column(name="beneficiary_account_number")
	private String beneficiary_account_number;
	
	@Column(name="beneficiary_amount")
	private Double beneficiary_amount;
	
	@Column(name="beneficiary_currency_code")
	private String beneficiary_currency_code;
	
	@Column(name="beneficiary_email")
	private String beneficiary_email;
	
	@Column(name="beneficiary_external_account_bank_name")
	private String beneficiary_external_account_bank_name;
	
	@Column(name="beneficiary_external_account_branch_code")
	private String beneficiary_external_account_branch_code;
	
	@Column(name="beneficiary_external_account_holder_name")
	private String beneficiary_external_account_holder_name;
	
	@Column(name="beneficiary_external_account_number")
	private String beneficiary_external_account_number;
	
	@Column(name="beneficiary_external_account_type")
	private String  beneficiary_external_account_type;
	
	@Column(name="beneficiary_phone_number")
	private String beneficiary_phone_number;
	
	@Column(name="beneficiary_reference")
	private String beneficiary_reference;
	
	@Column(name="conversion_rate")
	private Double conversion_rate;
	
	@Column(name = "created_date_time")
	private Date created_date_time;
	
	
	//@Basic(optional=false)
//	@Column(name="created_date_time", updatable=false)
	//@Temporal(TemporalType.TIMESTAMP)
//	private Date created_date_time;
	
	@Column(name="originator_account_number")
	private String originator_account_number;
	
	@Column(name="originator_amount")
	private Double originator_amount;
	
	@Column(name="originator_channel")
	private String originator_channel;
	
	@Column(name="originator_country_code")
	private String originator_country_code;
	
	@Column(name="originator_currency_code")
	private String originator_currency_code;
	
	@Column(name="originator_customer_id")
	private String originator_customer_id;
	
	@Column(name="originator_reference")
	private String originator_reference;
	
	//@Basic(optional=false)
	@Column(name="payment_date")
	//@Temporal(TemporalType.TIMESTAMP)
	private Date payment_date;
	
	@Column(name="payment_status")
	private String payment_status;
	
	@Column(name="payment_transection_type")
	private String payment_transection_type;
	
	@Column(name="payment_type")
	private String payment_type;
	
	@Column(name="trading_partner_id")
	private String trading_partner_id;
	
	//@Basic(optional=false)
	@Column(name="updated_date_time")
//	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_date_time;
	
	
	
	
	public Payment()
	{
	}

	public java.util.UUID getPayment_transaction_id() {
		return payment_transaction_id;
	}

	public void setPayment_transaction_id(java.util.UUID payment_transaction_id) {
		this.payment_transaction_id = payment_transaction_id ;
	}

	public String getBeneficiary_account_number() {
		return beneficiary_account_number;
	}

	public void setBeneficiary_account_number(String beneficiary_account_number) {
		this.beneficiary_account_number = beneficiary_account_number;
	}

	public Double getBeneficiary_amount() {
		return beneficiary_amount;
	}

	public void setBeneficiary_amount(Double beneficiary_amount) {
		this.beneficiary_amount = beneficiary_amount;
	}

	public String getBeneficiary_currency_code() {
		return beneficiary_currency_code;
	}

	public void setBeneficiary_currency_code(String beneficiary_currency_code) {
		this.beneficiary_currency_code = beneficiary_currency_code;
	}

	public String getBeneficiary_email() {
		return beneficiary_email;
	}

	public void setBeneficiary_email(String beneficiary_email) {
		this.beneficiary_email = beneficiary_email;
	}

	public String getBeneficiary_external_account_bank_name() {
		return beneficiary_external_account_bank_name;
	}

	public void setBeneficiary_external_account_bank_name(String beneficiary_external_account_bank_name) {
		this.beneficiary_external_account_bank_name = beneficiary_external_account_bank_name;
	}

	public String getBeneficiary_external_account_branch_code() {
		return beneficiary_external_account_branch_code;
	}

	public void setBeneficiary_external_account_branch_code(String beneficiary_external_account_branch_code) {
		this.beneficiary_external_account_branch_code = beneficiary_external_account_branch_code;
	}

	public String getBeneficiary_external_account_holder_name() {
		return beneficiary_external_account_holder_name;
	}

	public void setBeneficiary_external_account_holder_name(String beneficiary_external_account_holder_name) {
		this.beneficiary_external_account_holder_name = beneficiary_external_account_holder_name;
	}

	public String getBeneficiary_external_account_number() {
		return beneficiary_external_account_number;
	}

	public void setBeneficiary_external_account_number(String beneficiary_external_account_number) {
		this.beneficiary_external_account_number = beneficiary_external_account_number;
	}

	public String getBeneficiary_external_account_type() {
		return beneficiary_external_account_type;
	}

	public void setBeneficiary_external_account_type(String beneficiary_external_account_type) {
		this.beneficiary_external_account_type = beneficiary_external_account_type;
	}

	public String getBeneficiary_phone_number() {
		return beneficiary_phone_number;
	}

	public void setBeneficiary_phone_number(String beneficiary_phone_number) {
		this.beneficiary_phone_number = beneficiary_phone_number;
	}

	public String getBeneficiary_reference() {
		return beneficiary_reference;
	}

	public void setBeneficiary_reference(String beneficiary_reference) {
		this.beneficiary_reference = beneficiary_reference;
	}

	public Double getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(Double conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	public Date getCreated_date_time() {
		return created_date_time;
	}

	public void setCreated_date_time(Date created_date_time) {
		this.created_date_time = created_date_time;
	}

	public String getOriginator_account_number() {
		return originator_account_number;
	}

	public void setOriginator_account_number(String originator_account_number) {
		this.originator_account_number = originator_account_number;
	}

	public Double getOriginator_amount() {
		return originator_amount;
	}

	public void setOriginator_amount(Double originator_amount) {
		this.originator_amount = originator_amount;
	}

	public String getOriginator_channel() {
		return originator_channel;
	}

	public void setOriginator_channel(String originator_channel) {
		this.originator_channel = originator_channel;
	}

	public String getOriginator_country_code() {
		return originator_country_code;
	}

	public void setOriginator_country_code(String originator_country_code) {
		this.originator_country_code = originator_country_code;
	}

	public String getOriginator_currency_code() {
		return originator_currency_code;
	}

	public void setOriginator_currency_code(String originator_currency_code) {
		this.originator_currency_code = originator_currency_code;
	}

	public String getOriginator_customer_id() {
		return originator_customer_id;
	}

	public void setOriginator_customer_id(String originator_customer_id) {
		this.originator_customer_id = originator_customer_id;
	}

	public String getOriginator_reference() {
		return originator_reference;
	}

	public void setOriginator_reference(String originator_reference) {
		this.originator_reference = originator_reference;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	public String getPayment_transection_type() {
		return payment_transection_type;
	}

	public void setPayment_transection_type(String payment_transection_type) {
		this.payment_transection_type = payment_transection_type;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getTrading_partner_id() {
		return trading_partner_id;
	}

	public void setTrading_partner_id(String trading_partner_id) {
		this.trading_partner_id = trading_partner_id;
	}

	public Date getUpdated_date_time() {
		return updated_date_time;
	}

	public void setUpdated_date_time(Date updated_date_time) {
		this.updated_date_time = updated_date_time;
	}
	
	


	
	
	
	
}
	
	

