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
public class HinhTamGiac {
    private int ma;
    private int mb;
    private int mc;
    
    
    public HinhTamGiac(){
        
    }
    
    public HinhTamGiac(int a, int b, int c) {
        if(a <= 0 && b <= 0 && c <= 0){
            a = b = c = 0;
        }else if(laTamGiac(a, b, c) == false){
            System.out.println("Khong phai la hinh tam giac");
            a = b = c = 0;
        }
        else{
            ma = a;
            mb = b; 
            mc = c;
        }
    }

    public int getCanhA() {
        return ma;
    }

    public void setCanhA(int v) {
        if(v <= 0 || laTamGiac(v, this.mb, this.mc) == false)
            return;
        else this.ma = v;
    }

    public int getCanhB() {
        return mb;
    }

    public void setCanhB(int v) {
        if(v <= 0 || laTamGiac(this.ma, v, this.mc) == false)
            return;
        else this.mb = v;
    }

    public int getCanhC() {
        return mc;
    }

    public void setCanhC(int v) {
        if(v <= 0 || laTamGiac(this.ma, this.mb, v) == false)
            return;
        this.mc = v;
    }

    public boolean laTamGiac(){
        if(this.ma + this.mb > this.mc && this.ma + this.mc > this.mb && this.mb + this.mc > this.ma)
            return true;
        return false;
    }
    public boolean laTamGiac(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a) return true;
        return false;
    }
    public int getChuVi(){
        return this.ma + this.mb + this.mc;
    }
    public double getDienTich(){
        double p = (double)((this.ma + this.mb + this.mc) / 2);
        return (double)(Math.sqrt(p * (p - this.ma) * (p - this.mb) * (p - this.mc)));
    }
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap canh a = ");
        this.ma = s.nextInt();
        System.out.print("Nhap canh b = ");
        this.mb = s.nextInt();
        System.out.print("Nhap canh c = ");
        this.mc = s.nextInt();
    }
}
