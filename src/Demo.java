import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Demo {

	
    
	public static void main(String[] args) {
		
   String str="dyeepika pandiya";
   
   char arr[]= str.toCharArray();
   
   ArrayList<Character> li= new ArrayList<Character>();
   
   for(int i =0;i<arr.length;i++)
   {
	   if(!li.contains(arr[i]))
	   {
		   li.add(arr[i]);
		   
	   }
	   else
	   {
		   System.out.println("duplicate character is "+arr[i]);
	   }
   }


        
	}
}
