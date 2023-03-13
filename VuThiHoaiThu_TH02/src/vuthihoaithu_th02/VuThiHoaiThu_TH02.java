/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuthihoaithu_th02;

/**
 *
 * @author Vu Thi Hoai Thu
 */
public class VuThiHoaiThu_TH02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bai tap 1
        System.out.println("Bai tap 1.");
        HinhTron hinhtron = new HinhTron();
        hinhtron.Nhap();
        System.out.println("Chu vi hinh tron = " + hinhtron.chuVi());
        System.out.println("Dien tich hinh tron = " + hinhtron.dienTich());

        //Bai tap 2
        System.out.println("Bai tap 2: ");
        HinhTamGiac tamGiac = new HinhTamGiac();
        tamGiac.Nhap();
        if(tamGiac.laTamGiac() == false)
            System.out.println("Khong phai ba canh cua tam giac");
        else{
            System.out.println("Chu vi cua tam giac = " + tamGiac.getChuVi());
            System.out.println("Dien tich cua tam giac = " + tamGiac.getDienTich());
       }

        //Bai tap 3
        System.out.println("Bai tap 3: ");
        NhanVien[] nv = new NhanVien[2];
        System.out.println("Nhap thong tin 2 nhan vien");
        for(int i = 0; i < 2; i++){
            System.out.println("Nhap thong tin nhan vien " + (i + 1));
            nv[i] = new NhanVien();
            nv[i].Nhap();
        }
        System.out.println("Thong tin vua nhap");
        NhanVien.XuatTieuDe();
        for(int i = 0; i < 2; i++){
            System.out.println(nv[i]);
        }


        //Bai tap 4
        System.out.println("Bai tap 4: ");
        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(4, 5);
        if(circle.getArea() > rectangle.getArea()){
            System.out.println("Area of circle > Area of rectangle");
        }
        else
            System.out.println("Area of circle < Area of rectangle");   
        
        if(circle.getPerimeter() > rectangle.getPerimeter())
            System.out.println("getPerimeter of circle > getPerimeter of rectangle");
        else 
            System.out.println("getPerimeter of circle < getPerimeter of rectangle");
    }
    
}
