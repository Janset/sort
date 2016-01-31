package sorts;

import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class acm1003 {
	public static void main(String[] args) {
    	// TODO Auto-generated method stub
		Scanner cin = new Scanner(new BufferedInputStream(System.in));	 		
		
		double sum=0.0;
		double x=cin.nextDouble();	 
	    while(x!=0.0){    		 
	    	sum=0.0;
	    	for(int i=2;;i++){	    		
	    		sum+=1.0/i;
	    		if(sum>=x){
	    			System.out.println((i-1)+" card(s)");
	    			break;
	    		}
	    	}
	    	x=cin.nextDouble();
	    } 
	  
	   
    }
}
