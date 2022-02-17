package com.boraozisik.game;

public class Archer extends Warrior {

	public Archer(String warriorRace, String warriorName,Player belongsPlayer) {
		super(warriorRace, warriorName,belongsPlayer);
		
		if(warriorRace.equals("Elf")) {
			super.setWarriorPower(93); 
			super.setWarriorHealth(415); 		
			super.setWarriorAttackRange(12); 			
			
				
		}
		else if(warriorRace.equals("Human")) {
			super.setWarriorPower(85);
			super.setWarriorHealth(485);
			super.setWarriorAttackRange(12);
			
				
		}
		else if(warriorRace.equals("Dwarf")) {
			super.setWarriorPower(99);
			super.setWarriorHealth(390);
			super.setWarriorAttackRange(10);
			
				
		}
		else if(warriorRace.equals("Skeleton")) {
			super.setWarriorPower(104);
			super.setWarriorHealth(430);
			super.setWarriorAttackRange(14);
			
				
		}
		else if(warriorRace.equals("Troll")) {
			super.setWarriorPower(64);
			super.setWarriorHealth(700);
			super.setWarriorAttackRange(9);
			
				
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


