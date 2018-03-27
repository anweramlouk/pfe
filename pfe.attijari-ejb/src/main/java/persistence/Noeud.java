package persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Noeud implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	 
	private String adr_ip;
	 private String type_cx;
	 private String type_eq;
	 private Date date_conf;

	public Noeud(int id, String adr_ip, String type_cx, String type_eq, Date date_conf) {
		super();
		this.id = id;
		this.adr_ip = adr_ip;
		this.type_cx = type_cx;
		this.type_eq = type_eq;
		this.date_conf = date_conf;
	}
	public Noeud() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdr_ip() {
		return adr_ip;
	}
	public void setAdr_ip(String adr_ip) {
		this.adr_ip = adr_ip;
	}
	public String getType_cx() {
		return type_cx;
	}
	public void setType_cx(String type_cx) {
		this.type_cx = type_cx;
	}
	public String getType_eq() {
		return type_eq;
	}
	public void setType_eq(String type_eq) {
		this.type_eq = type_eq;
	}
	public Date getDate_conf() {
		return date_conf;
	}
	public void setDate_conf(Date date_conf) {
		this.date_conf = date_conf;
	}
	
	
	
	
}
