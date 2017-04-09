import java.io.*;
import java.util.*;

class sjf{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of processes: ");
		int n = sc.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];
		int[] tat = new int[n];
		int[] w = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the arrival time of process: " +(i+1));
			a[i] = sc.nextInt();
			System.out.println("Enter the burst time of process: " +(i+1));
			b[i] = sc.nextInt();
		}
		int c = 0;
		int k = 0;
		while(c<a[n-1]){
			for(int i=k+1;k<n;k++){
				c += a[i];
				if(b[k]<b[i]){
					b[k] -= a[i];
					continue; 
				}
				else{
					System.out.println("aborted " + (k+1));
					k++;
				}
			}
		}
		Arrays.sort(b);
		for(int i=0;i<n;i++){
			System.out.println(b[i]);
		}
	}
}