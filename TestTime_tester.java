package org.keyin.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTime_tester {
    @Test
    public void testTimeConstructor() {
        Time test1 = new Time(2, 4, 5);
        assertEquals(2 , test1.getHour());
        assertEquals(4 , test1.getMinute());
        assertEquals(5 , test1.getSecond());

        /* testing Time Constructor to see if receives
        the correct Hour, Minute and Second.
         */

    }
    @Test
    public void testSetTimeSetterMethod(){
        Time test1 = new Time(5, 6, 7);
        test1.setTime(1, 2, 3);
        assertEquals(1, test1.getHour());
        assertEquals(2, test1.getMinute());
        assertEquals(3, test1.getSecond());

         /* testing setTime Constructor to see if receives
        the correct Hour, Minute and Second.
         */


    }

    @Test
    public void testNextSecondMethod(){
        Time test1 = new Time(5, 6, 7);
        test1.nextSecond();
        assertEquals(8, test1.getSecond());

         /* testing nextSecond Method to see if receives
        the correct next Second.
         */

    }
    @Test
    public void testNextSecond59Method(){
        Time test1 = new Time(5, 6, 59);
        test1.nextSecond();
        assertEquals(0, test1.getSecond());

         /* testing nextSecond Constructor to see if receives
        Second for 59.
         */
    }
    @Test
    public void testPreviousSecondMethod(){
        Time test1 = new Time(5, 6, 7);
        test1.previousSecond();
        assertEquals(6, test1.getSecond());

        /* testing PreviousSecond Constructor to see if receives
        Second.
         */

    }
    @Test
    public void testPrevious00SecondMethod(){
        Time test1 = new Time(5, 6, 0);
        test1.previousSecond();
        assertEquals(59, test1.getSecond());

        /* testing nextSecond Constructor to see if receives
        Second for 0 to go to 59.
         */
    }
}

