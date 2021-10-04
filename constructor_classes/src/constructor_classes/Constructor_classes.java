/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_classes;

/**
 *
 * @author S M Arsalan Shah
 */
class Book {

    int id;
    String title;
    String author;
    int pages;
    String category;
    String edition;

    Book(int id,
            String title,
            String author,
            int pages,
            String category,
            String edition) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;
        this.edition = edition;

    }

    Book(int id,
            String title,
            String author,
            int pages
    ) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;

    }

    void print() {
        if (category == null || edition == null) {
            System.out.println("id" + id);
            System.out.println("book name" + title);
            System.out.println("book " + author);
            System.out.println("no of pages" + pages);
        } else {
            System.out.println("id" + id);
            System.out.println("book name " + title);
            System.out.println("book " + author);
            System.out.println("no of pages " + pages);
            System.out.println("category " + category);
            System.out.println("edition " + edition);

        }

    }
}

class Vehicle {

    String name;
    int number;

    Vehicle(String name, int number) {
        this.name = name;
        this.number = number;

    }

    void display() {

        System.out.println("name" + name);
        System.out.println("number" + number);

    }

}

class Car extends Vehicle {

    int door;

    public Car(String name, int number,int door) {
        super(name, number);
        this.door=door;
        
    }
    
   

   
    @Override
    void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("door"+door);
    }
}

class Bike extends Vehicle {
 String handle;
 String kick;
    public Bike(String name, int number,String handle,String kick) {
        super(name, number);
        this.handle = handle;
        this.kick= kick; 
    }
  
            

    @Override
    void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("handles"+handle);
    
    }


}

public class Constructor_classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Book b1 = new Book(101, "jannat ke pattay", "nimrah ahmed", 700, "novel", "2011");
        Book b2 = new Book(101, "jannat ke pattay", "nimrah ahmed", 700);
        b2.print();
        Bike s1 = new Bike("honda",555 ,"2", "handles");
        
        s1.display();
        Car c1=new Car("cultus",123456,4);
        c1.display();
    }

}
