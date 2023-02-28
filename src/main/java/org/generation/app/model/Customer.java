package org.generation.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
	public static final int FIELDS_MAX_LENGTH = 150;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column( name="id_cliente")
	private long idCustomer; 
	@Column( name="first_name", length = FIELDS_MAX_LENGTH)
	private String firstName;
	@Column( name="last_name", length = FIELDS_MAX_LENGTH)
	private String lastName;
	@Column( name="email",nullable = false,updatable = false ,unique = true, length = FIELDS_MAX_LENGTH)
	private String email;
	@Column( name="password", length = FIELDS_MAX_LENGTH)
	private String password; 
	@Column( name="avatar", length = FIELDS_MAX_LENGTH)
	private String avatar;
	@Column( name="is_sctive", length = FIELDS_MAX_LENGTH)
	private boolean active;
	
}
