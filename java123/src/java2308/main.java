package java2308;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        LinkedList<BankAccount> ll = new LinkedList<BankAccount>();

        BankAccount ba = new BankAccount();

        int x =1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to add account 2 to login and 3 to exit");
        x = sc.nextInt();

        while(x<=2){
            if(x==1) {
                System.out.println("Enter Id");
                ba.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter user");
                ba.setUser(sc.nextLine());
                System.out.println("Enter password");
                ba.setPassword(sc.nextLine());

                ll.add(ba);

                System.out.println("Signup Successful!!");
            }
            else if(x==2){

                sc.nextLine();
                System.out.println("Enter user");
               String user = (sc.nextLine());
               System.out.println("Enter password");
               String password = (sc.nextLine());
                Iterator<BankAccount> itr = ll.iterator();
                int flag = 1;

                while(itr.hasNext()){
                    BankAccount bas = itr.next();

                    if(user.equals(bas.getUser()) && password.equals(bas.getPassword())){
                        System.out.println("Login Success");
                        System.out.println("Welcome "+bas.getUser());
                        System.out.println("Your id is "+bas.getId());
                        flag = 0;
                        break;
                    }
                }

                if(flag==1){
                    System.out.println("Login Failed");
                }
            }

            System.out.println("Enter 1 to add account 2 to login 3 to exit");
            x = sc.nextInt();
        }

        Iterator<BankAccount> itr = ll.iterator();

        while(itr.hasNext()){
            BankAccount bas = itr.next();
            System.out.println(bas.getId()+"  "+bas.getUser()+" "+bas.getPassword());
        }
    }
}
