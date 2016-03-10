/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol14;

/**
 *
 * @author Pablite5
 */
public class Bol14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try{
            System.out.println("La temperatura en grados farenheit es= " + ConversorTemperaturas.centigradosAFharenheit(80)+"ºF");
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        ConversorTemperaturas.centigradosAReamur(78);
        ConversorTemperaturas.centigradosAReamurObligatorio(68);
    }
    }
    

