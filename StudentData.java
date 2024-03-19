/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class StudentData extends DataMahasiswa {
    String ClassName;

    StudentData (String name, String NIM, String ClassName) {
        super(name, NIM, ClassName, 0);
        this.ClassName = ClassName;
    }
    
    String getClassName(){
        return ClassName;
    }
    
    @Override
    void InfoData_Mahasiswa() {
        super.InfoData_Mahasiswa();
        //System.out.println("Nama Anda : " + super.setname);
        System.out.println("Kelas Anda : " + getClassName());
    }
}


