/**
 * QuickSort worst-case O(n^2)
 *           best-case O(nlogn)
 *           average0-case O(nlgn)
 */
package sorts;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuickSort {
	public static void QuickSort(int A[],int p,int q){
		if(p<q){
			int r=Partition(A,p,q);
			QuickSort(A,p,r-1);
			QuickSort(A,r+1,q);
		}
	}
	public static int Partition(int A[],int p,int q){
		int i=p;
		int j=q;
		int t=0;
		int key=A[i];
		while(i<j){
			while(i<j && A[i]<A[j]){//jÏò×óÉ¨Ãè
				j--;
			}
			if(i<j){
				t=A[i];
				A[i]=A[j];
				A[j]=t;
			}
			while(i<j && A[i]<A[j]){//iÏòÓÒÉ¨Ãè
				i++;
			}
			if(i<j){
				t=A[i];
				A[i]=A[j];
				A[j]=t;
			}
		}
		return i;
	}
    public static void main(String[] args) {
		int A[]=new int[100];
		int x,i=0;
		Scanner stdin = new Scanner(System.in);   		
		String s=stdin.nextLine();
		String a[]=s.split(" ");
		for(String a1:a){
			x=Integer.parseInt(a1);
			A[i]=x;
			i++;	
		}
		for(int k=0;k<i;k++){
			System.out.print(A[k]+" ");
		}
		System.out.println();
		QuickSort(A,0,i-1);	
		for(int k=0;k<i;k++){
			System.out.print(A[k]+" ");
		}
				
	
	}
}
