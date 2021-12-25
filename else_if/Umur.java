/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package else_if;
import java.util.Scanner;
/**
 *
 * @author Bryan C.B
 */
public class Umur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;
        String nama;
        
        System.out.println("Masukkan Nama Anda : ");
        nama = input.next();
        System.out.println("Masukkan Umur Anda : ");
        umur = input.nextInt();
        
        if (umur >= 60){
            System.out.println("Tuan "+nama+" ,apakah Anda sudah pensiun ?");
        }
        else if (umur>=25 && umur<=60){
            System.out.println("Saudara "+nama+" ,apakah Anda masih aktif kerja ?");
        }
        else {
            System.out.println("Adik " +nama+" ,apakah Anda masih sekolah ?");
        }
    }
}
