/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloConversor;
import vista.VistaConversor;

/**
 *
 * @author Sixtus32 <4396551@alu.murciaeduca.es>
 */
public class ControladorConversor implements ActionListener{
    private ModeloConversor modelo;
    private VistaConversor vista;
    private double resultado;

    public ControladorConversor(ModeloConversor modeloConversor, VistaConversor vistaConversor) {
        this.modelo=modeloConversor;
        this.vista=vistaConversor;
        
        this.vista.botonPeseta.addActionListener(this);
        this.vista.botonDolar.addActionListener(this);
    }
    public void iniciarVista(){
        this.vista.setVisible(true);
        this.vista.setSize(600,400);
        this.vista.setLocationRelativeTo(null);
        this.vista.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ev=e.getSource();
        try {
            resultado=Double.parseDouble(vista.entrarDato.getText());
            if (vista.botonPeseta == ev) {
                if(!"".equalsIgnoreCase(vista.entrarDato.getText())){
                    modelo.setCantidad(resultado);
                    modelo.setMoneda(166.3860);
                    modelo.convertirMoneda();
                    vista.resultadoMostrado.setText(""+resultado);   
                }
            }else if(vista.botonPeseta == ev){
                    if(!"".equalsIgnoreCase(vista.entrarDato.getText())){
                    modelo.setCantidad(resultado);
                    modelo.setMoneda(166.3860);
                    modelo.convertirMoneda();
                    vista.resultadoMostrado.setText(""+resultado);   
                }
            }
        } catch (NumberFormatException ex) {
            vista.resultadoMostrado.setText("Introduce un número por favor.");
        }
    }
    
    
}
