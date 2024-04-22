/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                   Aplicacion que permite realizar los cambios a "EditorFrame"
:*        
:*  Archivo     : OpcionesDialog.java
:*  Autor       : Carlos Roberto Rocha Trejo      22130517
:*  Fecha       : 19/SEP/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripción : Esta aplicacion es la aplicacion de opciones donde 
:*                se debera seleccionar una opcion, entre cuale estan:
:*                   1. Fuente
:*                   2. Apariencia 
:*                   3. Corrector
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  
:------------------------------------------------------------------------------------------/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package editor;

import java.awt.Color;
import javax.swing.JColorChooser;
import editor.EditorFrame;
import java.awt.Font;
import javax.swing.JOptionPane;
//------------------------------------------------------------------------------------------
public class OpcionesDialog extends javax.swing.JDialog {


    private JColorChooser jColorChooser = new JColorChooser();
    private EditorFrame editorFrame;
    private Color colorTexto;
    private Color colorFondo;
    public OpcionesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        editorFrame = (EditorFrame)parent;
        
    }
//------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstFamilia = new javax.swing.JList<>();
        jspnTamaño = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnColorFondo = new javax.swing.JButton();
        jbtnColorTexto = new javax.swing.JButton();
        jlblcolorFondo = new javax.swing.JLabel();
        jlblColorTexto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtnCorregir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblCorrector = new javax.swing.JTable();
        jbtnCancelar = new javax.swing.JButton();
        jbtnAceptar = new javax.swing.JButton();

        setTitle("Opciones");

        jLabel1.setText("Familia:");

        jLabel2.setText("Tamaño:");

        jlstFamilia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Predeterminado", "Arial", "Calibri", "Courier New", "Times New Roman" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlstFamilia.setSelectedIndex(0);
        jScrollPane1.setViewportView(jlstFamilia);

        jspnTamaño.setModel(new javax.swing.SpinnerNumberModel(10, 8, 24, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jspnTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jspnTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fuente", jPanel1);

        jLabel3.setText("Color de texto");

        jLabel4.setText("Color de fondo");

        jbtnColorFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editcopy.gif"))); // NOI18N
        jbtnColorFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnColorFondoActionPerformed(evt);
            }
        });

        jbtnColorTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filenew.gif"))); // NOI18N
        jbtnColorTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnColorTextoActionPerformed(evt);
            }
        });

        jlblcolorFondo.setBackground(new java.awt.Color(255, 255, 255));
        jlblcolorFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblcolorFondo.setOpaque(true);

        jlblColorTexto.setBackground(new java.awt.Color(0, 0, 0));
        jlblColorTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblColorTexto.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnColorTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblColorTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnColorFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblcolorFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnColorFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jbtnColorTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblcolorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblColorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Apariencia", jPanel2);

        jbtnCorregir.setText("Corregir ahora");
        jbtnCorregir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCorregirActionPerformed(evt);
            }
        });

        jtblCorrector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"poes", "pues"},
                {"pus", "pues"},
                {"poruque", "porque"},
                {"caundo", "cuando"},
                {"haiga", "haya"},
                {"contastes", "contaste"}
            },
            new String [] {
                "Si encuentra", "Reemplazar por"
            }
        ));
        jScrollPane2.setViewportView(jtblCorrector);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnCorregir)
                        .addGap(14, 14, 14)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCorregir)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Corrector", jPanel3);

        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnAceptar.setText("Aceptar");
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jbtnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCancelar)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAceptar)
                    .addComponent(jbtnCancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------------------
    
    private void jbtnColorTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnColorTextoActionPerformed
        Color colorNuevo = JColorChooser.showDialog(this, "Color de Texto", Color.black);
        if(colorNuevo != null){
            colorTexto = colorNuevo;
            jlblColorTexto.setBackground(colorNuevo);
        }
    }//GEN-LAST:event_jbtnColorTextoActionPerformed
//------------------------------------------------------------------------------------------
    
    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtnCancelarActionPerformed
//------------------------------------------------------------------------------------------
    
    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed
        //Aplicar la fuente que se haya establecido
        String familia = jlstFamilia.getSelectedValue();
        int tamaño = Integer.parseInt(jspnTamaño.getValue().toString());
        Font fuente = new Font (familia,Font.PLAIN,tamaño);
        editorFrame.setFuente(fuente);
        // Establecer color de texto y fondo seleccionados
        editorFrame.setColorEditor(colorTexto, colorFondo);
        
        setVisible(false);
    }//GEN-LAST:event_jbtnAceptarActionPerformed
//------------------------------------------------------------------------------------------
    
    private void jbtnColorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnColorFondoActionPerformed
        Color colorNuevo = JColorChooser.showDialog(this, "Color del fondo",Color.BLACK);
        if(colorNuevo != null){
            colorFondo = colorNuevo;
            jlblcolorFondo.setBackground(colorNuevo);

        }
    }//GEN-LAST:event_jbtnColorFondoActionPerformed
//------------------------------------------------------------------------------------------
    
    // Este metodo toma el texto actual del Editor para buscar en él cada una
    // de las palabras del corrector y sustituirlas por la correspondiente palabra
    // correcta. Al final este metodo establece el nuevo texto correigo como el
    // texto del editor
    
    
    private void jbtnCorregirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCorregirActionPerformed
       String texto = editorFrame.getTextoEditor();
       String [] mal = new String[jtblCorrector.getRowCount()];
       String [] bien = new String[jtblCorrector.getRowCount()];
       //Procesar el texto para corregir las palabras
       for(int i = 0; i < jtblCorrector.getRowCount(); i++){
           // se llenan arreglos con las palabras mal escritas y palabras bien escritas
           mal[i] = jtblCorrector.getValueAt(i,0).toString();
           bien[i] = jtblCorrector.getValueAt(i,1).toString();
           // el metodo 'replaceAll' retonrna un String y necesita las palabras mal escritas
           // y las palabras bien escritas para poder funcionar
           texto = texto.replaceAll(mal[i], bien[i]);
       }
       if(editorFrame.getTextoEditor() != null){
            JOptionPane.showMessageDialog(this, "Palabras corregidas correctamente!", "Corrector", JOptionPane.INFORMATION_MESSAGE);
       
      
            editorFrame.setTextoEditor(texto);
          }
       
    }//GEN-LAST:event_jbtnCorregirActionPerformed
//------------------------------------------------------------------------------------------

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Motif".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OpcionesDialog dialog = new OpcionesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
//------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnColorFondo;
    private javax.swing.JButton jbtnColorTexto;
    private javax.swing.JButton jbtnCorregir;
    private javax.swing.JLabel jlblColorTexto;
    private javax.swing.JLabel jlblcolorFondo;
    private javax.swing.JList<String> jlstFamilia;
    private javax.swing.JSpinner jspnTamaño;
    private javax.swing.JTable jtblCorrector;
    // End of variables declaration//GEN-END:variables
}
