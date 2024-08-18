
package bankManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,
       pinTextField;   
    JButton next;
    JRadioButton male, female,other,married,nonmarried;
    JDateChooser dateChooser; 
    
    SignupOne(){
        setLayout(null);
        
        Random ran =new Random();
         random =Math.abs((ran.nextLong()%9000L)+1000L);
        
        
        JLabel formno= new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD, 38));
        formno.setForeground(Color.WHITE);
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails= new JLabel("Page 1:Personal Details");
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
        
        JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setForeground(Color.WHITE);
        name.setBounds(100,150,100,30);
        image.add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        nameTextField.setBounds(300,150,400,30);
        
        add(nameTextField);
        
        
        
        JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setForeground(Color.WHITE);
        fname.setBounds(100,190,200,30);
        image.add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        
         JLabel dob=new JLabel("Date Of Birth:");
         dob.setForeground(Color.WHITE);
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        image.add(dob);
        
       dateChooser =new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.red);
        image.add(dateChooser);
        
         JLabel gender=new JLabel("Gender: ");
         gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        image.add(gender);
        
        male =new JRadioButton("Male");
        
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        image.add(male);
        
       female =new JRadioButton("Female");
     
        female.setBounds(450,290,80,30);
        female.setBackground(Color.white);
        image.add(female);
        
        ButtonGroup gendergroup= new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        
            JLabel email=new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setForeground(Color.WHITE);
        email.setBounds(100,340,200,30);
        image.add(email);
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
       
        
        
            JLabel marital=new JLabel("Marital Status:");
            marital.setForeground(Color.WHITE);
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        image.add(marital);
        
        married =new JRadioButton("Married");
       
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        image.add(married);
        
         nonmarried =new JRadioButton("Unmarried");
         
        nonmarried.setBounds(450,390,100,30);
        nonmarried.setBackground(Color.white);
        image.add(nonmarried);
        
        
         other =new JRadioButton("Other");
         
         other.setBounds(600,390,100,30);
        other.setBackground(Color.white);
        image.add(other);
        
        ButtonGroup maritalgroup= new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(nonmarried);
        maritalgroup.add(other);
        
        
        
        
        
            JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        address.setForeground(Color.WHITE);
        image.add(address);
        
          addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        
        
        
        
            JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setForeground(Color.WHITE);
        city.setBounds(100,490,200,30);
        image.add(city);
        
          cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
        
            JLabel state=new JLabel("State: ");
            state.setForeground(Color.WHITE);
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        image.add(state);
        
          stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        
            JLabel pin=new JLabel("Pin Code: ");
            pin.setForeground(Color.WHITE);
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,590,200,30);
        image.add(pin);
        
          pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
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
    String formno = ""+random; //long
    String name = nameTextField.getText();
    String fname= fnameTextField.getText();
    String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if(male.isSelected()){
        gender="Male";
        
    }else if(female.isSelected()){
        gender="Female";
    }
    String email = emailTextField.getText();
    String marital =null;
    if(married.isSelected()){
        marital= "Married";
    }else if(nonmarried.isSelected()){
        marital="Unmarried";
    }else if(other.isSelected()){
        marital="Other";
    }
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pin =pinTextField.getText();
    
    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is Required");
        }else {
            Conn c= new Conn();
            String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
           c.s.executeUpdate(query);
           
           setVisible(false);
           new SignupTwo(formno).setVisible(true);
           
        }
        
    }catch (Exception e){
        System.out.println(e);
    }
}

    
    public static void main(String args[]){
        
        new SignupOne();
    }
    
}
