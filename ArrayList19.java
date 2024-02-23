/* 19. Write a Java program for trimming the capacity of an array list. 
	trimToSize() supposed to trim the size if 10 becomes 7. but nothing happened.
	It's a array list method. cannot be List referenced.
 */
 
 import java.util.List;
 import java.util.ArrayList;
 
 public class ArrayList19
 {
	public static void main(String[] args)
	{
		ArrayList<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		System.out.println("Size is: "+colors.size());
		colors.trimToSize();
		System.out.println("After trimming size is: "+colors.size());
		System.out.println("Colors are: "+colors);
	}
	
	public static ArrayList<String> getColors()
	{
		ArrayList<String> colorsList = new ArrayList<>(10);
	
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