package Lecture;

public class Nestedconditions {
  public static void main(String[] args)
  {
	  int abhi = 96;
	  int ajinkya = 98;
	  int akash = 96;
	  {
if(abhi == ajinkya && ajinkya == akash )
{
	System.out.println("no is bigger");
}
else{
	if(abhi == ajinkya && abhi > akash)
	{
		if(abhi > akash)
		{
			System.out.println("abhi is bigger");
		}
		else{
			System.out.println("akash is bigger");
		}
	}
	else
	{
		if(ajinkya > akash)
		{
			System.out.println("ajinkya is bigger");
		}
		else{
			System.out.println("akash is bigger");
		}
		
			
		}
		}
	}
	  }
  }

