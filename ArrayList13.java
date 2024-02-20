/* 13. Write a Java program to compare two array lists. 
		Comparing two lists the output is whether they are equal or not.

	12b. Write a Java program to check two array lists are equal.
	
	two arrays are equal if they are of same type, length and have identical elements.
	
	brute force? 
	check type equal
	check equal length 
	check if element from listA is in listB
	if any of these fails, the lists are not equal.
	
	Use equals method. arrayList.equals(arrayList2) safe and elegant.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayList13
{
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		List<String> colors2 = new ArrayList<>();
		colors2.add(new String("Crimson"));
		System.out.println("Colors2 are: "+colors2);
		
		if(checkEqual(colors,colors2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		System.out.println("colors == colors2? "+colors.equals(colors2));
		
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
	
	public static boolean checkEqual(List<String> c, List<String>d)
	{
		if(c == null || d == null)
			return false;
		
		if(c.size()!=d.size())
			return false;
		
		for(String a:c)
		{
			if(!d.contains(a))
				return false;
		}
		
		return true;
	}
}