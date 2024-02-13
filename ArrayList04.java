/* 4. Write a Java program to retrieve an element (at a specified index) from a given array list. 
	Using get(index)
	getFirst() and getLast() returns first and last element of the list
*/

import java.util.List;
import java.util.ArrayList;

public class ArrayList04
{
	public static void main(String[] args)
	{
		List<String> colors = addColors();
		System.out.println("Colors are: "+colors);
		
		System.out.println("Retrieving element from position p from the array list");
		System.out.println("Color at 3: "+colors.get(2));
	}
	
	public static List<String> addColors()
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