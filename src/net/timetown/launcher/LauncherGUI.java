package net.timetown.launcher;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.jna.platform.WindowUtils;

public class LauncherGUI extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LauncherGUI().setVisible(true);
	}
	
	
	
	public LauncherGUI() {
//		this.setOpacity(0.8f);
//		
		this.setBounds(100, 100, 1024, 768);
		
		this.setLayout(new BorderLayout());
		System.setProperty("sun.java2d.noddraw","true");  
//		WindowUtils.setWindowAlpha(this, 0.5f);
		
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.setOpaque(false);
		this.add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel(new ImageIcon("img/bg.png"));
		
		panel.add(label, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
