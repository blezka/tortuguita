package comp.logo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;

@SuppressWarnings("serial")
public class Tortuguita extends JFrame
{
	JTextArea history;
	JTextArea command;
	public static void main(String ... s)
	{
		Tortuguita tortu = new Tortuguita();
		tortu.repaint();
	}
	public Tortuguita()
	{
		super("Tortuguita");
		this.setSize(800,600);
		this.setPreferredSize(new Dimension(800,600));
//		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Helper.transp);
		
		panelTuga panT = new panelTuga();
		panT.setBackground(Helper.transp);

		history = new JTextArea(5,10);
		history.setBackground(new Color(190,190,190));
		history.setEditable(false);
		JScrollPane jspanHist = new JScrollPane(history);
		command = new JTextArea();
		command.addKeyListener(new myKey(this, panT));
		command.setSize(800,50);

		JPanel panelcito = new JPanel();
		panelcito.setLayout(new BorderLayout());
		panelcito.add(jspanHist, BorderLayout.PAGE_START);
		panelcito.add(command, BorderLayout.PAGE_END);
				
		this.getContentPane().add(panT);
		this.add(panelcito, BorderLayout.PAGE_END);
		
		this.pack();
	}
	
}
@SuppressWarnings("serial")
class panelTuga extends JPanel
{
	private Image tuga;
	myPoint posActual;
	public panelTuga()
	{
		super();
		setBackground(Helper.transp);
		this.setLayout(null);
		this.setLocation(0,0);
		tuga = this.getToolkit().getImage("src/turti.png");
		posActual = Helper.add(new myPoint(Helper.centerX,Helper.centerY));
	}
	public void paint(Graphics g)
	{
		   super.paintComponent(g);

		   posActual = new myPoint(Helper.centerX,Helper.centerY);
		   for (int i = 0 ; i < Helper.getPuntos().size(); i++)
				{
					myPoint siguiente = Helper.getPuntos().get(i);
			   		g.setColor(siguiente.getLinecolor());
			   		g.drawArc(siguiente.X()-siguiente.getRadius()/2, siguiente.Y()-siguiente.getRadius()/2, siguiente.getRadius(),siguiente.getRadius(), siguiente.getAngleStart(), siguiente.getAngleEnd());
					g.drawLine(posActual.X(), posActual.Y(), siguiente.X(), siguiente.Y());
					posActual = siguiente;
				}

		     Graphics2D g2d = (Graphics2D)g;
		     AffineTransform origXform = g2d.getTransform();
		     AffineTransform newXform = (AffineTransform)(origXform.clone());
		     //center of rotation is center of the panel
//		     int xRot = this.getWidth()/2;
//		     int yRot = this.getHeight()/2;
		     //center turtle
		     newXform.rotate(Math.toRadians(Helper.getAngle()), posActual.X(), posActual.Y());
		     g2d.setTransform(newXform);
		     //draw image centered in panel
//		     int x = (getWidth() - tuga.getWidth(this))/2;
//		     int y = (getHeight() - tuga.getHeight(this))/2;
//		     g2d.drawImage(tuga, x, y, this);
		     
			g2d.drawImage(tuga, posActual.X()-tuga.getWidth(this)/2, posActual.Y()-tuga.getHeight(this)/2, this);		     
		    g2d.setTransform(origXform);


	}
	public void update(Graphics g)
	{
		paint(g);
	}
	
}

class myKey implements KeyListener
{
	Tortuguita t;
	panelTuga panT;
	public myKey(Tortuguita t, panelTuga panT)
	{
		this.t = t;
		this.panT = panT;
	}
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER )
		{
			t.command.setText("");	
		}
		t.repaint();
	}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER )
		{			
			t.history.setText(t.history.getText()+"\n\r"+Compiler.Compile(t.command.getText().toUpperCase()));
		}
	}
	public void keyTyped(KeyEvent e) {}	
}
