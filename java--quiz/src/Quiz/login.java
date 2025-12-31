package Quiz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class login extends JFrame implements ActionListener{

    JButton rules, back;
    JTextField tfname;
    //Constructor
    login(){
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        //Main heading
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        //Enter Name
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        //Text Field box
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        name.setFont(new Font("Times new roman", Font.BOLD, 18));
        add(tfname);


        //Button
        rules = new JButton("rules");
        rules.setBounds(735,270,120,25);
        rules.setForeground(new Color(30,144,254));
        rules.addActionListener(this);
        add(rules);
        
        
        //Back Button
        back = new JButton("back");
        back.setBounds(915,270,120,25);
        back.setForeground(new Color(30,144,254));
        back.addActionListener(this);
        add(back);


        
        setSize(1200,500);
        setVisible(true);
        setLocation(100,150);
    }
    

    public static void main(String[] args) {
        new login();

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == rules)
        {
            String name = tfname.getText();
            setVisible(false);
            new rules(name);
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
        }
    }
}
