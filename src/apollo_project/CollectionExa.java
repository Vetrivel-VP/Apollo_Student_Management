/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apollo_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Student
 */
class Book {

    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class CollectionExa {

    public static void main(String arg[]) {
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Ravi");
//        al.add("Ajay");
//        Iterator itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        for (String obj : al) {
//            System.out.println(obj);
//        }

//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Ravi");
//        al.add("Vijay");
//        al.add("Ajay");
//        ArrayList<String> al2 = new ArrayList<String>();
//        al2.add("Ravi");
//        al2.add("Hanumat");
//        al.retainAll(al2);
//        System.out.println("iterating the elements after removing the elements of al2...");
//        Iterator itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        List<Book> list = new ArrayList<Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        list.add(b1);
        list.add(b2);
        list.add(b3);

        for (Book b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
//                 System.out.println(b.);
        }
    }

}
