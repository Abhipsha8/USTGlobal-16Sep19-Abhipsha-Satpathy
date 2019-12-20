package com.ustglobal.stock.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_info")
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private double total_price;
	@Column
	private double total_price_with_gst;
}
