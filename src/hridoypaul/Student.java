/*
Name:Hridoy Paul (Gupi)
ID :2012020136
Section: C
Email :cse_2012020136@lus.ac.bd
Date:08-08-2021
*/
package hridoypaul;

public class Student {
    String name;
    int id;
    static String universityName;
    
    Student(){
        System.out.println("Default Constractor");
    }
    
    Student (String name){
        this.name = name;
         System.out.println("Name :"+this.name);
    }
    
    Student (String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("Id :"+this.id);
    }
    
    void display(){
        System.out.println("University name :"+universityName);
    }
    
}
