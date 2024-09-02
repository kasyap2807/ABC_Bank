package java230824;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        System.out.println("********Welcome to ABC Bank***********");
        LinkedList<bankaccount> list = new LinkedList<bankaccount>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter \n1-> for creating Bank Account \n2-> For Balence check \n 3->withDraw \n 4->Exit");
        int choice = sc.nextInt();

        while(choice<=4 && choice>0){
            switch (choice){
                case 1: {

                    AccountCreation ac = new AccountCreation();

                    list.add(ac.AccountAdd());

                    System.out.println("Account Created Successful!.....");

                    System.out.println("enter \n1-> for creating Bank Account \n2-> For Balence check  \n 3->withDraw \n 4->Exit");
                    choice = sc.nextInt();
                    break;
                }
                case 2:{
                    CheckBalance cb = new CheckBalance();

                    cb.balanceCheck(list);

                    System.out.println("enter \n1-> for creating Bank Account \n2-> For Balence check  \n 3->withDraw \n 4->Exit");
                    choice = sc.nextInt();
                    break;
                }
                case 3:{
                    WithDraw wd = new WithDraw();

                    list = wd.withdrawamount(list);

                    System.out.println("enter \n1-> for creating Bank Account \n2-> For Balence check  \n 3->withDraw \n 4->Exit");
                    choice = sc.nextInt();
                    break;

                }
            }
        }

        System.out.println("********Thank You & Vist Again**********");


    }
}
