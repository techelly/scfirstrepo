package com.scb.usecasetwousingspring.entity;



import jakarta.persistence.Entity;
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
	@ManyToOne @JoinColumn(name="custId", nullable=false)
	private Customers customers;
}
