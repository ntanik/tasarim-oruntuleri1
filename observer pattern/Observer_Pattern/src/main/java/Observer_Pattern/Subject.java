/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer_Pattern;

public interface Subject {

	// Register and unregister Systems's Users
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);


	// Notify users if there is a change
	public void notifyObservers();

	// Get updates from subjects
	public Object getUpdate(Observer obj);
}