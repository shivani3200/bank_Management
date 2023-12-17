
package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

import java.awt.event.*;
import java.sql.*;

/*
 @author shivani
 */
public class SignupOne extends JFrame implements ActionListener{
    JTextField nameTextField,fnameTextField,emailTextField,stateTextField,cityTextField,pincodeTextField,countryTextField;
    JButton next;
    JRadioButton male, female,other, married, unmarried, other2;
    JDateChooser dateChooser;
    long random;
    SignupOne(){
        setLayout(null);
        Random ran = new Random();
         random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        //form no
        JLabel formno = new JLabel("APPLICATION FORM NO : " + random);
        formno.setFont(new Font("raleway", Font.BOLD, 38));
        formno.setBounds(140,20, 600, 40);
        add(formno);
        
        //personalDetails
        JLabel personalDetails = new JLabel("Personal Details ");
        personalDetails.setFont(new Font("raleway", Font.BOLD, 22));
        personalDetails.setBounds(300,80, 400, 20);
        add(personalDetails);
        
        //NAME
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("raleway", Font.BOLD, 20));
        name.setBounds(100,140, 100, 30  );
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("releway", Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
                
        //FATHER's name
        JLabel fname = new JLabel("Father's Name : ");
        fname.setFont(new Font("raleway", Font.BOLD, 20));
        fname.setBounds(100,190, 200, 30  );
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("releway", Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        //DOB
        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("raleway", Font.BOLD, 20));
        dob.setBounds(100,240, 200, 30  );
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        add(dateChooser);
        
        //GENDER
        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("raleway", Font.BOLD, 20));
        gender.setBounds(100,290, 200, 30  );
        add(gender);
                //MALE
         male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.WHITE);
        add(male);
                //FEMALE
        female = new JRadioButton("Female");
        female.setBounds(420,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);
                //OTHER
        other = new JRadioButton("Other");
        other.setBounds(540,290,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        //GROUPING THE BUTTONS
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);
        
        //EMAIL
        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("raleway", Font.BOLD, 20));
        email.setBounds(100,340, 200, 30  );
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("releway", Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
                
        //MARITAL STATUS
        JLabel marital = new JLabel("Marital Status : ");
        marital.setFont(new Font("raleway", Font.BOLD, 20));
        marital.setBounds(100,390, 200, 30  );
        add(marital);
                //MALE
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
                //FEMALE
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(420,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
                //OTHER
        other2 = new JRadioButton("Other");
        other2.setBounds(540,390,100,30);
        other2.setBackground(Color.WHITE);
        add(other2);
        //GROUPING THE BUTTONS
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other2);
        
        //ADDRESS
        JLabel address = new JLabel("Address Details ");
        address.setFont(new Font("raleway", Font.BOLD, 20));
        address.setBounds(300,440, 200, 30  );
        add(address);
                
        //CITY
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("raleway", Font.BOLD, 20));
        city.setBounds(100,490, 200, 30  );
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("releway", Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        //STATE
        JLabel state = new JLabel("State : ");
        state.setFont(new Font("raleway", Font.BOLD, 20));
        state.setBounds(100,540, 200, 30  );
        add(state);
        
         stateTextField = new JTextField();
        stateTextField.setFont(new Font("releway", Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        //COUNTRY
        JLabel country = new JLabel("Country : ");
        country.setFont(new Font("raleway", Font.BOLD, 20));
        country.setBounds(100,590, 200, 30  );
        add(country);
        
        countryTextField = new JTextField();
        countryTextField.setFont(new Font("releway", Font.BOLD,14));
        countryTextField.setBounds(300,590,400,30);
        add(countryTextField);
        
        //PINCODE
        JLabel pincode = new JLabel("Pin code : ");
        pincode.setFont(new Font("raleway", Font.BOLD, 20));
        pincode.setBounds(100,640, 200, 30  );
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("raleway", Font.BOLD,14));
        pincodeTextField.setBounds(300,640,200,30);
        add(pincodeTextField);
        
        next = new JButton("NEXT");
        next.setBounds(600,700,100,30);
        next.setFont(new Font("raleway", Font.BOLD,14));
        next.setOpaque(true);
        next.setBorderPainted(false);
        next.setBackground(new Color(7, 94, 84));
        next.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        next.setForeground(Color.WHITE);

        next.addActionListener(this);
        add(next);
        
        //frame 
        setSize(850,800);
        setVisible(true);
        setLocation(300,10);
        getContentPane().setBackground(Color.WHITE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno = ""+ random; //long
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender =  null;
        if(male.isSelected()){
            gender = "male";
        }else if(female.isSelected()){
            gender = "female";
        }else if(other.isSelected()){
            gender = "other";
        }
        String email = emailTextField.getText();
        String marital =  null;
        if(married.isSelected()){
            marital = "married";
        }else if(unmarried.isSelected()){
            marital = "unmarried";
        }else if(other2.isSelected()){
            marital = "other";
        }
        
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String country = countryTextField.getText();
        String pin = pincodeTextField.getText();
        
        try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is required");
        }
        else if(fname.equals("")){
            JOptionPane.showMessageDialog(null,"Father's name is required");
        }
         else if(city.equals("")){
            JOptionPane.showMessageDialog(null,"city is required");
        }

            else if(state.equals("")){
            JOptionPane.showMessageDialog(null,"state is required");
        }

            else if(country.equals("")){
            JOptionPane.showMessageDialog(null,"country is required");
        }
                    else if(pin.equals("")){
            JOptionPane.showMessageDialog(null,"pin is required");
        }
        
      else{
//                        establising connection
            DatabaseConnection c = new DatabaseConnection();
            //dml command
            String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+city+"','"+state+"','"+country+"','"+pin+"')";
            //QUERY WILL RUN IN MYSQL
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                    }
                        

        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args){
    new SignupOne();
    }
}
