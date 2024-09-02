import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PracArrayList {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int userip = 1;
       while(userip<=2){
           System.out.println("Enter 1 for signin and 2 for signup and others for exit");
           userip = sc.nextInt();

           if(userip==1){
               System.out.println("----------------Signin page----------------------");
           }
           else if(userip==2){
               System.out.println("----------------signuppage page----------------------");
           }
       }
    }
}
