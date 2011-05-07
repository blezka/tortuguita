package comp.logo;

import java.awt.Color;
import java.util.*;

public class Helper {
	public static final int centerX = 375;
	public static final int centerY = 200;
	public static final Color transp = new Color(10,10,243);
	private static int angle = 0;
	private static Vector<myPoint> puntos = new Vector<myPoint>();
	private static Hashtable<String,Object> variables = new Hashtable<String,Object>();
	
	public static Vector<myPoint> getPuntos() {
		return puntos;
	}
	
	public static int getCantPuntos()
	{
		return puntos.size();
	}

	public static void clearPuntos() {
		Helper.puntos.clear();
		Helper.add(new myPoint(375,200));
	}

	public static Hashtable<String, Object> getVariables() {
		return variables;
	}

	public static void setVariables(Hashtable<String, Object> variables) {
		Helper.variables = variables;
	}
	
	public static myPoint add(myPoint p)
	{
		puntos.add(p);
		return p;
	}
	public static myPoint add(int dist)
	{
		myPoint added = new myPoint(Math.sin(Math.toRadians(180-angle))*Math.abs(dist), Math.cos(Math.toRadians(180-angle))*Math.abs(dist));
		if (puntos.size()>0)
			puntos.add(new myPoint(puntos.get(puntos.size()-1).x+added.X(), puntos.get(puntos.size()-1).y+added.Y()));
//		System.out.println(puntos);
		return new myPoint(0,0);
	}

	public static int getAngle() {
		return angle;
	}

	public static void setAngle(int angle) {
		Helper.angle = (Helper.angle+angle)%360;
//		System.out.println(Helper.angle);
	}

}
