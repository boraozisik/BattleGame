package com.boraozisik.game;

public class Tower {
	private TowerProtector towerProtector;
	private int towerHealth;	
	private boolean isAllowedToAttack;
	private String towerName;
	
	
	public Tower(TowerProtector towerProtector,String towerName) {
		
		this.towerProtector = towerProtector;
		
		this.isAllowedToAttack = false;
		this.towerName = towerName;
		this.towerHealth = 500;
	}


	public TowerProtector getTowerProtector() {
		return towerProtector;
	}


	public void setTowerProtector(TowerProtector towerProtector) {
		this.towerProtector = towerProtector;
	}


	public String getTowerName() {
		return towerName;
	}


	public void setTowerName(String towerName) {
		this.towerName = towerName;
	}


	public int getTowerHealth() {
		return towerHealth;
	}


	public void setTowerHealth(int towerHealth) {
		this.towerHealth = towerHealth;
	}


	
	
	
	
	
	public boolean isAllowedToAttack() {
		return isAllowedToAttack;
	}


	public void setAllowedToAttack(boolean isAllowedToAttack) {
		this.isAllowedToAttack = isAllowedToAttack;
	}

	
	
	
	public void startAttack(Warrior warrior) {
		if(isAllowedToAttack) {
			System.out.println("Tower is attacking to " +warrior.getWarriorName());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(warrior.getWarriorHealth() <= this.getTowerProtector().getProtectorPower()) {
				warrior.setWarriorHealth(0);
				System.out.println(warrior.getWarriorName() +" is dead!!");
				warrior.getBelongsPlayer().getPlayerDeck().removeFromDeck(warrior);
				
					if(warrior.getBelongsPlayer().getPlayerDeck().warriors.size() == 0) {						
						warrior.getBelongsPlayer().getPlayerTower().setAllowedToAttack(true);
					}
			}
			else {
				warrior.setWarriorHealth(warrior.getWarriorHealth() - this.getTowerProtector().getProtectorPower());
				System.out.println("Warrior " +warrior.getWarriorName() + " has " +warrior.getWarriorHealth() +" health left.");
			}
			
		}
		else {
			System.out.println("This tower is not allowed to attack because this tower's player still has warrior in his deck!!!");
		}
	}

}
