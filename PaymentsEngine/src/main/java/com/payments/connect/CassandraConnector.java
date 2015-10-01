package com.payments.connect;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Cluster.Builder;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.exceptions.NoHostAvailableException;

public class CassandraConnector {
	public Cluster cluster;
	public Session session;
	
	public  Session connect(){
		 try {
	            this.cluster = Cluster.builder().addContactPoint("bvbdev1dat1cas.deloittecloud.co.za").withCredentials("payments", "dRw4#wawsQ").build();
	            this.session = this.cluster.connect();
	        } catch (NoHostAvailableException var3) {
	            System.out.println("All host(s) for the address:  tried for query failed");
	        }
		return this.session;
		
		
		//return Cluster.builder().addContactPoint(node).withCredentials("payments", "dRw4#wawsQ").build();
	}
}
