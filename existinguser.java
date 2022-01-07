import java.util.Scanner;
public class existinguser {

     int acc;

     void input(){
          Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
          System.out.print("Enter your account number- ");
          int acc = sc.nextInt();


     }
     void function(){
          System.out.println("What function do you want to perform?:\n 1)Transfer Money\n 2)Close Your Account");
          int a;
          Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
          a= sc.nextInt();
          if(a==1){
               System.out.println("Enter The amount you want to transfer");
                 //System.in is a standard input stream
               int amount= sc.nextInt();
               System.out.println("Enter the account number at which you want to transfer");
                 //System.in is a standard input stream
               int acc2= sc.nextInt();

               System.out.println(amount+ " Rupees Has been transfeerred to account number"+ acc2);


          }
          else{
               System.out.println("Your account has been succesfully closed");
          }
     }





}
