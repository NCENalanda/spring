package com.nt.beans;

public interface Courier {
   public default   void  deliver(int oid){
		System.out.println("Flipkart(InLine):: delevring order whose order id::"+oid);
   }

}
