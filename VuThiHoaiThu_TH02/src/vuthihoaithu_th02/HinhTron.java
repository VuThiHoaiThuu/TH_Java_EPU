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
public class HinhTron {
    private float banKinh;
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        this.banKinh = s.nextFloat();
    }
    public double chuVi(){
        return this.banKinh * 2 * Math.PI;
    }
    
    public double dienTich(){
        return this.banKinh * this.banKinh * Math.PI;
    }
}
