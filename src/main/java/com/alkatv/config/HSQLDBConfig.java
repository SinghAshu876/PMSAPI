package com.alkatv.config;

import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HSQLDBConfig {

	private Logger log = LoggerFactory.getLogger(App.class);

	public void init() {
		log.info("startHSQLDB");
		try {

			HsqlProperties hsqlProperties = new HsqlProperties();
			hsqlProperties.setProperty("server.database.0", "file:D:\\hsqldb-2.4.1\\hsqldb\\data");
			hsqlProperties.setProperty("server.dbname.0", "PMSDB");

			Server dbServer = new Server();
			dbServer.setPort(9001);
			dbServer.setProperties(hsqlProperties);

			dbServer.start();
		} catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}

	}

}
