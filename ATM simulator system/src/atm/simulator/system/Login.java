
package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login , signUp, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    //LOGIN constructor
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        //INSERTING image logo
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 100);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10, 100, 100);
        add(label);
        
        //adding welcome label
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font ("osward",Font.BOLD,38));
        text.setBounds(200, 40, 400, 30);
        add(text);
        //adding welcome label
        JLabel cardNo = new JLabel("Card Number:");
        cardNo.setFont(new Font ("raleway",Font.BOLD,28));
        cardNo.setBounds(120, 150, 400, 30);
        add(cardNo);
        //side form box of card number
        cardTextField = new JTextField();
        cardTextField.setBounds(350,150,250,30);
        cardTextField.setFont(new Font("nunito", Font.BOLD,14));
        add(cardTextField);
        
        //adding welcome label
        JLabel pin = new JLabel("PIN code:");
        pin.setFont(new Font ("raleway",Font.BOLD,28));
        pin.setBounds(120, 220, 400, 40);
        add(pin);
        //side form box of pin
        pinTextField = new JPasswordField();
        pinTextField.setBounds(350,220,250,30);
        add(pinTextField);
        
        //ADDING SIGN IN BUTTON
        login = new JButton("SIGN IN");
        login.setBounds(350,300,100,30);
        login.setOpaque(true);
        login.setBorderPainted(false);
        login.setBackground(new Color(7, 94, 84));
        login.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        login.setForeground(Color.WHITE);

        login.addActionListener(this);
        add(login);
        
        //ADDING CLEAR BUTTON
        clear = new JButton("CLEAR");
        clear.setBounds(500,300,100,30);
        clear.setOpaque(true);
        clear.setBorderPainted(false);
        clear.setBackground(new Color(7, 94, 84));
        clear.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        clear.setForeground(Color.WHITE);

        clear.addActionListener(this);
        add(clear);
        
        //ADDING sign up BUTTON
        signUp = new JButton("SIGN UP");
        signUp.setBounds(350,350,250,30);
        signUp.setOpaque(true);
        signUp.setBorderPainted(false);
        signUp.setBackground(new Color(7, 94, 84));
        signUp.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        signUp.setForeground(Color.WHITE);

        signUp.addActionListener(this);
        add(signUp);
        
        
        
        //changing the background color
        getContentPane().setBackground(Color.WHITE);
        //ssetting the height and width of frame
        setSize(700,500);
        //making the frame visible
        setVisible(true);
        //ssetting the location of frame
        setLocation(350,200);
        
        
    }
    //abstract method override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
        pinTextField.setText("");
        cardTextField.setText("");
        }
        else if(ae.getSource() == login){
        
        }
        else if(ae.getSource() == signUp){
            setVisible(false);
            new SignupOne().setVisible(true);
        
        }
            
    }
    public static void main(String args[]){
        new Login();
    }
    
}
