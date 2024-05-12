/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Bagus Duta Prasetya
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import connector.*;
import controller.*;
import DAOImplement.*;

public class Viewoutput {

    String data[][] = new String[500][2];
    
    connector connector = new connector();    
    
    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("movie_db");
    JTable tabel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"JUDUL","GENRE"}; //membuat kolom dgn array tipe object;
    public Viewoutput() {
        window.setLayout(null);
        window.setSize(550,600);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            String query = "Select * from `film`"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                data[jmlData][0] = resultSet.getString("judul"); 
                data[jmlData][1] = resultSet.getString("genre"); 
              
                jmlData++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        
        tabel = new JTable(data,namaKolom); //tabel merupakan variabel untuk tabelnya dengan isi tablemodel
        scrollPane = new JScrollPane(tabel);
        window.add(scrollPane);
        
        scrollPane.setBounds(20, 35, 500, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }
    

    
    
}