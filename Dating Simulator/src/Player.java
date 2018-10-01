import java.io.*;

public class Player implements Serializable
	{
	
	private static final long serialVersionUID =1L;	
		
	private String name;
	private int popularity;
	private int charisma;
	private int intelligence;
	private int luck;
	
	public Player(String n, int p, int ch, int i, int l)
	{
		n=name;
		p=popularity;
		ch=charisma;
		i=intelligence;
		l=luck;
	}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public int getPopularity()
		{
			return popularity;
		}

	public void setPopularity(int popularity)
		{
			this.popularity = popularity;
		}

	public int getCharisma()
		{
			return charisma;
		}

	public void setCharisma(int charisma)
		{
			this.charisma = charisma;
		}

	public int getLuck()
		{
			return luck;
		}

	public void setLuck(int luck)
		{
			this.luck = luck;
		}

	public int getIntelligence()
		{
			return intelligence;
		}

	public void setConfidence(int confidence)
		{
			this.intelligence = confidence;
		}
	
	
	
	}
