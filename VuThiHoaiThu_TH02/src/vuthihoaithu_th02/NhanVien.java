/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuthihoaithu_th02;

import java.util.Scanner;

/**
 *
 * @author Vu Thi Hoai Thu
 */
public class NhanVien {
    private String maNV;
    private int soSP;
    
    public NhanVien(){
        
    }
    
    public NhanVien(String ma, int sp){
        maNV = ma;
        soSP = sp;
    }
    
    public String getMaNV(){
        return this.maNV;
    }
    
    public void setMaNV(String ma){
        this.maNV = ma;
    }
    
    public int getSoSP(){
        return this.soSP;
    }
    
    public void setSoSP(int sp) {
        if(sp < 0){
            sp = 0;
        }
        else{
            this.soSP = sp;
        }
    }
    
    public boolean coVuotChuan(){
        if(this.soSP > 500) 
            return true;
        else return false;
    }
    
    public String getTongKet(){
        if(coVuotChuan() == true)
            return "Vuot";
        else return "";
    }
    
    public double getLuong(){
        if(coVuotChuan() == false)
            return this.soSP * 20000;
        else 
            return (this.soSP - 500) * 30000 + 500 * 20000;
    }
    
    public static void XuatTieuDe(){
        System.out.println("MaNV \t\t\tSoSp\t\t\tLuong\t\t\tTong Ket" );
    }
    
    @Override
    public String toString() {
        return maNV +"\t\t\t" + soSP + "\t\t\t" + getLuong() + "\t\t\t" + getTongKet();
    }
    
    public void Nhap(){
        System.out.print("Nhap maNV: ");
        Scanner s = new Scanner(System.in);
        this.maNV = s.nextLine();
        System.out.print("Nhap so san pham: ");
        this.soSP = s.nextInt();
    }
}
