package entities;
// Generated Jan 8, 2019 5:35:08 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Quoctich generated by hbm2java
 */
public class Quoctich  implements java.io.Serializable {


     private String maQuocTich;
     private String tenQuocTich;
     private Set nhanviens = new HashSet(0);

    public Quoctich() {
    }

	
    public Quoctich(String maQuocTich, String tenQuocTich) {
        this.maQuocTich = maQuocTich;
        this.tenQuocTich = tenQuocTich;
    }
    public Quoctich(String maQuocTich, String tenQuocTich, Set nhanviens) {
       this.maQuocTich = maQuocTich;
       this.tenQuocTich = tenQuocTich;
       this.nhanviens = nhanviens;
    }
   
    public String getMaQuocTich() {
        return this.maQuocTich;
    }
    
    public void setMaQuocTich(String maQuocTich) {
        this.maQuocTich = maQuocTich;
    }
    public String getTenQuocTich() {
        return this.tenQuocTich;
    }
    
    public void setTenQuocTich(String tenQuocTich) {
        this.tenQuocTich = tenQuocTich;
    }
    public Set getNhanviens() {
        return this.nhanviens;
    }
    
    public void setNhanviens(Set nhanviens) {
        this.nhanviens = nhanviens;
    }




}

