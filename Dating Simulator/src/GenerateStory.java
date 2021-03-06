import java.util.Scanner;

public class GenerateStory
	{
	 static Scanner userInput= new Scanner(System.in);
	 static int scale=1;
     static int party=0;
     static int dice=0;
    
     public static void beginPrologue() throws InterruptedException
     {
    	 if(CharacterCreator.player.getLuck()==0)
    		 {
    			dice=(int)(Math.random()*100)+1; 
    		 }
    	 else if(CharacterCreator.player.getLuck()==1)
    		 {
    			 dice=(int)(Math.random()*50)+1; 
    		 }
    	 else
    		 {
    			 dice=(int)(Math.random()*10)+1;
    		 }
    	 
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
    		printText("'I'm not totally worried, though, most of the time I've been able to find a small group of friends that I get along with...'");
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
    	 printText("You feel something soft slam into your head. Your head throbs as you are jostled awake...");
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
    			 printText("The pillow hits the wall with a dull thud and then slowly slides to the bottom.");
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

    	 
    	 printText("Afraid your dad is going to leave without you, you scramble out of bed to get ready as fast as possible...");
    	 userInput.nextLine();
    	 printText("You throw on a wetsuit and some random clothes on top of it. Thankfully, your house is completely drained of water and pumped with oxygen so you can exist under normal conditions while at home...");
    	 userInput.nextLine();
    	 printText("However, the only way to survive outside is to slip on the helmet and oxygen tank your dad's work provided...");
    	 userInput.nextLine();
    	 printText("You run to your front door and enter the airlock. You take a deep breath and open the door to the outside...");
    	 userInput.nextLine();
    	 printText("The airlock floods with water. You take an even deeper breath and swim out to your car...");
    	 userInput.nextLine();
    	 printText("Walking is possible, but much slower, and your dad is already inclredibly angry at you for sleeping in so you figure swimming is the best idea...");
    	 userInput.nextLine();
    	 printText("You climb into the car and your dad pulls out of the driveway without a word.");
    	 printText("As you're driving to school, you sneak a look at him. He's quietly staring ahead with a somber expression on his face...");
    	 userInput.nextLine();
    	 printText("After about 6 minutes of silence, he begins to speak.");
    	 printText("DAD: 'You know I really am sorry, "+CharacterCreator.player.getName()+". In all likelihood we won't be stuck down here forever.'");
    	 printText("He pauses for a second.");
    	 printText("'Let's just try and make the best of this while we're here and we'll be gone before you know it...'");
    	 userInput.nextLine();
    	 printText("Your dad pulls up in front of the school.");
    	 printText("You see groups of people, well not people- groups of highly intelligent sea creatures mingle about in front of the school...");
    	 userInput.nextLine();
    	 printText("DAD: 'Well.....Have a good day at school...'");
    	 printText("");
    	 printText("1) 'Love you dad...'\n"
    	 		 + "2) '...'");
    	 if(userInput.nextInt()==1)
    		 {
    			 printText("DAD: '...'");
    			 userInput.nextLine();
    			 userInput.nextLine();
    			 printText("DAD: '...Love you too, "+CharacterCreator.player.getName()+"...'");
    		 }
    	 else
    		 {
    			 printText("DAD: 'I'll see you when I pick you up. 3:00 okay?...'");
    		 }
    	 
    	 userInput.nextLine();
    	 userInput.nextLine();
    	 printText("You step out of the car and head into the unknown...");
    	 userInput.nextLine();
    	 printText("You decide to walk this time, the longer it takes to get to school, the longer it takes for you to begin your first day...");
    	 userInput.nextLine();
    	 printText("?: '...oh cmon, Brad pleaaaaaaaase.'");
    	 printText("You turn to your left and see a starfish clinging to the arm of a shark.");
    	 printText("The shark, who you can safely assume is Brad, starts speaking to the starfish...");
    	 userInput.nextLine();
    	 printText("BRAD: 'Cynthia, I would just loveeeeee to come to your party tonight, but we got a football game tomorrow. Gotta make sure I get my rest, y'know?...'");
    	 userInput.nextLine();
    	 printText("Brad suddenly turns toward you...");
    	 userInput.nextLine();
    	 if(CharacterCreator.c0.getAttraction()>=1)
    		 {
    			 printText("He starts walking toward you...");
    			 userInput.nextLine();
    			 printText("BRAD: 'Hey there, are you new here?'");
    			 printText("");
    			 printText("1) 'Yeah! I just moved here from San Diego.'\n"
    			 		 + "2) 'Yup! Fresh off the boat.'\n"
    			 		 + "3) '...'");
    			 switch(userInput.nextInt())
    			 {
    				 case 1:
    					 printText("BRAD: 'San Diego? Isn't that where Sea World is? MY DAD WAS CAPTURED SEA WORLD.'");
    					 CharacterCreator.c0.expressDislike();
    					 printText("Brad walks away...");
    					 userInput.nextLine();
    					 userInput.nextLine();
    					 break;
    				 case 2:
    					 printText("BRAD: 'That's cool yo. Hey, so Cynthia's having a party tonight, you should come.'");
    					 printText("");
    					 printText("1) 'Sure!'\n"
    					 		 + "2) 'I'm sorry I think I'm busy tonight.'");
    					 if(userInput.nextInt()==1)
    						 {
    							 CharacterCreator.c0.expressLike();
    							 party+=1;
    							 printText("BRAD: 'Coooool, I'll see ya there...'");
    							 userInput.nextLine();
    							 userInput.nextLine();
    						 }
    					 else
    						 {
    							printText("BRAD: 'Well I'll see ya around I guess...'");
    							userInput.nextLine();
   							    userInput.nextLine();
    						 }
    					 break;
    				 case 3:
    					 printText("BRAD: 'Um....So hey, Cynthia's having a party tonight, you should come.'");
    					 printText("");
    					 printText("1) 'Sure!'\n"
    					 		 + "2) 'I'm sorry I think I'm busy tonight.");
    					 if(userInput.nextInt()==1)
    						 {
    							 CharacterCreator.c0.expressLike();
    							 party+=1;
    							 printText("BRAD: 'Coooool, I'll see ya there...'");
    							 userInput.nextLine();
    							 userInput.nextLine();
    						 }
    					 else
    						 {
    							printText("BRAD: 'Well I'll see ya around I guess...'");
    							userInput.nextLine();
   							    userInput.nextLine();
    						 }
    					 break;
    			 }
    			
    		 }
    	 else
    		 {
    		 printText("Brad takes one look at you and then looks away...");
    		 userInput.nextLine();
    		 }
    	 printText("You keep walking...");
     }
   
     public static String printText(String s) throws InterruptedException
     {
    	 for(int i=0; i<s.length(); i++)
    	 {
    		System.out.print(s.substring(i, i+1));
    		Thread.sleep(15L);
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
