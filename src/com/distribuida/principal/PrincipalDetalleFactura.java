package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.Detalle_facturaDao;
import com.distribuida.entities.DetalleFactura;

public class PrincipalDetalleFactura {

	  

public static void main(String[] args) {
			
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
	Detalle_facturaDao DetalleFacturasDao = context.getBean("detallefacturaDaoImpl", Detalle_facturaDao.class);

	
	List<DetalleFactura> DetalleFacturas =DetalleFacturasDao.findAll();
	DetalleFacturasDao.findAll().forEach(item -> {System.out.println(item.toString());});
	
		}

	}

