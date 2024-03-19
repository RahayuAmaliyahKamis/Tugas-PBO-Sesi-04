
import java.util.ArrayList;
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
public class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Nama Anda : ");
            String name = sc.nextLine();
            
            System.out.print("Masukkan Nomor Induk Mahasis (NIM) Anda : ");
            String NIM = sc.nextLine();
            
            System.out.print("Dikelas Manakah Anda Berada : ");
            String ClassName = sc.nextLine();
            System.out.println("-------------- Data Anda --------------");
            System.out.println("   Nama : " + name);
            System.out.println("   NIM : " + NIM );
            System.out.println("   Kelas : " + ClassName);
            System.out.println("---------------------------------------");
            
            
            
            
    }
}
