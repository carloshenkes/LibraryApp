package com.acme.view;

import com.acme.model.Book;
import com.acme.model.Library;
import com.acme.model.file.FileManager;
import java.io.File;
import javax.swing.JFileChooser;

public class MainForm extends javax.swing.JFrame {

    private Library library;

    public MainForm() {
        initComponents();
        library = new Library();
        openStart();
        jtfBookQ.setText(String.valueOf(library.getNumberOfBooks()));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfcFiles = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jopExit = new javax.swing.JOptionPane();
        jopErrorSaveNullFIle = new javax.swing.JOptionPane();
        jToolBar1 = new javax.swing.JToolBar();
        jbSave = new javax.swing.JButton();
        jbOpen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtfBookQ = new javax.swing.JTextField();
        jmbBar = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiNew = new javax.swing.JMenuItem();
        jmiOpen = new javax.swing.JMenuItem();
        jmiSave = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiExit = new javax.swing.JMenuItem();
        jmEdit = new javax.swing.JMenu();
        jmBooks = new javax.swing.JMenu();
        jmiRegister = new javax.swing.JMenuItem();
        jmiListBooks = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library 1.0");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jbSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/common/disk.png"))); // NOI18N
        jbSave.setToolTipText("Click here to save your data");
        jbSave.setFocusable(false);
        jbSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSaveMouseClicked(evt);
            }
        });
        jToolBar1.add(jbSave);

        jbOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/common/folder.png"))); // NOI18N
        jbOpen.setFocusable(false);
        jbOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbOpenMouseClicked(evt);
            }
        });
        jToolBar1.add(jbOpen);

        jLabel1.setText("Number of Books:");

        jtfBookQ.setEditable(false);

        jmFile.setText("File");
        jmFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFileActionPerformed(evt);
            }
        });

        jmiNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/common/page_white.png"))); // NOI18N
        jmiNew.setText("New");
        jmFile.add(jmiNew);

        jmiOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmiOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/common/folder.png"))); // NOI18N
        jmiOpen.setText("Open");
        jmiOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOpenActionPerformed(evt);
            }
        });
        jmFile.add(jmiOpen);

        jmiSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmiSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/common/page_save.png"))); // NOI18N
        jmiSave.setText("Save");
        jmiSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSaveActionPerformed(evt);
            }
        });
        jmFile.add(jmiSave);
        jmFile.add(jSeparator1);

        jmiExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmiExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/common/door.png"))); // NOI18N
        jmiExit.setText("Exit");
        jmiExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmiExitMouseClicked(evt);
            }
        });
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jmFile.add(jmiExit);

        jmbBar.add(jmFile);

        jmEdit.setText("Edit");
        jmbBar.add(jmEdit);

        jmBooks.setText("Books");
        jmBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jmiRegister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmiRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/common/add.png"))); // NOI18N
        jmiRegister.setMnemonic('R');
        jmiRegister.setText("Registrate Book");
        jmiRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRegisterActionPerformed(evt);
            }
        });
        jmBooks.add(jmiRegister);

        jmiListBooks.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmiListBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/all/table.png"))); // NOI18N
        jmiListBooks.setText("List Books");
        jmiListBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListBooksActionPerformed(evt);
            }
        });
        jmBooks.add(jmiListBooks);

        jmbBar.add(jmBooks);

        setJMenuBar(jmbBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jtfBookQ, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfBookQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 227, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRegisterActionPerformed
        Book b = new Book();//cria um objeto Book vazio
        AddBookForm abd = new AddBookForm(this, true, b);// envia a referencia do objeto b para o metodo construtor
        abd.setVisible(true);
        library.addBook(b);// adiciona o livro ao Array
        jtfBookQ.setText(Integer.toString(library.getNumberOfBooks()));
    }//GEN-LAST:event_jmiRegisterActionPerformed

    private void jmiListBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListBooksActionPerformed
        if (library.getNumberOfBooks() != 0) {
            ListBooks lb = new ListBooks(this, true, library);
            lb.setVisible(true);
        } else {
            ListBooks lb = new ListBooks(this, true, library);
            lb.setVisible(false);
        }


    }//GEN-LAST:event_jmiListBooksActionPerformed

    private void jbSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSaveMouseClicked
        save();
    }//GEN-LAST:event_jbSaveMouseClicked

    private void jmiSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSaveActionPerformed
        save();
    }//GEN-LAST:event_jmiSaveActionPerformed

    private void save() {
        if (library.getNumberOfBooks() != 0) {
            int result = jfcFiles.showSaveDialog(this);
            if (result == JFileChooser.CANCEL_OPTION) {
                return;
            }
            File f = jfcFiles.getSelectedFile();
            FileManager.saveFile(library, f);
        } else {
            jopErrorSaveNullFIle.showMessageDialog(null,"The library does not have registered books to save!");
        }
    }

    private void jmFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFileActionPerformed

    }//GEN-LAST:event_jmFileActionPerformed

    private void jmiOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOpenActionPerformed
        open();
    }//GEN-LAST:event_jmiOpenActionPerformed

    private void jbOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbOpenMouseClicked
        open();
    }//GEN-LAST:event_jbOpenMouseClicked

    private void jmiExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiExitMouseClicked

    }//GEN-LAST:event_jmiExitMouseClicked

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        int result = jopExit.showConfirmDialog(this, "Do you really want exit?", "Exit", jopExit.YES_NO_OPTION);
        if (result == jopExit.YES_OPTION) {
            save();
            System.exit(0);
        }
    }//GEN-LAST:event_jmiExitActionPerformed

    void open() {
        int result = jfcFiles.showOpenDialog(this);
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File f = jfcFiles.getSelectedFile();
        this.library = FileManager.openFile(f);
        jtfBookQ.setText(String.valueOf(library.getNumberOfBooks()));
    }
    
    
    void openStart(){
        File f = new File("testebook.ser");
            this.library = FileManager.openFile(f);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbOpen;
    private javax.swing.JButton jbSave;
    private javax.swing.JFileChooser jfcFiles;
    private javax.swing.JMenu jmBooks;
    private javax.swing.JMenu jmEdit;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenuBar jmbBar;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiListBooks;
    private javax.swing.JMenuItem jmiNew;
    private javax.swing.JMenuItem jmiOpen;
    private javax.swing.JMenuItem jmiRegister;
    private javax.swing.JMenuItem jmiSave;
    private javax.swing.JOptionPane jopErrorSaveNullFIle;
    private javax.swing.JOptionPane jopExit;
    private javax.swing.JTextField jtfBookQ;
    // End of variables declaration//GEN-END:variables
}
