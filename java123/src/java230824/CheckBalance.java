package java230824;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CheckBalance {
    public void balanceCheck(LinkedList<bankaccount> accountdata){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String username = (sc.nextLine());
        System.out.println("Enter Password: ");
        String password = (sc.nextLine());

        Iterator<bankaccount> itr = accountdata.iterator();
        Boolean check = false;

        while(itr.hasNext()){
            bankaccount detials = itr.next();
            if(detials.getUsername().equals(username) && detials.getPassword().equals(password)){
                System.out.println("Login Successfull \nYour Balance is "+detials.getCurrentbalnce());
                check = true;
                break;
            }
        }

        if(!check){
            System.out.println("Login Failed!....");
        }
    }


}
