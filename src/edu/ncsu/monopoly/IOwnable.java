package edu.ncsu.monopoly;

public interface IOwnable {

	String getName();

	Player getOwner();

	int getPrice();

	boolean isAvailable();

	boolean playAction(String newParam);

	void setAvailable(boolean available);

	void setOwner(Player owner);

	String toString();

}