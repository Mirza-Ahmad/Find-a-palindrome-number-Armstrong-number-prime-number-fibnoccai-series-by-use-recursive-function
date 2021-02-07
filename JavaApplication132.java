package javaapplication132;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class JavaApplication132 
{
    public static void palindrome(String t)
    {
    String rev="";
    boolean y=false;
    for(int i=t.length()-1; i>=0; i--)
    {
        rev=rev+t.charAt(i);
        if(t.equals(rev))
        { 
            y=true;
        }
    }
    if(y==true)
      {
         System.out.println("This is a palindrome number " );
      }
      else
      {
          if(y==false)
          {
              System.out.println("This number is not a palindrome number " );
          }
      }
    }
    public static void prime(int j)
    {
      boolean t=true;
      for(int i=2; i<=j/2; i++)
      {
          if(j%2==0)
          {
            t=false;
            break;
          }
      }
      if(t==true)
      {
        System.out.println("This is a prime number");
      }
      else
      {
          if(t==false)
          {
            System.out.println("This is not a prime number");
          }
      }
    }
    public static void armstrong(int v)
    {
       int b=0;
       while(v>0)
       {
       int n=v%10;
       b=b+(int)Math.pow(v, 3);
       v=v/10;
       }
       if(b==v)
       {
         System.out.println("It is a armstrong number");
       }
       else
       {
           if(b!=v)
           {
               System.out.println("It is not a armstrong number");
           }
       }
    }
    public static int fab(int g)
    {
      if(g==0 || g==1)
      {
         return g;
      }
      else
      {
      return (fab(g-1)+fab(g-2)); 
      }
    }
    public static void main(String[] args) 
    {
    Scanner is=new Scanner(System.in);
    JFrame f=new JFrame();
    String t,m;
    int n;
    while(true)
    {
    m=JOptionPane.showInputDialog(f, " Press 1 : to check whether the number is palindrome or not: \n Press 2: to check the whetther the number is prime or not: \n Press 3: to check the Armstrong number: \n Press 4: to check the fabnocii series by using recursive function: \n Press 5: For exit the program:" +JOptionPane.INFORMATION_MESSAGE);
    n=Integer.parseInt(m);
    boolean y=false;
    if(n==1)
    {
    System.out.println("Enter a number:");
    t=is.next();
    palindrome(t);
    }
    else
    {
        if(n==2)
        {
            System.out.println("Enter a number:");
            int j=is.nextInt();
            prime(j);
        }
    }
    if(n==3)
    {
        System.out.print("Enter a number:");
        int v=is.nextInt();
        armstrong(v);
    }
    if(n==4)
    {
       System.out.println("Enter a number : ");
       int g=is.nextInt();
       fab(g);
       for(int i=0; i<g; i++)
       {
         System.out.println(fab(i));
       }
    }
    if(n==5)
    {
        System.exit(n);
    }
   }
 }
}