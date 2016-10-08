/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class NameSurfer extends ConsoleProgram implements NameSurferConstants {

/* Method: init() */
/**
 * This method has the responsibility for reading in the data base
 * and initializing the interactors at the bottom of the window.
 */
	public void init() {
	    
		//initializing interactors 
		label = new JLabel ("Name"); 
		add(label, SOUTH);
		nameField = new JTextField(20);
		add(nameField, SOUTH);
		nameField.addActionListener(this);
		
		
		graph = new JButton ("Graph");
		add(graph, SOUTH);
		
		clear = new JButton ("Clear");
		add(clear,SOUTH);
	
		addActionListeners();

	}

/* Method: actionPerformed(e) */
/**
 * This class is responsible for detecting when the buttons are
 * clicked, so you will have to define a method to respond to
 * button actions.
 */
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == nameField){
			println("Graph enter:" + nameField.getText() );
		}
		
		String cmd = e.getActionCommand();
		
		if(cmd.equals("Graph")){
			println("Graph button:" + nameField.getText());
		}
		
		if(cmd.equals("Clear")){
			println("Clear");
		}
		
		

		
		
	}
	
	
	
	/*instance variables*/
	
	//variable for name label
	private JLabel label;
	
	//variable for textfield
	private JTextField nameField;
	
	//variable for graph button (graph is an object!)
	private JButton graph;
	
	//variable for clear button (clear is an object!)
	private JButton clear;
	

	
}
