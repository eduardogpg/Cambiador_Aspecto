
package proyecto_pimentel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;


public class Cambiador_Aspecto extends javax.swing.JFrame {
public Color color;                   //Ayuda a El color de Panel 1          
public Image imagen;                //Guarda la Imagen ya en Negativo y la Pinta en Pantalla con el Metodo
public BufferedImage foto;              //Guarda una imagen en Objeto para poder descomponerla despues

ImageIcon icono;                //Guarda la IMagen en un Icon
ImageIcon IconoBoton;       
ImageIcon IconoBoton2;              //3 Imagenes de Botonos 
ImageIcon IconoBoton3;

  
    
    public Cambiador_Aspecto() {
        initComponents();
        /*try {
            //vista de Windows
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//vista de Windows
                //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");//Java
                //UIManager.setLookAndFeel("javax.swing.plaf.ocean.MetalLookAndFeel");
                //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");//Cosa fea
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cambiador_Aspecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Cambiador_Aspecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Cambiador_Aspecto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Cambiador_Aspecto.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        IconoBoton = new ImageIcon("twitter.png");
        IconoBoton2 = new ImageIcon("Google plus.png");         //Agrega los 3 iconos
        IconoBoton3 = new ImageIcon("MySpace.png");
        jPanel1.setBackground(Color.lightGray);         //Establece un Color de Fondo
       
       this.add(jToolBar1,BorderLayout.NORTH);
        jButton2.setIcon(IconoBoton);
        jButton1.setIcon(IconoBoton2);      //Agrega las imagenes a los botones
        jButton3.setIcon(IconoBoton3);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);
        jToolBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jToolBar1KeyPressed(evt);
            }
        });

        jButton1.setText("Cambiar Fondo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Negativo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setText("Creditos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setText("Nueva Imagen");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public void paint(Graphics g) {        //Metdo para Dibujar
        super.paint(g);
        g.drawImage(imagen, 130, 100, null);        //Una Trampa para que no Vibre xD
 
 }
 

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Cambiar_Negativo negativo = new Cambiar_Negativo(); //Crea el Objeto 
      negativo.NegativoImagen(foto);                       //Manda la Imagen
      foto = negativo.getFoto();                    //recive la Image
     
     JOptionPane.showMessageDialog(null, "Se cambio la Imagen a Negativo");
     repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    color = JColorChooser.showDialog(Cambiador_Aspecto.this,"Seleciones un color", color);
						
        if(color ==  null)              //MEtodo que cambia el COlor
        color= Color.LIGHT_GRAY;
    this.jPanel1.setBackground(color);
    repaint();
    JOptionPane.showMessageDialog(null, "Se a cambiado el Color de Fondo");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    }//GEN-LAST:event_jButton3ActionPerformed
 
    private void jToolBar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jToolBar1KeyPressed

    }//GEN-LAST:event_jToolBar1KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // añadir imagen
        JFileChooser escogedor = new JFileChooser();
        int valor = escogedor.showOpenDialog(null);//abrimos el FileChooser
        if( valor == JFileChooser.APPROVE_OPTION){//sirve para verificar si selecciono un archivo

            try {
                
                foto = ImageIO.read(escogedor.getSelectedFile());
                icono = new ImageIcon(foto);
                this.imagen = icono.getImage();
               } catch (IOException ex) {
                
                JOptionPane.showMessageDialog(null, "No se puede abrir la imagen");
                
            } 
        }
        repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambiador_Aspecto().setVisible(true);
            }
        });
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
