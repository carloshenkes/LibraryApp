package com.acme.view;

import com.acme.model.Book;
import com.acme.model.Library;
import com.acme.model.ListObjects;
/**
 * @version 0.2
 * @since 2016-05-17
 * @author carloshenkes
 */
public class ListBooks extends javax.swing.JDialog {

    private Library library;

    public ListBooks(java.awt.Frame parent, boolean modal, Library l) {
        super(parent, modal);
        initComponents();

        this.library = l;
        
        if (!library.getBooks().isEmpty()) {
            ListObjects.clearTable(jtListBooks);//Limpa a table
            ListObjects.setCLine(0);
            for (Book b : library.getBooks()) {
                ListObjects.listBooks(jtListBooks, b);
            }
        } else {
            jopMessageLibraryNull.showMessageDialog(null, "The library have not books to listing.");
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jopMessageLibraryNull = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListBooks = new javax.swing.JTable();
        jbSearch = new javax.swing.JButton();
        jbListAll1 = new javax.swing.JButton();
        jtfSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("List Books");

        jtListBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Title", "Author", "Edition", "Format", "Date Added"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtListBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListBooks);

        jbSearch.setText("Search");
        jbSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSearchMouseClicked(evt);
            }
        });

        jbListAll1.setText("List All");
        jbListAll1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbListAll1MouseClicked(evt);
            }
        });

        jLabel1.setText("Search by title:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbListAll1)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jbSearch)
                    .addComponent(jbListAll1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbListAll1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbListAll1MouseClicked
        if (!library.getBooks().isEmpty()) {
            ListObjects.setCLine(0);
            for (Book b : library.getBooks()) {
                ListObjects.listBooks(jtListBooks, b);
            }
        } else {
            jopMessageLibraryNull.showMessageDialog(null, "The library have not books to listing.");
            return;
        }

    }//GEN-LAST:event_jbListAll1MouseClicked

    private void jbSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSearchMouseClicked
        if (!jtfSearch.getText().isEmpty()) {
            ListObjects.clearTable(jtListBooks);// limpa a Table
            ListObjects.setCLine(0);
            if (!library.getBooks().isEmpty()) {
                for (Book b : library.getBooks()) {
                    if (b.getTitle().equalsIgnoreCase(jtfSearch.getText())) {
                        ListObjects.listBooks(jtListBooks, b);
                    }
                }
            } else {
                jopMessageLibraryNull.showMessageDialog(null, "The library have not books to listing.");
            }
        } else {
            jopMessageLibraryNull.showMessageDialog(null, "Please enter a title to search!");
        }
    }//GEN-LAST:event_jbSearchMouseClicked

    private void jtListBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListBooksMouseClicked
        jtListBooks.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_jtListBooksMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbListAll1;
    private javax.swing.JButton jbSearch;
    private javax.swing.JOptionPane jopMessageLibraryNull;
    private javax.swing.JTable jtListBooks;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
