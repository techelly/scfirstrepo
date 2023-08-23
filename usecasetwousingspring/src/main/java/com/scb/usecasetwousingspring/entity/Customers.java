package com.scb.usecasetwousingspring.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customers {
	@Id
	private Integer custId;//Primary Key
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String active;
	//inverse side
	@OneToMany(cascade=CascadeType.ALL, mappedBy="customers")
	private Accounts accounts;//HAS-A
}
