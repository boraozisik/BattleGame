package com.boraozisik.game;

public class Warrior {
	
	
	private String warriorName;
	
	private int warriorPower;
	private int warriorHealth;
	private int warriorAttackRange;	
	private Player belongsPlayer;
	
	
	public Warrior(String warriorRace,String warriorName,Player belongsPlayer) {
		
		this.warriorName = warriorName;
		this.belongsPlayer = belongsPlayer;
	}
		
	

	public Player getBelongsPlayer() {
		return belongsPlayer;
	}



	public void setBelongsPlayer(Player belongsPlayer) {
		this.belongsPlayer = belongsPlayer;
	}



	public String getWarriorName() {
		return warriorName;
	}



	public void setWarriorName(String warriorName) {
		this.warriorName = warriorName;
	}



	


	public int getWarriorPower() {
		return warriorPower;
	}


	public void setWarriorPower(int warriorPower) {
		this.warriorPower = warriorPower;
	}


	public int getWarriorHealth() {
		return warriorHealth;
	}


	public void setWarriorHealth(int warriorHealth) {
		this.warriorHealth = warriorHealth;
	}


	public int getWarriorAttackRange() {
		return warriorAttackRange;
	}


	public void setWarriorAttackRange(int warriorAttackRange) {
		this.warriorAttackRange = warriorAttackRange;
	}


	
	
	




	public void showWarriorFeatures() {
		System.out.println("Warrior's Name: " +this.warriorName);
		
		System.out.println("Warrior's Power: " +this.warriorPower);
		System.out.println("Warrior's Health: " +this.warriorHealth);
		System.out.println("Warrior's Attack Range: " +this.warriorAttackRange);		
		System.out.println("This warrior belongs to: " +this.getBelongsPlayer().getPlayerName());
	}
	
	public void attack(Warrior warrior) {
		System.out.println(this.getWarriorName() +" is attacking to " +warrior.getWarriorName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(warrior.getWarriorHealth() <= this.getWarriorPower()) {
			warrior.setWarriorHealth(0);
			System.out.println(warrior.getWarriorName() +" is dead!!");
			warrior.getBelongsPlayer().getPlayerDeck().removeFromDeck(warrior);
			
				if(warrior.getBelongsPlayer().getPlayerDeck().warriors.size() == 0) {
					
					warrior.getBelongsPlayer().getPlayerTower().setAllowedToAttack(true);
				}
		}
		else {
			warrior.setWarriorHealth(warrior.getWarriorHealth() - this.getWarriorPower());
			System.out.println("Warrior " +warrior.getWarriorName() + " has " +warrior.getWarriorHealth() +" health left.");
		}
		
			
	}
	
	
	public void attackToTower(Tower tower) {
		if(this.belongsPlayer.getPlayerTower().isAllowedToAttack()) {
			System.out.println(this.getWarriorName() +" is attacking to " +tower.getTowerName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(tower.getTowerHealth() <= this.getWarriorPower()) {
				tower.setTowerHealth(0);
				System.out.println(tower.getTowerName()+" has been destroyed!!!");
				System.out.println(tower.getTowerName()+" has been destroyed  HE LOSED THE GAME!!!");
												
			}
			else {
				tower.setTowerHealth(tower.getTowerHealth() - this.getWarriorPower());
				System.out.println("The tower has " +tower.getTowerHealth() +" health left.");
			}
		}
		else {
			System.out.println("You can't attack to this tower because this tower's player still has warriors in his deck!!!");
		}
		
	}
}	
