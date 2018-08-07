package com.alkatv.api;


import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.Server;



public class StartDBTest {

	

	private Server dbServer = null;

	
	public void run() {
		try {
			
			HsqlProperties hsqlProperties = new HsqlProperties();
			hsqlProperties.setProperty("server.database.0", "file:D:\\hsqldb-2.4.1\\hsqldb\\data");
			hsqlProperties.setProperty("server.dbname.0", "PMSDB");

			dbServer = new Server();
			dbServer.setPort(9001);
			dbServer.setProperties(hsqlProperties);
			
			dbServer.start();
		} catch (Exception e) {
		}

	}
	
	public  void dispose() {
		dbServer.signalCloseAllServerConnections();
		dbServer.shutdown();
		dbServer = null;
	}
	
	public static void main(String args[]) {
		new StartDBTest().run();
	}

	

}
