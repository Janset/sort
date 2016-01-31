package sorts;

import java.util.Scanner;
/*
200 120 400 150 180 300
150 250 360 120 200 130
350 300 250 100 500 260
100 150 260 320 100 150
500 130 260 100 200 170
160 100 250 200 600 200
*/
public class Main2 {

	public static void main(String[] args) {
		  
		  Scanner s=new Scanner(System.in);		  
		  int a[][]=new int[6][6];
		  int i = 0,j=-1;
		  
		  while(i<6){
			
			  int num=s.nextInt();
			  j++;
			  a[i][j]=num;			 
			  if(j==5){
				  i++;
				  j=-1;
			  }			  
		  }
		  for(int i1=0;i1<a.length;i1++){
			  for(int j1=0;j1<a.length;j1++){
				  System.out.print(a[i1][j1]+" ");				  
			  }
			  System.out.println();
			  
		  }

	}

}
