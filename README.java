import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
    int c=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for (int i = 1; i <= a; i++)
{
      if (a % i == 0)
      {
         c++;
      }
  }

  if (c == 2) {
  System.out.println("n is a Prime number");
  }
  else {
  System.out.println("n is not a Prime number");
  }
}
}
