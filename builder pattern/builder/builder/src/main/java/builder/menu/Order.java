/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder.menu;

/**
 *
 * @author User
 */
public class Order {
    
   private Food    food;
   private Drink   drink;
   private Dessert dessert;
   private Salad   salad;

   public Order() {

   }

   public Order(Food food, Drink drink, Dessert dessert, Salad salad) {
      this.food = food;
      this.drink = drink;
      this.dessert = dessert;
      this.salad = salad;
   }

   public Food getFood() {
      return food;
   }

   public void setFood(Food food) {
      this.food = food;
   }

   public Drink getDrink() {
      return drink;
   }

   public void setDrink(Drink drink) {
      this.drink = drink;
   }

   public Dessert getDessert() {
      return dessert;
   }

   public void setDessert(Dessert dessert) {
      this.dessert = dessert;
   }

   public Salad getSalad() {
      return salad;
   }

   public void setSalad(Salad salad) {
      this.salad = salad;
   }

}
