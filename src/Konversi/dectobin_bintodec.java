/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konversi;
import java.util.Scanner;
/**
 *
 * @author Arif
 */
public class dectobin_bintodec {
    void decimalToBiner(int a){
        if (a>1){
            decimalToBiner(a/2);
        }
        System.out.print(a%2);
    }
    
    String binerToDecimal(String bilangan){
        String[] binerReverse = new String[bilangan.length()];
        double resultDecimal = 0;
        //reverse
        int n = 0;
        for (int i = bilangan.length() - 1; i >= 0; i--){
            binerReverse[n] = String.valueOf(bilangan.charAt(i));
            n++;
        }
        //pangkatkan
        for (int i = 0; i < binerReverse.length; i++) {
        if (Integer.parseInt(binerReverse[i]) == 1) {
            resultDecimal += Math.pow(2, i);
            }
        }
        return String.valueOf(resultDecimal);
    }
}
