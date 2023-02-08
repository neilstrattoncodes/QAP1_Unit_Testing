package org.example;

public class TestTime {
    public static void main(String[] args) {

        Time t1 =  new Time(21, 10, 58 ); // added second for reference and original time
        Time t2 = new Time(10, 20, 0 ); // added second for reference and original time

        t1.setSecond(58); // sets the second for t1;
        t2.setSecond(0); // sets the second for t2;

        t1.nextSecond();  // tells t1 to advance a second
        t2.previousSecond(); // tells t2 to go back a second

        System.out.println("Time one second advanced is " + t1);
        System.out.println("Time one second previous is " + t2);
        System.out.println(t1.nextSecond());








    }
}
