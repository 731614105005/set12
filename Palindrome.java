# set12
 import java.io.*;
 import java.util.*;
 public class Palindrome
 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a,b,c=0;
     b=n;
     while(n!=0)
     {
       a=n%10;
       n=n/10;
       c=c*10+a;
       }
       if(c==b)
       System.out.println("n is palindrome");
       else
       {
         System.out.println("n is not a palindrome");
         }
         }
         }
