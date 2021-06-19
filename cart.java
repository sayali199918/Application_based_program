 import java.util.ArrayList;
 import java.util.Scanner;
 
 class item{
 float price;
 String name;
 int id;
 int quantity=1;

 item(float price, String name,int id, int quantity){
 this.price=price;
 this.name=name;
 this.id=id;
 if(quantity>1) {
 this.quantity = quantity;
 }
 }
 

 }
  
 
 public class cart {
 ArrayList<item> cartlist=new ArrayList<item>();
void add(){
 Scanner sc= new Scanner(System.in);
 System.out.println("enter name");
 String name=sc.nextLine();
 System.out.println("enter id");
int id=sc.nextInt();
 System.out.println("enter price");
 float price=sc.nextFloat();
 System.out.println("enter quantity");
int quantity=sc.nextInt();
 
 item i=new item(price, name, id,quantity);
 cartlist.add(i);
 
 }
 
 public String remove(int id){
 for(int i=0;i<cartlist.size();i++){
 if(id==cartlist.get(i).id){
 cartlist.remove(cartlist.get(i));
 return "remove";
 }
 
 }
 return "not found";
 
 }
 
 public void display(){
 for(int i=0;i<cartlist.size();i++){
 System.out.println(cartlist.get(i).name);
 System.out.println(cartlist.get(i).id);
 System.out.println(cartlist.get(i).price);
 System.out.println(cartlist.get(i).quantity);
 
 }
 }
 public void checkout(){
 display();
 float total=0;
 for(int i=0;i<cartlist.size();i++){
 total=cartlist.get(i).price*cartlist.get(i).quantity+total;
 } empty();
 System.out.println(total);
 }
 public void empty(){
 cartlist.removeAll(cartlist);
 }
 static void menu(){
 Scanner sc=new Scanner(System.in);
 cart c1=new cart();
 int choice;
 do {
 System.out.println("1.add an item in your cart \n 2.remove an item in your cart \n 3.view the item in your cart\n 4.end shopping and go to checkout \n 5.empty your cart\n 6.exit the program");
 choice = sc.nextInt();
 switch (choice) {
 case 1:
 c1.add();
 break;
 case 2:
 System.out.println("enter item you want to delete");
 int b = sc.nextInt();
 c1.remove(b);
 break;
 case 3:
 c1.display();
 break;
 
 case 4:
 c1.checkout();
 break;
 
 case 5:
 c1.empty();
break;
 
 case 6:
 System.exit(0);
 break;
 
 default:
 System.out.println("invalid choice");
 }
 
 // System.out.println();
 }while (choice >0) ;
 
}

 public static void main(String[] args){
 menu();
}
}