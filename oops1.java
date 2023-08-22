/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.oops1;

import java.util.Scanner;

/**
 *
 * @author 22cseb56
 */
public class oops1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner S=new Scanner(System.in);
        System.out.print("Enter a first number:");
        a=S.nextInt();
        System.out.print("Enter a second number:");
        b=S.nextInt();
        if(a<b)
        {
            System.out.println("minimum is A:"+a);
        }
        else
        {
            System.out.println("minimum is B:"+b);
        }
        
                
    }
    
}
