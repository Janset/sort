package sorts;
/**
 * A, B, and C map to 2 
D, E, and F map to 3 
G, H, and I map to 4 
J, K, and L map to 5 
M, N, and O map to 6 
P, R, and S map to 7 
T, U, and V map to 8 
W, X, and Y map to 9

23
0000000
0000000
0001000
0001000
4873279
ITS-EASY
888-4567
3-10-10-10
888-GLOP
TUT-GLOP
967-11-11
310-GINO
F101010
888-1200
-4-8-7-3-2-7-9-
487-3279
00---------------7-3279
007-3279
007-3279
087-3279
087-3279
087-0279
087-0279


 * @author Administrator
 *
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class acm1002 {
	public static char getNum(char c) {   
        if (Character.isDigit(c)) {   
            return c;   
        }   
        if (c == 'A' || c == 'B' || c == 'C') {   
            return '2';   
        }   
        if (c == 'D' || c == 'E' || c == 'F') {   
            return '3';   
        }   
        if (c == 'G' || c == 'H' || c == 'I') {   
            return '4';   
        }   
        if (c == 'J' || c == 'K' || c == 'L') {   
            return '5';   
        }   
        if (c == 'M' || c == 'N' || c == 'O') {   
            return '6';   
        }   
        if (c == 'P' || c == 'R' || c == 'S') {   
            return '7';   
        }   
        if (c == 'T' || c == 'U' || c == 'V') {   
            return '8';   
        }   
        if (c == 'W' || c == 'X' || c == 'Y') {   
            return '9';   
        }   
        return '#';   
     }  
	//超时可能是输入流的问题
	public static void main(String[] args) throws Exception {	
		DataInputStream cin = new DataInputStream(new BufferedInputStream(System.in));			
		int  num=Integer.parseInt(cin.readLine());
	    TreeMap<String , Integer> mapToNum1 = new TreeMap<String , Integer>(); 	   
	    for(int i=0;i<num ;i++){	    	
	    	String s=cin.readLine().replace("-","");	    	
	    	StringBuilder s1=new StringBuilder();
	    	for(int j=0;j<s.length();j++){
	    		char c=getNum(s.charAt(j));
	    		if(Character.isDigit(c)){	    	
	    			s1.append(c);
	    		}	    	
	    	}	
	    	String result =s1.toString().substring(0,3)+"-"+s1.toString().substring(3);
	    	if(mapToNum1.containsKey( result)){    	    	
   	  	    	mapToNum1.put( result,mapToNum1.get(result)+1);
	    	}else{
	    		mapToNum1.put( result,1);
	    	}	    	
	    }		  
	    boolean flag=false;     
	    for (String key : mapToNum1.keySet()) {	
	    	if(mapToNum1.get(key)>1){
	    		flag=true;
			   System.out.println(key+" "+mapToNum1.get(key)); 
	    	}			 
	    }
	    if(!flag){
	    	System.out.println("No duplicates. "); 
	    }
    //   System.out.println(System.currentTimeMillis()-t);
	   

	}
}
