import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class GenerateStory
	{
	 static Scanner userInput= new Scanner(System.in);
	 static int scale=1;
     public static void beginPrologue() throws InterruptedException
     {
    	
    	System.out.print(CharacterCreator.player.getName()+": 'Once again, ");
    	TimeUnit.SECONDS.sleep((long) ((long) scale*1.5)); 
    	System.out.println("I am the new kid in town...'");
    	TimeUnit.SECONDS.sleep((long) ((long) scale*1)); 
    	System.out.println("(Whenever you see an elipse hit enter to advance the text on screen)");
    	userInput.nextLine();

    	System.out.println("'I have to move around a lot because of my dad's work.");
    	TimeUnit.SECONDS.sleep((long) ((long) scale*1.5)); 
    	System.out.println("This time, however, my dad was moved the weirdest place possible...'");
    	TimeUnit.SECONDS.sleep(1); 
    	userInput.nextLine();
    	
    	System.out.print("'The Ocean");
    	TimeUnit.SECONDS.sleep(scale); 
    	System.out.print(" and not just some island in the middle of the ocean, ");
    	TimeUnit.SECONDS.sleep((long) ((long) scale*1.5)); 
    	System.out.println("he was LITERALLY moved underwater...'");
    	userInput.nextLine();
    	
    	System.out.println("'Now I have to go to some preppy school that's also underwater...'");
    	userInput.nextLine();
    	
    	System.out.print("'Except there's one catch, ");
    	TimeUnit.SECONDS.sleep(scale*2);
    	System.out.println("I'm the ONLY human (as far as I know)...'");
    	userInput.nextLine();
    	
    	System.out.println("'Tommorrow is my first day of school and I'm stressing out...'");
    	userInput.nextLine();
    	
    	if((CharacterCreator.player.getCharisma()>=7)&&(CharacterCreator.player.getCharisma()<10))
    		{
    		System.out.println("'Although I really shouldn't worry. I've always been able to make friends really really easily...'");
    		userInput.nextLine();
    		}
    	else if((CharacterCreator.player.getCharisma()<7)&&(CharacterCreator.player.getCharisma()>=4))
    		{
    		System.out.println("'I'm not totally worried, though, most of the time I've been able to find a small group of friends that I get along with...");
    		userInput.nextLine();
    		}
    	else
    		{
    		System.out.println("'Making friends is not my forte. I spent most of my lunches over the last few years under a tree by myself...'");
    		userInput.nextLine();
    		}
    	
    	System.out.println("'Ah, I might as well get some rest, don't want to be exhausted on my first day...'");
    	System.out.println("(Hit enter to begin your first day)");
    	userInput.nextLine();
    	
    	clearConsole();
    	
    	
    	
    	 	
     }
     public static void beginDayOne()
     {
    	 System.out.println("DAY ONE...");
    	 userInput.nextLine();
    	 System.out.println("");
     }
     public final static void clearConsole()
    	 {
    	 for(int i=0; i<100; i++)
    	 {
    		System.out.println("\n"); 
    	 }
    	 }
     
	}
