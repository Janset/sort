package sorts;
/*
 * 简便算法可以用数学的定理算
0 0 0 0
0 0 0 100
5 20 34 325
4 5 6 7
283 102 23 320
203 301 203 40
-1 -1 -1 -1
24 29 34 0           
24 29 34 1           
24 29 34 2           
0  0  0  0  
0 18 13 100         
-1 -1 -1 -1
 */

import java.util.Scanner;

public class acm1006 {
	public static void main(String[] args) {		
		Scanner cin = new Scanner(System.in);	
		int n=1;		
	    while(cin.hasNext()){ 
	    	int p=cin.nextInt();
			int e=cin.nextInt();
			int i=cin.nextInt();
			int d=cin.nextInt();
			if(p==-1 || e==-1 || i==-1 || d==-1){
				break;
			}
			
	    	for(int j=21252+d;j>=1;j--){	 
	    		if((j-p)%23==0 && (j-e)%28==0 &&(j-i)%33==0){
	    			System.out.println("Case "+n+": the next triple peak occurs in "+(j-d)+" days.");
	    			break;
	    		}	   		    
	    	}	    	
			n++;
	    }   

	}

}
