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
public class Food {
    
private String food;
   
   public Food(String food) {
      this.setFood(food);
   }

   public String getFood() {
      return food;
   }

   public void setFood(String food) {
      this.food = food;
   }
}
