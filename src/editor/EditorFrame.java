/*------------------------------------------------------------------------------------------
:*                         TECNOLOGICO NACIONAL DE MEXICO
:*                               CAMPUS LA LAGUNA
:*                     INGENIERIA EN SISTEMAS COMPUTACIONALES
:*                       TOPICOS AVANZADOS DE PROGRAMACION "B"
:*
:*                   SEMESTRE: AGO-DIC/2023    HORA: 17-18 HRS
:*
:*                   Aplicacion visual que permite realizar archivos de texto
:*        
:*  Archivo     : EditorFrame.java
:*  Autor       : Carlos Roberto Rocha Trejo      22130517
:*  Fecha       : 19/SEP/2023
:*  Compilador  : JDK 17 + Netbeans 18
:*  Descripción : Esta aplicacion permite crear un acrhivo de texto  
:*                guardarlo cambiarle la apariencia entre otras cosas.
:*               
:*  Ultima modif:
:*  Fecha       Modificó             Motivo
:*========================================================================================== 
:*  
:------------------------------------------------------------------------------------------/


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package editor;

import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

//------------------------------------------------------------------------------------------
public class EditorFrame extends javax.swing.JFrame {
private String archivoActual;
private boolean textoModificado = false;
private OpcionesDialog opcionesDlg = new OpcionesDialog(this,true);

    private JFileChooser jFileChooser = new JFileChooser();
    public EditorFrame() {
        initComponents();
        // Maximizamos el frame
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Agregar un escuchador de eventos al documento del área de texto para detectar cambios
        jtxaEditor.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            textoModificado = true;
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            textoModificado = true;
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            textoModificado = true;
        }
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jbtnNuevo = new javax.swing.JButton();
        jbtnAbrir = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnGuardarComo = new javax.swing.JButton();
        jbtnImprimir = new javax.swing.JButton();
        jbtnCopiar = new javax.swing.JButton();
        jbtnCortar = new javax.swing.JButton();
        jbtnPegar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaEditor = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiArchivoNuevo = new javax.swing.JMenuItem();
        jmiArchivoAbrir = new javax.swing.JMenuItem();
        jmiArchivoGuardar = new javax.swing.JMenuItem();
        jmiArchivoGuardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiArchivoImprimir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiArchivoSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiEditarCopiar = new javax.swing.JMenuItem();
        jmiEditarCortar = new javax.swing.JMenuItem();
        jmiEditarPegar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiHerramientasOpciones = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAyudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EditorApp");
        setExtendedState(3);

        jToolBar1.setRollover(true);

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filenew.gif"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setFocusable(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnNuevo);

        jbtnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fileopen.gif"))); // NOI18N
        jbtnAbrir.setText("Abrir");
        jbtnAbrir.setFocusable(false);
        jbtnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnAbrir);

        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filesave.gif"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setFocusable(false);
        jbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnGuardar);

        jbtnGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filesaveas.gif"))); // NOI18N
        jbtnGuardarComo.setText("Guardar Como");
        jbtnGuardarComo.setFocusable(false);
        jbtnGuardarComo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnGuardarComo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarComoActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnGuardarComo);

        jbtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fileprint.gif"))); // NOI18N
        jbtnImprimir.setText("Imprimir");
        jbtnImprimir.setFocusable(false);
        jbtnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnImprimir);

        jbtnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editcopy.gif"))); // NOI18N
        jbtnCopiar.setText("Copiar");
        jbtnCopiar.setFocusable(false);
        jbtnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCopiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnCopiar);

        jbtnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editcut.gif"))); // NOI18N
        jbtnCortar.setText("Cortar");
        jbtnCortar.setFocusable(false);
        jbtnCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCortarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnCortar);

        jbtnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editpaste.gif"))); // NOI18N
        jbtnPegar.setText("Pegar");
        jbtnPegar.setFocusable(false);
        jbtnPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPegarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnPegar);

        jtxaEditor.setColumns(20);
        jtxaEditor.setRows(5);
        jtxaEditor.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jtxaEditorInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jtxaEditor);

        jMenu1.setText("Archivo");

        jmiArchivoNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filenew.gif"))); // NOI18N
        jmiArchivoNuevo.setText("Nuevo");
        jmiArchivoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArchivoNuevo);

        jmiArchivoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fileopen.gif"))); // NOI18N
        jmiArchivoAbrir.setText("Abrir...");
        jmiArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArchivoAbrir);

        jmiArchivoGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filesave.gif"))); // NOI18N
        jmiArchivoGuardar.setText("Guardar");
        jmiArchivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArchivoGuardar);

        jmiArchivoGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/filesaveas.gif"))); // NOI18N
        jmiArchivoGuardarComo.setText("Guardar como...");
        jmiArchivoGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArchivoGuardarComo);
        jMenu1.add(jSeparator1);

        jmiArchivoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fileprint.gif"))); // NOI18N
        jmiArchivoImprimir.setText("Imprimir...");
        jmiArchivoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArchivoImprimir);
        jMenu1.add(jSeparator2);

        jmiArchivoSalir.setText("Salir");
        jmiArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArchivoSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiArchivoSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jmiEditarCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editcopy.gif"))); // NOI18N
        jmiEditarCopiar.setText("Copiar");
        jmiEditarCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarCopiarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiEditarCopiar);

        jmiEditarCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editcut.gif"))); // NOI18N
        jmiEditarCortar.setText("Cortar");
        jmiEditarCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarCortarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiEditarCortar);

        jmiEditarPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editpaste.gif"))); // NOI18N
        jmiEditarPegar.setText("Pegar");
        jmiEditarPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarPegarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiEditarPegar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Herramientas");

        jmiHerramientasOpciones.setText("Opciones");
        jmiHerramientasOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHerramientasOpcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jmiHerramientasOpciones);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        jmiAyudaAcercaDe.setText("Acerca de...");
        jmiAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAyudaAcercaDeActionPerformed(evt);
            }
        });
        jMenu4.add(jmiAyudaAcercaDe);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------------------

    private void jmiArchivoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoNuevoActionPerformed
//        if(textoModificado && archivoActual != null){
//                jmiArchivoGuardar.doClick();
//            
//        }
//        if(textoModificado && archivoActual == null){
//            if(JOptionPane.showConfirmDialog(this,"Deseas guardar el archivo") == 0){
//                jmiArchivoGuardarComo.doClick();
//            }
//        }
        if(textoModificado){
            if(JOptionPane.showConfirmDialog(this,"Deseas guardar el archivo") == 0){
                jmiArchivoGuardarComo.doClick();
            }
        }
        
        
        
            jtxaEditor.setText("");
        
    }//GEN-LAST:event_jmiArchivoNuevoActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiArchivoSalirActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiArchivoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoImprimirActionPerformed
        try {
            jtxaEditor.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this,"Error al imprimir","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmiArchivoImprimirActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiEditarCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarCopiarActionPerformed
        jtxaEditor.copy();
    }//GEN-LAST:event_jmiEditarCopiarActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiEditarCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarCortarActionPerformed
        jtxaEditor.cut();
    }//GEN-LAST:event_jmiEditarCortarActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiEditarPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarPegarActionPerformed
        jtxaEditor.paste();
    }//GEN-LAST:event_jmiEditarPegarActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoAbrirActionPerformed
       if(jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
           //El usuario selecciono un archivo y dio click en el boton abrir
           File archivoAbrir = jFileChooser.getSelectedFile();
           archivoActual = archivoAbrir.getAbsolutePath();
           // abrir el archivo seleccionado
           try {
               // Lectura del archivo linea x linea
               BufferedReader fbr = new BufferedReader ( 
                                new FileReader ( archivoAbrir ) );
               String lineaTexto = "";
               while((lineaTexto = fbr.readLine()) != null){
                   jtxaEditor.append(lineaTexto + "\n");
               }
               // Cerrar el archivo
               fbr.close();
               // Posicionar el cursor del Textarea en el caracter 0
               jtxaEditor.setCaretPosition(0);
               jtxaEditor.requestFocus();
           }catch(FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this,"Error al abrir el archivo","Error",JOptionPane.ERROR_MESSAGE);
           }
           catch(IOException e){
               JOptionPane.showMessageDialog(this,"Error al leer el archivo","Error",JOptionPane.ERROR_MESSAGE);
           }
            
       }
    }//GEN-LAST:event_jmiArchivoAbrirActionPerformed
//------------------------------------------------------------------------------------------

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        jmiArchivoNuevo.doClick();
    }//GEN-LAST:event_jbtnNuevoActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiArchivoGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoGuardarComoActionPerformed
        if( jFileChooser.showSaveDialog ( this  ) == JFileChooser.APPROVE_OPTION  ){
            
            File archivoGuardar = jFileChooser.getSelectedFile();
            

            
            try {
                PrintWriter printWriter = new PrintWriter (archivoGuardar);
                 // Escribir en el archivo el contenido del TextArea
                 printWriter.println( jtxaEditor.getText() );
                 // Cerrar el archivo
                 printWriter.flush ();
                 printWriter.close ();
            
                
            } catch (FileNotFoundException ex) {
               JOptionPane.showMessageDialog(this,"Error al crear el archivo","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jmiArchivoGuardarComoActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiHerramientasOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHerramientasOpcionesActionPerformed
        opcionesDlg.setVisible(true);
    }//GEN-LAST:event_jmiHerramientasOpcionesActionPerformed
//------------------------------------------------------------------------------------------

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        jmiArchivoGuardar.doClick();
    }//GEN-LAST:event_jbtnGuardarActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiArchivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArchivoGuardarActionPerformed
        if(archivoActual == null){      
             if(JOptionPane.showConfirmDialog(this,"Desea Guardar") == 0){
                 jmiArchivoGuardarComo.doClick();
             }
           
        }
        else if(archivoActual != null){
            PrintWriter printWriter;
            try {
                printWriter = new PrintWriter(new File(archivoActual));
                printWriter.write(jtxaEditor.getText());
                printWriter.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EditorFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_jmiArchivoGuardarActionPerformed
//------------------------------------------------------------------------------------------

    private void jtxaEditorInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jtxaEditorInputMethodTextChanged
    }//GEN-LAST:event_jtxaEditorInputMethodTextChanged
//------------------------------------------------------------------------------------------

    private void jbtnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAbrirActionPerformed
        jmiArchivoAbrir.doClick();
    }//GEN-LAST:event_jbtnAbrirActionPerformed
//------------------------------------------------------------------------------------------

    private void jbtnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarComoActionPerformed
        jmiArchivoGuardarComo.doClick();
    }//GEN-LAST:event_jbtnGuardarComoActionPerformed
//------------------------------------------------------------------------------------------

    private void jbtnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImprimirActionPerformed
        jmiArchivoImprimir.doClick();
    }//GEN-LAST:event_jbtnImprimirActionPerformed
//------------------------------------------------------------------------------------------

    private void jbtnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCopiarActionPerformed
        jmiEditarCopiar.doClick();
    }//GEN-LAST:event_jbtnCopiarActionPerformed
//------------------------------------------------------------------------------------------

    private void jbtnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCortarActionPerformed
        jmiEditarCortar.doClick();
    }//GEN-LAST:event_jbtnCortarActionPerformed
//------------------------------------------------------------------------------------------

    private void jbtnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPegarActionPerformed
        jmiEditarPegar.doClick();
    }//GEN-LAST:event_jbtnPegarActionPerformed
//------------------------------------------------------------------------------------------

    private void jmiAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAyudaAcercaDeActionPerformed
        //Cargar el archivo de imagen del logo en un objeto Image Icon
        Icon icono = new ImageIcon( getClass().getResource("/iconos/ITL.png") );
        JOptionPane.showMessageDialog(this, """
                                            EditorApp v1.0
                                            
                                            Autor: Carlos Roberto Rocha Trejo
                                            (22130517)
                                            
                                            (C) Drechos reservados 2023.
                                            """, 
                                                        "Acerca de", 
                                                        JOptionPane.INFORMATION_MESSAGE, 
                                                        icono);
    }//GEN-LAST:event_jmiAyudaAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnAbrir;
    private javax.swing.JButton jbtnCopiar;
    private javax.swing.JButton jbtnCortar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnGuardarComo;
    private javax.swing.JButton jbtnImprimir;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnPegar;
    private javax.swing.JMenuItem jmiArchivoAbrir;
    private javax.swing.JMenuItem jmiArchivoGuardar;
    private javax.swing.JMenuItem jmiArchivoGuardarComo;
    private javax.swing.JMenuItem jmiArchivoImprimir;
    private javax.swing.JMenuItem jmiArchivoNuevo;
    private javax.swing.JMenuItem jmiArchivoSalir;
    private javax.swing.JMenuItem jmiAyudaAcercaDe;
    private javax.swing.JMenuItem jmiEditarCopiar;
    private javax.swing.JMenuItem jmiEditarCortar;
    private javax.swing.JMenuItem jmiEditarPegar;
    private javax.swing.JMenuItem jmiHerramientasOpciones;
    private javax.swing.JTextArea jtxaEditor;
    // End of variables declaration//GEN-END:variables
//------------------------------------------------------------------------------------------    
    public void setFuente(Font fuente){
        jtxaEditor.setFont(fuente);
    }
//------------------------------------------------------------------------------------------  
    public void setColorEditor(Color texto, Color fondo){
        jtxaEditor.setForeground(texto);
        jtxaEditor.setBackground(fondo);
        
        
    }
//------------------------------------------------------------------------------------------
    public String getTextoEditor(){
        return jtxaEditor.getText();
    }
 //------------------------------------------------------------------------------------------
    public void setTextoEditor(String nuevoTexto){
        jtxaEditor.setText(nuevoTexto);
    }
    

}
