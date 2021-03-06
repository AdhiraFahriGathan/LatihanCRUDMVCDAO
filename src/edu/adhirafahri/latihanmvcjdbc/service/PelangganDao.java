/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adhirafahri.latihanmvcjdbc.service;

import edu.adhirafahri.latihanmvcjdbc.entity.Pelanggan;
import java.awt.List;
import latihanmvcjdbc.error.PelangganException;

/**
 *
 * @author
 * NIM : 10119025
 * NAMA : ADHIRA FAHRI GATHAN
 * KELAS : IF-1
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;

    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;

    public void deletePelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(Integer id) throws PelangganException;

    public Pelanggan getPelanggan(String email) throws PelangganException;

    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
    
}
