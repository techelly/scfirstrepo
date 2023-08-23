package com.scb.usecasetwousingspring.entity;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Accounts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;//PRIMARY KEY
	private String accountType;
	private Integer accountNumber;
	private String accountBranch;
	private Double accountBalance;
	//owning side
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY) @JoinColumn(name="custId", nullable=false)
	@Exclude
	@JsonIgnore
	private Customers customers;
}
