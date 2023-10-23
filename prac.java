/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0){
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int n = sc.nextInt();
	    System.out.println(fibo(a,b,n));
	}
	}
	public static int fibo(int a,int b,int n){
	    if(n==0){
	        return a;
	    }
	    if(n==1){
	        return b;
	    }
	    return (fibo(a,b,n-1))^(fibo(a,b,(n-2)));
	}
}
