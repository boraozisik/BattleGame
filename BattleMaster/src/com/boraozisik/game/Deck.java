package com.boraozisik.game;

import java.util.ArrayList;

public class Deck {
	
	ArrayList<Warrior> warriors;

	public Deck() {
		this.warriors = new ArrayList<Warrior>();
	}
	
	
	public void addToDeck(Warrior warrior) {
		this.warriors.add(warrior);
	}
	
	public void removeFromDeck(Warrior warrior) {
		this.warriors.remove(warrior);		
	}
	
	public void showDeck() {
		for(Warrior value: this.warriors) {
			value.showWarriorFeatures();
			System.out.println("***********************");
			System.out.println("-----------------------");
		}
	}
	public Warrior getWarriorByName(String name) {
		for(Warrior warrior: this.warriors) {
			if(warrior.getWarriorName().equals(name)) {
				return warrior;
			}
		}
		return null;
	}

}
