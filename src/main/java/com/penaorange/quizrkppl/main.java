/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.penaorange.quizrkppl;

/**
 *
 * @author Ilham Anugrah
 */
public class main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        System.out.println("Ditambah 2 library dari maven");
        
        Soal soal = new Soal();
        System.out.println("Penggunaan Fungsi");
        System.out.println("Pangkat");
        System.out.println("2 pangkat 2 = " + soal.pangkat(2, 2));
        
        System.out.println("================");
        System.out.println("Faktorial");
        System.out.println("2 faktorial = "+ soal.faktorial(2));
        
        System.out.println("End of file");
    }
}
