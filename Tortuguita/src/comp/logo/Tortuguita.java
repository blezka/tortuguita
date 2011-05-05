package comp.logo;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.*;

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
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(10,10,243));
		
		panelTuga panT = new panelTuga();
		panT.setBackground(new Color(10,10,243));

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
class panelTuga extends JPanel
{
	private Image tuga;
	myPoint posActual;
	myPoint posFutur;
	public panelTuga()
	{
		super();
		setBackground(new Color(10,10,243));
		this.setLayout(null);
		this.setLocation(0,0);
		tuga = this.getToolkit().getImage("src/turti.png");
		posActual = new myPoint(375,200);
		posFutur = new myPoint(posActual.X(), posActual.Y());
	}
	public void paint(Graphics g)
	{
		g.drawLine(posActual.X(), posActual.Y(), posFutur.X(), posFutur.Y());
		g.drawImage(tuga,(int)(posFutur.getX()-tuga.getWidth(this)/2),(int)(posFutur.getY()-tuga.getWidth(this)/2),this);
	}
	public void update(Graphics g)
	{
		paint(g);
	}
	
}
class myPoint extends Point
{
	public myPoint(int x, int y)
	{
		super(x,y);
	}
	public int X() {return (int)super.getX();}
	public int Y() {return (int)super.getY();}
	public String toString()
	{return "[x="+getX()+",y="+getY()+"]";}
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
	}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER )
		{			
			t.history.setText(t.history.getText()+"\n\r"+Compiler.Compile(t.command.getText()));
		}
	}
	public void keyTyped(KeyEvent e) {}	
}
