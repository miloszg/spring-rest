package com.apollo.rest.webservice.restfulwebservice.params;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Params")
public class Param {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="vmin")
	private int vmin;
	
	@Column(name="vmax")
	private int vmax;
	
	@Column(name="imax")
	private float imax;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVmin() {
		return vmin;
	}

	public void setVmin(int vmin) {
		this.vmin = vmin;
	}

	public int getVmax() {
		return vmax;
	}

	public void setVmax(int vmax) {
		this.vmax = vmax;
	}

	public float getImax() {
		return imax;
	}

	public void setImax(int imax) {
		this.imax = imax;
	}
	
	

	public Param() {	
	}

	public Param(int vmin, int vmax, float imax) {
		this.vmin = vmin;
		this.vmax = vmax;
		this.imax = imax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + Float.floatToIntBits(imax);
		result = prime * result + vmax;
		result = prime * result + vmin;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Param other = (Param) obj;
		if (id != other.id)
			return false;
		if (Float.floatToIntBits(imax) != Float.floatToIntBits(other.imax))
			return false;
		if (vmax != other.vmax)
			return false;
		if (vmin != other.vmin)
			return false;
		return true;
	}

	
	

	
	
	
	
	
	
	
}
