/* 6. Write a Java program to remove the third element from an array list. 
	Using remove(index) -- removes the element from the list
	removeFirst() and removeLast() is also available.
*/

import java.util.List;
import java.util.ArrayList;

public class ArrayList06
{
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		System.out.println("Removing second color");
		String color = colors.remove(1);
		
		System.out.println("Colors are after removal: "+colors);
		System.out.println("Old color (removed) is: "+color);
		
		System.out.println("Hashcode is: "+colors.hashCode());
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