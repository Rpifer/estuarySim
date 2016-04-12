package bounceExample;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Estuary {
	int x;
	int y;
	int sizeX;
	int sizeY;
	public BufferedImage image;
	public Estuary(int x, int y){
		this.x = x;
		this.y = y;
		this.sizeX = 1500;
		this.sizeY = 1000;
		try {                
	          image = ImageIO.read(new File("./img/Estuary.png"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
	    }
	}

