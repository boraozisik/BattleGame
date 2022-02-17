package com.boraozisik.game;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			
		Deck player1Deck = new Deck();
		Deck player2Deck = new Deck();
		
		TowerProtector towerProtector1 = new TowerProtector();
		TowerProtector towerProtector2 = new TowerProtector();
		Tower tower1 = new Tower(towerProtector1,"Player1's Tower");
		Tower tower2 = new Tower(towerProtector2,"Player2's Tower");
		
		Player player1 = new Player("Bora", player1Deck,tower1);
		Player player2 = new Player("Batu", player2Deck,tower2);
		
		player1.showGameRules();
		
		String chooseWarriorOptions = "1- For choose Fighter\n"
				+ "2- For choose Archer\n"
				+ "3- For choose Musketeer\n"
				+ "4- For choose Magician\n"
				+ "5- For choose Healer";
		String chooseRaceOptions = "1- For choose Elf\n"
				+ "2- For choose Human\n"
				+ "3- For choose Dwarf\n"
				+ "4- For choose Skeleton\n"
				+ "5- For choose Troll\n"
				+ "q-For Go Back";	
		
		String options = "q- Is for Withdraw\n"
				+ "1-For Attack\n"				
				+ "2-For see the options again";
		
		
		
		while(true) {
			System.out.println();
			System.out.println("Creating Deck");
			System.out.println();
			System.out.println("Which player are you? (player1 or player2(For Finish press q)");
			String playerSelection = input.nextLine();
			if(playerSelection.equals("q")) {
				System.out.println("Finishing...");
				break;
			}
			else if(playerSelection.equals("player1")) {
				System.out.println(chooseWarriorOptions);
				System.out.println("Choose your Warrior");
				String selection = input.nextLine();
				if(selection.equals("1")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Fighter fighter1 = new Fighter("Elf", "Elf Fighter", player1);
						player1.addWarriorToYourDeck(fighter1);
					}
					else if(selection2.equals("2")) {
						Fighter fighter2 = new Fighter("Human", "Human Fighter", player1);
						player1.addWarriorToYourDeck(fighter2);
					}
					else if(selection2.equals("3")) {
						Fighter fighter3 = new Fighter("Dwarf", "Dwarf Fighter", player1);
						player1.addWarriorToYourDeck(fighter3);
					}
					else if(selection2.equals("4")) {
						Fighter fighter4 = new Fighter("Skeleton", "Skeleton Fighter", player1);
						player1.addWarriorToYourDeck(fighter4);
					}
					else if(selection2.equals("5")) {
						Fighter fighter5 = new Fighter("Troll", "Troll Fighter", player1);
						player1.addWarriorToYourDeck(fighter5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("2")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Archer archer1 = new Archer("Elf", "Elf Archer", player1);
						player1.addWarriorToYourDeck(archer1);
					}
					else if(selection2.equals("2")) {
						Archer archer2 = new Archer("Human", "Human Archer", player1);
						player1.addWarriorToYourDeck(archer2);
					}
					else if(selection2.equals("3")) {
						Archer archer3 = new Archer("Dwarf", "Dwarf Archer", player1);
						player1.addWarriorToYourDeck(archer3);
					}
					else if(selection2.equals("4")) {
						Archer archer4 = new Archer("Skeleton", "Skeleton Archer", player1);
						player1.addWarriorToYourDeck(archer4);
					}
					else if(selection2.equals("5")) {
						Archer archer5 = new Archer("Troll", "Troll Archer", player1);
						player1.addWarriorToYourDeck(archer5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("3")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Musketeer musketeer1 = new Musketeer("Elf", "Elf Musketeer", player1);
						player1.addWarriorToYourDeck(musketeer1);
					}
					else if(selection2.equals("2")) {
						Musketeer musketeer2 = new Musketeer("Human", "Human Musketeer", player1);
						player1.addWarriorToYourDeck(musketeer2);
					}
					else if(selection2.equals("3")) {
						Musketeer musketeer3 = new Musketeer("Dwarf", "Dwarf Musketeer", player1);
						player1.addWarriorToYourDeck(musketeer3);
					}
					else if(selection2.equals("4")) {
						Musketeer musketeer4 = new Musketeer("Skeleton", "Skeleton Musketeer", player1);
						player1.addWarriorToYourDeck(musketeer4);
					}
					else if(selection2.equals("5")) {
						Musketeer musketeer5 = new Musketeer("Troll", "Troll Musketeer", player1);
						player1.addWarriorToYourDeck(musketeer5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("4")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Magician magician1 = new Magician("Elf", "Elf Magician", player1);
						player1.addWarriorToYourDeck(magician1);
					}
					else if(selection2.equals("2")) {
						Magician magician2 = new Magician("Human", "Human Magician", player1);
						player1.addWarriorToYourDeck(magician2);
					}
					else if(selection2.equals("3")) {
						Magician magician3 = new Magician("Dwarf", "Dwarf Magician", player1);
						player1.addWarriorToYourDeck(magician3);					
					}
					else if(selection2.equals("4")) {
						Magician magician4 = new Magician("Skeleton", "Skeleton Magician", player1);
						player1.addWarriorToYourDeck(magician4);
					}
					else if(selection2.equals("5")) {
						Magician magician5 = new Magician("Troll", "Troll Magician", player1);
						player1.addWarriorToYourDeck(magician5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("5")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Healer healer1 = new Healer("Elf", "Elf Healer", player1);
						player1.addWarriorToYourDeck(healer1);
					}
					else if(selection2.equals("2")) {
						Healer healer2 = new Healer("Human", "Human Healer", player1);
						player1.addWarriorToYourDeck(healer2);
					}
					else if(selection2.equals("3")) {
						Healer healer3 = new Healer("Dwarf", "Dwarf Healer", player1);
						player1.addWarriorToYourDeck(healer3);			
					}
					else if(selection2.equals("4")) {
						Healer healer4 = new Healer("Skeleton", "Skeleton Healer", player1);
						player1.addWarriorToYourDeck(healer4);
					}
					else if(selection2.equals("5")) {
						Healer healer5 = new Healer("Troll", "Troll Healer", player1);
						player1.addWarriorToYourDeck(healer5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						
					}
				}	
			}
			else if(playerSelection.equals("player2")) {
				System.out.println(chooseWarriorOptions);
				System.out.println("Choose your Warrior");
				String selection = input.nextLine();
				if(selection.equals("1")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Fighter fighter1 = new Fighter("Elf", "Elf Fighter", player2);
						player2.addWarriorToYourDeck(fighter1);
					}
					else if(selection2.equals("2")) {
						Fighter fighter2 = new Fighter("Human", "Human Fighter", player2);
						player2.addWarriorToYourDeck(fighter2);
					}
					else if(selection2.equals("3")) {
						Fighter fighter3 = new Fighter("Dwarf", "Dwarf Fighter", player2);
						player2.addWarriorToYourDeck(fighter3);
					}
					else if(selection2.equals("4")) {
						Fighter fighter4 = new Fighter("Skeleton", "Skeleton Fighter", player2);
						player2.addWarriorToYourDeck(fighter4);
					}
					else if(selection2.equals("5")) {
						Fighter fighter5 = new Fighter("Troll", "Troll Fighter", player2);
						player2.addWarriorToYourDeck(fighter5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("2")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Archer archer1 = new Archer("Elf", "Elf Archer", player2);
						player2.addWarriorToYourDeck(archer1);
					}
					else if(selection2.equals("2")) {
						Archer archer2 = new Archer("Human", "Human Archer", player2);
						player2.addWarriorToYourDeck(archer2);
					}
					else if(selection2.equals("3")) {
						Archer archer3 = new Archer("Dwarf", "Dwarf Archer", player2);
						player2.addWarriorToYourDeck(archer3);
					}
					else if(selection2.equals("4")) {
						Archer archer4 = new Archer("Skeleton", "Skeleton Archer", player2);
						player2.addWarriorToYourDeck(archer4);
					}
					else if(selection2.equals("5")) {
						Archer archer5 = new Archer("Troll", "Troll Archer", player2);
						player2.addWarriorToYourDeck(archer5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("3")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Musketeer musketeer1 = new Musketeer("Elf", "Elf Musketeer", player2);
						player2.addWarriorToYourDeck(musketeer1);
					}
					else if(selection2.equals("2")) {
						Musketeer musketeer2 = new Musketeer("Human", "Human Musketeer", player2);
						player2.addWarriorToYourDeck(musketeer2);
					}
					else if(selection2.equals("3")) {
						Musketeer musketeer3 = new Musketeer("Dwarf", "Dwarf Musketeer", player2);
						player2.addWarriorToYourDeck(musketeer3);
					}
					else if(selection2.equals("4")) {
						Musketeer musketeer4 = new Musketeer("Skeleton", "Skeleton Musketeer", player2);
						player2.addWarriorToYourDeck(musketeer4);
					}
					else if(selection2.equals("5")) {
						Musketeer musketeer5 = new Musketeer("Troll", "Troll Musketeer", player2);
						player2.addWarriorToYourDeck(musketeer5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("4")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Magician magician1 = new Magician("Elf", "Elf Magician", player2);
						player2.addWarriorToYourDeck(magician1);
					}
					else if(selection2.equals("2")) {
						Magician magician2 = new Magician("Human", "Human Magician", player2);
						player2.addWarriorToYourDeck(magician2);
					}
					else if(selection2.equals("3")) {
						Magician magician3 = new Magician("Dwarf", "Dwarf Magician", player2);
						player2.addWarriorToYourDeck(magician3);					
					}
					else if(selection2.equals("4")) {
						Magician magician4 = new Magician("Skeleton", "Skeleton Magician", player2);
						player2.addWarriorToYourDeck(magician4);
					}
					else if(selection2.equals("5")) {
						Magician magician5 = new Magician("Troll", "Troll Magician", player2);
						player2.addWarriorToYourDeck(magician5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						break;
					}
				}
				else if(selection.equals("5")) {
					System.out.println(chooseRaceOptions);
					System.out.println("Choose your Warrior's Race");
					String selection2 = input.nextLine();
					if(selection2.equals("q")) {
						System.out.println("Going Back...");
						break;
					}
					else if(selection2.equals("1")) {
						Healer healer1 = new Healer("Elf", "Elf Healer", player2);
						player2.addWarriorToYourDeck(healer1);
					}
					else if(selection2.equals("2")) {
						Healer healer2 = new Healer("Human", "Human Healer", player2);
						player2.addWarriorToYourDeck(healer2);
					}
					else if(selection2.equals("3")) {
						Healer healer3 = new Healer("Dwarf", "Dwarf Healer", player2);
						player2.addWarriorToYourDeck(healer3);			
					}
					else if(selection2.equals("4")) {
						Healer healer4 = new Healer("Skeleton", "Skeleton Healer", player2);
						player2.addWarriorToYourDeck(healer4);
					}
					else if(selection2.equals("5")) {
						Healer healer5 = new Healer("Troll", "Troll Healer", player2);
						player2.addWarriorToYourDeck(healer5);
					}
					else {
						System.out.println("Invalid transaction!!!");
						
					}
				}
				else {
					System.out.println("Invalid Transaction!!");
					
				}
			}
			else {
				System.out.println("Invalid Transaction!!");
				
			}
		}
			
		
		
		
		while(true) {
			System.out.println();
			System.out.println("Battle Begin");
			System.out.println();
			System.out.println("Which player are you? (player1 or player2)");
			String playerSelection = input.nextLine();
			if(playerSelection.equals("player1")) {
				System.out.println(options);
				System.out.println("Choose your option:");
				String selection = input.nextLine();
				if(selection.equals("q")) {
					System.out.println(player1.getPlayerName() + " withdrawed " +player2.getPlayerName() + "YOU WON THE GAME");
					break;
				}
				else if(selection.equals("1")) {
					System.out.println("---YOUR DECK---");
					player1.getPlayerDeck().showDeck();
					System.out.println("Which warrior do you wanna fight with?(Enter his name clearly)");
					String warriorName = input.nextLine();
					
					if(player2.getPlayerDeck().warriors.size() <= 0) {
						player1.getPlayerDeck().getWarriorByName(warriorName).attackToTower(tower2);
						tower2.startAttack(player1.getPlayerDeck().getWarriorByName(warriorName));
					}
					
					else {
						if(player1.getPlayerDeck().getWarriorByName(warriorName) == null) {
							System.out.println("You entered your warrior's name wrong!!!");
						}
						else {
							System.out.println("---PLAYER2'S DECK---");
							player2.getPlayerDeck().showDeck();
							System.out.println("Which warrior do you wanna attack?(Enter his name clearly)");
							String warriorName2 = input.nextLine();
							if(player2.getPlayerDeck().getWarriorByName(warriorName2) == null) {
								System.out.println("You entered the attacking warrior's name wrong!!!");
							}
							else {
								player1.getPlayerDeck().getWarriorByName(warriorName).attack(player2.getPlayerDeck().getWarriorByName(warriorName2));
							}
							
						}
					}
					
				}
				else if(selection.equals("2")) {
					System.out.println(options);
				}
				else {
					System.out.println("Invalid transaction!!!");
					
				}
			}
			else if(playerSelection.equals("player2")) {
				System.out.println(options);
				System.out.println("Choose your option:");
				String selection = input.nextLine();
				if(selection.equals("q")) {
					System.out.println(player2.getPlayerName() + " withdrawed " +player1.getPlayerName() + "YOU WON THE GAME");
					break;
				}
				else if(selection.equals("1")) {
					System.out.println("---YOUR DECK---");
					player2.getPlayerDeck().showDeck();
					System.out.println("Which warrior do you wanna fight with?(Enter his name clearly)");
					String warriorName = input.nextLine();
					
					if(player1.getPlayerDeck().warriors.size() <= 0) {
						player2.getPlayerDeck().getWarriorByName(warriorName).attackToTower(tower1);
						tower1.startAttack(player2.getPlayerDeck().getWarriorByName(warriorName));
					}
					
					else {
						if(player2.getPlayerDeck().getWarriorByName(warriorName) == null) {
							System.out.println("You entered your warrior's name wrong!!!");
						}
						else {
							System.out.println("---PLAYER1'S DECK---");
							player1.getPlayerDeck().showDeck();
							System.out.println("Which warrior do you wanna attack?(Enter his name clearly)");
							String warriorName2 = input.nextLine();
							if(player1.getPlayerDeck().getWarriorByName(warriorName2) == null) {
								System.out.println("You entered the attacking warrior's name wrong!!!");
							}
							else {
								player2.getPlayerDeck().getWarriorByName(warriorName).attack(player1.getPlayerDeck().getWarriorByName(warriorName2));
							}
							
						}
					}
					
				}
				else if(selection.equals("2")) {
					System.out.println(options);
				}
				else {
					System.out.println("Invalid transaction!!!");
					
				}
			}
			else {
				System.out.println("Wrong player input !!!");
				
			}
			
			
		}
		
	}		
		
		
}		
		
		

	


