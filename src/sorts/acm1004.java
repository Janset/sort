package sorts;
/*
 * 
100.00
489.12
12454.12
1234.10
823.05
109.20
5.27
1542.25
839.18
83.99
1295.01
1.75

 */
import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class acm1004 {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
		Scanner cin = new Scanner(new BufferedInputStream(System.in)); 	 
		DecimalFormat df = new DecimalFormat("0.00");
		double sum=0.0;
		int month=12;
	    while(month>0){
	    	sum+=cin.nextDouble();	  
	    	month--;
	    } 
	    System.out.println("$"+df.format(sum/12.00));
    }
}
