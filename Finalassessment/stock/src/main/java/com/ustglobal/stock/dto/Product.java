package com.ustglobal.stock.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="product_info")
public class Product {
	@GeneratedValue
	@Id
	@Column
	private int id;
	@Column(unique = true)
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="order_history_info", joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="order_id"))

	private List<OrderHistory> history;
	private OrderInfo orderInfo;
}
