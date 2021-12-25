/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Absah;
import java.util.Scanner;
/**
 *
 * @author Bryan C.B
 */
public class absah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Nilai;
        
        System.out.println("Masukkan Nilai : ");
        Nilai = input.nextInt();
        
        if(Nilai<=100) {
            System.out.println("Absah");
        } else {
            System.out.println("Tidak Absah");
        }
    }
}
