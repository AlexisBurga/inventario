package com.distribuida.principal;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturasDao;
import com.distribuida.entities.Facturas;


public class PrincipalFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturasDao facturasDao = context.getBean("facturasDaoImpl", FacturasDao.class);

	
		List<Facturas> Facturas =facturasDao.findAll();
		facturasDao.findAll().forEach(item -> {System.out.println(item.toString());});
		
	
	
	}

}

