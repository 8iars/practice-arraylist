/* 1. Write a Java program to create an array list, add some colors (strings) and print out the collection. 
	Using add(E);
*/

import java.util.ArrayList;
import java.util.List;

public class ArrayList01
{
	public static void main(String[] args)
	{
		List<String> colorsList = addColors();
		
		System.out.println("Colors are...");
		System.out.println(colorsList);//pass the list to print and it displays as list
		System.out.println("Colors are...");
		showColors1(colorsList);
		System.out.println("-".repeat(10));
		showColors2(colorsList);
		System.out.println("-".repeat(10));
		showColors3(colorsList);
		System.out.println("-".repeat(10));
		showColors4(colorsList);
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
		//colorsList.add(new StringBuilder("StringBuilder")); does not work. Expecting String but passed StringBuilder
		
		return colorsList;
	}
	
	public static void showColors1(List<String> colors)
	{
		System.out.println("Using advanced for loop");
		for(String color: colors)
			System.out.println(color);
	}
	
	public static void showColors2(List<String> colors)
	{
		System.out.println("Using forEach with method reference System.out::println");
		colors.forEach(System.out::println);
	}
	
	public static void showColors4(List<String> colors)
	{
		System.out.println("Using forEach with method reference System.out::print");
		colors.forEach(System.out::print);
	}
	
	public static void showColors3(List<String> colors)
	{
		System.out.println("Using forEach with lambda");
		colors.forEach(color->System.out.println(color));
	}
}