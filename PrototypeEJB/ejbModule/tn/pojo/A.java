package tn.pojo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: A
 *
 */
@Entity

public class A implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;

	public A() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
   
}
