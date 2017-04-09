import java.io.*;
import java.util.*;

public class question19{
	public static void main(String[] args){
		int inte=0;
		double doub=0;
		for(int i=0;i<args.length;i++){
			try{
				int x = Integer.parseInt(args[i]);
				inte++;
			}
			catch(Exception e){
				try{
					double y = Double.parseDouble(args[i]);
					doub++;
				}
				catch(Exception e2){}
			}	
		}
		System.out.println(inte);
		System.out.println(doub);
	}
}