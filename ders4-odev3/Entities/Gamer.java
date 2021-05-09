package Entities;

import java.util.ArrayList;
import Abstract.Entity;

public class Gamer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<Game> games;
	
	
	public Gamer() {
		
	}
	public Gamer(int id, String firstName, String lastName, ArrayList<Game> games) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.games = games;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	
	

}
