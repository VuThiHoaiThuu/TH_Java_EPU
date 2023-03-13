/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuthihoaithu;
import java.util.*;
/**
 *
 * @author I'm Fall
 */
public class VuThiHoaiThu {
    public static void main(String[] args) {
        System.out.println("Bai tap 1:");
        Bai1();
        System.out.println("Bai tap 2: Giai phuong trinh bac nhat");
        Bai2();
        System.out.println("Bai tap 3: Giai phuong trinh ban hai");
        Bai3();
        System.out.println("Bai tap 4: Tinh S = 1 + 2 + 3 + … + n");
        Bai4();
        System.out.println("Bai tap 5: Tinh S = 1 + 1/2 + 1/3 + … + 1/n");
        Bai5();
        System.out.println("Bai tap 6: Tinh n!");
        Bai6();
        System.out.println("Bai tap 7: Tinh n!!");
        Bai7();
        System.out.println("Bai tap 8: Tim UCNN, BCLN");
        Bai8();
        System.out.println("Bai tap 9: Mang 1 chieu");
        Bai9();
        System.out.println("Bai tap 10: Ma tran");
        Bai10();
    }
    
    //Bài 1: Tính tong 20 so chan dau tien
    public static void Bai1(){
        int count = 0;
        int sum = 0;
        for(int i = 0; i < 1000; i++){
            if(i % 2 == 0){
                count++;
                if(count <= 10)
                    sum += i;
            }
        }
        System.out.println("Tong 20 so chan dau tien = " + sum);
    }
    
    //Bai 2: Giai phuong trinh bac nhat ax + b = 0;
    public static void Bai2(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        double a = s.nextDouble();
        System.out.print("Nhap b = ");
        double b = s.nextDouble();
        
        if(a == 0 && b == 0)
            System.out.println("Phuong trinh vo so nghiem");
        else if(a == 0 && b != 0)
            System.out.println("Phuong trinh vo nghiem");
        else
            System.out.println("Phuong trinh co nghiem x = " + (-b/a));
    }
    
    //Bai 3: Giai phuong trinh bac 2
    public static void Bai3(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        double a = s.nextDouble();
        System.out.print("Nhap b = ");
        double b = s.nextDouble();
        System.out.print("Nhap c = ");
        double c = s.nextDouble();
        
        if(a == 0){
            if(b == 0){
                if(c == 0)
                    System.out.println("Phuong trinh vo so nghiem");
                else
                    System.out.println("Phuong trinh vo nghiem");
            }
            else
                System.out.println("Phuong trinh co nghiem x = " + (-c/b));
        }
        else{
            double delta = b * b - 4 * a * c;
            if(delta > 0){
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + ", x2 = " + x2);
            }
            else if(delta == 0){
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            }
            else
                System.out.println("Phuong trinh vo nghiem");
        }
    }
    
    //Bai 4: S = 1 + 2 + 3 + … + n
    public static void Bai4(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        long sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("Tong S = " + sum);
    }
    
    //Bai 5: S = 1 + 1/2 + 1/3 + … + 1/n
    public static void Bai5(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        float Sum = 0;
        for(int i = 1; i <= n; i++){
            Sum += (1.0 / i);
        }
        System.out.println("S = " + Sum);
    }
    
    //Bai6: Tinh n!
    public static void Bai6(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        long giaiThua = 1;
        for(int i = 1; i <= n; i++){
            giaiThua *= i;
        }
        System.out.println(n + "! = " + giaiThua);
    }
    
    //Bai7 : tính n!!
    public static void Bai7(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        long kq = 1;
        if( n % 2 == 0 && n > 0){
            for(int i = 2; i <= n; i += 2){
                kq *= i;
            }
        }
        else{
            for(int i = 1; i <= n; i += 2){
                kq *= i;
            }
        }
        System.out.println(n + "!! = " + kq);
    }
    
    //Bai8: UCLN, BCNN cua 2 so a,b
    public static void Bai8(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = s.nextInt();
        System.out.print("Nhap b = ");
        int b = s.nextInt();
        
        System.out.println("UCLN(" + a + ", " + b + ") = " + UCLN(a, b));
        System.out.println("BCNN(" + a + ", " + b + ") = " + BCNN(a, b));
    }
    public static int UCLN(int a, int b){
        if(b == 0) return a;
        return UCLN(b, a % b);
    }
    public static int BCNN(int a, int b){
        return (a * b) / UCLN(a, b);
    }
    
    //Bai9: Mang n phan tu
    public static void Bai9(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap gia tri cua mang: ");
        Nhap(arr, n, s);
        
        System.out.print("Cac gia tri vua nhap: " );
        Xuat(arr, n);
        
        System.out.print("\nMang co " + SoChan(arr, n) + " so chan");
        
        System.out.print("\nSo nguyen to: ");
        SNT(arr, n);
        
        System.out.print("\nMang sap xep tang: ");
        SapXepTang(arr, n);
        Xuat(arr, n);
        
        System.out.print("\nNhap gia tri can tim: ");
        int x = s.nextInt();
        GiaTri(arr, n, x);
        
    }
    public static void Nhap(int a[], int n, Scanner s){
        for(int i = 0; i < n; i++){
            System.out.print("Nhap a[" + (i + 1) + "] = ");
            a[i] = s.nextInt();
        }
    }
    public static void Xuat(int a[], int n){
        for(int item : a)
            System.out.print(item + ", ");
    }
    public static int SoChan(int a[], int n){
        int count = 0;
        for(int item : a){
            if(item % 2 == 0)
                count++;
        }
        return count;
    }
    public static boolean checkSNT(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void SNT(int a[], int n){
        for(int i = 0; i < n; i++){
            if(checkSNT(a[i])){
                System.out.print(a[i] + "   ");
            }
        }
    }
    public static void SapXepTang(int a[], int n){
        for(int i = 0; i < n - 1; i++){
            int index = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[index])
                    index = j;
            }
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
    public static void GiaTri(int a[], int n, int x){
        int key = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == x){
                count ++;
                key = i;
                break;
            }
        }
        if(count == 0)
            System.out.println("Mang khong co gia tri " + x);
        else
            System.out.println("Phan tu co gia tri " +  x + " la a[" + (key + 1) + "].");
    }
    
    //Bai10: Ma tran m x n;
    public static void Bai10(){
        Scanner s = new Scanner(System.in);
        System.out.print("m = ");
        int m = s.nextInt();
        System.out.print("n = ");
        int n = s.nextInt(); 
        int [][] a = new int[m][n];
        
        System.out.println("Nhap ma tran: ");
        Nhap(a, m, n, s);
        
        System.out.println("\nMa tran: ");
        Xuat(a, m, n);
        System.out.println("Phan tu nho nhat = " + Min(a, m, n));
        System.out.println("Phan tu le nho nhat = " + MinLe(a, m, n));
        System.out.println("Dong co tong lon nhat: " + DongCoTongMax(a, m, n));
    }
    public static void Nhap(int a[][], int m, int n, Scanner s){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Nhap a[" + (i + 1) + "][" + (j + 1) + "] = ");
                a[i][j] = s.nextInt();
            }
        }
    }
    public static void Xuat(int a[][], int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    public static int Min(int a[][], int m, int n){
        int min = a[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
                if(a[i][j] < min)
                    min = a[i][j];
        }
        return min;

    }
    public static int MinLe(int a[][], int m, int n){
        int minle = 0;
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
                if(a[i][j] % 2 != 0){
                    minle = a[i][j];
                    count++;
                    break;
                }
        }
        if(count == 0)
            System.out.println("Ma tran khong co phan tu le");
        else{
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(a[i][j] < minle && a[i][j] < minle)
                        minle = a[i][j];                
                }
            }
        }
        return minle;
    }
    public static int DongCoTongMax(int a[][], int m, int n){
        int max = 0;
        int sum = 0;
        int dong = 0;
        for(int i = 0;i < m; i++){
            sum = 0;
            for (int j = 0;j < n; j++){
                sum += a[i][j];
            }
            if(sum > max){
                max = sum;
                dong = i;
            }

        }
        return dong + 1;
    }
}
