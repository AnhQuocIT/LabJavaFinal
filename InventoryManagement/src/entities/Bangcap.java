package entities;
// Generated Jan 9, 2019 4:59:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Bangcap generated by hbm2java
 */
public class Bangcap  implements java.io.Serializable {


     private String maBangCap;
     private String tenBangCap;
     private Set nhanviens = new HashSet(0);

    public Bangcap() {
    }

	
    public Bangcap(String maBangCap, String tenBangCap) {
        this.maBangCap = maBangCap;
        this.tenBangCap = tenBangCap;
    }
    public Bangcap(String maBangCap, String tenBangCap, Set nhanviens) {
       this.maBangCap = maBangCap;
       this.tenBangCap = tenBangCap;
       this.nhanviens = nhanviens;
    }
   
    public String getMaBangCap() {
        return this.maBangCap;
    }
    
    public void setMaBangCap(String maBangCap) {
        this.maBangCap = maBangCap;
    }
    public String getTenBangCap() {
        return this.tenBangCap;
    }
    
    public void setTenBangCap(String tenBangCap) {
        this.tenBangCap = tenBangCap;
    }
    public Set getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set nhanviens) {
        this.nhanviens = nhanviens;
    }




}


