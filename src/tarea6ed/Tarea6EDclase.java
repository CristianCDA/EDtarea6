/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea6ed;

/**
 *
 * @author Cristian
 */
public class Tarea6EDclase {
    public void aplicarDescuento(double precioproducto, int numProductos){     
    double Total;
      
    if(numProductos>3)
        precioproducto -= Descuento_cantidad;
            if (numProductos !=0 ){
            Total = precioproducto*0.8;
            System.out.println("El total a pagar es:" +Total);
            salidaporconsola();
        }else {
            Total = precioproducto*0.95;
            System.out.println("El total a pagar es:" +Total);
            salidaporconsola();
        }   

    } 
   
    public static final int Descuento_cantidad = 5;

    private void salidaporconsola() {
        System.out.println("Enviado");
    }
}
