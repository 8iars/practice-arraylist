/* 3. Write a Java program to insert an element into the array list at the first position.
	Using add(index,element); --> add new element
	set(index,element) --> updates the position and returns old value
 */

import java.util.List;
import java.util.ArrayList;

public class ArrayList03
{
	public static void main(String[] args)
	{
		List<String> colors = addColors();
		
		System.out.println("Colors are: "+colors);
		
		System.out.println("Adding color black to the list at the first position");
		colors.add(0,new String("Black"));//Using add(index, element)		
		System.out.println("Colors are: "+colors);
		
		System.out.println("Adding color black to the list at the sixth position");
		colors.add(5,new String("Black"));//Using add(index, element). add returns void		
		System.out.println("Colors are: "+colors);
		
		System.out.println("Adding color purple to the list at third position");
		colors.add(2,new String("Purple"));
		System.out.println("Colors are: "+colors);
		
		System.out.println("Adding color olive green to the list at third position through set()");
		String color = colors.set(2,new String("Olive Green"));
		//set removes the third element and inserts the new element. returns the removed element.
		System.out.println("Colors are: "+colors);
		System.out.println("Color is(set): "+color);
		
		System.out.println("Adding color with set again");
		
		color = colors.set(colors.size()-1,new String("Deep Blue"));
		//set replaces old element with new element at specified position. returns the old element. does not extend the array.
		//IndexOutOfBoundsException if tried to add at the end of the list.
		System.out.println("Colors are: "+colors);
		System.out.println("Color is(set): "+color);
		
		
		System.out.println(colors.set(3,null));
		//can add null values to the list
		System.out.println(colors);
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