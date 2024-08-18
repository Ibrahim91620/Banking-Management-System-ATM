package bankManagementSystem;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField panTextField, adhaarNoTextField;  
    JButton next;
    JRadioButton yes, no;
    JComboBox Religion,Category,Qualify,Income,Occupation,account;
    String formno;
     
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
      
               
               
        
        setTitle("New Account Opening form- Page 2");
       
        JLabel personDetails= new JLabel("Page 2: Additional Details ");
        personDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        personDetails.setForeground(Color.WHITE);
        personDetails.setBounds(290,80,400,40);
        add(personDetails);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image i2 =i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,850,800);
        add(image);
        
        JLabel religion=new JLabel("Religion");
        religion.setForeground(Color.WHITE);
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,150,100,30);
        image.add(religion);
        
        String valReligion[]= {"Hindu","Muslim","Sikh","Christian","Other"};
        
         Religion = new JComboBox(valReligion);
        Religion.setBounds(300,150,400,30);
        Religion.setBackground(Color.GRAY);
        image.add(Religion);
        
        
        JLabel category=new JLabel("Category:");
        category.setForeground(Color.WHITE);
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        image.add(category);
        
        String valcategory[]={"General", "OBC","SC","ST","Other"};
       
        Category=new JComboBox(valcategory);
        Category.setBounds(300,190,400,30);
        Category.setBackground(Color.GRAY);
        image.add(Category);
        
        
         JLabel income=new JLabel("Income:");
         income.setForeground(Color.WHITE);
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        image.add(income);
        
        String valIncome[]={"less than 1 lakh", "1 lakh to 2 lakh","more than 2 lakh"};
        Income=new JComboBox(valIncome);
       
        Income.setBounds(300,240,400,30);
        Income.setBackground(Color.GRAY);
        image.add(Income);
        
     
        
        
         JLabel educational=new JLabel("Educational");
         educational.setForeground(Color.WHITE);
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        image.add(educational);
        
     
        JLabel qualification=new JLabel("Qualification:");
        qualification.setForeground(Color.WHITE);
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        image.add(qualification);
        
        String valQualify[]={"Non-Gratuation", "Graduate","Post-Graduate","Doctorate","Others"};
       
        Qualify=new JComboBox(valQualify);
        Qualify.setBounds(300,315,400,30);
        Qualify.setBackground(Color.GRAY);
        image.add(Qualify);
        
         
        
       
        
        
            JLabel panno=new JLabel("Pan Number:");
            panno.setForeground(Color.WHITE);
        panno.setFont(new Font("Raleway",Font.BOLD,20));
        panno.setBounds(100,390,200,30);
        image.add(panno);
        
         panTextField = new JTextField();
        
        panTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        panTextField.setBounds(300,390,400,30);
        image.add(panTextField);
        
        
        
        
        
            JLabel adhaar=new JLabel("Aadhaar Number:");
           
        adhaar.setFont(new Font("Raleway",Font.BOLD,20));
        adhaar.setBounds(100,440,200,30);
        adhaar.setForeground(Color.WHITE);
        image.add(adhaar);
        
          adhaarNoTextField = new JTextField();
          
        adhaarNoTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        adhaarNoTextField.setBounds(300,440,400,30);
        add(adhaarNoTextField);
        
        
        
        
        
            JLabel citizenship=new JLabel("Senior Citizen: ");
           citizenship.setForeground(Color.WHITE);
        citizenship.setFont(new Font("Raleway",Font.BOLD,20));
        citizenship.setBounds(100,490,200,30);
        image.add(citizenship);
        
        
        
        yes =new JRadioButton("Yes");
        yes.setBounds(300,490,60,30);
        yes.setBackground(Color.white);
        image.add(yes);
        
        no=new JRadioButton("No");
        no.setBounds(450,490,60,30);
        no.setBackground(Color.white);
        image.add(no);
        
        
        ButtonGroup decision=new ButtonGroup();
        decision.add(yes);
        decision.add(no);
        
       
         JLabel type=new JLabel("Account Type:");
         type.setForeground(Color.WHITE);
        type.setFont(new Font("Raleway",Font.BOLD,20));
        type.setBounds(100,540,200,30);
        image.add(type);
        
          String accountval[]={"Saving A/c","Current A/c","Salary A/c","Fixed Deposit"};
        
         account=new JComboBox(accountval);
        account.setBounds(300,540,400,30);
        account.setBackground(Color.GRAY);
        image.add(account);
         
        
        
        
            JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,590,200,30);
        occupation.setForeground(Color.WHITE);
        image.add(occupation);
        
        String valOccupation[]={"Salaried", "Self Employed","Bussiness","Student","Others"};
        Occupation =new JComboBox(valOccupation);
        Occupation.setBounds(300,590,400,30);
       Occupation.setBackground(Color.GRAY);
      
        image.add(Occupation);
        
          
        
         next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        image.add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
}

public void actionPerformed(ActionEvent ae){
    String sreligion =(String) Religion.getSelectedItem();
    String scategory= (String) Category.getSelectedItem();
    String sincome= (String) Income.getSelectedItem();
    String soccupation= (String) Occupation.getSelectedItem();
    String saccount= (String) account.getSelectedItem();
    String seducation= (String) Qualify.getSelectedItem();
    
    String seniorcitizen = null;
    if(yes.isSelected()){
        seniorcitizen="Yes";
        
    }else if(no.isSelected()){
       seniorcitizen="No";
    }
    
     String span = panTextField.getText();
     String sadhaar= adhaarNoTextField.getText();
    
    
    try{
       
            Conn c= new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+soccupation+"','"+saccount+"','"+seducation+"','"+seniorcitizen+"','"+span+"','"+sadhaar+"')";
           c.s.executeUpdate(query);
           
           setVisible(false);
           new SignupThree(formno).setVisible(true);
     //signup
    }catch (Exception e){
        System.out.println(e);
    }
}

    
    public static void main(String args[]){
        
        new SignupTwo("");
    }
    
}
