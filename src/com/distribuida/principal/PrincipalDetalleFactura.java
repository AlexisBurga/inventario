package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.Detalle_facturaDao;
import com.distribuida.entities.DetalleFactura;

public class PrincipalDetalleFactura {

    public static void main(String[] args) {
        // Cargar el contexto de Spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        try {
            // Obtener el bean de Detalle_facturaDao desde el contexto de Spring
            Detalle_facturaDao detalleFacturaDao = context.getBean("detalle_facturaDaoImpl", Detalle_facturaDao.class);

            // Obtener todas las facturas de detalle y mostrarlas
            List<DetalleFactura> detalleFacturas = detalleFacturaDao.findAll();
            detalleFacturas.forEach(item -> System.out.println(item.toString()));
        } finally {
            // Cerrar el contexto de Spring para liberar los recursos
            context.close();
        }
    }
}
