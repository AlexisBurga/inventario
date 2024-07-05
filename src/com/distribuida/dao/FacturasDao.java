package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Facturas;

public interface FacturasDao {

	public List<Facturas>findAll();
	
	public Facturas findOne(int id);	
	public void add(Facturas facturas);
	public void up(Facturas facturas);
	public void del(int id);
}
