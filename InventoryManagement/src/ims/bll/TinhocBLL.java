/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import java.util.*;
import entities.*;
import ims.dal.*;
/**
 *
 * @author AnhQuoc
 */
public class TinhocBLL {
    TinhocDAL tinhocDAL = new TinhocDAL();
    
    public List<Tinhoc> getListTH(){
        return tinhocDAL.getListTH();
    }
    
    public Tinhoc findByName(String name){
        return tinhocDAL.findByName(name);
    }
}
