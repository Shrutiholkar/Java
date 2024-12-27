//Write a program to accept ‘n’ name of cities from the user and sort them in ascending order.
import java.util.*;
class city
{
  String cname;
  void accept()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter city names::");
   cname=sc.next();
 }
 void disp()
 {
   System.out.println("\t city name="+cname);
 }
 public static void main(String abc[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter limit::");
   int n=sc.nextInt();
  city ob[]=new city[n];
  for(int i=0;i<n;i++)
  {
    ob[i]=new city();
    ob[i].accept();
  }
  for(int pass=1;pass<n;pass++)
  {
    for(int i=0;i<n-pass;i++)
    {
      if(ob[i].cname.compareTo(ob[i+1].cname)>0)
      {
        city t=ob[i];
        ob[i]=ob[i+1];
        ob[i+1]=t;
      }
    }
  }
  System.out.println("\n sorted city names::");
  for(int i=0;i<n;i++)
  {
    ob[i].disp();
  }
}
}