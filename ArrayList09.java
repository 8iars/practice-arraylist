/* 9. Write a Java program to copy one array list into another. 
	use addAll(elements) returns boolean --> adds elements from the end of the list
	addAll(index,elements) returns boolean --> adds elements from the index
	List.copyOf(arrayList) returns a copy of the list. it is unmodifiable. if tried, throws java.lang.UnsupportedOperationException
	iterate through and add
	Collections.copy(dest,src) //copies src into dst. dest becomes identical to src
 */
 
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;
 
 public class ArrayList09
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
			
		List<String> colors2 = new ArrayList<>();
		// getColors();
		colors2.add(new String("Crimson"));
		System.out.println("Colors2 are: "+colors2);
		
		colors2.addAll(colors);
		System.out.println("Color2 are(after copying): "+colors2);
		
		List<String> colors3 = List.copyOf(colors);
		//colors3.set(2,new String("Maroon"));
		colors3.forEach(System.out::println);
		
		Collections.copy(colors2,colors);
		System.out.println(colors2);
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