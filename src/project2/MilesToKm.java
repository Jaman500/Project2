/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Jaman500
 * I was asked to write a method that will print out a table which displays miles in km:
 * Miles Kilometers
 * 1     1.609
 * 2     3.218
 * ...   ...
 * 9     14.481
 * 10    16.090
 */
public class MilesToKm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Miles   Kilometers");
        for(int i = 1; i <= 10; i++)
        {
            //System.out.print(i + "       ");
            System.out.printf("%-7d %.3f %n", i, i*1.609);
        }
    }
    
}
