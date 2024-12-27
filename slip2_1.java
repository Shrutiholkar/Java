//Q1) Write a program to read the First Name and Last Name of a person, his weight and height using 
 //command line arguments. Calculate the BMI Index which is defined as the individual's body mass 
 //divided by the square of their height.
 //(Hint : BMI = Wts. In kgs / (ht)2)


import java.util.*;
 class cal_bmi
{
  String fname,lname;
  int w,h;
  float bmi;
  void accept()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter first and last name::");
  String fname=sc.next();
  String lname=sc.next();
  System.out.println("enter wieght and height::");
  int w=sc.nextInt();
  int h=sc.nextInt();
  bmi=w/(h*h);
 }
 void disp()
{
  System.out.println("person first name::"+fname);
  System.out.println("person last name::"+lname);
System.out.println("person wieght::"+w);
  System.out.println("person height::"+h);
System.out.println("person bmi::"+bmi);
  

}
}
class demo
{
  public static void main(String abc[])
 {
   cal_bmi ob=new cal_bmi();
   ob.accept();
   ob.disp();
 }
}