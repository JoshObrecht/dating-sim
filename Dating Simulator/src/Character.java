import java.io.*;

public class Character implements Serializable
	{
		private static final long serialVersionUID =1L;	
		
		//each scale maxes out at 10
		
		private String name;
		private int gender;
		private int attraction;
		private int likes;
		private int dislikes; 
		private int socialStanding;
		
		public Character(String n, int g, int a, int l, int d, int s)
		{
		name=n;
		gender=g;
		attraction=a;
		likes=l;
		dislikes=d;
		socialStanding=s;
		}
		
		public void expressDislike()
		{
			System.out.println(name + " disliked that.");
			attraction-=1;
		}
		
		public void expressLike()
		{
			System.out.println(name + " liked that.");
			attraction+=1;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getGender()
			{
				return gender;
			}

		public void setGender(int gender)
			{
				this.gender = gender;
			}

		public int getAttraction()
			{
				return attraction;
			}

		public void setAttraction(int attraction)
			{
				this.attraction = attraction;
			}

		public int getLikes()
			{
				return likes;
			}

		public void setLikes(int likes)
			{
				this.likes = likes;
			}

		public int getDislikes()
			{
				return dislikes;
			}

		public void setDislikes(int dislikes)
			{
				this.dislikes = dislikes;
			}

		public int getSocialStanding()
			{
				return socialStanding;
			}

		public void setSocialStanding(int socialStanding)
			{
				this.socialStanding = socialStanding;
			}
		
		
		
	}
