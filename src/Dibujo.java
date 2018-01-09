import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Dibujo extends Canvas{
	public Dibujo(){
		
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		g.setColor(Color.RED);
		g.fillRect(10, 10, 30, 50);
		
		g.setColor(Color.GREEN);
		g.drawRect(30, 10, 40, 100);
		
		g.setColor(Color.BLUE);
		g.drawLine(3, 12, 79, 200);
		
	}

}
