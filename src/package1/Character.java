package package1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Character {
	
	public static int hunger = 50;
	public static String mood = "Happy";
	public static int age = 0;
	private String name;
	public static BufferedImage image1;
	public static BufferedImage image2;
	public static BufferedImage image3;
	
	public Character(){
		//this.name = name;
		try {
			this.image1 = ImageIO.read(new File("src\\package1\\sad.jpeg"));
			this.image2 = ImageIO.read(new File("src\\package1\\happy.jpg"));
			this.image3 = ImageIO.read(new File("src\\package1\\normal.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
