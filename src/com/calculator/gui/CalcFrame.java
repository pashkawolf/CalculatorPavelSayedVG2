package com.calculator.gui;

import javax.swing.*;

import com.calculator.interfaceimplementations.CalculatorAdvancedOperation;
import com.calculator.interfaceimplementations.CalculatorBasicOperation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalcFrame extends JFrame {
    JTextArea display= new JTextArea();
    JPanel buttonPanel = new JPanel(new GridLayout(5,3));
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonSum = new JButton("+");
    JButton buttonBack = new JButton("C");
    JButton buttonDivide = new JButton("/");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("*");
    JButton buttonStart = new JButton("=");
    JButton buttonCos = new JButton("Cos");
    JButton buttonSin = new JButton("Sin");
    JButton buttonLog = new JButton("Log");
    JButton buttonSqrt = new JButton("Sqrt");
    JButton buttonTan = new JButton("Tan");
    int firstValue = 0;
    CalculatorBasicOperation calbas=new CalculatorBasicOperation();
    CalculatorAdvancedOperation caladv = new CalculatorAdvancedOperation();
    String operation = "";
    
    
    
    
    public CalcFrame() {
        setBounds(300, 300, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"9");
            }
        });
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                
					try {
						display.setText(temp.substring(0,temp.length()-1));
					} catch (StringIndexOutOfBoundsException e1) {
					}
				
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                operation = "+";
             // display.setText("");
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                operation = "*";
                display.setText("");
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                operation = "/";
                display.setText("");
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
					firstValue = Integer.valueOf(display.getText().toString());
				} catch (NumberFormatException e1) {
					
				}
                display.setText("");
                operation = "-";
                
            }
        });
        buttonCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText().toString());
                operation = "Cos";
             // display.setText("");
            }
        });
        buttonSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
               // display.setText("");
                operation = "Sin";
            }
        });
        buttonLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                operation = "Log";
             // display.setText("");
            }
        });
        buttonSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                operation = "Sqrt";
             // display.setText("");
            }
        });
        buttonTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue = Integer.valueOf(display.getText());
                operation = "Tan";
             // display.setText("");
            }
        });
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.valueOf(display.getText().toString());
                if("+".equals(operation)){
                    display.setText(String.valueOf(calbas.add(firstValue, secondValue)));
                }
                if("-".equals(operation)){
                	display.setText(String.valueOf(calbas.sub(firstValue, secondValue)));
                }
                if("*".equals(operation)){
                	display.setText(String.valueOf(calbas.mul(firstValue, secondValue)));
                }
                if("/".equals(operation)){
                	display.setText("");
                	display.setText(String.valueOf(calbas.div(firstValue, secondValue)));
                }
                if("Cos".equals(operation)){
                	display.setText(String.valueOf(caladv.cos(firstValue)));
                }
                if("Sin".equals(operation)){
                	display.setText(String.valueOf(caladv.sin(firstValue)));
                 }
                if("Log".equals(operation)){
                	display.setText(String.valueOf(caladv.log(firstValue)));
                 }
                if("Sqrt".equals(operation)){
                	display.setText(String.valueOf(caladv.sqrt(firstValue)));
                 }
                if("Tan".equals(operation)){
                	display.setText(String.valueOf(caladv.tan(firstValue)));
                 }
                firstValue = 0;
                operation = "+";
            }
        });
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel,BorderLayout.CENTER);
        add(buttonStart,BorderLayout.SOUTH);
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);
        buttonPanel.add(buttonCos);
        buttonPanel.add(buttonSin);
        buttonPanel.add(buttonLog);
        buttonPanel.add(buttonSqrt);
        buttonPanel.add(buttonTan);
        

        setVisible(true);
    }
    
}

