import java.awt.EventQueue;
import javax.swing.event.*;

import org.antlr.v4.gui.TreeViewer;

import gen.MyVisitor;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class menu {

	private JFrame frame;
	private JTextField resultField;
	//private JTextField anserField;
	//private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,sub,multiply,div,equals;
	public String sanswer=null,stemp1="",stemp2="";
	public double answer=0.0;
	public boolean ss=true,dec=false;
	public char operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String piku=".3";
					System.out.println(Double.parseDouble(piku)+1.0);
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//menu obj = new menu();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 651, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="1";resultField.setText(stemp1);}
				else {stemp2+="1";resultField.setText(stemp2);}
			}
		});
		button1.setBounds(45, 140, 115, 25);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="2";resultField.setText(stemp1);}
				else {stemp2+="2";resultField.setText(stemp2);}
			}
		});
		button2.setBounds(185, 140, 115, 25);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="3";resultField.setText(stemp1);}
				else {stemp2+="3";resultField.setText(stemp2);}
			}
		});
		button3.setBounds(320, 140, 115, 25);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="4";resultField.setText(stemp1);}
				else {stemp2+="4";resultField.setText(stemp2);}
			}
		});
		button4.setBounds(45, 180, 117, 25);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="5";resultField.setText(stemp1);}
				else {stemp2+="5";resultField.setText(stemp2);}
			}
		});
		button5.setBounds(185, 180, 115, 25);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="6";resultField.setText(stemp1);}
				else {stemp2+="6";resultField.setText(stemp2);}
			}
		});
		button6.setBounds(320, 180, 115, 25);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="7";resultField.setText(stemp1);}
				else {stemp2+="7";resultField.setText(stemp2);}
			}
		});
		button7.setBounds(45, 217, 117, 25);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="8";resultField.setText(stemp1);}
				else {stemp2+="8";resultField.setText(stemp2);}
			}
		});
		button8.setBounds(185, 217, 117, 25);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="9";resultField.setText(stemp1);}
				else {stemp2+="9";resultField.setText(stemp2);}
			}
		});
		button9.setBounds(320, 217, 117, 25);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="0";resultField.setText(stemp1);
				//if(stemp2=="")num1.setText("num1 : "+stemp1);
				}
				else {stemp2+="0";resultField.setText(stemp2);
				//if(stemp1!="")num2.setText("num2 : "+stemp2);
				}
			}
		});
		button0.setBounds(183, 254, 117, 25);
		frame.getContentPane().add(button0);
		
		/*JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});*/
		JButton buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+=".";resultField.setText(stemp1);}
				else {stemp2+=".";resultField.setText(stemp2);}
			}
		});
		buttonDecimal.setBounds(320, 254, 117, 25);
		frame.getContentPane().add(buttonDecimal);
		
		
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="+";resultField.setText(stemp1);}
				else {stemp2+="+";resultField.setText(stemp2);}
			}
		});
		buttonAdd.setBounds(45, 304, 117, 25);
		frame.getContentPane().add(buttonAdd);
		
		JButton buttonSub = new JButton("-");
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="-";resultField.setText(stemp1);}
				else {stemp2+="-";resultField.setText(stemp2);}
			}
		});
		buttonSub.setBounds(185, 304, 117, 25);
		frame.getContentPane().add(buttonSub);
		
		JButton buttonMul = new JButton("*");
		buttonMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ss){stemp1+="*";resultField.setText(stemp1);}
				else {stemp2+="*";resultField.setText(stemp2);}
			}
		});
		buttonMul.setBounds(318, 304, 117, 25);
		frame.getContentPane().add(buttonMul);
		
		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ss){stemp1+="/";resultField.setText(stemp1);}
				else {stemp2+="/";resultField.setText(stemp2);}
			}
		});
		buttonDiv.setBounds(469, 304, 117, 25);
		frame.getContentPane().add(buttonDiv);
		
		JButton buttonMod = new JButton("%");
		buttonMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ss){stemp1+="%";resultField.setText(stemp1);}
				else {stemp2+="%";resultField.setText(stemp2);}
			}
		});
		buttonMod.setBounds(469, 350, 117, 25);
		frame.getContentPane().add(buttonMod);
		
		JButton buttonOpen = new JButton("(");
		buttonOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+="(";resultField.setText(stemp1);}
				else {stemp2+="(";resultField.setText(stemp2);}
			}
		});
		buttonOpen.setBounds(45, 350, 117, 25);
		frame.getContentPane().add(buttonOpen);
		
		JButton buttonClose = new JButton(")");
		buttonClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ss){stemp1+=")";resultField.setText(stemp1);}
				else {stemp2+=")";resultField.setText(stemp2);}
			}
		});
		buttonClose.setBounds(185, 350, 117, 25);
		frame.getContentPane().add(buttonClose);
		
		JButton buttonNeg = new JButton("neg");
		buttonNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ss){stemp1+="$";resultField.setText(stemp1);}
				else {stemp2+="$";resultField.setText(stemp2);}
			}
		});
		buttonNeg.setBounds(318, 350, 117, 25);
		frame.getContentPane().add(buttonNeg);
		
		JButton buttonEq = new JButton("=");
		buttonEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("input: " + resultField.getText());
//				String text = "((5+(5/3)*4-6))";
//				System.out.println("text: " + text);
				String text = "";
				text = resultField.getText();
				
				int open = 0;
				int close = 0;
				for(int i=0; i<text.length(); i++){
					if(text.charAt(i) == '(')
						open++;
					else if(text.charAt(i) == ')')
						close++;
				}
				
				if(open != close){
					System.out.println("hehehhe");
					
					resultField.setText("ERROR");
					if(open > close){
						String msg = "mismatched input '<EOF>' expecting {NUMBER, ')'}";
						try {
							throw new Exception(msg);
						} catch (Exception e1) {
							 JOptionPane.showMessageDialog(null, "Error: " +  msg);
						}
					}
					else{
						String msg = "mismatched input '<EOF>' expecting {NUMBER, '('}";
						try {
							throw new Exception(msg);
						} catch (Exception e1) {
							 JOptionPane.showMessageDialog(null, "Error: " +  msg);
						}
					}
				}
				else{
					System.out.println("getting tree");
					MyVisitor mv = new MyVisitor(text);
					
	//				
					float temp = (float) 0.0;
				    try{
					
				    	temp = mv.visit(mv.getTree());
				    }catch(Exception ex){
			            System.out.println("error here");
			            mv.setError(true);
			        }
				    
	//			    try{
	//				    TreeViewer viewr = new TreeViewer(Arrays.asList(mv.getParser().getRuleNames()), mv.getTree());
	//					viewr.setScale(1.5);
	//				    viewr.open();
	//				    
	//					}catch(Exception ex){
	//			            System.out.println("error here");
	//			            JOptionPane.showMessageDialog(null, "Error: Invalid input!");
	//			            mv.setError(true);
	//			        }
				    
				    
				    System.out.println("error? " + mv.getIsError());
				    if (mv.getIsError())
				    	resultField.setText("ERROR");
				    else{
				    	resultField.setText(temp + "");
				    	TreeViewer viewr = new TreeViewer(Arrays.asList(mv.getParser().getRuleNames()), mv.getTree());
						viewr.setScale(1.5);
					    viewr.open();
				    }
			    
			    
			    
				}
			    		
			    
			    
			    
			    
				
			}
		});
		buttonEq.setBounds(497, 180, 117, 25);
		frame.getContentPane().add(buttonEq);
		
		resultField = new JTextField();
		resultField.setFont(new Font("Accanthis ADF Std", Font.BOLD, 15));
		resultField.setEditable(false);
		resultField.setBounds(46, 36, 389, 66);
		frame.getContentPane().add(resultField);
		resultField.setColumns(10);
		
		
		
		JButton buttonX = new JButton("X");
		buttonX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stemp1 = "";
				stemp2 = "";
				resultField.setText("");
				
			}
		});
		buttonX.setBounds(497, 56, 117, 25);
		frame.getContentPane().add(buttonX);
		
		
		
	}
}