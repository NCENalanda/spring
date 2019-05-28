package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("store")
public class ShoppingStore {
	@Autowired
	private Order order;
	@Value("#{ord.items.size()}")
	private int orderCount;
	@Value("#{ord.items[0]}")
	private String firstOrderItem;
	@Value("#{ord.itemPrices['idly']+ord.itemPrices['poha']+ord.itemPrices['vadapav']+ord.itemPrices['jelebi'] }")
	private float totalPrice;
	@Value("#{ord.orderType}")
	private String orderType;
	@Value("#{systemProperties['java.vm.specification.vendor']}")
	private String javaVendor;
	public void setJavaVendor(String javaVendor) {
		this.javaVendor=javaVendor;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public void setFirstOrderItem(String firstOrderItem) {
		this.firstOrderItem = firstOrderItem;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	@Override
	public String toString() {
		return "ShoppingStore [order=" + order + ", orderCount=" + orderCount + ", firstOrderItem=" + firstOrderItem
				+ ", totalPrice=" + totalPrice + ", orderType=" + orderType +",  javaVendor="+javaVendor+"]";
	}
  
	
}
