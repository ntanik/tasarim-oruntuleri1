/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.build;

import builder.menu.Dessert;
import builder.menu.Drink;
import builder.menu.Food;
import builder.menu.Salad;


public class JuniorMenuBuilder extends OrderBuilder {

   @Override
   public void setFood(Food food) {
      getOrder().setFood(food);
   }

   @Override
   public void setDrink(Drink drink) {
      getOrder().setDrink(drink);
      
   }

   @Override
   public void setDessert(Dessert dessert) {
      getOrder().setDessert(dessert);
      
   }

   @Override
   public void setSalad(Salad salad) {
      getOrder().setSalad(salad);
      
   }

}
