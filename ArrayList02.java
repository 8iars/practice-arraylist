/* 2. Write a Java program to iterate through all elements in an array list. */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList02
{
	public static void main(String[] args)
	{
		List<String> colorsList = addColors();
		colorsIterate(colorsList);
		
		System.out.println("-".repeat(10));
		colorsIterate2(colorsList);
		
		System.out.println("-".repeat(10));
		colorsIterate3(colorsList);
		
		System.out.println("-".repeat(10));
		colorsIterate4(colorsList);
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
	
	public static void colorsIterate(List<String> colors)
	{
		System.out.println("Iterating using Iterator<String> it = colors.iterator()");
		Iterator<String> it = colors.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public static void colorsIterate2(List<String> colors)
	{
		System.out.println("Iterating through ListIterator<String> listIterator = colors.listIterator()");
		ListIterator<String> listIterator = colors.listIterator();
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
	}
	
	public static void colorsIterate3(List<String> colors)
	{
		System.out.println("Iterating through advanced for loop");
		for(String color: colors)
			System.out.println(color);
	}
	
	public static void colorsIterate4(List<String> colors)
	{
		System.out.println("Iterating through for loop");
		for(int i=0; i<colors.size(); i++)
			System.out.println(colors.get(i));
	}
}