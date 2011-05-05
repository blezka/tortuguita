package comp.logo;

import java.util.*;

public class Helper {
	private static int angle = 55;
	private static Vector<myPoint> puntos = new Vector<myPoint>();
	private static Hashtable<String,Object> variables = new Hashtable<String,Object>();
	
	public static Vector<myPoint> getPuntos() {
		return puntos;
	}

	public static void setPuntos(Vector<myPoint> puntos) {
		Helper.puntos = puntos;
	}

	public static Hashtable<String, Object> getVariables() {
		return variables;
	}

	public static void setVariables(Hashtable<String, Object> variables) {
		Helper.variables = variables;
	}
	
	public static myPoint add(myPoint p)
	{
		myPoint added = p;
		if (puntos.size()>0)
			added = new myPoint(puntos.get(puntos.size()-1).x+p.x, puntos.get(puntos.size()-1).y+p.y);
		puntos.add(added);
		System.out.println(puntos);
		return added;
	}

	public static int getAngle() {
		return angle;
	}

	public static void setAngle(int angle) {
		Helper.angle = angle%360;
		System.out.println(Helper.angle);
	}

}
