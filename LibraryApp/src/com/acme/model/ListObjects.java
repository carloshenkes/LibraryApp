package com.acme.model;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListObjects {

    private static int cLine;

    /**
     * @param cLine
     * @author carloshenkes
     */
    public static void setCLine(int cLine) {
        ListObjects.cLine = cLine;
    }

    /**
     * @param jt
     * @author carloshenkes
     */
    public static void addLine(JTable jt) {
        DefaultTableModel dfm = (DefaultTableModel) jt.getModel();
        dfm.addRow(new Object[]{null, null});
    }

    /**
     * @param jt
     * @author carloshenkes
     */
    public static void clearTable(JTable jt) {
        DefaultTableModel dfm = (DefaultTableModel) jt.getModel();
        while (dfm.getRowCount() > 0) {
            dfm.removeRow(0);
        }
        dfm.addRow(new Object[]{null, null});
    }

    /**
     * @param jt
     * @param  b 
     * @author carloshenkes
     */
    public static void listBooks(JTable jt, Book b) {
        jt.setValueAt(b.getTitle(), cLine, 1);
        ArrayList<String> authors = b.getAuthors();
        jt.setValueAt(authors.toString().replace("[", "").replace("]", ""), cLine, 2);
        jt.setValueAt(b.getEdition(), cLine, 3);
        jt.setValueAt(b.getFormat(), cLine, 4);
        jt.setValueAt(b.getDateAdded(), cLine, 5);
        jt.setValueAt(b.getCode(), cLine, 0);
        cLine++;
        addLine(jt);
    }
}
