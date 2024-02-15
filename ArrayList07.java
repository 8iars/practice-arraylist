/* 7. Write a Java program to search for an element in an array list. 
	use indexOf(element) returns position if available or -1 if not.
	contains(element) returns boolean
 */
 
 import java.util.List;
 import java.util.ArrayList;
 
 public class ArrayList07
 {
	public static void main(String[] args)
	{
		List<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		String color = colors.get(4);
		System.out.printf("%s is at %d\n",color,colors.indexOf(color)+1);
		
		if(colors.contains(color))
			System.out.println(color+" is present");
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