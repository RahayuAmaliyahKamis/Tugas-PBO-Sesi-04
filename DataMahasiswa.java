/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class DataMahasiswa {
    protected String name;
    protected String NIM;
    protected String Class;
    protected int Age;

    DataMahasiswa(String name, String NIM, String Class, int Age) {
        this.name = name;
        this.NIM = NIM;
    }
    DataMahasiswa(){
    }
    void setname (String Name){
            Name = name;
        }
    void setNIM (String nim){
        nim = NIM;
    }
    String getname(){
        return name;
    }
    String getNIM(){
        return NIM;
    }

    void InfoData_Mahasiswa() {
        System.out.println("Nama Anda : " + name);
        System.out.println("NIM Anda : " + NIM);
    }
}


