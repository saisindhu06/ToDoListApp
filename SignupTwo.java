/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managment.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    String formno;
    JComboBox religion,category,occupation,education,income;
    SignupTwo(String formno)
    {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setLayout(null);
        
        
        
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");
       AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        AdditionalDetails.setBounds(290, 80, 400, 30);
        add(AdditionalDetails);
        
        JLabel name = new JLabel(" Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu","Christian","Sikh","Muslim","Others"};
         religion =  new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        add(religion);
        
         
        
        
         JLabel fathername = new JLabel("Category: ");
       fathername.setFont(new Font("Raleway",Font.BOLD,20));
        fathername.setBounds(100, 190, 200, 30);
        add(fathername);
        
        String valcategory[] = {"General","OBC","SC","ST","others"};
         category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        add(category);
        
        JLabel dob = new JLabel("Income:");
       dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String incomecategory[] = {"null","< 1,00,000","< 2,00,000 ","< 5,00,000","<10,00,000"};
          income = new JComboBox(incomecategory);
         income.setBounds(300,240,200,30);
         add(income);
         
         
        
        JLabel gender = new JLabel("Educational :");
       gender.setFont(new Font("Raleway",Font.BOLD,20));
       gender.setBounds(100, 290, 200, 30);
        add(gender);
        
         
        
        JLabel email = new JLabel("Qualification :");
       email.setFont(new Font("Raleway",Font.BOLD,20));
       email.setBounds(100, 315, 200, 30);
        add(email);
        
         String educationvalues[] = {"Non-graduate","Graduation","Post-Graduation","Docterate","Others"};
          education = new JComboBox(educationvalues);
         education.setBounds(300,315,400,30);
         add(education);
        
        
        JLabel marital = new JLabel("Occupation :");
       marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100, 400, 200, 30);
        add(marital);
        
       String occupationvalues[] = {"Salaried","Self Employed","Business","Student","Others"};
          occupation = new JComboBox(occupationvalues);
         occupation.setBounds(300,390,400,30);
         add(occupation);
        
        
         
        
        
        
        JLabel address = new JLabel("Pan No:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
         pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar No:");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100, 490, 200, 30);
        add(city);
        
         aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen:");
       state.setFont(new Font("Raleway",Font.BOLD,20));
       state.setBounds( 100, 540, 200, 30);
        add(state);
        
         syes = new JRadioButton("Yes");
         syes.setBounds(300,540,100,30);
         add(syes);
         
         sno = new JRadioButton("No");
         sno.setBounds(450,540,100,30);
         add(sno);
         
         ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(syes);
        gendergroup.add(sno);
                
        JLabel pincode = new JLabel("Exisiting account:");
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
       pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
         eyes.setBounds(300,590,100,30);
         add(eyes);
         
         eno = new JRadioButton("No");
         eno.setBounds(450,590,100,30);
         add(eno);
         
         ButtonGroup egendergroup = new ButtonGroup();
        egendergroup.add(syes);
        egendergroup.add(sno);
        
        
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
        }else if(sno.isSelected())
        {
            seniorcitizen = "No";
        }
        //String email = emailTextField.getText();
        String existingaccount = null;
        if(eyes.isSelected())
        {
            existingaccount = "Yes";
        }else if(eno.isSelected())
        {
             existingaccount = "No";
        }
       
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        try {
             
                Conn c = new Conn();
                String query = "insert into signuptwo values( '"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')"; 
                c.s.executeUpdate(query);//This is used to run the sql query
                setVisible(false);
                new signupThree(formno).setVisible(true);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        new  SignupTwo("");
    }
}
