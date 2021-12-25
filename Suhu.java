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
public class Suhu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int suhu;
        
        System.out.println("Masukkan Suhu : ");
        suhu = input.nextInt();
        if (suhu>=32) {
            System.out.println("Cuaca Sangat Panas");
        }
        else if (suhu>=27 && suhu<=32){
            System.out.println("Cuaca Panas");
        }
        else if (suhu>=5 && suhu<=15){
            System.out.println("Cuaca Dingin");
        }
        else {
            System.out.println("Cuaca Sangat Dingin");
        }
    }
}
