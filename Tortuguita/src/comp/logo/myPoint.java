package comp.logo;

import java.awt.Point;

public class myPoint extends Point
{
	private static final long serialVersionUID = 1L;
	public myPoint(int x, int y)
	{
		super(x,y);
	}
	public int X() {return (int)super.getX();}
	public int Y() {return (int)super.getY();}
	public String toString()
	{return "[x="+getX()+",y="+getY()+"]";}
}