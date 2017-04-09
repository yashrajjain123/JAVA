import java.io.*;
import java.util.*;

class IilegalArguementException extends Exception{
	IilegalArguementException(){
		System.out.println(this);
	}
	public String toString(){
		return ("there is a length issue");
	}
}
class NoSuchElementException extends Exception{
	NoSuchElementException(){
		System.out.println(this);
	}
	public String toString(){
		return ("there is NoSuchElementException issue");

	}
}
class student{
	int mob1;
	char[] x;
	student(char[] reg,String mob)throws Exception{
		if(mob.length()!=10){
			IilegalArguementException sc = new IilegalArguementException();
			throw sc;
			
		}
		if(reg.length!=9){
			IilegalArguementException sc = new IilegalArguementException();
			throw sc;
			
		}
		try{
			mob1 = Integer.parseInt(mob);
		}
		catch(NumberFormatException ne){
			System.out.println("Number galat h");
		}
		x = new char[reg.length];
		for(int i=0;i<x.length;i++){
			
				if((x[i]>='a' && x[i]<='z')||(x[i]>='0' && x[i]<='9'))
					x[i] = reg[i];
				else
					throw new NoSuchElementException();
			
			
		}
	}
}

public class question20{
	public static void main(String[] args){
		char[] l = "ehu2yu1!1".toCharArray();
		try{student s = new student(l,"6439123231");}
		catch(Exception erf){}
		
		
	}
}