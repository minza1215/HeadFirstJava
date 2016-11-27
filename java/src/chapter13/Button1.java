package chapter13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 {
	public static void main(String[] args){
		Button1 gui = new Button1();
		gui.go();
	}
	
	public void go(){
		JFrame frame = new JFrame();
		JButton east = new JButton("悼率");
		JButton west = new JButton("辑率");
		JButton north = new JButton("合率");
		JButton south = new JButton("巢率");
		JButton center = new JButton("吝居");
		
		frame.getContentPane().add(BorderLayout.EAST, east);
		frame.getContentPane().add(BorderLayout.WEST, west);
		frame.getContentPane().add(BorderLayout.NORTH, north);
		frame.getContentPane().add(BorderLayout.SOUTH, south);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
