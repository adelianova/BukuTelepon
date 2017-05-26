package Tabel;


import Tabel.DataKontak;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author intel
 */
public class TabelDataKontak extends AbstractTableModel{
    private List<DataKontak> list = new ArrayList<DataKontak>();

@Override
public int getRowCount() {
return list.size();
}

@Override
public int getColumnCount() {
return 3;
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
switch(columnIndex){
case 0 : return list.get(rowIndex).getNama();
case 1 : return list.get(rowIndex).getTelepon1();
case 2 : return list.get(rowIndex).getTelepon2();
default : return null;
}
}

@Override
public String getColumnName(int kolom){
switch(kolom){
case 0 : return "Nama";
case 1 : return "Telepon 1";
case 2 : return "Telepon 2";
default : return null;
}
}

public void add(DataKontak kontak){
list.add(kontak);
fireTableRowsInserted(getRowCount(), getColumnCount());
}

public void delete(int i, int baris){
list.remove(i);
fireTableRowsDeleted(i, baris);
}

public DataKontak get(int baris){
return (DataKontak) list.get(baris);
}
}
