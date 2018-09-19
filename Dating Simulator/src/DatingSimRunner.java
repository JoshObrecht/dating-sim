import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class DatingSimRunner
	{
		static ArrayList<Character> characters= new ArrayList<Character>();
		
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

			}
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
		Player player = new Player("", 0, 0, 0, 0);
		System.out.println("Hello and thank you for playing. To begin we're going to find out who you are through a personality test."
				+ "\n I'm going give you 10 statements. Type 1 if you agree with the statement. Type 2 if you disagree.");
		
		System.out.println("I see yourself as extraverted.");
		
		System.out.println("I see myself as quarrelsome.");
		
		System.out.println("I see myself as dependable.");
		
		System.out.println("I see myself as anxious.");
		
		System.out.println("I see myself as open to new experiences.");
		
		System.out.println("I see myself as quiet.");
		
		System.out.println("I see myself as sympathetic.");
		
		System.out.println("I see myself as careless.");
		
		System.out.println("I see myself as calm.");
		
		System.out.println("I am not very creative.");
		
		System.out.println("");
		
		
			
		}

	}
