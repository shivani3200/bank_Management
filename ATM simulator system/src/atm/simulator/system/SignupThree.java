
package atm.simulator.system;

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
import java.util.*;
/*
  @author shivani
 */
  

public class SignupThree extends JFrame implements ActionListener{
      JRadioButton savingAccount, fixedDepositAccount, currentAccount, recurringDepositAccount;
      JCheckBox atmCard, netBanking, emailAlerts, mobileBanking, chequeBook, eStatement, declaration;
      JButton submit, cancel;

    SignupThree(){
        setLayout(null);
        
        JLabel l1 = new JLabel("Account Details page 3");
        l1.setFont(new Font("raleway", Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("raleway", Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        //SAVING ACCOUNT RADIO BUTTON
        savingAccount = new JRadioButton("Saving Account");
        savingAccount.setFont(new Font("raleway", Font.PLAIN, 16));
        savingAccount.setBounds(100, 180, 200, 30);
        add(savingAccount);
                
        //SAVING ACCOUNT RADIO BUTTON
        fixedDepositAccount = new JRadioButton("Fixed Deposit Account");
        fixedDepositAccount.setFont(new Font("raleway", Font.PLAIN, 16));
        fixedDepositAccount.setBounds(450, 180, 250, 30);
        add(fixedDepositAccount);
                
        //SAVING ACCOUNT RADIO BUTTON
        currentAccount = new JRadioButton("Current Account");
        currentAccount.setFont(new Font("raleway", Font.PLAIN, 16));
        currentAccount.setBounds(100, 220, 200, 30);
        add(currentAccount);
                
        //SAVING ACCOUNT RADIO BUTTON
        recurringDepositAccount = new JRadioButton("Recurring Deposit Account");
        recurringDepositAccount.setFont(new Font("raleway", Font.PLAIN, 16));
        recurringDepositAccount.setBounds(450, 220, 300, 30);
        add(recurringDepositAccount);
        
        //GROUPING THE RADIO BUTTONS
        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(savingAccount);
        groupAccount.add(fixedDepositAccount);
        groupAccount.add(currentAccount);
        groupAccount.add(recurringDepositAccount);
        
         //CARD TYPE J LABEL
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("raleway", Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        //CARD DETAIL
        JLabel cardDetail = new JLabel("Your 16 digit card number");
        cardDetail.setFont(new Font("raleway", Font.PLAIN,12));
        cardDetail.setBounds(110,330,200,30);
        add(cardDetail);
        //RANDON CARD NUMBER
        JLabel cardNumber = new JLabel("XXXX-XXXX-XXXX-4821");
        cardNumber.setFont(new Font("raleway", Font.PLAIN,22));
        cardNumber.setBounds(330,300,300,30);
        add(cardNumber);
        //PIN J LABEL
        JLabel pin = new JLabel("Pin Number");
        pin.setFont(new Font("raleway", Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        //PIN DETAIL
        JLabel pinDetail = new JLabel("Your 4 digit pin number");
        pinDetail.setFont(new Font("raleway", Font.PLAIN,12));
        pinDetail.setBounds(110,400,200,30);
        add(pinDetail);
        //RANDON PIN NUMBER
        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("raleway", Font.PLAIN,22));
        pinNumber.setBounds(330,370,300,30);
        add(pinNumber );
        //SERVICES REQUIRED
        JLabel servicesRequired = new JLabel("Services Required");
        servicesRequired.setFont(new Font("raleway", Font.BOLD,20));
        servicesRequired.setBounds(100,450,300,30);
        add(servicesRequired );
        
        //CHECK BOX FOR ATM CARD
        atmCard  = new JCheckBox("ATM Card");
        atmCard.setBounds(100,500,200,20);
        atmCard.setFont(new Font("raleway", Font.PLAIN,16));
        add(atmCard);
                //CHECK BOX FOR NET BANKING
        netBanking  = new JCheckBox("Net Banking");
        netBanking.setBounds(100,530,200,20);
        netBanking.setFont(new Font("raleway", Font.PLAIN,16));
        add(netBanking);
                //CHECK BOX FOR EMAIL ALERTS
        emailAlerts  = new JCheckBox("Email & SMS Alerts");
        emailAlerts.setBounds(100,560,200,20);
        emailAlerts.setFont(new Font("raleway", Font.PLAIN,16));
        add(emailAlerts);
                //CHECK BOX FOR MOBILE BANKING 
        mobileBanking  = new JCheckBox("Mobile Banking");
        mobileBanking.setBounds(450,500,200,20);
        mobileBanking.setFont(new Font("raleway", Font.PLAIN,16));
        add(mobileBanking);
                //CHECK BOX FOR CHEQUE BOOK
        chequeBook  = new JCheckBox("Cheque Book");
        chequeBook.setBounds(450,530,200,20);
        chequeBook.setFont(new Font("raleway", Font.PLAIN,16));
        add(chequeBook);
                //CHECK BOX FOR E STATEMENT
        eStatement  = new JCheckBox("E-Statement");
        eStatement.setBounds(450,560,200,20);
        eStatement.setFont(new Font("raleway", Font.PLAIN,16));
        add(eStatement);
                //CHECK BOX FOR DECLARATION
        declaration  = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        declaration.setBounds(80,620,600,20);
        declaration.setFont(new Font("raleway", Font.BOLD,12));
        add(declaration);
        //SUBMIT BUTTON
        submit = new JButton("Submit");
        submit.setBounds(280,660,100,30);
        submit.setOpaque(true);
        submit.setBorderPainted(false);
        submit.setBackground(new Color(7, 94, 84));
        submit.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this); 
        add(submit);
          //CANCEL BUTTON      
        cancel = new JButton("Cancel");
        cancel.setBounds(420,660,100,30);
        cancel.setOpaque(true);
        cancel.setBorderPainted(false);
        cancel.setBackground(new Color(7, 94, 84));
        cancel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        

        
        setSize(850,820);
        setLocation(350, 0);
        getContentPane().setBackground(Color.WHITE);//changing background 
        setVisible(true);
        
        
    
    }
    //overidding the action performed function
    public void actionPerformed(ActionEvent ae){
   
        if(ae.getSource() ==  submit){
            String Account = null;
            if(savingAccount.isSelected()){
                Account  = "Saving account";
            }else if(fixedDepositAccount.isSelected()){
                Account  = "Fixed Deposit account";
            }else if(currentAccount.isSelected()){
                Account  = "Current Account";
            }else if(recurringDepositAccount.isSelected()){
                Account  = "Recurring Deposit Account";
            }
            //generating random card number and pin
          Random random  = new Random();
          String cardNumber = ""+Math.abs(random.nextLong() % 90000000L) + 5885633600000000L;
          String pinNumber = ""+Math.abs(random.nextLong() % 9000L) + 1000L;

          //
          String facility = "";
          if(atmCard.isSelected()){
              facility = facility +"ATM Card";
           }else if(netBanking.isSelected()){
             facility = facility +"Net Banking";
           }
          else if(emailAlerts.isSelected()){
             facility = facility +"Email & SMS Alerts";
           }
          else if(mobileBanking.isSelected()){
             facility = facility +"Mobile Banking";
           }
          else if(chequeBook.isSelected()){
             facility = facility +"Cheque Book";
           }else if(eStatement.isSelected()){
             facility = facility +"E-Statement";
           }
          
          //ADDING DATABASE CONNECTION
          //try catch block qki database alag entity hai to exception de skta hai runtime pe
          try{ 
              
           }catch(Exception e){
           }
          
        } 
        
        else if(ae.getSource() == cancel){
        
        }
    }
    
    public static void main(String[] args){
        new SignupThree();
    }
}
