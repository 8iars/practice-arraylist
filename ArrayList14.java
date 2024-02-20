/* 14. Write a Java program that swaps two elements in an array list. 

	Swap two elements
	Use temp holder and do swap on any two elements?
	Problem with this approach is that you have to know the type of the element in the arrayList.
	
	or is there different output for this? No. Just simple swap.
	Use collections.
	Collections.swap(arrayList,pos1,pos2) // swap the elements at pos1 and pos2
	
	Collections has many static methods. Don't blindly try to memorize.
 */
 
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;
 
 public class ArrayList14
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		Collections.swap(colors,0,2);
		System.out.println("After swapping: "+colors);
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