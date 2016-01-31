package sorts;

import java.math.BigInteger;
import java.util.Scanner;

public class acm1001 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in); 	      
	    while(cin.hasNext()){
	    	java.math.BigDecimal  R=cin.nextBigDecimal();
	    	int n=cin.nextInt();	    	
	    	java.math.BigDecimal resultBig = R.pow(n).stripTrailingZeros(); //去掉后导0
	    	String s=resultBig.toPlainString();//将大数类型转变成不带指数型的字符串
	    	if(s.charAt(0)=='0')//去掉前导0
	    		s=s.substring(1);
	    	System.out.println(s);
	    }    

	}

}
