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
public class SanPham {
    private String MaSP;
    private String TenSP;
    private long DonGia;
    private String MaLoai;

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public long getDonGia() {
        return DonGia;
    }

    public void setDonGia(long DonGia) {
        this.DonGia = DonGia;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }
    
    public Connect conn = new Connect();
    
    public List<SanPham> getSanPham() throws SQLServerException {
        String sql = "select * from SanPham";
        List<SanPham> sp = new ArrayList<SanPham>();
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareCall(sql);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()){
                SanPham obj = new SanPham();
                obj.MaSP = rs.getString("MaSP");
                obj.TenSP = rs.getString("TenSP");
                obj.DonGia = rs.getLong("DonGia");
                obj.MaLoai = rs.getString("MaLoai");
                
                sp.add(obj);
            }
            
            
            prSt.close();
            db.close();
        } catch (Exception e) {
        }
        return sp;
    }
    
    public SanPham getSanPhamTheoMa(String msp) throws SQLServerException {
        String sql = "select * from SanPham where MaSP = ?";
        SanPham sp = new SanPham();
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareCall(sql);
            prSt.setString(1, msp);
            
            ResultSet rs = prSt.executeQuery();
            rs.next();
            sp.MaSP = rs.getString("MaSP");
            sp.TenSP = rs.getString("TenSP");
            sp.DonGia = rs.getLong("DonGia");
            sp.MaLoai = rs.getString("MaLoai");
            
            prSt.close();
            db.close();
        } catch (Exception e) {
        }
        return sp;
    }
    
    public List<SanPham> getSanPhamTheoTen(String ten) throws SQLServerException {
        String sql = "select * from SanPham where TenSP = ?";
        List<SanPham> sp = new ArrayList<SanPham>();
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareCall(sql);
            prSt.setNString(1, ten);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()){
                SanPham obj = new SanPham();
                obj.MaSP = rs.getString("MaSP");
                obj.TenSP = rs.getString("TenSP");
                obj.DonGia = rs.getLong("DonGia");
                obj.MaLoai = rs.getString("MaLoai");
                
                sp.add(obj);
            }

            prSt.close();
            db.close();
        } catch (Exception e) {
        }
        return sp;
    }
    
    public List<SanPham> getSanPhamTheoGia(long GiaTu, long GiaDen) throws SQLServerException {
        String sql = "select * from SanPham where DonGia between ? and ?";
        List<SanPham> sp = new ArrayList<SanPham>();
        
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareCall(sql);
            
            prSt.setLong(1, GiaTu);
            prSt.setLong(2, GiaDen);
            ResultSet rs = prSt.executeQuery();
            while(rs.next()){
                SanPham obj = new SanPham();
                obj.MaSP = rs.getString("MaSP");
                obj.TenSP = rs.getString("TenSP");
                obj.DonGia = rs.getLong("DonGia");
                obj.MaLoai = rs.getString("MaLoai");
                
                sp.add(obj);
            }
            
        } catch (Exception e) {
        }
        return sp;
    }
   
    
    public boolean DeleteData(String msp) throws SQLException {
        String sql = "delete from SanPham where MaSP = ?";
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, msp);
            
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            
            return row == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean InsertData(SanPham sp) throws SQLException {
        String sql = "insert into SanPham values(? , ?, ?, ?)";
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, sp.MaSP);
            prSt.setString(2, sp.TenSP);
            prSt.setLong(3, sp.DonGia);
            prSt.setString(4, sp.MaLoai);
                 
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            return row != 0;      
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            return false;
        }
    }
    
    public boolean EditData(SanPham sp) throws SQLException {
        String sql = "update SanPham set TenSP = ?, DonGia = ?, MaLoai = ? where MaSP = ?";
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            
            prSt.setString(1, sp.TenSP);
            prSt.setLong(2, sp.DonGia);
            prSt.setString(3, sp.MaLoai);
            prSt.setString(4, sp.MaSP);
            
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            return false;
        }
    }
    

}
