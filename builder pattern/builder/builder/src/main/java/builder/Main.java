/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builder;

/**
 *
 * @author User
 */
import builder.build.JuniorMenuBuilder;
import builder.build.OrderBuilder;
import builder.menu.Dessert;
import builder.menu.Drink;
import builder.menu.Food;
import builder.menu.Order;
import builder.menu.Salad;

/**
 * 
 * @summary The creation Order from OrderBuilder
 */
public class Main {

   private OrderBuilder builders;

   public Order makeOrder(Food food, Drink drink, Dessert dessert, Salad salad) {
      if (food.getFood().equals("Hamburger") && drink.getDrink().equals("Cola") && dessert.getDesert().equals("Ice Cream") && salad.getSalad()
                                                                                                                                   .equals("Cesar Salad")) {
         builders = new JuniorMenuBuilder();
      }

      builders.setFood(food);
      builders.setDrink(drink);
      builders.setDessert(dessert);
      builders.setSalad(salad);
      return builders.getOrder();
   }

   public static void main(String[] args) {

      Food food = new Food("Hamburger");
      Drink drink = new Drink("Cola");
      Dessert dessert = new Dessert("Ice Cream");
      Salad salad = new Salad("Cesar Salad");

      Main waiter = new Main();
      Order juniorMenu = waiter.makeOrder(food, drink, dessert, salad);

      System.out.println("Food:" + juniorMenu.getFood().getFood());
      System.out.println("Drink:" + juniorMenu.getDrink().getDrink());
      System.out.println("Dessert:" + juniorMenu.getDessert().getDesert());
      System.out.println("Salad:" + juniorMenu.getSalad().getSalad());
   }
}
