/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konversi_Waktu;

import java.util.Scanner;
/**
 *
 * @author Adrian MNA
 */
public class Konversi {
    public static void main(String[] args){
        System.out.println("Pilihan Konbersi:\n" 
                            + "1. jam -> Menit\n"
                            + "2. Detik -> Hari, jam, menit, dan detik");
        
        System.out.println("\n Masukkan pilihan");
        try (Scanner options = new Scanner(System.in)){
            if (!options.hasNextInt()){
                System.out.println("Itu alfabet, anda salah!");
            } else{
                if (options.nextInt()==1){
                    System.out.println("Masukkan jam:");
                    Scanner hours = new Scanner(System.in);
                    JamKeMenit(hours.nextInt());
                } else {
                    System.out.println("Masukkan detik:");
                    try(Scanner seconds = new Scanner(System.in)){
                        DetikKeHari(seconds.nextLong());
                    }
                }
            }
        }
    }

    public static void jamKeMenit(long jam) {   
        long menit = jam * 60;   
        System.out.println("Menit: " + menit); 
    }
    
    public static void detikKeHari(long detik) { 
        //hari    
        int hari = (int) (detik / (60 * 60 * 24)); 
        //jam    
        detik %= (60 * 60 * 24);    int jam = (int) (detik / (60 * 60));
        //menit    
        detik %= (60 * 60);    int menit = (int) (detik / 60); 
        //detik    
        detik %= 60; 
        System.out.println(hari + " Hari, " + jam + "jam , " + menit + " menit, " + detik + " detik"); 
    }

    private static void JamKeMenit(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void DetikKeHari(long nextLong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}