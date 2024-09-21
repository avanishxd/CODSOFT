package com.jframe_swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Atm extends User implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;

    JTextField text;

    JLabel label2; // Use the instance variable

    public int with;
    public int depo;
    public int temp_bal;

    public static void main(String[] args) {
        new Atm().myGUI();
    }

    private void myGUI() {
        Border border = BorderFactory.createLineBorder(Color.black, 3);

        text = new JTextField();
        text.setBounds(20, 200, 300, 40);

        // Panel 1 body panel
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.decode("#fffacd"));
        panel1.setLayout(null);
        panel1.setBounds(0, 150, 586, 412);
        panel1.setBorder(border);

        // Panel 2 - Header panel
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.decode("#87ceeb"));
        panel2.setLayout(null);
        panel2.setBorder(border);
        panel2.setBounds(0, 0, 586, 151);

        // Label 1 - ATM heading
        JLabel label1 = new JLabel();
        label1.setText("ATM");
        label1.setFont(new Font("Comic Sans", Font.BOLD, 80));
        label1.setBounds(200, 30, 200, 80);

        // Label 2 - Printing Purpose
        label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.decode("#636363"));
        label2.setForeground(Color.WHITE);
        label2.setText("Welcome to the ATM!");
        label2.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER); 
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.CENTER);
        label2.setBorder(border);
        label2.setBounds(20, 50, 300, 120);

        // Button 1 - withdraw
        button1 = new JButton("Withdraw Amount");
        button1.setBounds(360, 50, 150, 60);
        button1.setFocusable(false);
        button1.addActionListener(this);

        // Button 2 - deposit
        button2 = new JButton("Deposit Amount");
        button2.setBounds(360, 150, 150, 60);
        button2.setFocusable(false);
        button2.addActionListener(this);

        // Button 3 - balance
        button3 = new JButton("Check Balance");
        button3.setBounds(360, 250, 150, 60);
        button3.setFocusable(false);
        button3.addActionListener(this);

        // Frame
        JFrame frame = new JFrame("ATM Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.decode("#ffffff"));

        // Adding
        frame.add(panel1);
        frame.add(panel2);
        panel2.add(label1);
        panel1.add(label2); 
        panel1.add(text);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            with = Integer.parseInt(text.getText());
            Withdraw();
        }
        
        if (e.getSource() == button2) {
            depo = Integer.parseInt(text.getText());
            Deposit();
        }
        
        if (e.getSource() == button3) {
            Balance();
        }
    }

    public void Withdraw() {
        temp_bal = getBal();
        if (temp_bal > with && with != 0) {
        	
            label2.setText("<html>Withdrawal Processing...</html>");
            temp_bal = temp_bal - with;
            setBal(temp_bal);
            label2.setText("<html>Withdrawal Success!</html>");
        } 
        else {
            label2.setText("<html>Please Enter Valid Amount!</html>");
        }
    }
    
    public void Deposit() {
    	if(depo!=0) {
    		
    		label2.setText("<html>Deposition Processing...</html>");
    		temp_bal = getBal();
    		temp_bal = temp_bal + depo;
    		setBal(temp_bal);
    		label2.setText("<html>Deposit Success!</html>");
    	}
    	else {
            label2.setText("<html>Please Enter Valid Amount!</html>");
        }
    	
    }
    
    public void Balance() {
    	temp_bal = getBal();
    	label2.setText("<html>Account Balance: "+temp_bal+"/-</html>");
    }
}
