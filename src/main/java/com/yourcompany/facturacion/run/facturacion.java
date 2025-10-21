package com.yourcompany.facturacion.run;

import org.openxava.util.*;


public class facturacion {

	public static void main(String[] args) throws Exception {
		DBServer.start("facturaciondb"); 
		AppServer.run("facturacion"); 
	}

}
