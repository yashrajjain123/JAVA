import java.io.*;
import java.util.*;

abstract class Themepark{
	int totalCost(int n,int m){
		return (500*n + 300*m);
	}
	abstract void playGame(int i);
	boolean[] a = new boolean[30];
	int[] x = new int[40];
	int count = 0;
}

class Queensland extends Themepark{
	Queensland(){
		
		
		for(int i=0;i<30;i++){
			a[i] = false;
		}
	}
	void playGame(int i){

		if(a[i]==true)
			System.out.println("Sorry mate! already played this game");
		else{
			a[i] = true;
			count++;
		}
	}
	void playedGames(){
		System.out.println(count);
	}	
}

class Veegaland extends Themepark{
	Veegaland(){
		
	}
	void playGame(int i){
		x[i]++;
	}
	void playedGames(){
		System.out.println("Games that were palyed");
		for(int i=0;i<40;i++){
			if(x[i]>0){
				System.out.println(i+ "played for" + x[i] + "times");
			}
		}
		System.out.println("Games that were not palyed");
		for(int i=0;i<40;i++){
			if(x[i]==0){
				System.out.println(i);
			}
		}
	}
}

public class question18{
	public static void main(String[] args){
		Queensland q = new Queensland();
		q.totalCost(3,4);
		q.playGame(3);
		q.playGame(3);
		q.playedGames();
		Veegaland v = new Veegaland();
		v.totalCost(4,6);
		v.playGame(4);
		v.playGame(4);
		v.playedGames();
	}
}