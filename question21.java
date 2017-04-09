import java.io.*;
import java.util.*;

class BelowClassAverageException extends RuntimeException{
	int marks;
	BelowClassAverageException(int m){
		marks = m;
	}
	public String toString(){
		return "Ye number bohot kharab h bc "+marks;
	}
}

class TermEndException extends RuntimeException{
	int marks;
	TermEndException(int m){
		marks = m;
	}
	public String toString(){
		return "Term end mai gaand mar gyi";
	}
}

class Marks{
	int te, inter;
	Marks(int te, int inter)throws RuntimeException{
		this.te = te;
		this.inter = inter;
		if(this.te<40){
			TermEndException tee = new TermEndException(this.te);
			System.out.println(tee);
		}
		else if(this.inter<48){
			BelowClassAverageException be = new BelowClassAverageException(this.inter);
			System.out.println(be);
		}
		else{
			System.out.println("pass");
		}
	}

}

public class question21{
	public static void main(String[] args){
		Marks m = new Marks(56,43);
	}
}

