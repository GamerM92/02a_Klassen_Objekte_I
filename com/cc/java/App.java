package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        /*
         *  Instanziierung --> 
         * Erzeugen eines Objekts durch Aufruf eines Konstruktors
         *  Objekt <---> Instanz
         *  cat --> Referenzvariable
         *  Cat --> Referenztyp(Klasse) 
         * 
         */

        Cat cat = new Cat();
        output("Blick von aussen: " + cat);
        cat.getInstanceVariable();

        output("---------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        cat2.getInstanceVariable();
        
        // output("hi");
    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }
   

}

