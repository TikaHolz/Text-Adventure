import java.util.Scanner;
public class TextAdventure
	{
	public static void main(String []args)
		{
		Scanner userIntInput = new Scanner(System.in);
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userStringInput.nextLine();
		System.out.println("Hello, " + name + " nice to meet you");
		
		
		System.out.println("Its a dark and stormy night. You are running through the enpty streets of Boston. You can either go into the ally or you can run into a shop?");
		System.out.println("\t (1) Alley");
		System.out.println("\t (2) Shop");
		int alleyOrShop = userIntInput.nextInt();
		
		if(alleyOrShop == 1)
			{
			//alley
			System.out.println("You enter the alley and you are faced with a masked assaliant. Do you try to fight or do you run?");
			System.out.println("\t (1) Fight");
			System.out.println("\t (2) Run");
			int fightOrRun = userIntInput.nextInt();
			if(fightOrRun == 1)
				{
				//fight
				System.out.println("You try to fight, but you fail. They come at you with nunchucks.");
				}
			else if(fightOrRun == 2)
				{
				//run
				System.out.println("You run into the street. They follow you. you keep running, but a pack of wild dogs come and attack you.");	
				}
			}
		
		else if(alleyOrShop == 2)
			{
			//shop
			System.out.println("You walk into the shop. When you get there you are faced with two doors. The red door or the blue door. ");
			System.out.println("\t (1) Red door");
			System.out.println("\t (2) Blue door");
			int redOrBlue = userIntInput.nextInt();
			
			if(redOrBlue == 1)
				{
				//red
				System.out.println("You walk into a room full of fire. it comsumes your being. You die");
				}
			else if(redOrBlue == 2)
				{
				//blue
				System.out.println("You step into a pool of water. You now regret not taking swimming lessons when you were younger. You die");
				}
			}
		
		
		}
	}
