package com.bytecode.tratcms.data.model;

import java.util.Date;

public class MPermiso {
	private long IdPermiso;
	
	private String Nombre;

	private Date Fecha;

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public long getIdPermiso() {
		return IdPermiso;
	}

	public void setIdPermiso(long idPermiso) {
		IdPermiso = idPermiso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
