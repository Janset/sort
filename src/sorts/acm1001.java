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
	    	java.math.BigDecimal resultBig = R.pow(n).stripTrailingZeros(); //ȥ����0
	    	String s=resultBig.toPlainString();//����������ת��ɲ���ָ���͵��ַ���
	    	if(s.charAt(0)=='0')//ȥ��ǰ��0
	    		s=s.substring(1);
	    	System.out.println(s);
	    }    

	}

}
