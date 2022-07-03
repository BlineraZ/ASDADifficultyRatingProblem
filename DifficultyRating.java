import java.util.*;
import java.lang.*;
import java.io.*;

public class DifficultyRating{
	public static void main (String[] args){
		Scanner scn= new Scanner(System.in);
		int x = scn.nextInt();
		
		while(x-- > 0){
		    
			int length = scn.nextInt();
		    int a[] = new int[length];
		    int count=0;
		    
			for (int i=0;i<length;i++){
		        a[i] = scn.nextInt();
		    }
			
		    for ( int i=0;i<length;i++){
				if( a[i]>=1000)	{
		        count++;
				}	
		    }
		    System.out.println(count);
		}
	}
}