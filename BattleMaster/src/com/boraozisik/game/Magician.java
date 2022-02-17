package com.boraozisik.game;

public class Magician extends Warrior {
	
	public Magician(String warriorRace,String warriorName,Player belongsPlayer){
		super(warriorRace,warriorName,belongsPlayer);
		
		if(warriorRace.equals("Elf")) {
			super.setWarriorPower(150);
			super.setWarriorHealth(410);
			super.setWarriorAttackRange(17);
			
				
		}
		else if(warriorRace.equals("Human")) {
			super.setWarriorPower(150);
			super.setWarriorHealth(405);
			super.setWarriorAttackRange(17);
			
			
				
		}
		else if(warriorRace.equals("Dwarf")) {
			super.setWarriorPower(135);
			super.setWarriorHealth(440);
			super.setWarriorAttackRange(15);
			
				
		}
		else if(warriorRace.equals("Skeleton")) {
			super.setWarriorPower(140);
			super.setWarriorHealth(475);
			super.setWarriorAttackRange(16);
			
				
		}
		else if(warriorRace.equals("Troll")) {
			super.setWarriorPower(125);
			super.setWarriorHealth(650);
			super.setWarriorAttackRange(13);
			
				
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
