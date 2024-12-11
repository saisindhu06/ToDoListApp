/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managment.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SingupOne extends JFrame implements ActionListener {
    Long random;
    JTextField nameTextField,fathernameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,Others,married,Unmarried;
    JDateChooser dateChooser;
    SingupOne()
    {
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
       personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        
         JLabel fathername = new JLabel("Father Name: ");
       fathername.setFont(new Font("Raleway",Font.BOLD,20));
        fathername.setBounds(100, 190, 200, 30);
        add(fathername);
        
         fathernameTextField = new JTextField();
        fathernameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fathernameTextField.setBounds(300, 190, 400, 30);
        add(fathernameTextField);
        
        JLabel dob = new JLabel("Date of Birth :");
       dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :");
       gender.setFont(new Font("Raleway",Font.BOLD,20));
       gender.setBounds(100, 290, 200, 30);
        add(gender);
        
         male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
         female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email = new JLabel("Email address :");
       email.setFont(new Font("Raleway",Font.BOLD,20));
       email.setBounds(100, 340, 200, 30);
        add(email);
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital status :");
       marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100, 390, 200, 30);
        add(marital);
        
         married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
                
         Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(450,390,100,30);
        Unmarried.setBackground(Color.white);
        add(Unmarried);
        
         Others = new JRadioButton("Others");
        Others.setBounds(630,390,100,30);
        Others.setBackground(Color.white);
        add(Others);
        
        ButtonGroup Maritalgroup = new ButtonGroup();
        Maritalgroup.add(married);
        Maritalgroup.add(Unmarried);
        Maritalgroup.add(Others);
        
        JLabel address = new JLabel("Enter your address");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("Enter your city");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100, 490, 200, 30);
        add(city);
        
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("Enter your state");
       state.setFont(new Font("Raleway",Font.BOLD,20));
       state.setBounds( 100, 540, 200, 30);
        add(state);
        
         stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
                
        JLabel pincode = new JLabel("Enter your pincode");
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
       pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        
         pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);
        
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
        String formno = "" + random;
        String name = nameTextField.getText();
        String fathername = fathernameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        }else if(female.isSelected())
        {
            gender = "female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected())
        {
            marital = "married";
        }else if(Unmarried.isSelected())
        {
             marital = "Unmarried";
        }
        else if(Others.isSelected()){
            marital = "Others";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        try {
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else{
                Conn c = new Conn();
                String query = "insert into signup values( '"+formno+"', '"+name+"', '"+fathername+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')"; 
                c.s.executeUpdate(query);//This is used to run the sql query
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        new  SingupOne();
    }
}
