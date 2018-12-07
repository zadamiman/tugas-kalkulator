/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatortest;

/**
 *
 * @author ASPIRE E 14
 */
public class KalkulatorBagus implements CalculatorAdvanceService{

    public void Akar(double x) {
        double ang1 = (int) x;
        double hasil;
        
        hasil = Math.sqrt(x);
        System.out.println(hasil);
    }

    public void Pangkat(double x, double y) {
        double ang1 = (int) x;
        double ang2 = (int) y;
        double hasil;
        
        hasil = Math.pow(x,y);
        System.out.println(hasil);
    }

    public void Perkalian(double x, double y) {
        int ang1 = (int) x;
        int ang2 = (int) y;
        double hasil;
        hasil = x * y;
        
        try {
            ang1 = 0;
            ang2 = 0;
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Tidak boleh kali nol");
        }
        System.out.println("Hasil kali: "+hasil);
    }

    public void Pembagian(double x, double y) {
        int ang1 = (int)x;
        int ang2 = (int)y;
        double hasil;
        hasil = x/y;
        try {
            ang1 = 0;
            hasil = x/y;
            
            ang2 = 0;
            hasil = x/y;
            
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Tidak boleh bagi nol");
        }
        System.out.println("Hasil bagi: "+hasil);
    }

    public void Penjumlahan(double x, double y) {
        int ang1 = (int)x;
        int ang2 = (int)y;
        float hasil;
        
        hasil = ang1 + ang2;
        System.out.println("Hasil jumlah: "+hasil);
    }

    public void Pengurangan(double x, double y) {
        int ang1 = (int) x;
        int ang2 = (int) y;
        float hasil;
        
        hasil = ang1 - ang2;
        System.out.println("Hasil bagi: "+hasil);
    }
    
}
