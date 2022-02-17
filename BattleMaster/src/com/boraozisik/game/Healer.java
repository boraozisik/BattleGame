package com.boraozisik.game;

public class Healer extends Warrior {
	
	public Healer(String warriorRace,String warriorName,Player belongsPlayer){
		super(warriorRace,warriorName,belongsPlayer);
		
		if(warriorRace.equals("Elf")) {
			super.setWarriorPower(25);
			super.setWarriorHealth(380);
			super.setWarriorAttackRange(32);
			
				
		}
		else if(warriorRace.equals("Human")) {
			super.setWarriorPower(23);
			super.setWarriorHealth(400);
			super.setWarriorAttackRange(32);
			
				
		}
		else if(warriorRace.equals("Dwarf")) {
			super.setWarriorPower(30);
			super.setWarriorHealth(410);
			super.setWarriorAttackRange(28);
			
				
		}
		else if(warriorRace.equals("Skeleton")) {
			super.setWarriorPower(32);
			super.setWarriorHealth(405);
			super.setWarriorAttackRange(31);
			
				
		}
		else if(warriorRace.equals("Troll")) {
			super.setWarriorPower(35);
			super.setWarriorHealth(420);
			super.setWarriorAttackRange(28);
			
				
		}
		else {
			System.out.println("Invalid race name!!!");
		}
			 
		
		
	
	}

	@Override
	public void attack(Warrior warrior) {		
		super.attack(warrior);
		
	}

	@Override
	public void attackToTower(Tower tower) {		
		super.attackToTower(tower);
	}
	
	

}
