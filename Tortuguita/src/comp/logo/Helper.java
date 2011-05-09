package comp.logo;

import java.awt.Color;
import java.util.*;

public class Helper {
	public static final int centerX = 375;
	public static final int centerY = 200;
	
	public static Color penColor = Color.black;
	public static boolean penDown = true;
	public static int penSize = 0;
	
	private static int TurtleAngle = 0;
	private static String output = "";
	//lineas a dibujar
	private static Vector<myPoint> puntos = new Vector<myPoint>();
	//mapas para guardar
	private static Hashtable<String,Object> variables = new Hashtable<String,Object>();
	private static Hashtable<String,Object> funciones = new Hashtable<String,Object>();
	
	public static void setPenDown(boolean pen)
	{
		penDown = pen;
	}

	public static Hashtable<String, Object> getFunciones() {
		return funciones;
	}
	public static void setFunciones(Hashtable<String, Object> funciones) {
		Helper.funciones = funciones;
	}
	
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
	public static String searchVar(String key)
	{
		if (variables.get(key)!= null)
			return variables.get(key).toString();
		return "["+key+" variable not found]";
	}
	
	public static myPoint add(myPoint p)
	{
		puntos.add(p);
		return p;
	}
	public static myPoint add(int dist)
	{
		myPoint added = new myPoint(Math.sin(Math.toRadians(180-TurtleAngle))*Math.abs(dist), Math.cos(Math.toRadians(180-TurtleAngle))*Math.abs(dist));
		added.setPenDown(penDown);
		if (puntos.size()>0)
			return add(new myPoint(puntos.get(puntos.size()-1).x+added.X(), puntos.get(puntos.size()-1).y+added.Y()));
		return added;
	}

	public static int getTurtleAngle() {
		return TurtleAngle;
	}
	public static void setTurtleAngle(int angle) {
		Helper.TurtleAngle = (Helper.TurtleAngle+angle)%360;
//		System.out.println(Helper.angle);
	}
	
	public static String getOutput(){
		return output;
	}
	public static void setOutput(String out){
		output+=" "+out;
	}
	public static void clearOutput(){output = "";}
}
