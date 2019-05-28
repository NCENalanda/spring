package com.nt.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Order {
	private int orderId;
	private String orderType;
	private Date orderDate;
	private List<String> items;
	private Map<String,Integer> itemPrices;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public Map<String, Integer> getItemPrices() {
		return itemPrices;
	}
	public void setItemPrices(Map<String, Integer> itemPrices) {
		this.itemPrices = itemPrices;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderType=" + orderType + ", orderDate=" + orderDate + ", items="
				+ items + ", itemPrices=" + itemPrices + "]";
	}
  
}
