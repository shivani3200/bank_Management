
package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/*
 @author shivani
 */
public class SignupTwo extends JFrame implements ActionListener{
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton seniorYes, seniorNo,accountYes,accountNo;
    JComboBox religionComboBox,categoryComboBox,incomeComboBox,educationComboBox,occupationComboBox;
    String formno;
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        
        //form no
        setTitle("NEW ACCOUNT APLLICATION page-2");
        
        //personalDetails
        JLabel additionalDetails = new JLabel("Additional Details ");
        additionalDetails.setFont(new Font("raleway", Font.BOLD, 22));
        additionalDetails.setBounds(300,80, 400, 20);
        add(additionalDetails);
        
        //RELIGION
        JLabel religion = new JLabel("Religion : ");
        religion.setFont(new Font("raleway", Font.BOLD, 20));
        religion.setBounds(100,140, 200, 30  );
        add(religion);
                
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religionComboBox = new JComboBox(valReligion);
        religionComboBox.setBounds(300,140,250,30);
        add(religionComboBox);

                
        //CATEGORY
        JLabel category = new JLabel("Category : ");
        category.setFont(new Font("raleway", Font.BOLD, 20));
        category.setBounds(100,190, 200, 30  );
        add(category);
        
        String valCategory[] = {"General","OBC","SC","ST","Other"};
        categoryComboBox = new JComboBox(valCategory);
        categoryComboBox.setBounds(300,190,250,30);
        add(categoryComboBox);
        
        //INCOME
        JLabel income = new JLabel("Income : ");
        income.setFont(new Font("raleway", Font.BOLD, 20));
        income.setBounds(100,240, 200, 30  );
        add(income);
               
        String incomeCategory[] = {"Null","< ₹1,00,000","< ₹2,50,000","< ₹5,00,000","Upto ₹10,00,000"};
        incomeComboBox = new JComboBox(incomeCategory);
        incomeComboBox.setBounds(300,240,250,30);
        add(incomeComboBox);
        
        //EDUCATIONAL QUALIFICATION
        JLabel educational = new JLabel("Educational ");
        educational.setFont(new Font("raleway", Font.BOLD, 20));
        educational.setBounds(100,290, 200, 30  );
        add(educational);
        
        
        JLabel qualifications = new JLabel("Qualifications : ");
        qualifications.setFont(new Font("raleway", Font.BOLD, 20));
        qualifications.setBounds(100,315, 200, 30  );
        add(qualifications);
        
        String educationCategory[] = {"Matriculation","Intermediate","Graduation","Post-Graduation","P.hd","Other"};
        educationComboBox = new JComboBox(educationCategory);
        educationComboBox.setBounds(300,315,250,30);
        add(educationComboBox);
                
        //OCCUPATION
        JLabel occupation = new JLabel("Occupation  : ");
        occupation.setFont(new Font("raleway", Font.BOLD, 20));
        occupation.setBounds(100,390, 200, 30  );
        add(occupation); 
        
        String occupationCategory[] = {"Salaried","Self-Employed","Business","Retired","Student","Other"};
        occupationComboBox = new JComboBox(occupationCategory);
        occupationComboBox.setBounds(300,390,250,30);
        add(occupationComboBox);
         
        
        //PAN NUMBER
        JLabel pan = new JLabel("PAN number ");
        pan.setFont(new Font("raleway", Font.BOLD, 20));
        pan.setBounds(100,440, 200, 30  );
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("releway", Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

   
        //AADHAR NUMBER
        JLabel aadhar = new JLabel("Aadhar number ");
        aadhar.setFont(new Font("raleway", Font.BOLD, 20));
        aadhar.setBounds(100,490, 200, 30  );
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("releway", Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);

        //SENIOR CITIZEN
        JLabel senior = new JLabel("Senior Citizen : ");
        senior.setFont(new Font("raleway", Font.BOLD, 20));
        senior.setBounds(100,540, 200, 30  );
        add(senior);
        
        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(300,540,200,30);
        add(seniorYes);
                
        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(400,540,200,30);
        add(seniorNo);
        
        ButtonGroup citizenGroup = new ButtonGroup();
        citizenGroup.add(seniorYes);
        citizenGroup.add(seniorNo);
        
        //EXISTING ACCOUNT
        JLabel account = new JLabel("Existing Account : ");
        account.setFont(new Font("raleway", Font.BOLD, 20));
        account.setBounds(100,590, 200, 30  );
        add(account);

        accountYes = new JRadioButton("Yes");
        accountYes.setBounds(300,590,200,30);
        add(accountYes);
                
        accountNo = new JRadioButton("NO");
        accountNo.setBounds(400,590,200,30);
        add(accountNo);
        
        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(accountYes);
        accountGroup.add(accountNo);
       
        
        next = new JButton("NEXT");
        next.setBounds(600,700,100,30);
        next.setFont(new Font("raleway", Font.BOLD,14));
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
      // String formno = ""+ random; //long
       String religion = (String)religionComboBox.getSelectedItem();
       String category = (String)categoryComboBox.getSelectedItem();
       String income = (String)incomeComboBox.getSelectedItem();
       String qualifications = (String)educationComboBox.getSelectedItem();
       String occupation = (String)occupationComboBox.getSelectedItem();

        String seniorCitizen =  null;
        if(seniorYes.isSelected()){
            seniorCitizen = "Yes";
        }else if(seniorNo.isSelected()){
            seniorCitizen = "No";
        }
        String existingAccount =  null;
        if(accountYes.isSelected()){
            seniorCitizen = "Yes";
        }else if(accountNo.isSelected()){
            seniorCitizen = "No";
        }
      
        String panNumber = panTextField.getText();
        String aadharNumber = aadharTextField.getText();
        
        try{
        if(aadharNumber.equals("")){
            JOptionPane.showMessageDialog(null,"Aadhar number is required");
        }
        else if(panNumber.equals("")){
            JOptionPane.showMessageDialog(null,"Pan number is required");
        }
         
      else{
//                        establising connection
            DatabaseConnection c = new DatabaseConnection();
            //dml command
            String query = "insert into signupTwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+qualifications+"','"+occupation+"','"+panNumber+"','"+aadharNumber+"','"+seniorCitizen+"','"+existingAccount+"')";
            //QUERY WILL RUN IN MYSQL
                c.s.executeUpdate(query);
                    }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args){
    new SignupTwo("");
    }
}
