/* 16. Write a Java program to clone an array list to another array list.  
	Expectation: the output of the program return an identical array list
	Use Collections.copy() to get a copy dest must not be empty. else exception: java.lang.IndexOutOfBoundsException
	List.copyOf()
	create empty list and do addAll()
	
	Output (Actual):
	call clone() directly.
	
	Compile time Warnings:
	Note: ArrayList16.java uses unchecked or unsafe operations.
	Note: Recompile with -Xlint:unchecked for details.
	
	Better create an empty list and do addAll()
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList16
{
	public static void main(String[] args)
	{
		ArrayList<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		List<String> colors2 = new ArrayList<>();
		//colors2 = colors.clone(); colors is referenced by List and clone() is not available in List. gives compile error
		colors2 = (ArrayList<String>)colors.clone();
		System.out.println("After copying: "+colors2);
	}
	
	public static ArrayList<String> getColors()
	{
		ArrayList<String> colorsList = new ArrayList<>();
	
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