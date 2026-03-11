/* 1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly. */

package javaProgram;

// Superclass
public class HillStations {

    void location() {
        System.out.println("Location of hill station");
    }

    void famousFor() {
        System.out.println("Famous for");
    }

    public static void main(String[] args) {

        // i) Parent class reference, Child class object
        HillStations h;

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();

        System.out.println("-------------------");

        // ii) Calling using subclass objects

        Manali m1 = new Manali();
        m1.location();
        m1.famousFor();

        Mussoorie m2 = new Mussoorie();
        m2.location();
        m2.famousFor();

        Gulmarg g1 = new Gulmarg();
        g1.location();
        g1.famousFor();
    }
}

// Subclass 1
class Manali extends HillStations {

    @Override
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for Snow and Adventure Sports");
    }
}

// Subclass 2
class Mussoorie extends HillStations {

    @Override
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }

    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for Scenic Beauty");
    }
}

// Subclass 3
class Gulmarg extends HillStations {

    @Override
    void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir");
    }

    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for Skiing");
    }
}

/* output: Manali is located in Himachal Pradesh
Manali is famous for Snow and Adventure Sports
Mussoorie is located in Uttarakhand
Mussoorie is famous for Scenic Beauty
Gulmarg is located in Jammu & Kashmir
Gulmarg is famous for Skiing
-------------------
Manali is located in Himachal Pradesh
Manali is famous for Snow and Adventure Sports
Mussoorie is located in Uttarakhand
Mussoorie is famous for Scenic Beauty
Gulmarg is located in Jammu & Kashmir
Gulmarg is famous for Skiing    */
