
package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class MiniStatement extends JFrame{
    
    
    MiniStatement(String pinnumber){
        setTitle("Mini Statement");
        
        setLayout(null);
        
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/sbilogo.png"));
        Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label =new JLabel(i3);
        label.setBounds(70 ,10,70,70);
        add(label);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image i5 =i4.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0,0,400,500);
        add(image);
        
        JLabel mini =new JLabel();
        mini.setBounds(20,140,400,200);
        mini.setForeground(Color.WHITE);
        image.add(mini);
        
        JLabel bank = new JLabel("State Bank Of India");
        bank.setBounds(150,20,200,30);
        bank.setForeground(Color.WHITE);
        image.add(bank);
        
        JLabel card= new JLabel();
        card.setBounds(20,80,300,20);
        card.setForeground(Color.WHITE);
        image.add(card);
        
        JLabel balance =new JLabel();
        balance.setBounds(20,400,300,20);
        bank.setForeground(Color.WHITE);
        image.add(balance);
        
        try {
            Conn conn = new Conn();
            ResultSet rs=conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: "+rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12,16));
            }
        }catch(Exception e){
            
            System.out.println(e);
        }
        try {
            Conn conn = new Conn();
            ResultSet rs=conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while(rs.next()){
               mini.setText(mini.getText()+ "<html>" + rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
            }
        }catch(Exception e){
            
            System.out.println(e);
        }
        setSize(400,500);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
   }
    
    
    public static void main(String args[]){
        new MiniStatement("");
        
        
    }
    
}
