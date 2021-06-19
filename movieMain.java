
 import java.util.Scanner;

 class Movie{
 String movieName = " " ;
 String movieDirector;
 String review;
 byte rating;

 void addReview(Movie obj,String movieName){
 Scanner sc = new Scanner(System.in);

 this.movieName = movieName;

 System.out.print("Enter name of Director : ");
movieDirector = sc.nextLine();

System.out.print("Post your review : ");
 review = sc.nextLine();
 
 System.out.print("How do u rate this movie out of 10 : ");
rating = sc.nextByte();
System.out.println("\n\tThanks for the review..!\n");
 
 }

 void displayReview(){
 System.out.println("Movie : "+this.movieName);
 System.out.println("Director : "+this.movieDirector);
 System.out.println("Review for your choosen movie : "+ this.review);
 System.out.println("Rating of this movie out of 10 : "+ this.rating);
 }
 }

 public class movieMain {
 
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Movie obj [] = new Movie [5];
 for(int i = 0; i < 5 ; i++) {
obj [i] = new Movie();
 }
 int choice;
 int in;
 do {
 System.out.println("Select slot from 1-5 **Max = 5 ");
 in = sc.nextInt()-1;
 
 do {
System.out.println("Select the choice..... \nPress 1 for adding review \n\t2 for searching the movie \n\tAny other key to exit....");
 choice = sc.nextInt();
 
 switch (choice) {
 case 1:
System.out.print("Enter the movie name : ");
sc.nextLine();
 String movieName = sc.nextLine();
 obj [in].addReview(obj[in], movieName);
break;
case 2:
 System.out.print("Enter the movie name to search it : ");
 sc.nextLine();
 String name = sc.nextLine();
for(int i = 0; i < 5 ; i++) {
if ( (obj[i].movieName).contains(name) )
 obj[i].displayReview();
 } //else
 System.out.println("Sorry dear !!! Your movie is not available add it first");
 break;
 default:
 System.out.println("Tata bye bye khatam....");
 break;
 }
 
 }while(choice == 1 || choice == 2);
 
}while(in == 0 || in == 1 || in == 2 || in == 3 || in == 4);
 sc.close();
} 
 }