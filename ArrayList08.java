/* 8. Write a Java program to sort a given array list. 
	Using .sort(comparator)
	Collections.sort(arrayList,comparator) // returns void
	Collections.shuffle(arrayList) // shuffles and returns void
	Collections.reverse(arrayList) // reverse the arrayList and returns void
	Collections is a class and its methods are static
 */
 
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;
 
 public class ArrayList08
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		System.out.println("Sorting through comparator");
		colors.sort((c1,c2)->c1.compareTo(c2));
		System.out.println("Sorted list: "+colors);
		
		System.out.println("Shuffling array list");
		Collections.shuffle(colors);
		System.out.println("After shuffling: "+colors);
		
		
		Collections.sort(colors,(c1,c2)->c1.compareTo(c2));
		System.out.println("Sorting through collections: "+colors);
		
		Collections.reverse(colors);
		System.out.println("Reverse of the sorted list: "+colors);
		
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