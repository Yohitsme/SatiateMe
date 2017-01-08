package package1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class General {
	
	public Scanner reader = new Scanner(System.in);
	public static JFrame frame = new JFrame("Satiate Me");
	JLabel label = new JLabel("Hunger: " + Character.hunger);
	public boolean run = true;
	JLabel imageLabel = new JLabel();
	public int count = 0;

	
	public General(){
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setFont(new Font("Verdana",1,20));
		
		JButton button1 = new JButton("FEED ME!");
		JPanel info = new JPanel();
		JPanel image = new JPanel();

		info.add(label);
		image.add(imageLabel);
		//imageLabel.setIcon(new ImageIcon(Character.image1));
		frame.add(button1, BorderLayout.PAGE_END);
		frame.add(info, BorderLayout.PAGE_START);
		frame.add(image, BorderLayout.CENTER);
		button1.addActionListener(new Button());
	}
	
	public void update(){
		label.setText("Hunger: " + Character.hunger);
		if (Character.hunger > 50){
			imageLabel.setIcon(new ImageIcon(Character.image1));
		} else if (Character.hunger < 50){
			imageLabel.setIcon(new ImageIcon(Character.image2));
		} else {
			imageLabel.setIcon(new ImageIcon(Character.image3));
		}
		count++;
		if (count % 1000000 == 0){
			Character.hunger++;
		}
	}
	
	public static void main(String args[]){
		General general = new General();
		//String name = general.reader.next();
		Character character = new Character();
		
		while (general.run == true){
			general.update();
		}
		
	}

}
