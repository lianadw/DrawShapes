/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

package com.mycompany.minggu5;

/**
 *
 * @author Liana Dewi
 */
public class Minggu5 {

    public static void main(String[] args) {
     A superOb = new A();
        B subOb = new B();

        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();

        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();

        // member tambahan yang hanya ada pada subclass
        subOb.z = 50;
        subOb.TampilkanJumlah();
}
}

    

