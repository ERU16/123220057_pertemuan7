/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Bagus Duta Prasetya
 */
public class modeltabeldatamovie extends AbstractTableModel {
     List<datamovie> dtm;
    public modeltabeldatamovie(List<datamovie>dtm){
        this.dtm = dtm;
    }
    
    @Override
    public int getRowCount() {
        return dtm.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Judul";
            case 1:
                return "Alur";
            case 2:
                return "Penokohan";
            case 3:
                return "Akting";
            case 4:
                return "Nilai";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return dtm.get(row).getJudul();
            case 1:
                return dtm.get(row).getAlur();
            case 2:
                return dtm.get(row).getPenokohan();
            case 3:
                return dtm.get(row).getAkting();
            case 4:
                return dtm.get(row).getNilai();
            default:
                return null;
        }
    }
    
}
