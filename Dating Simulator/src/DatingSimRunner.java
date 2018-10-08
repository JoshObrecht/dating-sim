import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class DatingSimRunner
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[] args) throws InterruptedException
			{
				GenerateStory.printText("Welcome to 'All the Fish in the Sea'!");
				GenerateStory.printText("(Press any button to begin)");
				userInput.nextLine();
				
				GenerateStory.clearConsole();
				
				GenerateStory.printText("1) New Game \n"
						+ "2) Load Game\n"
						+ "(Type the number that corresponds with the desired option)");
				
				if(userInput.nextInt()==1)
					{
						CharacterCreator.createCharacters();
						CharacterCreator.createPlayer();
						GenerateStory.clearConsole();
						GenerateStory.beginPrologue();
					}
				else
					{
						GenerateStory.clearConsole();
						SaveGame.loadGame();
					}
			}
		
	}
