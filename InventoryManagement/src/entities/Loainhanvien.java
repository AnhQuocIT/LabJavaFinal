package entities;
// Generated Jan 7, 2019 10:09:45 AM by Hibernate Tools 4.3.1



/**
 * Loainhanvien generated by hbm2java
 */
public class Loainhanvien  implements java.io.Serializable {


     private String maLoaiNv;
     private String tenLoaiNv;

    public Loainhanvien() {
    }

    public Loainhanvien(String maLoaiNv, String tenLoaiNv) {
       this.maLoaiNv = maLoaiNv;
       this.tenLoaiNv = tenLoaiNv;
    }
   
    public String getMaLoaiNv() {
        return this.maLoaiNv;
    }
    
    public void setMaLoaiNv(String maLoaiNv) {
        this.maLoaiNv = maLoaiNv;
    }
    public String getTenLoaiNv() {
        return this.tenLoaiNv;
    }
    
    public void setTenLoaiNv(String tenLoaiNv) {
        this.tenLoaiNv = tenLoaiNv;
    }




}

