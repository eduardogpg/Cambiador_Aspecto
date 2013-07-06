/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pimentel;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;


public class Cambiar_Negativo {

    public BufferedImage foto=null;
    public int rojo;
    private int verde;
    private int azul;
    private Color color;
 
    private ImageIcon icono;
    
    public void NegativoImagen(BufferedImage f){
        this.foto = f;
        for(int x=0;x<foto.getWidth();x++){
          for(int y=0;y<foto.getHeight();y++){
              
                //se obtiene el color del pixel
              //Se empiexa de 0,0 al tamaño de la imagen
                color = new Color(foto.getRGB(x, y));
                //se extraen los valores RGB
                rojo = color.getRed();
                verde = color.getGreen();
                azul = color.getBlue();
                
                //SetRGB coloca los nuevos colores
                foto.setRGB(x, y, new Color(255-rojo,255-verde,255-azul).getRGB()); 
                
          }
        }   
}
    
   public BufferedImage getFoto(){
  return this.foto;
    }  
}
