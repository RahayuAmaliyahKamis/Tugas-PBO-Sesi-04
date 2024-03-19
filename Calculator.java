
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Calculator {
    // Pembagian
    public double calculate(double a, double b){
        return a/b;
    }
    
    // penjumlahan 3 angka
    public int calculate(int a, int b, int c){
        return a + b + c;
    }
    
    // perkalian 4 angka
    public int calculate(int a, int b, int c, int d){
        return a * b * c * d;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----- Pilihlah salah satu opsi ------");
        System.out.println(" 1. Menghitung pembagian 2 angka ");
        System.out.println(" 2. Menghitung penjumlahan 3 angka ");
        System.out.println(" 3. Menghitung perkalian 4 angka ");
        System.out.println("-------------------------------------"); 
        System.out.print("Pilihan anda adalah nomer = ");        
        
        int pilihan = sc.nextInt();
        if(pilihan==1){
            System.out.print ("Silahkan isi angka pertama:  ");
            double a = sc.nextDouble();
            System.out.print ("Silahkan isi angka kedua:  " );
            double b = sc.nextDouble();
            double hasil = calc.calculate(a, b);
            System.out.println ("Hasil pembagian dari angka yang telah anda pilih adalah =  "+ hasil);
        }
        else if(pilihan == 2){
           System.out.print ("Silahkan isi angka pertama:  ");
           int a = sc.nextInt();
           System.out.print ("Silahkan isi angka kedua:  " );
           int b = sc.nextInt();
           System.out.print ("Silahkan isi angka ketiga:  " );
           int c = sc.nextInt();
           int hasil = calc.calculate(a, b, c);
           System.out.println ("Hasil penjumlahan dari angka yang telah anda pilih adalah =  "+ hasil); 
        }
        else if (pilihan == 3){
           System.out.print ("Silahkan isi angka pertama:  ");
           int a = sc.nextInt();
           System.out.print ("Silahkan isi angka kedua:  " );
           int b = sc.nextInt();
           System.out.print ("Silahkan isi angka ketiga:  " );
           int c = sc.nextInt();
           System.out.print ("Silahkan isi angka keempat:  " );
           int d = sc.nextInt();
           int hasil = calc.calculate(a, b, c, d);
           System.out.println ("Hasil pembagian dari angka yang telah anda pilih adalah = "+ hasil); 
        }
        else{
            System.out.println("Nomer yang anda pilih tidak valid! ");
        }
        sc.close();
    }
}
