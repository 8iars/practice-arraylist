/* 18. Write a Java program to test whether an array list is empty or not.  
	isEmpty()
	size()
*/

import java.util.List;
import java.util.ArrayList;

public class ArrayList18
{
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		System.out.println("Is empty? "+colors.isEmpty());
		System.out.println("Size is: "+colors.size());
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