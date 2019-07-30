/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Start;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Start.Start;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

/**
 *
 * @author julian
 */
public class login { 
    
    private String usuario="Matias";
    private String user_contra="Saitam";
    
    public login(){
        JFrame login = new JFrame("Iniciar Secion");
        login.setResizable(false);
        login.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        login.setLayout(null);
        login.setBounds(50,200,500,150);
        
        
        JLabel lbl_usr = new JLabel();
        lbl_usr.setBounds(150,10,100,25);
        lbl_usr.setText("Usuario:");
        
        JTextField user = new JTextField();
        user.setBounds(210,10,100,25);
        
        
        
        
        JLabel lbl_c = new JLabel();
        lbl_c.setText("Contraseña:");
        lbl_c.setBounds(120,40,100,25);
        
        JPasswordField contraseña = new JPasswordField(20);
	contraseña.setBounds(210, 40, 100,25);
	
        
        
        
        
        JButton btn_1 = new JButton();
        btn_1.setText("Enviar");
        btn_1.setBounds(250,80,80,30);
        
        
        btn_1.addActionListener((ActionEvent las) -> {
            String nombre= user.getText();            
            String contra= contraseña.getText();
            System.out.println(contra);
            if(usuario.equals(user.getText()) && user_contra.equals(contraseña.getText())){
                JavaApplication3 ch = new JavaApplication3();
                login.dispose();
            }else{
            JOptionPane.showMessageDialog(null,"Contraseña incorrecta, intente nuevamente");
            user.setText(null);            
            contraseña.setText(null);
            }
        });
                
                
        login.add(contraseña);
        login.add(lbl_c);
        login.add(lbl_usr);
        login.add(user);
        login.add(btn_1);
        login.setVisible( true);
        
    }
}

