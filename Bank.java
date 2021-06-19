import java.util.Scanner;
class Bankend
{
    private String name;
    private int ac = 12345697;
    private String type;
    private float  bal=500;
     void acopn( String name,String type)
    {
        System.out.println("Welcome to AXIS bank");
        System.out.println("Your account details are====>");
        System.out.println("Name = "+name);
        System.out.println("Your account no = "+ ac+1);
        System.out.println("Your account type = "+type);
        System.out.println("Your current balance is = "+bal);
    }
     void deposite(float pbal)
     {
         if (pbal< 0)
         {
             System.out.println("please enter positive value only");
             System.out.println("Your transition is not sucessful");
         }
         else
         {
         bal= pbal+bal;
         System.out.println("Your current balance is="+bal);
         System.out.println("Your transition is sucessful");
         
         }
     }
     void showbal()
     {
         System.out.println("Your current balnce is = "+bal);
         System.out.println("Your transition is sucessful");
     }
     void withdraw(float wbal)
            
     {     
         if(wbal <0)
                 {
                  System.out.println("please enter positive value")  ; 
                   System.out.println("Your transition is not sucessful");
                 }
         else{
         float ybal=bal;
         bal= bal-wbal;
         if(bal>500)
         {
            System.out.println("Your current balnce is = "+ bal);
            System.out.println("Your transition is sucessful");
         }
         else
         {
             System.out.println("if you do the transition then current balnce is lesss than 500 so you can't withdraw money");
             bal=ybal;
         }
         }
     }
  }
class Bank
{   
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);  
    System.out.println("Enter your name here please");
    String a= obj.nextLine();
    System.out.println("Enter your account type \n1. 'Saving' \n2. 'Current' \n **only enter Saving or current");
    String b=obj.nextLine();
    System.out.println("You have to deposit 500Rs for  futher procedure");
    System.out.println("if you want to continue then please enter = 1 if no then please enter = 2");
    int d=obj.nextInt();
    Bankend abc = new Bankend();
    
    if(d==1)
    {
    abc.acopn(a,b);
    }
    else
    {
     System.out.println("Thank you!!!!");
     System.exit(0);
    }
    
    
    System.out.println("What you want to do \n '1'.Deposit \n '2'.Show balance \n '3'.withdraw \n '4'.exit \n **please enter number number 1 2 3 4 only");
    int e=obj.nextInt();
    
    do{
    if(e==1)
    {
       System.out.println("enter how much amount you want to deposit");
       float c= obj.nextFloat();
       abc.deposite(c);
    }
    if(e==2)
    {
        abc.showbal();
    }
    if(e==3)
    {
        System.out.println("How much amount you want to withdraw");
        float f=obj.nextFloat();
        abc.withdraw(f);
    } 
    System.out.println("What you want to do \n '1'.Deposit \n '2'.Show balance \n '3'.withdraw \n '4'.exit\n **please enter number number 1 2 3 4 only");
    e=obj.nextInt();
    }while(e != 4);
   
    }
    
}
