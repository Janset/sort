package sorts;
/*
 * 
1
2
26
125
3125
9999

 */
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main1604 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in); 
		
	    while(cin.hasNext()){
	    	BigInteger sum=new BigInteger("1");
	    	int n=cin.nextInt();	    
	    	for(int i=1;i<=n;i++){
	    		BigInteger num = new BigInteger(String.valueOf(i));  
	    		sum=sum.multiply(num);
	    	}
	        String s=sum.toString();	     
	        int j=0;
//	        for(j=s.length()-1;;j--){	        	
//	        	if(s.charAt(j)!='0'){
//	        		break;
//	        	}
//	        }
	    	System.out.println(n+" -> "+sum+" "+" "+j+" "+s.charAt(j));
	    }    

	}

}
