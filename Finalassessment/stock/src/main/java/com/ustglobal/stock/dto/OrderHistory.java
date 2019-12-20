package com.ustglobal.stock.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="order_history_info")
public class OrderHistory {
	@Id
	@Column(unique = true)
	private int order_id;
	@Column(unique = true)
	private int product_id;

	//@Exclude
	//@ManyToMany(cascade=CascadeType.ALL,mappedBy = "history")
	//	private List<Product> products;

}
