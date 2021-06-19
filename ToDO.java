import java.util.*;
import java.util.HashMap;
 
 /*Create an App that takes inputs from the User that generates Username and Password
 * It should have Functions: SignIn(Login) and SignUp(Register).
 * It should also allow user to signoff(remove) at any point of time.
 */
 
 public class ToDO {
 
 static Map<String,String> data = new HashMap <String,String> (); //hashmap
 static Scanner sc = new Scanner (System.in);
 
 public void menu() { //menu
 
 int choice = 0;
 do {
 
System.out.println("Press.. \n\t1 to SignIn \n\t2 to SignUp \n\tAny other key to EXIT..");
 choice = sc.nextInt();
 
 switch (choice){
 case 1:
 System.out.println("\n******Signin Here ******\n");
 
 System.out.print("Enter your Username : ");
 sc.nextLine();
 String username = sc.next();

 System.out.print("Enter your Password : ");
 String password = sc.next();
 
 boolean res = check(username, password);
 
 if(res)
 logoutRemove(username);

 break;
 
 case 2:

 System.out.println("\n****** SignUp Here ******\n");
 
 System.out.print("Create Username : ");
 sc.nextLine();
 username = sc.next();
 
 System.out.print("Create Password : ");
 password = sc.next();
 data.put(username, password);
 System.out.println("Account created sucessfully....!!!\n");
 break;
 }
 }while(choice == 1 || choice == 2);
 }
 
 
 public boolean check(String name, String pass) {
 
 if( data.containsKey(name) && data.get(name).equals(pass) ) {
 System.out.println("\nLogin Sucessfull..!!!\n");
 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 return true;
 }else {
 System.out.println("\nInvalid username & password..\n");
  return false;
 }
 }
 
 public void logoutRemove(String username) {
 System.out.println("Welcome "+username+"\n");
 int choice = 0;
 
System.out.println("Press.. \n\t1 to SignOut \n\t2 to delete ur account \n");
 choice = sc.nextInt();
 
 switch(choice) {
 case 1:
 System.out.println("SignOut successfully..!\n");
 break;
 case 2:
 data.remove(username);
 System.out.println("Account deleted sucessfully..!!!\n");
 break;
 }
 
 }
 
 
 

 public static void main(String[] args) {
 ToDO obj = new ToDO();
 obj.menu();


}
}
