/* 22. Write a Java program to print all the elements of an ArrayList using the elements' position.
	Use for loop with index i
 */
 
 import java.util.List;
 import java.util.ArrayList;
 
 public class ArrayList22
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		
		for(int i=0;i<colors.size();i++)
		{
			System.out.println(colors.get(i));
		}
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