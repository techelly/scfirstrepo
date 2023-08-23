package com.scb.usecasetwousingspring.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer custId;//Primary Key
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String active;
	//inverse side
	@OneToMany(cascade=CascadeType.ALL, mappedBy="customers")
	@Exclude
	@JsonIgnore
	private List<Accounts> accounts;//HAS-A
}
