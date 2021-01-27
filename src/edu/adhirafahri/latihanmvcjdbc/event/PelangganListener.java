/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adhirafahri.latihanmvcjdbc.event;

import edu.adhirafahri.latihanmvcjdbc.entity.Pelanggan;
import latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author
 * NIM : 10119025
 * NAMA : ADHIRA FAHRI GATHAN
 * KELAS : IF-1
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
     
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
    
}
    

