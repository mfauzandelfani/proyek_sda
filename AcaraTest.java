/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaftarPanitia;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class AcaraTest {
    public static void main(String[] args) {
        Acara aa = new Acara();
        aa.insertDepan("namaAcara2", "BEM", "pembina", "deskripsi", "divisi1", "divisi2", "divisi3", "divisi4", "divisi5", "divisi6", "divisi7");
        aa.insertDepan("namaAcara22", "UKM", "pembina", "deskripsi", "divisi1", "divisi2", "divisi3", "divisi4", "divisi5", "divisi6", "divisi7");
        aa.insertDepan("namaAcara222", "ITSA", "pembina", "deskripsi", "divisi1", "divisi2", "divisi3", "divisi4", "divisi5", "divisi6", "divisi7");
        aa.filterPenyelenggara("BEM");
        
    }
    
}
