import java.util.*;
class staff
{
 protected int id;
  protected String name;
  staff(int id,String name)
  {
   this.id=id;
   this.name=name;
  }
}

class ostaff extends staff
{
  String dept;
  ostaff(int id,String name,String dept)
  {
    super(id,name);
     this.dept=dept;
  }
  void disp()
 {
   System.out.println("emp id="+id);
   System.out.println("emp name="+name);
   System.out.println("emp department="+dept);

 }
}
class demo
{
  public static void main(String abc[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter limit::");
   int n=sc.nextInt();
   ostaff ob[]=new ostaff[n];
   for(int i=0;i<n;i++)
   {
     System.out.println("enter emp id name dept::");
     int id=sc.nextInt();
     String name=sc.next();
     String dept=sc.next();
     ob[i]=new ostaff(id,name,dept);

   }
   for(int i=0;i<n;i++)
   {
     ob[i].disp();
  }
 }
}