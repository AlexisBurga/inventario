package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDao;

import com.distribuida.entities.Factura;


public class PrincipalFacturas {

    public static void main(String[] args) {

    		// TODO Auto-generated method stub
    		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    		FacturaDao FacturasDao = context.getBean("FacturaDaoImpl",FacturaDao.class);
    		//ProveedorDAO proveedorDAO = context.getBean("proveedorDAOimpl",ProveedorDAO.class);
    		//SucursalDAO sucursalDAO = context.getBean("sucursalDAOimpl", SucursualDAO.class);
    		//VendedorDAO vendedorDAO = context.getBean("vendedorDAO", VendedorDAO.class);
    		// CRUD : CREATE, READ, UPDATE, DELETE
    		//Factura.setProveedor(proveedorDAO.findOne(1));
    		// Add
    		Factura Factura = new Factura(1,19.89,1,2);
    		//FacturaDAO.add(Factura);
    		//Factura.setProveedor(proveedorDAO.findOne(1));
    		//Factura.setSucursal(sucursalDAO.findOne(1));
    		//Factura.setVendedor(vendedorDAO.findOne(1));

    		// Up
    		Factura Factura2 = new Factura(2,19.79,1,2);
    		//FacturaDAO.up(Factura2);
    		// Delete
    		//FacturaDAO.dell(2);
    		// findOne
    		//System.out.println("**************** DEL ****************"+FacturasDao.findOne(1));
    		// findAll
    		List<Factura> Facturas = FacturasDao.findAll();
    		Facturas.forEach(item -> {
    			System.out.println(item.toString());
    		});
    				context.close();
    	}
     
    }