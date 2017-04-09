import java.io.*;
import java.util.*;

class fcfs{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of processes: ");
		int n = sc.nextInt();
		int[] b = new int[n];
		int[] w = new int[n];
		int[] a = new int[n];
		int[] tat = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the burst time for process " + (i+1));
			b[i] = sc.nextInt();
			System.out.println("Enter the arrival time for process " + (i+1));
			a[i] = sc.nextInt();
		}
		w[0] = 0;
		tat[0] = b[0];
		int x = b[0];
		for(int i=1;i<n;i++){
			w[i] = x - a[i];
			tat[i] = b[i] + w[i] ;
			x += b[i];
		}
		for(int i=0;i<n;i++){
			System.out.println("Process "+ (i+1) +" waiting time "+ w[i]+" turn around time "+tat[i]);
		}

	}
}