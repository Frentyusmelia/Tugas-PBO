/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frentyusmelia.controller;
import Frentyusmelia.model.*;
import Frentyusmelia.view.FormBuku;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class BukuController {
    private FormBuku formBuku;
    private BukuDao bukuDao;
    private Buku buku;
    
    public BukuController (FormBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDaoImpl();
    }
    
    public void bersihForm(){
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
    }
    
    public void saveBuku(){
        buku = new Buku();
        buku.setKodebuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.save(buku);
        javax.swing.JOptionPane.showMessageDialog(formBuku, "Entri Ok");
    }
    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku != null){
            formBuku.getTxtKodeBuku().setText(buku.getKodebuku());
            formBuku.getTxtJudul().setText(buku.getJudul());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
        }
    }
    
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku.setKodebuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        bukuDao.update(index,buku);
        javax.swing.JOptionPane.showMessageDialog(formBuku, "Entri Ok");
    }
    
    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formBuku, "Delete Ok");
    }
    public void tampilData(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Buku> list = bukuDao.getAllBuku();
        for(Buku buku : list){
            Object[] data = {
                buku.getKodebuku(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit(),
            };
            tabelModel.addRow(data);
        }
    }
}
