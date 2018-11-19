/**
 * This is the model class which is the container for the various items of the tax 
 */

package com.sample.model;

import java.math.BigDecimal;

public class EuroCountry {
   public enum Country {
      Germany, Belgium
   }
   
   public enum Type {
      GROCERIES, MEDICINES, WATCHES, LUXURYGOODS
   }
   
   private Country purchaseCountry;
   private BigDecimal sellPrice;
   private Type typeofItem;
   public BigDecimal localTax;
   
   public Country getPurchaseCountry() {
      return purchaseCountry;
   }
   
   public void setPurchaseCountry(Country purchaseCountry) {
      this.purchaseCountry = purchaseCountry;
   }
   
   public BigDecimal getSellPrice() {
      return sellPrice;
   }
   
   public void setSellPrice(BigDecimal sellPrice) {
      this.sellPrice = sellPrice;
   }
   
   public Type getTypeofItem() {
      return typeofItem;
   }
   
   public void setTypeofItem(Type typeofItem) {
      this.typeofItem = typeofItem;
   }
   
   public BigDecimal getLocalTax() {
      return localTax;
   }
   
   public void setLocalTax(BigDecimal localTax) {
      this.localTax = localTax;
   }
}