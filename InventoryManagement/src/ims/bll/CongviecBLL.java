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
public class CongviecBLL {
    CongviecDAL congviecDAL = new CongviecDAL();
    public List<Congviec> getListCV(){
        return congviecDAL.getListCV();
    }
    
    public Congviec findByName(String name){
        return congviecDAL.findByName(name);
    }
}
