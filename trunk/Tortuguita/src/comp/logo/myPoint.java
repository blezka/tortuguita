package comp.logo;

import java.awt.Color;
import java.awt.Point;

public class myPoint extends Point
{
	private boolean penDown;
	private Color linecolor;
	private int radius;
	private int angleStart;
	private int angleEnd;
	private int size;


	private static final long serialVersionUID = 1L;
	public myPoint(int x, int y)
	{
		super(x,y);
		linecolor = Helper.penColor;
		penDown = Helper.penDown;
		size = Helper.penSize;
	}
	public myPoint(double x, double y)
	{
		this((int)x, (int)y);
	}	
	public myPoint(int x, int y, boolean penDown)
	{
		this(x,y);
		this.penDown = penDown;
	}
	public myPoint(int x, int y, Color color)
	{
		this(x,y);
		linecolor = color;
	}
	
	public myPoint(int x, int y,  int radius, int angleStart, int angleEnd)
	{
		this(x,y);
		this.radius = radius*2;
		this.angleStart = 90-angleStart;//90° porque se mide apartir del eje y no del x
		this.angleEnd = -angleEnd;
	}
	public boolean isPenDown() {
		return penDown;
	}
	public void setPenDown(boolean penDown) {
		this.penDown = penDown;
	}
	public Color getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(Color linecolor) {
		this.linecolor = linecolor;
	}
	public int X() {return (int)super.getX();}
	public int Y() {return (int)super.getY();}
	public int getRadius(){return radius;}
	public int getAngleStart(){return angleStart;}
	public int getAngleEnd(){return angleEnd;}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String toString()
	{return "[x="+getX()+",y="+getY()+"]"+"r="+radius+"a="+angleStart+","+angleEnd;}
}