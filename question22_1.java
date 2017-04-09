import primepackage.*;
import java.io.*;
import java.util.*;

class TwinPrimes{
	int l,m;
	TwinPrimes(int x,int y){
		l=x;
		m=y;
		if(checkForPrime(l) && checkForPrime(m)){
			if(Math.abs(l-m)==2)
				System.out.println("TwinPrimes");
			else
				System.out.println("Not TwinPrimes");
		}
	}
}

public class question22_1{
	public static void main(String[] args){
		TwinPrimes tp = new TwinPrimes(3,5);
	}
}