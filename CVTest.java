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
public class CVTest {
    public static void main(String[] args) {
        CV a = new CV();
        a.insertDepan("namaAcara2", "penyelengara1", "pembina", "deskripsi", "divisi1", "divisi2", "divisi3", "divisi4","fds");
        a.insertDepan("namaAcara2", "penyelengara1", "pembina", "deskripsi", "divisi1", "divisi2", "divisi3", "divisi4","fds");
        a.printDepan();
        String cari = JOptionPane.showInputDialog("Cari data apa ?");
        a.filter(cari);
        
    }
    
}
