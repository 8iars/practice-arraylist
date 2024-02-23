/* 21. Write a Java program to replace the second element of an ArrayList with the specified element. 
	use set(index,element)
 */
 
 import java.util.List;
 import java.util.ArrayList;
 
 public class ArrayList21
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		colors.set(1,new String("BLUE"));
		System.out.println("Colors are update: "+colors);
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