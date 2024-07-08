/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantdeliverysystem;

import java.util.ArrayList;

/**
 *
 * @author Acer Nitro
 */
public class Order {
       private Double total ;
      private String orderID;
       private ArrayList<Items> itemsList;  
    private PaymentMethod paymentMethod;
      private   String domicilio;

    public Order(Double total, ArrayList<Items> itemsList) {  //ArrayList<Items> itemsList
        this.setTotal(total);
        this.setItemsList(itemsList);
        this.setOrderID(orderID);
        this.setPaymentMethod(paymentMethod);
        this.setDomicilio(domicilio);
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
     
   
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean processOrder(Double totalAmount) {
      
        return paymentMethod.processPayment(totalAmount);
    }

    public String getPaymentDetails() {
        return paymentMethod.getPaymentDetails();
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public ArrayList<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Items> itemsList) {
        this.itemsList = itemsList;
    }
    
    public Items getItemAtIndex(int n){
      return  this.itemsList.get(n);
    }
    
}
