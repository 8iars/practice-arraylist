/* 10. Write a Java program to shuffle elements in an array list. 
	Collections.shuffle(arrayList)
 */
 
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collections;
 
 public class ArrayList10
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		System.out.println("Shuffling the arrayList");
		Collections.shuffle(colors);
		
		System.out.println("After shuffling: "+colors);
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