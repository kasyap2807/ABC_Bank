package java230824;

import java.util.Scanner;

public class AccountCreation {
    public bankaccount AccountAdd(){
        Scanner sc = new Scanner(System.in);
        bankaccount ba = new bankaccount();
        System.out.println("Enter Bank Account Number: ");
        ba.setAccountNumber(sc.nextInt());
        System.out.println("Enter User Name: ");
        sc.nextLine();
        ba.setUsername(sc.nextLine());
        System.out.println("Enter Password: ");
        ba.setPassword(sc.nextLine());
        System.out.println("Enter PhoneNumber: ");
        ba.setPhoneNumber(sc.nextDouble());
        System.out.println("Enter MailId: ");
        sc.nextLine();
        ba.setMailId(sc.nextLine());
        System.out.println("Enter Your First Deposite: ");
        ba.setCurrentbalnce(sc.nextInt());

        return ba;
    }
}
