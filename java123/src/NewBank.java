import java230824.bankaccount;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class NewBank {
    public static void main(String[] args){
        System.out.println("********Welcome to ABC Bank***********");
        LinkedList<data> list = new LinkedList<data>();
        LinkedList<data> list2 = new LinkedList<data>();

        data d = new data();
        d.setAccountNumber(1);
        d.setUsername("kk");
        d.getPassword("kk");
        list.add(d);
        list2.add(d);
        data d2 = new data();
        d2.setAccountNumber(2);
        d2.setUsername("kk");
        d2.getPassword("kk");
        list.add(d2);
        list2.add(d2);
        data d3 = new data();
        d3.setAccountNumber(3);
        d3.setUsername("kk");
        d3.getPassword("kk");
        list.add(d3);

        Iterator<data> itr = list.iterator();
        while (itr.hasNext()){
            data dt = itr.next();
            System.out.println(dt.getAccountNumber());
        }

        list.clear();
        list.addAll(list2);

        Iterator<data> itr2 = list.iterator();
        while (itr2.hasNext()){
            data dt = itr2.next();
            System.out.println(dt.getAccountNumber());
        }








    }
}
