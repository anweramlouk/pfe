package persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Archivage implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	
	
	

}
