/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seat_booking_prog;

enum Seat_Value {

    A, B, C, D;

}

public class Seat {

    private boolean seat_occupied = false;

    String[][] seatArray = new String[Seat_Value.values().length][Seat_Value.values().length];

   
    public void seat_Value() {

        Seat_Value[] seats = Seat_Value.values();
        
        for (int i = 0; i < seatArray.length; i++) {

            for (int j = 0; j < seatArray[i].length; j++) {
                seatArray[i][j] = String.valueOf(seats[j]);
                System.out.print(seatArray[i][j] + "  ");

            }
            System.out.println("");

        }
        
        
        

    }
    

}
