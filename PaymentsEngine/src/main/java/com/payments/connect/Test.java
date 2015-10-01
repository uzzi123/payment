package com.payments.connect;


import java.util.Date;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.Batch;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;

public class Test {
	public  Cluster cluster;
	public static  Session session;
	
	
	public static void main(String[] args) {
		 CassandraConnector connector = new CassandraConnector();
		 session = connector.connect();
		session.execute("use payments_testing");
		 Insert insert_payment_static = QueryBuilder
					.insertInto("payment_transaction")
					.value("payment_transaction_id", java.util.UUID.randomUUID())
					.value("beneficiary_account_number", "0000")
					.value("beneficiary_amount", 12.12)
					.value("beneficiary_currency_code", "b")
					.value("beneficiary_email", "b")
					.value("beneficiary_external_account_bank_name", "b")
					.value("beneficiary_external_account_branch_code", "b")
					.value("beneficiary_external_account_holder_name", "b")
					.value("beneficiary_external_account_number","00.00")
					.value("beneficiary_external_account_type", "b")
					.value("beneficiary_phone_number", "b")
					.value("beneficiary_reference", "b")
					.value("conversion_rate", 00.00)
					.value("created_date_time", new Date())
					.value("originator_account_number", "b")
					.value("originator_amount",00.00)
					.value("originator_channel","b")
					.value("originator_country_code","b")
					.value("originator_currency_code", "b")
					.value("originator_customer_id","b")
					.value("originator_reference", "b")
					.value("payment_date",new Date())
					.value("payment_status","b")
					.value("payment_transaction_type", "b")
					.value("payment_type","b")
					.value("trading_partner_id", "b")
					.value("updated_date_time", new Date());
					
					
				

				Batch batch = QueryBuilder.batch(insert_payment_static);
				session.execute(batch.toString());
				System.out.println("success");

	}

}
