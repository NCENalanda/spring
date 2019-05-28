package com.nt.beans;

public class ShoppingStore {
	private Order order;
	private int orderCount;
	private String firstOrderItem;
	private float totalPrice;
	private String orderType;
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
