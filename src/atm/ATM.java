/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atm;
import java.util.Scanner;
/**
 *
 * @author USMAN
 */
public class ATM {

  public static double balance=15000;
public static String actualpin="1234";
public static int array[]={1234,5678,1472,4521,1214};
 public static int Pincheck(String pin)
{
   if(pin==actualpin)
 return 1;
else
return 0;
}
public static int Transection(double amount,double tempbal)
{
  if(amount < balance && tempbal>500)
    System.out.println("Here your money");
else
System.out.println("Can't withdraw");
      return 0;
}
public static int Transfermoney(double amount,double tempbal,int accountnum)
{  
  int check=0;
int a=0;
for(a=0;a<5;a++)
{
   if(array[a]!=accountnum)
   {
   } else {
       check=1;
       break;}
}
if(check==1)
{
  if( amount<balance && tempbal>500)
  {
   System.out.println("money has been tranfer");
}
 else
{ 
     System.out.println("enter data may be wrong");
}
}
else
  System.out.println("no account number found");
      return 0;

}


    public static void main(String[] args) {
     
     int a=0;
   int b;
   double amount;
  int accountnum;
  double tempbal;
   String pin;
   Scanner myObj = new Scanner(System.in);
  do{
      
 pin=myObj.nextLine();
 if(actualpin.equals(Pincheck(pin))){
 	a=1;
 	System.out.println("Welcome");
 }
 else {
 	a=0;
 	System.out.println("Wrong PIN enter again");
 }
     
} while(a==0);
  
   b = myObj.nextInt();
 switch(b)
  {
   case 1:
{
    
   amount = myObj.nextInt();
   tempbal = myObj.nextDouble();
    Transection(amount,tempbal);
   break;
}


 case 2:
{
    
   amount = myObj.nextInt();
 accountnum=myObj.nextInt();
  tempbal=myObj.nextDouble();
    Transfermoney(amount,tempbal,accountnum);
   break;
}
}
        // TODO code application logic here
    }

   

    
}
