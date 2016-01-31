package sorts;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * 
you are the best
123
To be No.1
Yes
Thanks very much
%%%
a b c d
abcd

 */
public class CopyOfMain2 {

	public static void main(String[] args) {
		  
		  Scanner s=new Scanner(System.in);	
		  Map<String,String> m=new LinkedHashMap<String,String>();
		 
		  while(s.hasNext()){
			  String s1=s.nextLine();
			  String s2=s.nextLine();
			  System.out.println(s1+" "+s2);
			
			  s1=s1.replaceAll(" ", s2);
			  System.out.println(s1);
			
		  }

		  
		 

	}

}
