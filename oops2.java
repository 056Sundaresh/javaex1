/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.oops2;

/**
 *
 * @author 22cseb56
 */
public class oops2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0;
        for(int i=101;i<200;i++)
        {
            if(i%7==0)
                a+=i;
        }
        System.out.println("output is"+a);
    }
    
}
