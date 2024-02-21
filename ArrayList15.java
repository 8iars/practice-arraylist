/* 15. Write a Java program to join two array lists. 
	use addAll(arrayList) by default it add elements from the end of the array
	Any other way using collections? streams + collections. not for now.
 */
 
 import java.util.List;
 import java.util.ArrayList;
 
 public class ArrayList15
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		List<String> colors2 = new ArrayList<>();
		colors2.add(new String("Prussian Blue"));
		
		System.out.println("Colors2 are: "+colors2);
		colors2.addAll(colors);
		
		System.out.println("After merging: "+colors2);
		
		
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