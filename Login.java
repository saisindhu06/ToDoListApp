/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managment.system;
import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author konda 
 */
public class Login extends JFrame implements ActionListener{
     JButton login,signup,clear;
     JTextField cardTextField;
     JPasswordField pinTextField;
    Login()//Constructor
    {
         setTitle("AUTOMATED TELLER MACHINE");
         setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        
         Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel label = new JLabel(i3);
         label.setBounds(70,10,100,100);
         add(label);
         JLabel text = new JLabel("Welcome To Atm");
         text.setFont(new Font("Osward",Font.BOLD,38));
         text.setBounds(200,40,400,40);
         add(text);
         JLabel cardno = new JLabel("Card No:");
         cardno.setFont(new Font("Raleway",Font.BOLD,28));
         cardno.setBounds(120,150,150,30);
         add(cardno);
          cardTextField = new JTextField();
         cardTextField.setBounds(300,150,230,30);
         add(cardTextField);
         JLabel pin = new JLabel("PIN:");
         pin.setFont(new Font("raleway",Font.BOLD,28));
         pin.setBounds(120,220,250,30);
         add(pin);
          pinTextField = new JPasswordField();
         pinTextField.setBounds(300,220,230,30);
         add(pinTextField);
          login = new JButton("SIGN IN");
         login.setBounds(300,300,100,30);
         login.setBackground(Color.black);
         login.setForeground(Color.white);
         login.addActionListener(this);
         add(login);
          clear = new JButton("CLEAR");
         clear.setBounds(430,300,100,30);
         clear.setBackground(Color.black);
         clear.setForeground(Color.white);
         clear.addActionListener(this);
         add(clear);
          signup = new JButton("SIGN UP");
         signup.setBounds(300,350,230,30);
         signup.setBackground(Color.black);
         signup.setForeground(Color.white);
         signup.addActionListener(this);
         add(signup);
         getContentPane().setBackground(Color.WHITE);
         setSize(800,480);//Length of the frame 
         setVisible(true);//
         setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae)
    {
       if (ae.getSource() == clear)
       {
         cardTextField.setText("");
         pinTextField.setText("");
       }
       else if(ae.getSource()==login)
       {
           Conn conn = new Conn();
           String cardnumber = cardTextField.getText();
           String pinnumber = pinTextField.getText();
           String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
           try{
               ResultSet rs = conn.s.executeQuery(query);
               if(rs.next())
               {
                   setVisible(false);
                   new Transactions(pinnumber).setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Incorrect card Number or Pin");
               }
           }catch(Exception e)
           {
               System.out.println(e);
               
           }
       }
       else if(ae.getSource()==signup)
       {
           setVisible(false);
           new SingupOne().setVisible(true);
       }
    }
    public static void  main(String args[])
    {
        new Login();//we are creating an object for the class when we run the class it calls the main function then it calls the object then we have to create an constructor.
    }   
}
