package com.ustglobal.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="person")
public class Person {
	@Column
	@Id
	private int pid;
	@Column
	private String pname;
	@OneToOne(cascade = CascadeType.ALL)//we are using cascade bcoz we perform all operations
	@JoinColumn(name = "vid")//Foreign key
	private VoterCard voterCard;
	

}
