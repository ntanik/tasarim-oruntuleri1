/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.build;
/**
 *
 * @author User
 */

import builder.menu.Dessert;
import builder.menu.Drink;
import builder.menu.Food;
import builder.menu.Order;
import builder.menu.Salad;


public abstract class OrderBuilder {

   private Order order;

   public OrderBuilder() {

   }

   public Order getOrder() {
      if (order == null) {
         order = new Order();
      }
      return order;
   }

   public abstract void setFood(Food food);

   public abstract void setDrink(Drink drink);

   public abstract void setDessert(Dessert dessert);

   public abstract void setSalad(Salad salad);
}

