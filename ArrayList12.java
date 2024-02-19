/* 12. Write a Java program to extract a portion of an array list.  
	subList(start,end) start is inclusive, end is exclusive returns a list
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList12
{
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		List<String> colorsSubList = colors.subList(2,6);
		System.out.println("Sublist is: "+colorsSubList);
		
		//System.out.println(colors.getClass());
		
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