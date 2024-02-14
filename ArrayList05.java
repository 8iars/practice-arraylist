/* 5. Write a Java program to update an array element by the given element. 
	Using set(index,element) --> removes the old value, insert the new values, returns the old value
*/

import java.util.List;
import java.util.ArrayList;


public class ArrayList05
{
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		
		System.out.println("Colors are: "+colors);
		
		System.out.println("Updating colors");
		String oldColor = colors.set(2,new String("Forest Green"));
		System.out.println("Colors are: "+colors);
		System.out.println("Old color is: "+oldColor);
		
	}
	
	public static List<String> getColors()
	{
		List<String> colorsList = new ArrayList<>();
	
		System.out.println("Adding colors...");
		
		colorsList.add(new String("Red"));
		colorsList.add(new String("Blue"));
		colorsList.add(new String("Green"));
		colorsList.add(new String("Orange"));
		colorsList.add(new String("Violet"));
		colorsList.add(new String("Yellow"));
		colorsList.add(new String("Indigo"));
		colorsList.add(new String("White"));
		
		return colorsList;
	}
}