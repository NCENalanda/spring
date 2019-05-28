package com.nt.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ord")
public class Order {
	@Value("#{ T(java.lang.Math).random() *100}")
	private int orderId;
	@Value("premium")
	private String orderType;
	@Autowired
	private Date orderDate;
	
	private List<String> items;
	private Map<String,Integer> itemPrices;
	
	public Order() {
		items=new ArrayList();
		items.add("idly"); items.add("poha"); items.add("vadapav");
		items.add("jelebi");
		
		itemPrices=new HashMap();
		itemPrices.put("idly",25);
		itemPrices.put("poha",30);
		itemPrices.put("vadapav",5);
		itemPrices.put("jelebi",10);
	}
	
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
