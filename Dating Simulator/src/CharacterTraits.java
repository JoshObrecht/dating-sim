
public class CharacterTraits
	{
		private String name;
		private int gender;
		private int attraction;
		private int likes;
		private int dislikes; 
		private int socialStanding;
		
		public CharacterTraits (String n, int g, int a, int l, int d, int s)
		{
		name=n;
		gender=g;
		attraction=a;
		likes=l;
		dislikes=d;
		socialStanding=s;
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
