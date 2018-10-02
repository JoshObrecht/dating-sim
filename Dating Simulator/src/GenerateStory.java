import java.util.Scanner;

import sun.management.counter.perf.PerfInstrumentation;

public class GenerateStory
	{
	 static Scanner userInput= new Scanner(System.in);
	 static int scale=1;
     public static void beginPrologue() throws InterruptedException
     {
    	
    	printText(CharacterCreator.player.getName()+": 'Once again, I am the new kid in town...'");
    	printText("(Whenever you see an ellipsis hit enter to advance the text on screen)");
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
    	CharacterCreator.player.setState(1);
    	SaveGame.saveGame();
    	beginDayOne();
    	 	
     }
     public static void beginDayOne() throws InterruptedException
     {
    	 printText("DAY ONE...");
    	 userInput.nextLine();
    	 printText("?: 'hey...'");
    	 userInput.nextLine();
    	 printText("?: 'HEY!!!!...'");
    	 userInput.nextLine();
    	 printText("W H A M");
    	 printText("You feel something slam into your head. Your head throbs as you are jostled awake...");
    	 userInput.nextLine();
    	 
    	 printText("As your eyes adjust to the light you see your dad standing over you. He's visibly furious.");
    	 printText("DAD: 'HEY! It's your first day of school and you're seriously oversleeping???...'");
    	 printText("");
    	 printText("1) 'I'm Sorry!!!'\n"
    	 		 + "2) 'AGHHHHHH!' *Throw your pillow*\n"
    	 		 + "3) 'I'm not the one who moved us underwater.......'\n"
    	 		 + "4) '...'\n"
    	 		 + "(Type the number of the action you would like to take. Anything surrounded by single quotes is a speaking option. Anything surrounded by astericks is a physical action.)");
    	 switch(userInput.nextInt())
    	 {
    		 case 1:
    			 printText("DAD: 'Sorry doesn't cut it. YOU HAVE TEN MINUTES TO BE IN THE CAR...'");
    			 break;
    		 case 2:
    			 printText("DAD: 'I will never understand you. After 30 seconds you suddenly decide to throw your pillow at me.'");
    			 printText("He gives you a look of the utmost disgust and then leaves the room...");
    			 break;
    		 case 3:
    			 printText("His face impossibly becomes redder.");
    			 printText("DAD: 'GET-OUTSIDE-NOW...'");
    			 break;
    		 default:
    			 printText("DAD: 'I'll be waiting in the car...'");
    			 break;
    	 }
    	 userInput.nextLine();
    	 userInput.nextLine();
    	 
    	 printText("Afraid your dad is going to leave without you, you scramble out of bed to get ready as fast as possible...");
    	 userInput.nextLine();
    	 printText("You throw on a wetsuit and some random clothes on top of it. Thankfully, your house is completely drained of water and pumped with oxygen so you can exist under normal conditions while at home...");
    	 userInput.nextLine();
    	 printText("However, the only way to survive outside is to slip on helmet and oxygen tank your dad's work provided...");
    	 userInput.nextLine();
    	 printText("You run to your front door and enter the airlock. You take a deep breath and open the door to the outside...");
     }
     
     public static String printText(String s) throws InterruptedException
     {
    	 int counter=1;
    	 boolean check=false;
    	 for(int i=0; i<s.length(); i++)
    	 {
    
    		System.out.print(s.substring(i, i+1));
    		Thread.sleep(10L);
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
