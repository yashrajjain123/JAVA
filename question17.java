import java.io.*;
import java.util.*;

interface Increasing {
	int n=137;
	String s="ant";
	void isIncreasing();
}
class IncreasingNumber implements Increasing{
	int num;
	IncreasingNumber(){
		num = n;
	}
	public void isIncreasing(){
		int x;
		int max = 10;
		int flag=0;
		while(num>0){
			x = num%10;
			if(max>x){
				max = x;
			}
			else{
				flag = 1;
				break;
			}
			num = num/10;
		}
		if(flag==1){
			System.out.println("Not increaing");
		}
		else
			System.out.println("increaing");
	}
}
class IncreasingString implements Increasing{
	String num;
	IncreasingString(){
		num = s;
	}
	public void isIncreasing(){
		char[] x = num.toCharArray();
		int flag=0;
		for(int i=0;i<x.length-1;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]<x[j])
					continue;
				else{
					flag = 1;
					break;
				}
			}
		}
		if(flag==1){
			System.out.println("Not increaing");
		}
		else
			System.out.println("increaing");
	}
}

public class question17{
	public static void main(String[] args){
		IncreasingString is = new IncreasingString();
		is.isIncreasing();
		IncreasingNumber in = new IncreasingNumber();
		in.isIncreasing();
	}
}