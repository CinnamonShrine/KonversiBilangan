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
}
