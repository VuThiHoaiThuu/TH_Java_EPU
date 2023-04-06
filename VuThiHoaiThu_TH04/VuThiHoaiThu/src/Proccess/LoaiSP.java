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
    private String maSP;  
    private String tenSP;
    public Connect conn = new Connect();

    public LoaiSP() { }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }
    
    public List<LoaiSP> getLoaiSP() throws SQLServerException {
        String sql = "select * from LoaiSP";
        List<LoaiSP> lsp = new ArrayList<LoaiSP>();
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            
            ResultSet rs = prSt.executeQuery();
            while(rs.next()){
                LoaiSP ob = new LoaiSP();
                ob.maSP = rs.getString("Maloai");
                ob.tenSP = rs.getString("Tenloai");
                
                lsp.add(ob);
            }
            
            prSt.close();
            db.close();
                   
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        return lsp;  
    }
    
    public LoaiSP getLoaiSP(String ml) throws SQLException {
        String sql = "select * from LoaiSP where Maloai = ?";
        LoaiSP sp = new LoaiSP();
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, ml);
            ResultSet rs = prSt.executeQuery();
            
            rs.next();
            sp.maSP = rs.getString("Maloai");
            sp.tenSP = rs.getString("Tenloai");
            
            prSt.close();
            db.close();
            
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        
        return sp;
    }
    
    // Thêm mới 1 dòng dữ liệu vào trong table LoaiSP
    public boolean insertData(LoaiSP obj) throws SQLException {
        String sql = "insert into LoaiSP values(? , ?)";
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, obj.maSP);
            prSt.setString(2, obj.tenSP);
                 
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            return row != 0;      
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            return false;
        }
        
    }
    
    public boolean editData(LoaiSP obj) throws SQLException {
        String sql = "update LoaiSP set Tenloai = ? where Maloai = ?";
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, obj.maSP);
            prSt.setString(2, obj.tenSP);
            
            int row = prSt.executeUpdate();
            prSt.close();
            db.close();
            
            return row == 1;
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            return false;
        }
    }
   
    public boolean deleteData(String ml) throws SQLException {
        String sql = "delete from LoaiSP where Maloai = ?";
        try {
            Connection db = conn.connect();
            PreparedStatement prSt = db.prepareStatement(sql);
            prSt.setString(1, ml);
            
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
