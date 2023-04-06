/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proccess;
import java.sql.*;
import Database.Connect;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.ArrayList;
import java.util.List;
     
/** 
 *
 * @author Vũ Thị Hoài Thu
 */
public class LoaiSP {
    private String MaLoai;
    private String TenLoai;

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
    public Connect conn = new Connect();
    
    public List<LoaiSP> getLoaiSP() throws SQLServerException {
        String sql = "select * from LoaiSP";
        List<LoaiSP> lsp = new ArrayList<LoaiSP>();
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()){
                LoaiSP ob = new LoaiSP();
                ob.MaLoai = rs.getString("MaLoai");
                ob.TenLoai = rs.getString("TenLoai");

                lsp.add(ob);
            }
            prSt.close();
            db.close();
            return lsp;
                   
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        return null;
    }
    
        public String TenLoaiSPTheoMa(String ml) {
        String sql = "select tenloai form loaisp where maloai = ?";
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, ml);
            
            ResultSet rs = prSt.executeQuery();
            LoaiSP obj = new LoaiSP();
            obj.setTenLoai(rs.getString("TenLoai"));
            
            return obj.getTenLoai();
            
            
        } catch (Exception e) {
        }
        return null;
    }
    
    
    public List<SanPham> getSPTheoloai(String ml) {
        String sql = "select MaSP, TenSP, Dongia, Maloai from Sanpham where Maloai = ?";
        List<SanPham> lsp = new ArrayList<SanPham>();
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, ml);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()) {
                SanPham obj = new SanPham();
                obj.setMaSP(rs.getString("MaSP"));
                obj.setTenSP(rs.getString("TenSP"));
                obj.setDonGia(rs.getLong("DonGia"));
                obj.setMaLoai(rs.getString("MaLoai"));
                
                lsp.add(obj);
                  
            }
            prSt.close();
            db.close();
            
            return lsp;
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            return null;
        }   
    }
    
    

}
