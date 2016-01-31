package sorts;
/*
3 2
1 2
-3 1
2 1

1 2
0 2

4 5
-5 3
-3 5
2 3
3 3

0 0
*/


import java.util.Arrays;
import java.util.Scanner;

public class acm1328 {
   public static void main(String[] args) {
	   Scanner cin = new Scanner(System.in); 
	   int num,d,k,count=1;
	   while(cin.hasNext()){
		   num=cin.nextInt();
		   d=cin.nextInt();
		   if(num==0 && d==0){
			   break;
		   }
		   k=1;
		   int ax[] = new int[num],ay[] = new int[num];		   
		   while(k<=num && cin.hasNext()){
			   ax[k-1]=cin.nextInt();
			   ay[k-1]=cin.nextInt();
			   k++;
		   }
		   int maxx=(int) Math.ceil((ax[num-1]-ax[0])/2.0);
		   int maxy= (int) Math.ceil((ay[num-1]-ay[0])/2.0);
		   if(maxy>d){
			   System.out.println("Case "+count+": "+-1);	
		   }else{
			   if(maxx>d){
				   if(maxx>maxy){
					   System.out.println("Case "+count+": "+((int)Math.ceil(maxx-d)+1));				   
				   }
			   }
			   else{
				   System.out.println("Case "+count+": "+1);
			   }   
		   }
		   count++;
		   
	   }    
   }
}
