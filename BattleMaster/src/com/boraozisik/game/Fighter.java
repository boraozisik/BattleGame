package com.boraozisik.game;



public class Fighter extends Warrior{
	
	
	

	public Fighter(String warriorRace,String warriorName,Player belongsPlayer){
		super(warriorRace,warriorName,belongsPlayer);
		
		if(warriorRace.equals("Elf")) {
			super.setWarriorPower(86);
			super.setWarriorHealth(615);
			super.setWarriorAttackRange(5);
			
				
		}
		else if(warriorRace.equals("Human")) {
			super.setWarriorPower(78);
			super.setWarriorHealth(685);
			super.setWarriorAttackRange(5);
			
				
		}
		else if(warriorRace.equals("Dwarf")) {
			super.setWarriorPower(92);
			super.setWarriorHealth(590);
			super.setWarriorAttackRange(3);
			
				
		}
		else if(warriorRace.equals("Skeleton")) {
			super.setWarriorPower(97);
			super.setWarriorHealth(557);
			super.setWarriorAttackRange(7);
			
				
		}
		else if(warriorRace.equals("Troll")) {
			super.setWarriorPower(55);
			super.setWarriorHealth(900);
			super.setWarriorAttackRange(2);
			
				
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
	
	


	
	
		
	


