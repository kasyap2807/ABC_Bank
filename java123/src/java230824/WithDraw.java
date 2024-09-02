package java230824;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class WithDraw {
    public LinkedList<bankaccount> withdrawamount(LinkedList<bankaccount> accountdata){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        String username = (sc.nextLine());
        System.out.println("Enter Password: ");
        String password = (sc.nextLine());


        Iterator<bankaccount> itr = accountdata.iterator();
        Boolean check = false;
        int i =0;

        while(itr.hasNext()){
            bankaccount detials = itr.next();
            bankaccount updates = detials;
            if(detials.getUsername().equals(username) && detials.getPassword().equals(password)){
                System.out.println("Login Successfull \nYour Balance is "+detials.getCurrentbalnce());
                System.out.println("Enter Amount To Withdraw: ");
                int amount = (sc.nextInt());

                if(detials.getCurrentbalnce()>amount){
                    System.out.println("Take your Money \n Current Balance is"+(detials.getCurrentbalnce()-amount));
                    updates.setCurrentbalnce((detials.getCurrentbalnce()-amount));

                    accountdata.set(i,updates);

                    return accountdata;

                }
                else{
                    System.out.println("Sorry Your Balance Is bot that Musch");
                }
            }
            i+=1;
        }

        if(!check){
            System.out.println("Login Failed!....");
        }

        return accountdata;
    }
}
