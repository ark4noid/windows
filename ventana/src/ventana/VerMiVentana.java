package ventana;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class VerMiVentana extends Frame {

	public VerMiVentana(String titulo) {
		super(titulo);
		this.setSize(500, 500);
		this.setLocation(100, 100);

		Color color = new Color(50, 80, 120);
		this.setBackground(color);
	}

	public VerMiVentana() {
		// TODO Auto-generated constructor stub
	}

	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(10, 300, 100, 100);
		g.setColor(Color.GREEN);
		g.fillRect(400, 30, 100, 100);
		g.setColor(Color.BLUE);
		g.drawLine(55, 40, 440, 400);
	}

}
