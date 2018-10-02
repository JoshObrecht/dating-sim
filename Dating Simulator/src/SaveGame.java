import java.io.*;
import java.util.ArrayList;

public class SaveGame
	{
		public static void saveGame() throws InterruptedException
		{
		String filename ="Save 1.ser";
		ArrayList<Object> people = new ArrayList<Object>();
		try
			{
				FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);
				
				people.add(CharacterCreator.player);
				people.add(CharacterCreator.c0);
				people.add(CharacterCreator.c1);
				people.add(CharacterCreator.c2);
				people.add(CharacterCreator.c3);
				people.add(CharacterCreator.c4);
				people.add(CharacterCreator.c5);
				people.add(CharacterCreator.c6);
				
				out.writeObject(people);
				
				out.close();
				file.close();
				
				GenerateStory.printText("Game Saved.");
			}
		catch(IOException ex)
			{
				System.out.println("IOException Caught.");
			}
		}
		
		public static void loadGame() throws InterruptedException
		{
			String filename ="Save 1.ser";
			ArrayList<Object> people = new ArrayList<Object>();
			try
				{
					FileInputStream file= new FileInputStream(filename);
					ObjectInputStream in = new ObjectInputStream(file);
					
					people=(ArrayList<Object>)in.readObject();
					
					CharacterCreator.player= (Player) people.get(0);
					CharacterCreator.c0= (Character) people.get(1);
					CharacterCreator.c1= (Character) people.get(2);
					CharacterCreator.c2= (Character) people.get(3);
					CharacterCreator.c3= (Character) people.get(4);
					CharacterCreator.c4= (Character) people.get(5);
					CharacterCreator.c5= (Character) people.get(6);
					CharacterCreator.c6= (Character) people.get(7);
					
					in.close();
					file.close();
				} 
			
			catch (IOException ex)
				{
					System.out.println("IOExcpetion Caught.");
				} 
			catch (ClassNotFoundException e)
				{
					e.printStackTrace();
				}
			switch(CharacterCreator.player.getState())
			{
				case 1:
					GenerateStory.beginDayOne();
					break;
				default:
					GenerateStory.beginPrologue();
					break;
			}
		}
	}
