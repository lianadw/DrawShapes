/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Liana Dewi
 */
public class Pelajar extends Orang {
    private String nim;
    private String mahasiswa;
    private double nilai; // Range: 0 - 100

    public Pelajar(String nama, double tinggi, double berat, String nim, String mahasiswa, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.mahasiswa = mahasiswa;
        this.nilai = nilai;
    }

    public String toString() {
        return super.toString() + "\nNIM = " + nim + "\nMahasiswa = " + mahasiswa + "\nNilai = " + nilai;
    }
}
