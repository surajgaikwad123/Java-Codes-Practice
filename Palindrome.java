package project_One;


public class Palindrome {
	
	public static void main(String[] args)
	{
		//Decleared input string
		String str1 = "78 9 0 -0 97 565";
		
		//Cleanning the string if found some impurity
		String clean = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(clean);
		
		//Strating point initiallized
		int left = 0;
		
		//End point initaiallized
		int right = clean.length()- 1;
		
		
		//flag to choose true or flase ( Palindrom )
		boolean Flag = true;
		
		
		//Loop while left is smaller than right
		while(left < right)
			
		{
			
			//if the cleans strings char at start on in ith position in not equals to the jth position then go in to code
			if(clean.charAt(left) != clean.charAt(right))
			{
				// flag becomes false
				Flag = false;
			}
		
		//increment of left
		left++;
		
		//Decrement of Right 
		
		// to meet in between the string and go through whole string 
		right--;
		}
		
		
		
		
		///if flag is false then its not palindrome .. if flag is true then it is palindrome
		if(Flag == true)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}
	}
}
