package sorts;

import java.awt.Point;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
	
		  
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int n1=n;
		 
		  Vector<Point> v=new Vector<Point>();
		  
		  while(n1>0){
			  Point p=new Point();
			  int x=s.nextInt();
			  //Scanner s1=new Scanner(System.in);
			  int y=s.nextInt();
			  p.setLocation(x, y);
			  v.add(p);
			  n1-=1;			  
		  }
		  int maxX=0;
		  int minX=Integer.MAX_VALUE;
		  int maxY=0;
		  int minY=Integer.MAX_VALUE;
		  if(n==1)
			  System.out.println(1);
		  else{
			  if (v.get(0)!=null){
				  maxX= (int) v.get(0).getX();
				  maxY= (int) v.get(0).getY();
			  }
			  for(int i=0;i<v.size();i++){	
				//  System.out.println(v.get(i));
				  if(v.get(i).getX()>maxX)
					  maxX= (int) v.get(i).getX();			  
				  if(v.get(i).getX()<minX)
					  minX=(int) v.get(i).getX();			  
				  if(v.get(i).getY()>maxY)
					  maxY= (int) v.get(i).getY();
				  if(v.get(i).getY()<minY)
					  minY= (int) v.get(i).getY();			  
			  }
			  int bian=0;
			  //System.out.println(minX+" "+maxX+" "+minY+" "+maxY);
			  if((maxX-minX)-(maxY-minY)>=0)
				  bian=maxX-minX;
			  else
				  bian=maxY-minY;		  
			  System.out.println(bian*bian);
		  }
		 
		
	}

}
