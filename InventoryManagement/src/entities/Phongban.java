package entities;
// Generated Jan 7, 2019 10:09:45 AM by Hibernate Tools 4.3.1



/**
 * Phongban generated by hbm2java
 */
public class Phongban  implements java.io.Serializable {


     private String maPhongBan;
     private String tenPhongBan;

    public Phongban() {
    }

    public Phongban(String maPhongBan, String tenPhongBan) {
       this.maPhongBan = maPhongBan;
       this.tenPhongBan = tenPhongBan;
    }
   
    public String getMaPhongBan() {
        return this.maPhongBan;
    }
    
    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }
    public String getTenPhongBan() {
        return this.tenPhongBan;
    }
    
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }




}

