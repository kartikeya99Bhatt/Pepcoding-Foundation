import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<=str.length();j++)
		    {
		        String s=str.substring(i,j);
		        if(isPalindrome(s))
		        System.out.println(s);
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
	public static  boolean isPalindrome(String str)
	{
	    int i=0;int j=str.length()-1;
	    while(i<j)
	    {
	        if(str.charAt(i)!=str.charAt(j)) return false;
	        i++;
	        j--;
	    }
	    return true ;
	}

}
