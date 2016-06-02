package com.acme.view;

import com.acme.model.Book;
import com.acme.model.BookFormat;
import javax.swing.DefaultListModel;

public class AddBookForm extends javax.swing.JDialog {

    private Book book;
    private DefaultListModel list;

    public AddBookForm(java.awt.Frame parent, boolean modal, Book b) {
        super(parent, modal);
        initComponents();

        list = new DefaultListModel();// default é uma lista
        jlAuthorsList.setModel(list);

        for (BookFormat bf : BookFormat.values()) {
            this.jcbFormatType.addItem(bf.name());
        }

        this.book = b;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jopEditionError = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfTitleBook = new javax.swing.JTextField();
        jpAuthors = new javax.swing.JPanel();
        jtfAuthorName = new javax.swing.JTextField();
        jbAddAuthorName = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlAuthorsList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jtfEdition = new javax.swing.JTextField();
        jbClearForm = new javax.swing.JButton();
        jbRegisterBook = new javax.swing.JButton();
        jcbFormatType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCode = new javax.swing.JTextField();

        jopEditionError.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Book");
        setPreferredSize(new java.awt.Dimension(760, 400));

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel1.setText("Register Book");
        jLabel1.setMaximumSize(new java.awt.Dimension(170, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(165, 28));
        jLabel1.setPreferredSize(new java.awt.Dimension(170, 28));

        jLabel2.setText("Title:");

        jpAuthors.setBorder(javax.swing.BorderFactory.createTitledBorder("Authors"));

        jbAddAuthorName.setText("Add");
        jbAddAuthorName.setPreferredSize(new java.awt.Dimension(100, 28));
        jbAddAuthorName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbAddAuthorNameMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jlAuthorsList);

        javax.swing.GroupLayout jpAuthorsLayout = new javax.swing.GroupLayout(jpAuthors);
        jpAuthors.setLayout(jpAuthorsLayout);
        jpAuthorsLayout.setHorizontalGroup(
            jpAuthorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAuthorsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAuthorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAuthorsLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jpAuthorsLayout.createSequentialGroup()
                        .addComponent(jtfAuthorName)
                        .addGap(18, 18, 18)
                        .addComponent(jbAddAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jpAuthorsLayout.setVerticalGroup(
            jpAuthorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAuthorsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAuthorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAddAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Edition:");

        jbClearForm.setText("Clear Form");
        jbClearForm.setPreferredSize(new java.awt.Dimension(150, 28));
        jbClearForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbClearFormMouseClicked(evt);
            }
        });

        jbRegisterBook.setText("Register Book");
        jbRegisterBook.setPreferredSize(new java.awt.Dimension(150, 28));
        jbRegisterBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRegisterBookMouseClicked(evt);
            }
        });

        jLabel4.setText("Format:");

        jLabel5.setText("Book code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbFormatType, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                        .addComponent(jbClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbRegisterBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jpAuthors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCode))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jtfTitleBook, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfTitleBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAuthors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegisterBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbFormatType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(5, 5, 5))
        );

        jpAuthors.getAccessibleContext().setAccessibleName("Authors:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddAuthorNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAddAuthorNameMouseClicked
        String n = jtfAuthorName.getText();
        list.addElement(n);
        jtfAuthorName.setText("");
    }//GEN-LAST:event_jbAddAuthorNameMouseClicked

    private void jbRegisterBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRegisterBookMouseClicked
        try{
        this.book.setDateAdded();
        
        this.book.setTitle(jtfTitleBook.getText());
        
        this.book.setCode(Integer.parseInt(jtfCode.getText()));

        this.book.setEdition(Integer.parseInt(jtfEdition.getText()));

        String f = String.valueOf(jcbFormatType.getSelectedItem());

        if (f.equalsIgnoreCase(BookFormat.DIGITAL.name())) {// buscar uma forma de tornar isso dinamico
            this.book.setFormat(BookFormat.DIGITAL);
        } 
        else if (f.equalsIgnoreCase(BookFormat.PRINTED.name())) {
            this.book.setFormat(BookFormat.PRINTED);
        } 
        else if (f.equalsIgnoreCase(BookFormat.CD.name())) {
            this.book.setFormat(BookFormat.CD);
        }

        Object[] a = list.toArray();
        for (Object x : a) {
            this.book.addAuthor((String) x);
        }
        
        dispose();
        }catch(NumberFormatException ex){
            jopEditionError.showMessageDialog(null, "Please verify edition and code, there not accept letters and others symbols");
        }

    }//GEN-LAST:event_jbRegisterBookMouseClicked

    private void jbClearFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbClearFormMouseClicked
        
        jtfAuthorName.setText("");
        jtfEdition.setText("");
        jtfCode.setText("");
        jtfTitleBook.setText("");
        jcbFormatType.setSelectedIndex(-1);
        list.clear();
        jlAuthorsList.removeAll();
        jtfTitleBook.requestFocus();
        
        
    }//GEN-LAST:event_jbClearFormMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAddAuthorName;
    private javax.swing.JButton jbClearForm;
    private javax.swing.JButton jbRegisterBook;
    private javax.swing.JComboBox<String> jcbFormatType;
    private javax.swing.JList<String> jlAuthorsList;
    private javax.swing.JOptionPane jopEditionError;
    private javax.swing.JPanel jpAuthors;
    private javax.swing.JTextField jtfAuthorName;
    private javax.swing.JTextField jtfCode;
    private javax.swing.JTextField jtfEdition;
    private javax.swing.JTextField jtfTitleBook;
    // End of variables declaration//GEN-END:variables
}
