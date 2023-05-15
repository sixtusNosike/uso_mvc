/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uso_mvc;

import controlador.ControladorConversor;
import modelo.ModeloConversor;
import vista.VistaConversor;

/**
 *
 * @author Sixtus32 <4396551@alu.murciaeduca.es>
 */
public class Conversor {
    public static void main(String[] args) {
        ModeloConversor modelo=new ModeloConversor();
        VistaConversor vista=new VistaConversor();
        
        ControladorConversor con=new ControladorConversor(modelo, vista);
        con.iniciarVista();
        
    }
}
