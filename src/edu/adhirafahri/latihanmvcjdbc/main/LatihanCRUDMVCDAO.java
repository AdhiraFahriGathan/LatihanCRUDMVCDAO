/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adhirafahri.latihanmvcjdbc.main;

import edu.adhirafahri.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.adhirafahri.latihanmvcjdbc.entity.Pelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import latihanmvcjdbc.error.PelangganException;
import latihanmvcjdbc.service.PelangganDao;
import latihanmvcjdbc.view.MainViewPelanggan;

/**
 *
 * @author User
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainViewPelanggan pelanggan = new MainViewPelanggan();
                try {
                    pelanggan.loadDatabase();
                } catch (SQLException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                pelanggan.setVisible(true);
            }
         });
                 }
}


            
        
