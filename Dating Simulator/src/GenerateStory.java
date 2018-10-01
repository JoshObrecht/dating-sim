import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class GenerateStory
	{
	 static Scanner userInput= new Scanner(System.in);
	 static int scale=1;
     public static void beginPrologue() throws InterruptedException
     {
    	
    	printText(CharacterCreator.player.getName()+": 'Once again, I am the new kid in town...'");
    	printText("(Whenever you see an elipse hit enter to advance the text on screen)");
    	userInput.nextLine();

    	printText("'I have to move around a lot because of my dad's work. This time, however, my dad was moved the weirdest place possible...'");
    	userInput.nextLine();
    	
    	printText("'The Ocean, and not just some island in the middle of the ocean, he was LITERALLY moved underwater...'"); 
    	userInput.nextLine();
    	
    	printText("'Now I have to go to some preppy school that's also underwater...'");
    	userInput.nextLine();
    	
    	printText("'Except there's one catch, I'm the ONLY human (as far as I know)...'");
    	userInput.nextLine();
    	
    	printText("'Tommorrow is my first day of school and I'm stressing out...'");
    	userInput.nextLine();
    	
    	if((CharacterCreator.player.getCharisma()>=7)&&(CharacterCreator.player.getCharisma()<10))
    		{
    		printText("'Although I really shouldn't worry. I've always been able to make friends really really easily...'");
    		userInput.nextLine();
    		}
    	else if((CharacterCreator.player.getCharisma()<7)&&(CharacterCreator.player.getCharisma()>=4))
    		{
    		printText("'I'm not totally worried, though, most of the time I've been able to find a small group of friends that I get along with...");
    		userInput.nextLine();
    		}
    	else
    		{
    		printText("'Making friends is not my forte. I spent most of my lunches over the last few years under a tree by myself...'");
    		userInput.nextLine();
    		}
    	
    	printText("'Ah, I might as well get some rest, don't want to be exhausted on my first day...'");
    	printText("(Hit enter to begin your first day)");
    	userInput.nextLine();
    	
    	clearConsole();
    	
    	
    	
    	 	
     }
     public static void beginDayOne()
     {
    	 System.out.println("DAY ONE...");
    	 userInput.nextLine();
    	 System.out.println("");
     }
     
     public static String printText(String s) throws InterruptedException
     {
    	 int counter=1;
    	 boolean check=false;
    	 for(int i=0; i<s.length(); i++)
    	 {
    
    		System.out.print(s.substring(i, i+1));
    		Thread.sleep(50L);
//    		if(userInput.nextLine()!=null)
//    			{
//    				check= true;
//    				break;
//    			}
//    		counter+=1;
    		
    	 }
    	 if(check)
    		 {
    	 System.out.print(s.substring(counter));
    	 System.out.println("");
    		 }
    	 System.out.println("");
    
    	 return s;
     }
     
     public static void clearConsole()
    	 {
    	 for(int i=0; i<100; i++)
    	 {
    		System.out.println("\n"); 
    	 }
    	 }
     
	}
