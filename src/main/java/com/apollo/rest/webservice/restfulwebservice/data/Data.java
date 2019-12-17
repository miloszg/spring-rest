package com.apollo.rest.webservice.restfulwebservice.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Data")
public class Data {
//	  `id` int(11) NOT NULL AUTO_INCREMENT,
//	  `dt` datetime DEFAULT NULL,
//	  `v1` int(11) DEFAULT NULL,
//	  `v2` int(11) DEFAULT NULL,
//	  `v3` int(11) DEFAULT NULL,
//	  `f` int(11) DEFAULT NULL,
//	  `c1` int(11) DEFAULT NULL,
//	  `c2` int(11) DEFAULT NULL,
//	  `c3` int(11) DEFAULT NULL,
//	  `ap` int(11) DEFAULT NULL,
//	  `ap1` int(11) DEFAULT NULL,
//	  `ap2` int(11) DEFAULT NULL,
//	  `ap3` int(11) DEFAULT NULL,
//	  `rp` int(11) DEFAULT NULL,
//	  `rp1` int(11) DEFAULT NULL,
//	  `rp2` int(11) DEFAULT NULL,
//	  `rp3` int(11) DEFAULT NULL,
//	  `sp` int(11) DEFAULT NULL,
//	  `sp1` int(11) DEFAULT NULL,
//	  `sp2` int(11) DEFAULT NULL,
//	  `sp3` int(11) DEFAULT NULL,
//	  `cos` int(11) DEFAULT NULL,
//	  `cos1` int(11) DEFAULT NULL,
//	  `cos2` int(11) DEFAULT NULL,
//	  `cos3` int(11) DEFAULT NULL
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="date")
	private String date;
	
	@Column(name="v1")
	private int v1;
	
	@Column(name="v2")
	private int v2;
	
	@Column(name="v3")
	private int v3;
	
	@Column(name="f")
	private int f;
	
	@Column(name="c1")
	private int c1;
	
	@Column(name="c2")
	private int c2;
	
	@Column(name="c3")
	private int c3;
	
	@Column(name="ap")
	private int ap;
	
	@Column(name="ap1")
	private int ap1;
	
	@Column(name="ap2")
	private int ap2;
	
	@Column(name="ap3")
	private int ap3;
	
	@Column(name="rp")
	private int rp;
	
	@Column(name="rp1")
	private int rp1;
	
	@Column(name="rp2")
	private int rp2;
	
	@Column(name="rp3")
	private int rp3;
	
	@Column(name="sp")
	private int sp;
	
	@Column(name="sp1")
	private int sp1;
	
	@Column(name="sp2")
	private int sp2;
	
	@Column(name="sp3")
	private int sp3;
	
	@Column(name="cos")
	private int cos;
	
	@Column(name="cos1")
	private int cos1;
	
	@Column(name="cos2")
	private int cos2;
	
	@Column(name="cos3")
	private int cos3;
	
	

	public Data() {
	}
	

	public Data(String date, int v1, int v2, int v3, int f, int c1, int c2, int c3, int ap, int ap1, int ap2, int ap3,
			int rp, int rp1, int rp2, int rp3, int sp, int sp1, int sp2, int sp3, int cos, int cos1, int cos2,
			int cos3) {
		this.date = date;
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.f = f;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.ap = ap;
		this.ap1 = ap1;
		this.ap2 = ap2;
		this.ap3 = ap3;
		this.rp = rp;
		this.rp1 = rp1;
		this.rp2 = rp2;
		this.rp3 = rp3;
		this.sp = sp;
		this.sp1 = sp1;
		this.sp2 = sp2;
		this.sp3 = sp3;
		this.cos = cos;
		this.cos1 = cos1;
		this.cos2 = cos2;
		this.cos3 = cos3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getV1() {
		return v1;
	}

	public void setV1(int v1) {
		this.v1 = v1;
	}

	public int getV2() {
		return v2;
	}

	public void setV2(int v2) {
		this.v2 = v2;
	}

	public int getV3() {
		return v3;
	}

	public void setV3(int v3) {
		this.v3 = v3;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public int getC1() {
		return c1;
	}

	public void setC1(int c1) {
		this.c1 = c1;
	}

	public int getC2() {
		return c2;
	}

	public void setC2(int c2) {
		this.c2 = c2;
	}

	public int getC3() {
		return c3;
	}

	public void setC3(int c3) {
		this.c3 = c3;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	public int getAp1() {
		return ap1;
	}

	public void setAp1(int ap1) {
		this.ap1 = ap1;
	}

	public int getAp2() {
		return ap2;
	}

	public void setAp2(int ap2) {
		this.ap2 = ap2;
	}

	public int getAp3() {
		return ap3;
	}

	public void setAp3(int ap3) {
		this.ap3 = ap3;
	}

	public int getRp() {
		return rp;
	}

	public void setRp(int rp) {
		this.rp = rp;
	}

	public int getRp1() {
		return rp1;
	}

	public void setRp1(int rp1) {
		this.rp1 = rp1;
	}

	public int getRp2() {
		return rp2;
	}

	public void setRp2(int rp2) {
		this.rp2 = rp2;
	}

	public int getRp3() {
		return rp3;
	}

	public void setRp3(int rp3) {
		this.rp3 = rp3;
	}

	public int getSp() {
		return sp;
	}

	public void setSp(int sp) {
		this.sp = sp;
	}

	public int getSp1() {
		return sp1;
	}

	public void setSp1(int sp1) {
		this.sp1 = sp1;
	}

	public int getSp2() {
		return sp2;
	}

	public void setSp2(int sp2) {
		this.sp2 = sp2;
	}

	public int getSp3() {
		return sp3;
	}

	public void setSp3(int sp3) {
		this.sp3 = sp3;
	}

	public int getCos() {
		return cos;
	}

	public void setCos(int cos) {
		this.cos = cos;
	}

	public int getCos1() {
		return cos1;
	}

	public void setCos1(int cos1) {
		this.cos1 = cos1;
	}

	public int getCos2() {
		return cos2;
	}

	public void setCos2(int cos2) {
		this.cos2 = cos2;
	}

	public int getCos3() {
		return cos3;
	}

	public void setCos3(int cos3) {
		this.cos3 = cos3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ap;
		result = prime * result + ap1;
		result = prime * result + ap2;
		result = prime * result + ap3;
		result = prime * result + c1;
		result = prime * result + c2;
		result = prime * result + c3;
		result = prime * result + cos;
		result = prime * result + cos1;
		result = prime * result + cos2;
		result = prime * result + cos3;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + f;
		result = prime * result + id;
		result = prime * result + rp;
		result = prime * result + rp1;
		result = prime * result + rp2;
		result = prime * result + rp3;
		result = prime * result + sp;
		result = prime * result + sp1;
		result = prime * result + sp2;
		result = prime * result + sp3;
		result = prime * result + v1;
		result = prime * result + v2;
		result = prime * result + v3;
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
		Data other = (Data) obj;
		if (ap != other.ap)
			return false;
		if (ap1 != other.ap1)
			return false;
		if (ap2 != other.ap2)
			return false;
		if (ap3 != other.ap3)
			return false;
		if (c1 != other.c1)
			return false;
		if (c2 != other.c2)
			return false;
		if (c3 != other.c3)
			return false;
		if (cos != other.cos)
			return false;
		if (cos1 != other.cos1)
			return false;
		if (cos2 != other.cos2)
			return false;
		if (cos3 != other.cos3)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (f != other.f)
			return false;
		if (id != other.id)
			return false;
		if (rp != other.rp)
			return false;
		if (rp1 != other.rp1)
			return false;
		if (rp2 != other.rp2)
			return false;
		if (rp3 != other.rp3)
			return false;
		if (sp != other.sp)
			return false;
		if (sp1 != other.sp1)
			return false;
		if (sp2 != other.sp2)
			return false;
		if (sp3 != other.sp3)
			return false;
		if (v1 != other.v1)
			return false;
		if (v2 != other.v2)
			return false;
		if (v3 != other.v3)
			return false;
		return true;
	}
	
	
	
	

	
	
	
	
	
	
	
}
