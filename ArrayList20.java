/* 20. Write a Java program to increase an array list size. 
	is it ensureCapacity(size)?
	Yes.
	
	ensureCapacity() ensures the capacity is the size. but nothing happened.
	Is it doing lazy initialization?
	If the capacity crosses the default capacity, then it will resize it?
	
	how insertion work in ArrayList?
 */
 
 import java.util.List;
 import java.util.ArrayList;
 
 public class ArrayList20
 {
	public static void main(String[] args)
	{
		ArrayList<String> colors = getColors();
		System.out.println("Colors are: "+colors);
		
		System.out.println("Size is: "+colors.size());
		colors.ensureCapacity(10);
		System.out.println("ensureCapacity is: "+colors.size());
	}
	
	public static ArrayList<String> getColors()
	{
		ArrayList<String> colorsList = new ArrayList<>();
	
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