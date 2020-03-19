import java.io.*;
import java.util.*;
public class Adv
{
  String arr[][] = new String[4][40];
  public static void main(String[] args) throws Exception
  {
    Adv ob=new Adv();
    String str="";
    Scanner sc=new Scanner(System.in);
    Scanner sc1 = new Scanner(new File("customers.txt"));
    while (sc1.hasNext())
    {
      str = sc1.nextLine();
    }
    String cust[]=str.split("\\s");
    int i;

    String prod[] = { "Notebook", "T-Shirt", "Socks", "Keyboard" };
    System.out.println("\t\t------- PHASE 1 : Getting target audience -------\n");
    System.out.println("Products Available :\n");
    for (i=0;i<4;i++)
    {
      System.out.println(i+1 +" - "+prod[i]);
    }
  while(true)
    {
    System.out.println("\nChoose any Product(1-4) to run Advertisment(0 to exit PHASE 1) : ");
    int ch = sc.nextInt();
    if(ch != 0)
    {
    switch(ch)
    {
      case 1:
      ob.customer(0,cust);
      break;
      case 2:
      ob.customer(1,cust);
      break;
      case 3:
      ob.customer(2,cust);
      break;
      case 4:
      ob.customer(3,cust);
      break;
      default :
      System.out.println("Invalid choise");
      System.exit(1);
    }
    System.out.println("Advertisment successfully Ran");
    } else break;
  }

  System.out.println("\n\t\t------- PHASE 2 : Targeted Advertising :-------\n");
  System.out.println("Products Available :\n");
  for (i=0;i<4;i++)
  {
    System.out.println(i+1 +" - "+prod[i]);
  }
  while(true)
  {
  System.out.println("\nChoose any Product(1-4) to run Targeted Advertisment(0 to exit) : ");
  int chp=sc.nextInt();
  if(chp != 0)
  {
  System.out.println("\nAdvertisment successfully ran in front of custom audience for "+ prod[chp-1]+" : ");

    for (int j=0;j<30;j++)
    {
      if(ob.arr[chp-1][j]!=null)
      System.out.println(prod[chp-1] + " - " + ob.arr[chp-1][j]);
    }
  } else break;
  }
    sc1.close();
  }

String[][] customer(int p,String[] cust)
{
  Scanner sc=new Scanner(System.in);
  int r=(int)Math.floor(Math.random()*30)+5; //out of 35 global audience
  for (int j=0;j<r;j++)
  {
    int r1=(int)Math.floor(Math.random()*r);// out of lets say 20
    int f=0;
    for(int k=0;k<r;k++)
    {
    if(cust[r1]==arr[p][k])
      {
        f=1;
        break;
      }
    }
    if(f==0)
    arr[p][j]=cust[r1];
  }
  return arr;
}
}
