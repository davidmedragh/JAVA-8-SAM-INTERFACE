package com.dmedragh.tutorials;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MaFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MaFrame() {
		JFrame frame = new JFrame("Lambda expression Jframe");
		frame.getContentPane().setLayout(new FlowLayout());
		JButton button = new JButton("click moi");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("J'ai été cliqué");
			}
		});
		button.addActionListener(e -> System.out.println("J'ai été cliqué"));
		frame.getContentPane().add(button);
		frame.pack();
	    frame.setVisible(true);
	}

}
