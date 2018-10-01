import java.io.*;
public class SaveGame
	{
		public static void saveGame() throws InterruptedException
		{
		String filename ="Save 1.ser";
		try
			{
				FileOutputStream file = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(file);
				
				out.writeObject(CharacterCreator.player);
				for(Character c: CharacterCreator.characters)
					{
						out.writeObject(c);
					}
				
				out.close();
				file.close();
				
				GenerateStory.printText("Game Saved.");
			}
		catch(IOException ex)
			{
				System.out.println("IOException Caught.");
			}
		}
		
		public static void loadGame()
		{
			String filename ="Save 1.ser";
			try
				{
					FileInputStream file= new FileInputStream(filename);
					ObjectInputStream in = new ObjectInputStream(file);
					
					CharacterCreator.player = (Player)in.readObject();
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
		}
	}
