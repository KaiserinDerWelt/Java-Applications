/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo3_ea_a3_mala;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author marianalicona
 */
public class CatFileManager extends javax.swing.JFrame {
    private Object file;

    /**
     * Creates new form CatFileManager
     */
    public CatFileManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DescriptionSelectFile1 = new javax.swing.JLabel();
        DescriptionSelectFile2 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Create = new javax.swing.JButton();
        Read = new javax.swing.JButton();
        Write = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        DescriptionCreate = new javax.swing.JLabel();
        InputCreate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReadArea = new javax.swing.JTextArea();
        DescriptionSelectFile = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CreateArea1 = new javax.swing.JTextArea();
        DescriptionSelectFile3 = new javax.swing.JLabel();
        RenameName = new javax.swing.JLabel();
        RenameInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        DeleteDescription = new javax.swing.JLabel();

        DescriptionSelectFile1.setText("Selecciona el archivo a leer:");

        DescriptionSelectFile2.setText("Selecciona el archivo a leer:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(204, 255, 255));
        Background.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dpo3_ea_a3_mala/Cat.png"))); // NOI18N
        Logo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));

        jLabel1.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 1, 24)); // NOI18N
        jLabel1.setText("CAT FILE MANAGER");

        Create.setText("Crear");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        Read.setText("Leer este Archivo Ya!");
        Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadActionPerformed(evt);
            }
        });

        Write.setText("Seleccionar");
        Write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WriteActionPerformed(evt);
            }
        });

        Delete.setText("Archivo para Eliminar");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        DescriptionCreate.setText("Nombre el archivo:");

        ReadArea.setBackground(new java.awt.Color(255, 204, 255));
        ReadArea.setColumns(20);
        ReadArea.setRows(5);
        jScrollPane1.setViewportView(ReadArea);

        DescriptionSelectFile.setText("Selecciona el archivo a leer:");

        CreateArea1.setBackground(new java.awt.Color(255, 204, 255));
        CreateArea1.setColumns(20);
        CreateArea1.setRows(5);
        jScrollPane2.setViewportView(CreateArea1);

        DescriptionSelectFile3.setText("Selecciona el archivo a renombrar:");

        RenameName.setText("Nuevo nombre del archivo:");

        RenameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenameInputActionPerformed(evt);
            }
        });

        jButton1.setText("Renombrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DeleteDescription.setText("Selecciona el archivo a eliminar:");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DescriptionCreate))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DescriptionSelectFile3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Write, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(DeleteDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(DescriptionSelectFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Read, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(RenameName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RenameInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Create, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                    .addContainerGap(184, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescriptionCreate)
                            .addComponent(InputCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(Create))
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Read)
                    .addComponent(DescriptionSelectFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionSelectFile3)
                    .addComponent(Write))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RenameName)
                    .addComponent(RenameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteDescription)
                    .addComponent(Delete))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(298, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        // TODO add your handling code here:
        String nombreArchivo=InputCreate.getText();
 String carpeta = System.getProperty("user.dir");
 String direccionCompleta= carpeta+"/"+nombreArchivo+".txt";
 FileWriter ubicacion = null;
 try {
 ubicacion = new FileWriter(direccionCompleta);
 } catch (IOException ex) {
 Logger.getLogger(crear.class.getName()).log(Level.SEVERE, null, ex);
 }
 try{
 BufferedWriter escritor = new BufferedWriter(ubicacion);
 escritor.write(CreateArea1.getText());
 escritor.close();
 } catch(Exception e){
 }
    }//GEN-LAST:event_CreateActionPerformed

    private void RenameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RenameInputActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
 fc.showOpenDialog(null);
 File ArchivoBorrado = fc.getSelectedFile();
 if (ArchivoBorrado.delete())
 JOptionPane.showMessageDialog(null, "Borrado Exitoso");
 else
 JOptionPane.showMessageDialog(null, "Error! Intenta borrarlo otra vez!");
    }//GEN-LAST:event_DeleteActionPerformed

    private void ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
 fc.showOpenDialog(null);
 File archivo = fc.getSelectedFile();
 try{
 FileReader fr = new FileReader (archivo);
 BufferedReader br = new BufferedReader(fr);
 String texto="";
 String linea="";
 while(((linea=br.readLine())!=null) ){
 texto+=linea+"\n";
 }
 ReadArea.setText(texto);
 }
 catch(Exception e){
 } 
    }//GEN-LAST:event_ReadActionPerformed

    private void WriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WriteActionPerformed
        // TODO add your handling code here:
       JFileChooser FileIwant=new JFileChooser();
       FileIwant.showOpenDialog(null);
       file = FileIwant.getSelectedFile();
    }//GEN-LAST:event_WriteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nvo=file.getParent+"\\"+RenameInput.getText()+".txt";
 File NameTwo = new File(RenameInput.getText());
 boolean correcto = file.renameTo(NameTwo);
 if (correcto==true)
 JOptionPane.showMessageDialog(null,"Renombrado Exitoso");
 else
 JOptionPane.showMessageDialog(null,"Renombrado Fallido"); 
  
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CatFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatFileManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton Create;
    private javax.swing.JTextArea CreateArea1;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel DeleteDescription;
    private javax.swing.JLabel DescriptionCreate;
    private javax.swing.JLabel DescriptionSelectFile;
    private javax.swing.JLabel DescriptionSelectFile1;
    private javax.swing.JLabel DescriptionSelectFile2;
    private javax.swing.JLabel DescriptionSelectFile3;
    private javax.swing.JTextField InputCreate;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Read;
    private javax.swing.JTextArea ReadArea;
    private javax.swing.JTextField RenameInput;
    private javax.swing.JLabel RenameName;
    private javax.swing.JButton Write;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private static class crear {

        public crear() {
        }
    }
}
