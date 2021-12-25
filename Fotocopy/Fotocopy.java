/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fotocopy;
import java.util.Scanner;
/**
 *
 * @author Bryan C.B
 */
public class Fotocopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Lembar,Fotocopy;
        
        System.out.println("Masukkan Jumlah Lembar yang di Fotocopy : ");
        Lembar = input.nextInt();
     
        if(Lembar>=100) {
            Fotocopy = Lembar*150;
            System.out.println("Harga Anda adalah "+Fotocopy);
        } else {
            Fotocopy = Lembar*250;
            System.out.println("Harga Anda Adalah "+Fotocopy);
        }
    }
}
