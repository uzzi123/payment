package com.payments.connect;
import java.util.Date;




public class PaymentAdd {
	  
	  public static void main(String[] args)
	    {
		
		  Payment payment=new Payment();
		 new java.util.UUID(0, 0);
		// payment.setPayment_transaction_id(new java.util.UUID(5,5));
		  payment.setPayment_transaction_id(java.util.UUID.randomUUID());
		  payment.setBeneficiary_account_number("0000");
		  payment.setBeneficiary_amount(457.00);  
		  payment.setBeneficiary_currency_code("a");
		  payment.setBeneficiary_email("a");
		  payment.setBeneficiary_external_account_bank_name("a");
		  payment.setBeneficiary_external_account_branch_code("a");
		  payment.setBeneficiary_external_account_holder_name("a");
		  payment.setBeneficiary_external_account_number("a");
		  payment.setBeneficiary_external_account_type("a");
		  payment.setBeneficiary_phone_number("a");
		  payment.setBeneficiary_reference("a");
		  payment.setConversion_rate(88.99);
		  payment.setCreated_date_time(new Date());
		  payment.setOriginator_account_number("a");
		  payment.setOriginator_amount(00.00);
		  payment.setOriginator_channel("a");
		  payment.setOriginator_country_code("a");
		  payment.setOriginator_currency_code("a");
		  payment.setOriginator_customer_id("a");
		  payment.setOriginator_reference("a");
		  payment.setPayment_date(new Date());
		  payment.setPayment_status("a");
		  payment.setPayment_transection_type("a");
		  payment.setPayment_type("a");
		  payment.setTrading_partner_id("a");
		  payment.setUpdated_date_time(new Date());
		  
		  
		  
		/*  
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("cassandra_pu");
		 	 
	        EntityManager em = emf.createEntityManager();

	        em.persist(payment);
	       
	        em.close();    
	        emf.close();     */
	    
	    }
	  

}
