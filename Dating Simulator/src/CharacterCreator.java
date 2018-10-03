import java.util.ArrayList;
import java.util.Scanner;

public class CharacterCreator
	{
		static ArrayList<Character> characters= new ArrayList<Character>();	
		static Scanner userString = new Scanner(System.in);
		static Scanner userInt = new Scanner(System.in);
		static Player player = new Player("", 0, 0, 0, 0, 0);
		
		static Character c0 = new Character("Brad", 1, 0, 0, 1, 10); //Shark-popular
		static Character c1 = new Character("Rhonda", 0, 0, 1, 2, 10); //Dolphin-popular
		static Character c2 = new Character("Claudia", 0, 0, 2, 3, 0); //Swordfish-unpopular
		static Character c3 = new Character("Gerald", 1, 0, 3, 4, 0); //Puffer fish-unpopular
		static Character c4 = new Character("Janice", 1, 0, 4, 5, 5); //Clown fish-in the middle
		static Character c5 = new Character("Jim", 1, 0, 5, 6, 5); //Tuna-in the middle
		
		static Character c6 = new Character("Dunham", 1, 0, 20, 20, 20); //Human-Easter Egg
		
		public static void createCharacters()
			{
			characters.add(c0);
			characters.add(c1);
			characters.add(c2);
			characters.add(c3);
			characters.add(c4);
			characters.add(c5);
			characters.add(c6);
			}
			public static void createPlayer() throws InterruptedException
			{
				
			int intelligence=0;
			int charisma=0; 
			
			
			GenerateStory.printText("Hello and thank you for playing. To begin we're going to find out who you are through a personality test."
					+ "\nI'm going give you 10 statements. Type 1 if you agree with the statement. Type 2 if you disagree.");
			
			System.out.println("");
			GenerateStory.printText("I see myself as extraverted.");
			
			if(userInt.nextInt()==1)
				{
				intelligence-=1;
				charisma+=1;
				}
			else
				{
				intelligence+=1;
				charisma-=1;
				}
			
			GenerateStory.printText("I see myself as quarrelsome.");
			
			if(userInt.nextInt()==1)
				{
				intelligence-=1;
				charisma+=1;
				}
			else
				{
				intelligence+=1;
				charisma-=1;
				}
			
			GenerateStory.printText("I see myself as dependable.");
			
			if(userInt.nextInt()==1)
				{
				charisma-=1;
				intelligence+=1;
				}
			else
				{
				charisma+=1;
				intelligence-=1;
				}
			
			GenerateStory.printText("I see myself as anxious.");
			
			if(userInt.nextInt()==1)
				{
				intelligence+=1;;
				charisma-=1;
				}
			else
				{
				intelligence-=1;
				charisma+=1;
				}
			
			GenerateStory.printText("I see myself as open to new experiences.");
			
			if(userInt.nextInt()==1)
				{
				charisma+=1;
				intelligence-=1;
				}
			else
				{
				charisma-=1;
				intelligence+=1;
				}
			
			GenerateStory.printText("I see myself as quiet.");
			
			if(userInt.nextInt()==1)
				{
				intelligence+=1;
				charisma-=1;
				}
			else
				{
				intelligence-=1;
				charisma+=1;
				}
			
			GenerateStory.printText("I see myself as sympathetic.");
			
			if(userInt.nextInt()==1)
				{
				intelligence-=1;
				charisma+=1;
				}
			else
				{
				intelligence+=1;
				charisma-=1;
				}
			
			GenerateStory.printText("I see myself as careless.");
			
			if(userInt.nextInt()==1)
				{
				intelligence-=1;
				charisma+=1;
				}
			else
				{
				intelligence+=1;
				charisma-=1;
				}
			
			GenerateStory.printText("I see myself as calm.");
			
			if(userInt.nextInt()==1)
				{
				intelligence+=1;
				charisma-=1;
				}
			else
				{
				intelligence-=1;
				charisma+=1;
				}
			
			GenerateStory.printText("I am not very creative.");
			
			if(userInt.nextInt()==1)
				{
				intelligence+=1;
				charisma-=1;
				}
			else
				{
				intelligence-=1;
				charisma+=1;
				}
			
			GenerateStory.printText("Okay! Finally, What's your name?");
			if(intelligence<0)
				{
				intelligence=0;
				}
			if(charisma<0)
				{
				charisma=0;
				}
			
			if(intelligence==10)
				{
				c1.setAttraction(0);
				c2.setAttraction(0);
				c2.setAttraction(2);
				c3.setAttraction(2);
				c5.setAttraction(1);
				c6.setAttraction(1);
				}
			if(charisma==10)
				{
				c0.setAttraction(2);
				c1.setAttraction(2);
				c2.setAttraction(0);
				c3.setAttraction(0);
				c5.setAttraction(1);
				c6.setAttraction(1);
				}
			if((charisma==0)&&(intelligence==0))
				{
				c0.setAttraction(0);
				c1.setAttraction(0);
				c2.setAttraction(0);
				c3.setAttraction(0);
				c5.setAttraction(0);
				c6.setAttraction(0);	
				}
			if((intelligence>=3)&&(intelligence<5))
				{
				c0.setAttraction(0);
				c1.setAttraction(0);
				c2.setAttraction(1);
				c3.setAttraction(1);
				c5.setAttraction(2);
				c6.setAttraction(2);		
				}
			if((charisma>=3)&&(charisma<5))
				{
				c0.setAttraction(1);
				c1.setAttraction(1);
				c2.setAttraction(0);
				c3.setAttraction(0);
				c5.setAttraction(2);
				c6.setAttraction(2);
				}
			
			
			
			
			
			player.setName(userString.nextLine());
			player.setCharisma(charisma);
			player.setIntelligence(intelligence);
			
			SaveGame.saveGame();
				
			}
	}
