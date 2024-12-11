/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managment.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class withdrawal extends JFrame implements ActionListener{
    JTextField amount;
    JButton  withdraw,back;
    String pinnumber;
    withdrawal(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter a amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);
        
         amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        image.add(amount);
        
        
        
         withdraw = new JButton("withdrawl");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
         back = new JButton("back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
      
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == withdraw)
        {
           String number = amount.getText();
           Date date = new Date();
           if(number.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
           }
           else
           {
               try {
               Conn conn = new Conn();
               String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawal','"+number+"')";
               conn.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs "+number+" withdraw Successfully");
               setVisible(false);
               new Transactions(pinnumber).setVisible(true);
               }catch (Exception e)
               {
                   System.out.println(e);
               }
           }
        }else if(ae.getSource()== back){
            setVisible(false);
           new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new withdrawal(" ");
    }
}
