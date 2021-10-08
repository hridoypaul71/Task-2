/*
Name:Hridoy Paul (Gupi)
ID :2012020136
Section: C
Email :cse_2012020136@lus.ac.bd
Date:08-08-2021
*/
package hridoypaul;


public class Main {
    public static void main(String[] args){
    
        Student student1 = new Student();
        Student.universityName = "Leading University";
    
        Student student2 = new Student ("Hridoy paul");
        
        Student student3 =  new Student ("",2012020136);
        student1.display();
    }
    
}
