import java.io.*;

public class Player implements Serializable
	{
	
	private static final long serialVersionUID =1L;	
		
	private String name;
	private int popularity;
	private int charisma;
	private int intelligence;
	private int luck;
	private int state;
	
	public Player(String n, int p, int ch, int i, int l, int s)
	{
		n=name;
		p=popularity;
		ch=charisma;
		i=intelligence;
		l=luck;
		s=state;
	}

	public int getState()
		{
			return state;
		}

	public void setState(int state)
		{
			this.state = state;
		}

	public void setIntelligence(int intelligence)
		{
			this.intelligence = intelligence;
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

	
	
	
	
	}
