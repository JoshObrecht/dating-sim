import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCreator
	{
		static ArrayList<Character> characters= new ArrayList<Character>();	
		static Scanner userString = new Scanner(System.in);
		static Scanner userInt = new Scanner(System.in);
		
		public static void createCharacters()
			{
			
				
			Character c0 = new Character("Brad", 1, 0, 0, 1, 10); //Shark
			Character c1 = new Character("Rhonda", 0, 0, 1, 2, 10); //Dolphin
			Character c2 = new Character("Claudia", 0, 0, 2, 3, 4); //Swordfish
			Character c3 = new Character("Janice", 0, 0, 3, 4, 1); //Puffer fish
			Character c4 = new Character("Gerald", 1, 0, 4, 5, 5); //Clown fish
			Character c5 = new Character("Owen", 1, 0, 5, 6, 6); //Tuna
			Character c6 = new Character("Dunham", 1, 0, 20, 20, 20); //Human-Easter Egg
			
			characters.add(c0);
			characters.add(c1);
			characters.add(c2);
			characters.add(c3);
			characters.add(c4);
			characters.add(c5);
			characters.add(c6);
			}
			public static void createPlayer()
			{
				
			int confidence=0;
			int charisma=0; 
			Player player = new Player("", 0, 0, 0, 0);
			
			System.out.println("Hello and thank you for playing. To begin we're going to find out who you are through a personality test."
					+ "\nI'm going give you 10 statements. Type 1 if you agree with the statement. Type 2 if you disagree.");
			
			System.out.println("");
			System.out.println("I see myself as extraverted.");
			
			if(userInt.nextInt()==1)
				{
				confidence+=1;
				charisma+=1;
				}
			else
				{
				confidence-=1;
				charisma-=1;
				}
			
			System.out.println("I see myself as quarrelsome.");
			
			if(userInt.nextInt()==1)
				{
				confidence+=2;
				charisma-=2;
				}
			else
				{
				confidence-=1;
				charisma+=1;
				}
			
			System.out.println("I see myself as dependable.");
			
			if(userInt.nextInt()==1)
				{
				charisma+=1;
				}
			else
				{
				charisma-=1;
				}
			
			System.out.println("I see myself as anxious.");
			
			if(userInt.nextInt()==1)
				{
				confidence-=2;
				charisma-=1;
				}
			else
				{
				confidence+=1;
				charisma+=1;
				}
			
			System.out.println("I see myself as open to new experiences.");
			
			if(userInt.nextInt()==1)
				{
				charisma+=1;
				}
			
			System.out.println("I see myself as quiet.");
			
			if(userInt.nextInt()==1)
				{
				confidence-=1;
				charisma-=2;
				}
			else
				{
				confidence+=1;
				charisma+=2;
				}
			
			System.out.println("I see myself as sympathetic.");
			
			if(userInt.nextInt()==1)
				{
				confidence-=1;
				charisma+=1;
				}
			else
				{
				confidence+=1;
				charisma-=2;
				}
			
			System.out.println("I see myself as careless.");
			
			if(userInt.nextInt()==1)
				{
				confidence+=2;
				charisma-=2;
				}
			else
				{
				confidence-=1;
				charisma+=1;
				}
			
			System.out.println("I see myself as calm.");
			
			if(userInt.nextInt()==1)
				{
				confidence+=1;
				charisma-=1;
				}
			else
				{
				confidence-=1;
				charisma+=1;
				}
			
			System.out.println("I am not very creative.");
			
			if(userInt.nextInt()==1)
				{
				charisma-=1;
				}
			else
				{
				charisma+=2;
				}
			
			System.out.println("Okay! Finally, What's your name?");
			if(confidence<0)
				{
				confidence=0;
				}
			if(charisma<0)
				{
				charisma=0;
				}
			
			player.setName(userString.nextLine());
			player.setCharisma(charisma);
			player.setConfidence(confidence);
			System.out.println(player.getName());
			System.out.println(player.getCharisma());
			System.out.println(player.getConfidence());
			
			
				
			}
	}
