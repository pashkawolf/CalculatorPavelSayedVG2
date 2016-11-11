package com.calculator.gui;

import javax.swing.*;

import com.calculator.interfaceimplementations.CalculatorAdvancedOperation;
import com.calculator.interfaceimplementations.CalculatorBasicOperation;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * CalcFrame extending JFrame implements ActionListener class
 * 
 */
public class CalcFrame extends JFrame implements ActionListener{
	/**
   	 *Defining new JtextArea()
   	 **/
    JTextArea display= new JTextArea();
    /**
   	 *Defining new JPanel()
   	 **/
    JPanel buttonPanel = new JPanel(new GridLayout(5,3));
    /**
   	 *Defining new JButtons for each button.
   	 **/
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
    /**
   	 *Defining firstValue to '0'
   	 **/
    int firstValue = 0;
    String temp = display.getText();
    /**
   	 *Setting  new operands .
   	 **/
    CalculatorBasicOperation calbas=new CalculatorBasicOperation();
    CalculatorAdvancedOperation caladv = new CalculatorAdvancedOperation();
    String operation = "";
    
    
    
    /**
   	 *Setting  grafical definitions for frames and button panel for each button.
   	 **/
    public CalcFrame() {
        setBounds(300, 300, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
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
        

        
        addActionListener();
        setVisible(true);
    }

    /**
	 *Defining ActionListener for each button.
	 **/
    public void addActionListener(){
    	button0.addActionListener(this);
    	button1.addActionListener(this);
    	button2.addActionListener(this);
    	button3.addActionListener(this);
    	button4.addActionListener(this);
    	button5.addActionListener(this);
    	button6.addActionListener(this);
    	button7.addActionListener(this);
    	button8.addActionListener(this);
    	button9.addActionListener(this);
    	buttonSum.addActionListener(this);
    	buttonSub.addActionListener(this);
    	buttonMul.addActionListener(this);
    	buttonBack.addActionListener(this);
    	buttonDivide.addActionListener(this);
    	buttonCos.addActionListener(this);
    	buttonSin.addActionListener(this);
    	buttonLog.addActionListener(this);
    	buttonSqrt.addActionListener(this);
    	buttonTan.addActionListener(this);
    	buttonStart.addActionListener(this);
		
	}
    /**
   	 *Defining ActionPerformed for each button.
   	 **/
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==buttonTan){
			firstValue = Integer.valueOf(display.getText());
			operation = "Tan";
		}
		if (e.getSource()==buttonSqrt){
			firstValue = Integer.valueOf(display.getText());
			operation = "Sqrt";
		}
		if (e.getSource()==buttonSin){
			firstValue = Integer.valueOf(display.getText());
			operation = "Sin";
		}
		if (e.getSource()==buttonCos){
			firstValue = Integer.valueOf(display.getText());
			operation = "Cos";
		}
		if (e.getSource()==buttonLog){
			firstValue = Integer.valueOf(display.getText());
			operation = "Log";
		}
		if (e.getSource()==button0){
			display.setText(display.getText() + "0");
		}
		if (e.getSource()==button1){
			display.setText(display.getText() + "1");
		}
		if (e.getSource()==button2){
			display.setText(display.getText() + "2");
		}
		if (e.getSource()==button3){
			display.setText(display.getText() + "3");
		}
		if (e.getSource()==button4){
			display.setText(display.getText() + "4");
		}
		if (e.getSource()==button5){
			display.setText(display.getText() + "5");
		}
		if (e.getSource()==button6){
			display.setText(display.getText() + "6");
		}
		if (e.getSource()==button7){
			display.setText(display.getText() + "7");
		}
		if (e.getSource()==button8){
			display.setText(display.getText() + "8");
		}
		if (e.getSource()==button9){
			display.setText(display.getText() + "9");
		}
		if (e.getSource()==buttonSum){
			firstValue = Integer.valueOf(display.getText());
			operation = "+";
			display.setText("");
		}
		if (e.getSource()==buttonSub){
			 try {
					firstValue = Integer.valueOf(display.getText().toString());
				} catch (NumberFormatException e1) {
					
				}
             operation = "-";
             display.setText("");
		}
		
		if (e.getSource()==buttonBack){
            
			try {
				display.setText("");
			} catch (StringIndexOutOfBoundsException e1) {
			}
		}
		if (e.getSource()==buttonDivide){
			firstValue = Integer.valueOf(display.getText());
			operation = "/";
			display.setText("");
		}
		if (e.getSource()==buttonMul){
			firstValue = Integer.valueOf(display.getText());
			operation = "*";
			display.setText("");
		}
		if (e.getSource()==buttonStart){
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
		}
		
	}
    


