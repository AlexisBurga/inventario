package com.distribuida.principal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturasDao;
import com.distribuida.entities.Facturas;

public class PrincipalFacturas {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        FacturasDao facturaDao = context.getBean(FacturasDao.class);

        // Prueba: Obtener todas las facturas
        System.out.println("Listado de Facturas:");
        for (Facturas factura : facturaDao.findAll()) {
            System.out.println(factura);
        }

        context.close();
    }
}
