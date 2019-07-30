/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Thanos Muere
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat de General Uriburu");
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
        
        JButton Boton = new JButton();
        frame.add(Boton);
        Boton.setBounds(100, 503, 100, 40);
        Boton.setText("Enviar");
        
        
        JButton Boton2 = new JButton();
        frame.add(Boton2);
        Boton2.setBounds(380, 503, 100, 40);
        Boton2.setText("Borrar");
        
        
        JButton Boton3 = new JButton();
        frame.add(Boton3);
        Boton3.setBounds(560, 503, 100, 40);
        Boton3.setText("Salir");
        
        
        
        JCheckBox caja = new JCheckBox("Habilitar Texto");
        caja.setText("Habilitar Boton");
        frame.add(caja);
        caja.setBounds(200, 499, 200, 20);
        caja.setSelected(true);
        
        
        JCheckBox caja2 = new JCheckBox("Ingresar texto");
        frame.add(caja2);
        caja2.setText("Agregar el texto al final");
        caja2.setBounds(200, 526, 200, 20);
        caja2.setSelected(true);
        
        
        
        JTextArea texto = new JTextArea();
        texto.setBounds(10, 10, 770, 390);
        texto.setEditable(false);
        texto.setBackground(Color.yellow);
        texto.setText("");
        frame.add(texto);
        
        
        JTextField barra = new JTextField();
        barra.setBounds(10, 440, 770, 23);
        frame.add(barra);
        frame.setVisible(true);
        
        
    
        Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (caja2.isSelected()==false){
                    if (!barra.getText().equals("")) {
                        texto.setText("Ninci: " + barra.getText() + "\n" + texto.getText()     );
                        barra.setText("");
                    }
                }else{
                    if (!barra.getText().equals("")) {
                        if(texto.getText().equals("")){
                            texto.setText(texto.getText() +  "Ninci: " + barra.getText());
                            barra.setText("");
                        }else{
                            texto.setText(texto.getText() + "\n" + "Ninci: " + barra.getText());
                            barra.setText("");
                        }
                    }
                }
            }

        });
        caja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                
                if (caja.isSelected()==false) {
                    Boton.setEnabled(false);
                }else{
                    Boton.setEnabled(true);
                }

            }

        });
        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                int opcion = JOptionPane.showConfirmDialog(frame, "SOS????", "sis", JOptionPane.YES_NO_CANCEL_OPTION);
                if(opcion == JOptionPane.YES_OPTION){
                    texto.setText("");
                }else{
                    
                }
            
            }

        });
        Boton3.addActionListener((ActionEvent las) -> {
            login lg = new login();
            frame.dispose();
        });

    }

}
