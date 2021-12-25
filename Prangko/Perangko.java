/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prangko;
import java.util.Scanner;
/**
 *
 * @author Bryan C.B
 */
public class Perangko {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Lembar, Surat;
        
        System.out.println("Masukkan Jumlah Lembar Surat yang Ingin di Kirim : ");
        Surat = input.nextInt();
        
        if (Surat>=5) {
            System.out.println(Surat+" Surat Anda Membutuhkan perangko");
        }else{
            System.out.println(Surat+" Surat Anda Tidak Membutuhkan Perangko");
        }
    }
}
