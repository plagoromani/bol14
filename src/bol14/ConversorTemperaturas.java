/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol14;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class ConversorTemperaturas {
      private final static byte TEMPMIN = 80;
    
    public static double centigradosAFharenheit(float temp) throws TemperaturaErradaExcepcion{
        if(temp<TEMPMIN){
            throw new TemperaturaErradaExcepcion("No se permite una temperatura menor a 80 grados");
        }else{
            return 9.0/5.0*temp+32.4;
        }
    }
    
    public static void centigradosAReamur(float temp){
        try{
            if(temp<TEMPMIN){
                throw new TemperaturaErradaExcepcion("No se permite una temperatura menor a 80 grados");
            }else{
                System.out.println("La temperatura en grados reamur es = "+4.0/5.0*temp);
            }
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void centigradosAReamurObligatorio(float temp){
        boolean obligado = false;
        do{
        try{
            if(temp<TEMPMIN){
                obligado=true;
                throw new TemperaturaErradaExcepcion("No se permite una temperatura menor a 80 grados");
            }else{
                obligado=false;
                System.out.println("La temperatura en grados reamur es = "+4.0/5.0*temp);
            }
        }catch(TemperaturaErradaExcepcion e){
            temp = Float.parseFloat(JOptionPane.showInputDialog("Introduzca temperatura mayor o igual a 80ºC:"));
        }
        }while(obligado);
    }
}
