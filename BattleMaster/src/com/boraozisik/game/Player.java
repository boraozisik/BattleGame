package com.boraozisik.game;



public class Player {
	
	private String playerName;
	private Deck playerDeck;
	private Tower playerTower;
	
	
	
	
	
	
	
	public Player(String playerName, Deck playerDeck, Tower playerTower) {
		super();
		this.playerName = playerName;
		this.playerDeck = playerDeck;
		this.playerTower = playerTower;
		
	}
	
	public void showGameRules() {
		String rules = "This game is playing with 2 players.\n"
				+ "Each player has warrior deck with size 5.\n"
				+ "These warriors is fighting and when one of the players has not any warrior in his deck the rival player can attack other player's tower.\n"
				+ "If your tower destroyed you will lose the game!!!";
		
		System.out.println(rules);
	}
	
	
	public Tower getPlayerTower() {
		return playerTower;
	}

	public void setPlayerTower(Tower playerTower) {
		this.playerTower = playerTower;
	}

	public Deck getPlayerDeck() {
		return playerDeck;
	}

	public void setPlayerDeck(Deck playerDeck) {
		this.playerDeck = playerDeck;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	
	
	public void addWarriorToYourDeck(Warrior warrior) {		
		if(this.getPlayerDeck().warriors.size() >= 5) {
			System.out.println("You can't add a warrior to your deck because you have already 5 warriors in your deck!!!");
		}
		else {
			this.getPlayerDeck().addToDeck(warrior);
			
		}
	}
	

}
