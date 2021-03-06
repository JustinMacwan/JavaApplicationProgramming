/**
 * File Name:       Client.java
 * Author:          Jusitn Macwan
 * Course:          CST8221 - JAP, Lab Section: 303
 * Assignment:      2, Part 2
 * Professor:       Svillen Ranev
 * Purpose:         This class is to build a simple
 *                  socket based client/server application.                 
 */

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * This class is responsible for launching the application.
 *  
 * @author Jusitn Macwan
 * @version 1
 * @see javax.swing.JFrame
 * @since 1.8.0_121
 */
public class Client {

	/**
	 * The main method to launch the frame.
	 * @param String[] args - command line arguments 
	 */
	public static void main(String[] args) { 
		ClientView view = new ClientView();
		
		/**
		 * The EventQueue.invokeLater method to invoke the frame.
		 * @param new Runnable - to run the frame 
		 */
		EventQueue.invokeLater(new Runnable() {

			/**
			 * The run method to run the frame. 
			 */
			public void run() {
				JFrame frame = new JFrame();
				frame.setTitle("Jusitn Macwan's Client");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setMinimumSize(new Dimension(610, 550));
                frame.add(view);
                frame.setVisible(true);
			}
		});

	}
}

