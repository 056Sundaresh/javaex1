/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.oops3;

/**
 *
 * @author 22cseb56
 */
public class oops3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=5;
        double result=0.0;
        System.out.println("The harmonic series is");
        while(num>0){
            result=result+(double)1/num;
            num--;
            System.out.print(result+",");

    }
    }
}
