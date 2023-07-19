import java.util.Scanner;
class Bank
  {
    String accname;
    int balance;
    public void display()
    {
      System.out.println("Bank details are");
      System.out.println("accname "+accname+" "+"balance"+balance);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bank bank[]=new Bank[2];
      for(int i=0;i<bank.length;i++)
        {
          bank[i]=new Bank();
          System.out.println("enter bank "+(i+1));
          System.out.println("enter accname");
          bank[i].accname=sc.next();
          System.out.println("enter balance");
          bank[i].balance=sc.nextInt();
          
        }
      for(int i=0;i<bank.length;i++)
        {
          bank[i].display();
        }
    }
      
    }
  