
package bankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;




public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
     SignupThree(String formno){
         this.formno= formno;
         
         setLayout(null);
         JLabel l1 = new JLabel("Page 3: Account Details");
         l1.setForeground(Color.WHITE);
         l1.setFont(new Font("Raleway",Font.BOLD,22));
         l1.setBounds(280,40,400,40);
         add(l1);
         
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image i2 =i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,850,800);
        add(image);
         
         
         JLabel status= new JLabel("Status");
         status.setForeground(Color.WHITE);
         status.setFont(new Font("Raleway", Font.BOLD,22));
         status.setBounds(100,140,200,30);
         image.add(status);
         
         r1= new JRadioButton("Non-Resident Indian(NRI)");
         r1.setBounds(100,180,230,20);
        
         image.add(r1);
         
         r2= new JRadioButton("Indian");
         r2.setBounds(350,180,230,20);
         
         image.add(r2);
                 
                 
         r3= new JRadioButton("Overseas Citizen of India");
         r3.setBounds(100,220,230,20);
        
         image.add(r3);   
         
                
         r4= new JRadioButton("Foreign Tourist");
         r4.setBounds(350,220,230,20);
         
         image.add(r4); 
         
         
         
         setSize(850,820);
         setLocation(350,0);
         setVisible(true);
         
         
         ButtonGroup groupaccount= new ButtonGroup();
         groupaccount.add(r1);
         groupaccount.add(r2);
         groupaccount.add(r3);
         groupaccount.add(r4);

         JLabel card =new JLabel("Card Number");
         card.setFont(new Font("Raleway",Font.BOLD,22));
         card.setBounds(100,280,200,30);
         card.setForeground(Color.WHITE);
         image.add(card);
         
         JLabel number =new JLabel("XXXX-XXXX-4104");
         number.setFont(new Font("Raleway",Font.BOLD,22));
         number.setBounds(330,280,200,30);
         number.setForeground(Color.WHITE);
         image.add(number);
         
         JLabel pin =new JLabel("PIN:");
         pin.setFont(new Font("Raleway",Font.BOLD,22));
         pin.setBounds(100,330,200,30);
         pin.setForeground(Color.WHITE);
         image.add(pin);
         
         JLabel pnumber =new JLabel("XXXX");
         pnumber.setFont(new Font("Raleway",Font.BOLD,22));
         pnumber.setBounds(330,330,300,30);
         pnumber.setForeground(Color.WHITE);
         image.add(pnumber);
         
         JLabel pindetail =new JLabel("Your 4 digit password");
         pindetail.setFont(new Font("Raleway",Font.BOLD,12));
         pindetail.setForeground(Color.WHITE);
         pindetail.setBounds(100,350,300,20);
         image.add(pindetail);
         
          JLabel carddetail =new JLabel("Your 16 digit Card Number");
          carddetail.setForeground(Color.WHITE);
         carddetail.setFont(new Font("Raleway",Font.BOLD,12));
         carddetail.setBounds(100,300,300,20);
         image.add(carddetail);
         
           JLabel services =new JLabel("Services Required:");
           services.setForeground(Color.WHITE);
         services.setFont(new Font("Raleway",Font.BOLD,22));
         services.setBounds(100,400,200,30);
         image.add(services);
         
         
         c1 =new JCheckBox("ATM CARD");
         
         c1.setFont(new Font("Raleway",Font.BOLD,16));
         c1.setBounds(100,450,200,30);
         image.add(c1);
         
         c2 =new JCheckBox("Internet Banking");
         
       
         c2.setFont(new Font("Raleway",Font.BOLD,16));
         c2.setBounds(350,450,200,30);
         image.add(c2);
         
         c3 =new JCheckBox("Mobile Banking");
        
         c3.setFont(new Font("Raleway",Font.BOLD,16));
         c3.setBounds(100,500,200,30);
         image.add(c3);
         
         
         c4 =new JCheckBox("Email & SMS alerts");
        
         c4.setFont(new Font("Raleway",Font.BOLD,16));
         c4.setBounds(350,500,200,30);
         image.add(c4);
         
         
         c5 =new JCheckBox("Cheque Book");
         
         c5.setFont(new Font("Raleway",Font.BOLD,16));
         c5.setBounds(100,550,200,30);
         image.add(c5);
         
         
         c6 =new JCheckBox("E-statement");
       
         c6.setFont(new Font("Raleway",Font.BOLD,16));
         c6.setBounds(350,550,200,30);
         image.add(c6);
         
         
         c7 =new JCheckBox("I hereby that the above entered details are correct to the best of my knowledge");
     
         c7.setFont(new Font("Raleway",Font.BOLD,16));
         c7.setBounds(100,600,700,30);
         image.add(c7);
         
         
         submit =new JButton("Submit");
         submit.setBackground(Color.BLACK);
         submit.setForeground(Color.WHITE);
         submit.setBounds(250,650,100,30);
         submit.setFont(new Font("Raleway",Font.BOLD,14));
         submit.addActionListener(this);
         image.add(submit);
         
         cancel =new JButton("Cancel");
         cancel.setBackground(Color.BLACK);
         cancel.setForeground(Color.WHITE);
         cancel.setBounds(420,650,100,30);
         cancel.setFont(new Font("Raleway",Font.BOLD,14));
         cancel.addActionListener(this);
         image.add(cancel);
         
         
         getContentPane().setBackground(Color.WHITE);
         
         
     }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== submit){
             String status=null;
             if(r1.isSelected()){
                 status="Non-Resident Indian(NRI)";
             }else if(r2.isSelected()){
                 status="Indian";
             }else if(r3.isSelected()){
                 status="Overseas Citizen of India";
             }else if(r4.isSelected()){
                 status="Foreign Tourist";
             } 
             Random random = new Random();
             String cardnumber = ""+Math.abs((random.nextLong()% 90000000L)+ 9162093400000000L);
             String pinnumber= ""+Math.abs((random.nextLong()%9000L)+1000L);
             
             String facility= "";
             if(c1.isSelected()){
                 facility= facility +  " ATM Card";
             }else if (c2.isSelected()){
                 facility =facility + "Internet Banking";
             }
             else if (c3.isSelected()){
                 facility =facility + "Mobile Banking";
             }else if (c4.isSelected()){
                 facility =facility + "SMS & EMAIL Alerts";
             }else if (c5.isSelected()){
                 facility =facility + "Cheque Book";
             }else if (c6.isSelected()){
                 facility =facility + "E-statement";
             }
             
             try{
                 if(status.equals("")){
                     
                     JOptionPane.showMessageDialog(null,"Status is required");
                 }else{
                     Conn conn =new Conn();
                     String query1= "insert into signupthree values ('"+formno+"','"+status+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                     String query2= "insert into login values ('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                     
                     conn.s.executeUpdate(query2);
                     conn.s.executeUpdate(query1);
                     
                     JOptionPane.showMessageDialog(null," Card Number "+ cardnumber + "\n Pin: " + pinnumber);
                  
                     setVisible(false);
                     new Deposit(pinnumber).setVisible(false);
                 
                 }
                 
             }catch (Exception e){
                 System.out.println(e);
             }
         }else if (ae.getSource()== cancel){
               setVisible(false);
               new Login().setVisible(true);
             
         }
     }
     
    

    public static void main(String args[]){
        new SignupThree("");
    }
}
