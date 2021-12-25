/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Bryan C.B
 */
public class Nilai {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int Nilai;
                
        System.out.println("Masukkan Nilai Anda");
        Nilai = input.nextInt();
        
        if(Nilai>=70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
           
    }
}
