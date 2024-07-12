package com.distribuida.dao;

import java.util.List;
import com.distribuida.entities.Facturas;

public interface FacturasDao {
    List<Facturas> findAll();
    Facturas findOne(int id);
    void add(Facturas facturas);
    void up(Facturas facturas);
    void del(int id);
}
