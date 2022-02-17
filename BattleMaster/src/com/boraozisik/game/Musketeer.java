package com.boraozisik.game;

public class Musketeer extends Warrior{
	
	public Musketeer(String warriorRace,String warriorName,Player belongsPlayer){
		super(warriorRace,warriorName,belongsPlayer);
		
		if(warriorRace.equals("Elf")) {
			super.setWarriorPower(95);
			super.setWarriorHealth(498);
			super.setWarriorAttackRange(14);
			
				
		}
		else if(warriorRace.equals("Human")) {
			super.setWarriorPower(87);
			super.setWarriorHealth(500);
			super.setWarriorAttackRange(14);
			
				
		}
		else if(warriorRace.equals("Dwarf")) {
			super.setWarriorPower(120);
			super.setWarriorHealth(440);
			super.setWarriorAttackRange(12);
			
				
		}
		else if(warriorRace.equals("Skeleton")) {
			super.setWarriorPower(122);
			super.setWarriorHealth(456);
			super.setWarriorAttackRange(17);
			
			
				
		}
		else if(warriorRace.equals("Troll")) {
			super.setWarriorPower(98);
			super.setWarriorHealth(810);
			super.setWarriorAttackRange(12);
			
				
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
	
	
