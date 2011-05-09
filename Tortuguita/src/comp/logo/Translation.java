package comp.logo;

import java.awt.Color;

import comp.logo.analysis.*;
import comp.logo.node.*;


class Translation extends DepthFirstAdapter
{
//	primitives
	public void caseAPWord(APWord node)
    {
        inAPWord(node);
        if(node.getWord() != null&&node.getIdentifier() != null&&node.getPIdentList() != null)
        {
        	String concat = node.getIdentifier().getText();
        	if (node.getPIdentList() instanceof AIdentListPIdentList)
        	{
        		AIdentListPIdentList list = (AIdentListPIdentList)node.getPIdentList();
        		while (list.getPIdentList() instanceof AIdentListPIdentList)
        		{
        			concat+=list.getIdentifier().getText();
        			list = (AIdentListPIdentList) list.getPIdentList();        			
        		}
        		concat+=list.getIdentifier().getText();
        		concat+=((AIdentPIdentList)list.getPIdentList()).getIdentifier();
        	}
        	else
        		concat+=((AIdentPIdentList)node.getPIdentList()).getIdentifier();
        	Helper.setOutput(concat);
        }
        outAPWord(node);
    }
    public void caseAPList(APList node)
    {
        inAPList(node);
        if(node.getList() != null&&node.getIdentifier() != null&&node.getPIdentList() != null)
        {
            Helper.getVariables().put("lista", "listando");
        }
        outAPList(node);
    }
//	communication
	public void caseAPPrint(APPrint node)
    {
        inAPPrint(node);
        if(node.getPrint() != null&&node.getLPar() != null&&node.getPIdentList() != null&&node.getRPar() != null)
        {
        	if ((node.getPIdentList() instanceof AIdentListPIdentList))
        	{
            	AIdentListPIdentList list = (AIdentListPIdentList)node.getPIdentList();
	        	while (list.getPIdentList() instanceof AIdentListPIdentList)
	        	{
	        		Helper.setOutput(Helper.searchVar(list.getIdentifier().getText()));
	        		list = (AIdentListPIdentList) list.getPIdentList();	        		
	        	}
	        	Helper.setOutput(Helper.searchVar(list.getIdentifier().getText()));
        		Helper.setOutput(Helper.searchVar(((AIdentPIdentList)list.getPIdentList()).getIdentifier().getText()));
        	}        	
        	else
        		Helper.setOutput(Helper.searchVar(((AIdentPIdentList)node.getPIdentList()).getIdentifier().getText()));
        }
        outAPPrint(node);
    }
//	arithmetic
	public void caseASumPSum(ASumPSum node)
    {
        inASumPSum(node);
        if(node.getSum() != null&&node.getPValue() != null&&node.getPValueList() != null)
        {
        	double sum = 0;
        	if (node.getPValue()instanceof AIntPValue)
        		sum += Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText());
        	else
        		sum += Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText());
        	if (node.getPValueList()instanceof AValueListPValueList)
        	{
        		AValueListPValueList list = (AValueListPValueList)node.getPValueList();
        		while (list.getPValueList() instanceof AValueListPValueList)
        		{
                	if (list.getPValue()instanceof AIntPValue)
                		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
                	else
                		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());
        			
        			list = (AValueListPValueList) list.getPValueList();
        		}
            	if (list.getPValue()instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
            	else
            		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());

            	if (((AValuePValueList)list.getPValueList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((AValuePValueList)list.getPValueList()).getPValue()).getInteger().getText());
            	else
            		sum += Double.parseDouble(((ADobPValue)((AValuePValueList)list.getPValueList()).getPValue()).getDouble().getText());

        	}
        	else
        	{
        		if (((AValuePValueList)node.getPValueList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((AValuePValueList)node.getPValueList()).getPValue()).getInteger().getText());
            	else
            		sum += Double.parseDouble(((ADobPValue)((AValuePValueList)node.getPValueList()).getPValue()).getDouble().getText());

        	}
        	Helper.setOutput(""+sum);
        		
        }
        outASumPSum(node);
    }
	public void caseAPlusPSum(APlusPSum node)
    {
        inAPlusPSum(node);
        if(node.getPValue() != null&&node.getPSumList() != null)
        {
            double sum = 0;
            if (node.getPValue()instanceof AIntPValue)
        		sum += Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText());
        	else
        		sum += Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText());
            if (node.getPSumList() instanceof ASumListPSumList)
        	{
            	ASumListPSumList list = (ASumListPSumList)node.getPSumList();
        		while (list.getPSumList() instanceof ASumListPSumList)
        		{
        			if (list.getPValue()instanceof AIntPValue)
                		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
                	else
                		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());
        			
        			list = (ASumListPSumList) list.getPSumList();
        		}
        		if (list.getPValue()instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
            	else
            		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());

        		if (((ASumValPSumList)list.getPSumList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((ASumValPSumList)list.getPSumList()).getPValue()).getInteger().getText());
            	else
            		sum += Double.parseDouble(((ADobPValue)((ASumValPSumList)list.getPSumList()).getPValue()).getDouble().getText());

        	}
            else
        	{
        		if (((ASumValPSumList)node.getPSumList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((ASumValPSumList)node.getPSumList()).getPValue()).getInteger().getText());
            	else
            		sum += Double.parseDouble(((ADobPValue)((ASumValPSumList)node.getPSumList()).getPValue()).getDouble().getText());

        	}
        	Helper.setOutput(""+sum);
        }
        outAPlusPSum(node);
    }
	public void caseADifPDifference(ADifPDifference node)
    {
        inADifPDifference(node);
        if(node.getDifference() != null&&node.getPValue() != null&&node.getPValueList() != null)
        {
        	double dif = 0;
        	if (node.getPValue()instanceof AIntPValue)
        		dif = Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText());
        	else
        		dif = Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText());
        	if (node.getPValueList()instanceof AValueListPValueList)
        	{
        		AValueListPValueList list = (AValueListPValueList)node.getPValueList();
        		while (list.getPValueList() instanceof AValueListPValueList)
        		{
                	if (list.getPValue()instanceof AIntPValue)
                		dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
                	else
                		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());
        			
        			list = (AValueListPValueList) list.getPValueList();
        		}
            	if (list.getPValue()instanceof AIntPValue)
            		dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
            	else
            		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());

            	if (((AValuePValueList)list.getPValueList()).getPValue() instanceof AIntPValue)
            		dif -= Integer.parseInt(((AIntPValue)((AValuePValueList)list.getPValueList()).getPValue()).getInteger().getText());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((AValuePValueList)list.getPValueList()).getPValue()).getDouble().getText());

        	}
        	else
        	{
        		if (((AValuePValueList)node.getPValueList()).getPValue() instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)((AValuePValueList)node.getPValueList()).getPValue()).getInteger().getText());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((AValuePValueList)node.getPValueList()).getPValue()).getDouble().getText());

        	}
        	Helper.setOutput(""+dif);

        }
        outADifPDifference(node);
    }
    public void caseAMinPDifference(AMinPDifference node)
    {
        inAMinPDifference(node);
        if(node.getPValue() != null&&node.getPDifList() != null)
        {
            double dif = 0;
            if (node.getPValue()instanceof AIntPValue)
        		dif = Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText());
        	else
        		dif = Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText());
            if (node.getPDifList() instanceof ADifListPDifList)
        	{
            	ADifListPDifList list = (ADifListPDifList)node.getPDifList();
        		while (list.getPDifList() instanceof ADifListPDifList)
        		{
        			if (list.getPValue()instanceof AIntPValue)
                		dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
                	else
                		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());
        			
        			list = (ADifListPDifList) list.getPDifList();
        		}
        		if (list.getPValue()instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText());
            	else
            		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText());

        		if (((ADifValPDifList)list.getPDifList()).getPValue() instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)((ADifValPDifList)list.getPDifList()).getPValue()).getInteger().getText());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((ADifValPDifList)list.getPDifList()).getPValue()).getDouble().getText());

        	}
            else
        	{
        		if (((ADifValPDifList)node.getPDifList()).getPValue() instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)((ADifValPDifList)node.getPDifList()).getPValue()).getInteger().getText());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((ADifValPDifList)node.getPDifList()).getPValue()).getDouble().getText());

        	}
        	Helper.setOutput(""+dif);
        }
        outAMinPDifference(node);
    }
    public void caseAMinusPMinus(AMinusPMinus node)
    {
        inAMinusPMinus(node);
        if(node.getMinus() != null&&node.getPValue() != null)
        {
        	if (node.getPValue() instanceof AIntPValue)
        		Helper.setOutput(""+-1*Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText()));
        	else
        		Helper.setOutput(""+-1*Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText()));
        }
        outAMinusPMinus(node);
    }
    public void caseAMinPMinus(AMinPMinus node)
    {
        inAMinPMinus(node);
        if(node.getMin() != null&&node.getPValue() != null)
        {
        	if (node.getPValue() instanceof AIntPValue)
        		Helper.setOutput(""+-1*Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText()));
        	else
        		Helper.setOutput(""+-1*Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText()));        }
        outAMinPMinus(node);
    }
    public void caseAPRound(APRound node)
    {
        inAPRound(node);
        if(node.getRound() != null && node.getPValue() != null)
        {
            if (node.getPValue() instanceof AIntPValue )
            	Helper.setOutput(((AIntPValue)node.getPValue()).getInteger().getText());
            else
            	Helper.setOutput(""+Math.round(Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText())));
            
        }
        outAPRound(node);
    }
    public void caseAPSqrt(APSqrt node)
    {
        inAPSqrt(node);
        if(node.getSqrt() != null&&node.getPValue() != null)
        {
        	if (node.getPValue() instanceof AIntPValue )
            	Helper.setOutput(""+Math.sqrt(Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText())));
            else
            	Helper.setOutput(""+Math.sqrt(Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText())));
        }
        outAPSqrt(node);
    }
    public void caseAPPower(APPower node)
    {
        inAPPower(node);
        if(node.getPower() != null&&node.getBase() != null&&node.getExp() != null)
        {
        	if (node.getBase() instanceof AIntPValue )
            	if (node.getExp() instanceof AIntPValue )
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((AIntPValue)node.getBase()).getInteger().getText()), Double.parseDouble(((AIntPValue)node.getExp()).getInteger().getText())));
                else
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((AIntPValue)node.getBase()).getInteger().getText()), Double.parseDouble(((ADobPValue)node.getExp()).getDouble().getText())));
            else
            	if (node.getExp() instanceof AIntPValue )
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((ADobPValue)node.getBase()).getDouble().getText()), Double.parseDouble(((AIntPValue)node.getExp()).getInteger().getText())));
                else
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((ADobPValue)node.getBase()).getDouble().getText()), Double.parseDouble(((ADobPValue)node.getExp()).getDouble().getText())));
        	
        }
        outAPPower(node);
    }
    public void caseAPExp(APExp node)
    {
        inAPExp(node);
        if(node.getExp() != null&&node.getPValue() != null)
        {
        	if (node.getPValue() instanceof AIntPValue )
            	Helper.setOutput(""+Math.pow(Math.E, (Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText()))));
            else
            	Helper.setOutput(""+Math.pow(Math.E, (Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText()))));
        }
        outAPExp(node);
    }
//	logic
//	graphics
    public void caseAFdsPGraphics(AFdsPGraphics node)
    {
        inAFdsPGraphics(node);
        if(node.getPForward() != null)
        {
            Integer dist = 0;
            if (node.getPForward() instanceof AForwardPForward)
            dist = Integer.parseInt(((AForwardPForward)node.getPForward()).getInteger().getText());
            else
            dist = Integer.parseInt(((AFdPForward)node.getPForward()).getInteger().getText());
            //dist<0 distancia negativa
            if (dist<0)Helper.setTurtleAngle(180);
            Helper.add(Math.abs(dist));
            if (dist<0)Helper.setTurtleAngle(180);
        }
        outAFdsPGraphics(node);
    }
    public void caseABksPGraphics(ABksPGraphics node)
    {
        inABksPGraphics(node);
        if(node.getPBack() != null)
        {
        	Integer dist = 0;
            if (node.getPBack() instanceof ABackPBack)
            	dist = Integer.parseInt(((ABackPBack)node.getPBack()).getInteger().getText());
            else
                dist = Integer.parseInt(((ABkPBack)node.getPBack()).getInteger().getText());
        	Helper.setTurtleAngle(180);
            if (dist<0)Helper.setTurtleAngle(180);
            Helper.add(Math.abs(dist));
            if (dist<0)Helper.setTurtleAngle(180);
        	Helper.setTurtleAngle(180);
        }
        outABksPGraphics(node);
    }
    public void caseALtsPGraphics(ALtsPGraphics node)
    {
        inALtsPGraphics(node);
        if(node.getPLeft() != null)
        {
        	Integer degree = 0;
        	if (node.getPLeft() instanceof ALeftPLeft)
        		degree = Integer.parseInt(((ALeftPLeft)node.getPLeft()).getInteger().getText());
        	else
        		degree = Integer.parseInt(((ALtPLeft)node.getPLeft()).getInteger().getText());
        	Helper.setTurtleAngle(-degree);
        }
        outALtsPGraphics(node);
    }
    public void caseARtsPGraphics(ARtsPGraphics node)
    {
        inARtsPGraphics(node);
        if(node.getPRight() != null)
        {
        	Integer degree = 0;
        	if (node.getPRight() instanceof ARightPRight)
        		degree = Integer.parseInt(((ARightPRight)node.getPRight()).getInteger().getText());
        	else
        		degree = Integer.parseInt(((ARtPRight)node.getPRight()).getInteger().getText());
        	Helper.setTurtleAngle(degree);
        }
        outARtsPGraphics(node);
    }
    public void caseAPSetxy(APSetxy node)
    {
        inAPSetxy(node);
        if(node.getSetxy() != null && node.getX() != null && node.getY() != null)
        {
        	Helper.add(new myPoint(Helper.centerX+Integer.parseInt(node.getX().getText()),Helper.centerY+Integer.parseInt(node.getY().getText()), false));
        }
        outAPSetxy(node);
    }  
    public void caseAPSetx(APSetx node)
    {
        inAPSetx(node);
        if(node.getSetx() != null && node.getInteger() != null)
        {
        	Helper.add(new myPoint(Helper.centerX+Integer.parseInt(node.getInteger().getText()),Helper.getPuntos().get(Helper.getPuntos().size()-1).Y(),false));
        }
        outAPSetx(node);
    }
    public void caseAPSety(APSety node)
    {
        inAPSety(node);
        if(node.getSety() != null && node.getInteger() != null)
        {
        	Helper.add(new myPoint(Helper.getPuntos().get(Helper.getPuntos().size()-1).X(),Helper.centerY+Integer.parseInt(node.getInteger().getText()),false));
        }
        outAPSety(node);
    }
    public void caseASethsPGraphics(ASethsPGraphics node)
    {
        inASethsPGraphics(node);
        if(node.getPSetheading() != null)
        {
        	if (node.getPSetheading()instanceof ASetheadingPSetheading)
        		Helper.setTurtleAngle(-Helper.getTurtleAngle()+Integer.parseInt(((ASetheadingPSetheading)node.getPSetheading()).getInteger().getText()));
        	else
        		Helper.setTurtleAngle(-Helper.getTurtleAngle()+Integer.parseInt(((ASethPSetheading)node.getPSetheading()).getInteger().getText()));
        }
        outASethsPGraphics(node);
    }
    public void caseAPHome(APHome node)
    {
        inAPHome(node);
        if(node.getHome() != null)
        {
            Helper.setTurtleAngle(-Helper.getTurtleAngle());
            Helper.add(new myPoint(Helper.centerX,Helper.centerY, false));
        }
        outAPHome(node);
    }
    public void caseAPArc(APArc node)
    {
        inAPArc(node);
        if(node.getArc() != null && node.getAngle() != null && node.getRadius() != null)
        {
        	myPoint anterior = Helper.getPuntos().get(Helper.getCantPuntos()-1);
        	//radius = angle ; angle = radius; ???
        	Helper.add(new myPoint(anterior.X(), anterior.Y(), Integer.parseInt(node.getAngle().getText()),Helper.getTurtleAngle(),Integer.parseInt(node.getRadius().getText())));
        }
        outAPArc(node);
    }
    public void caseAClrPGraphics(AClrPGraphics node)
    {
        inAClrPGraphics(node);
        if(node.getPClearscreen() != null)
        {
        	Helper.clearPuntos();
        	Helper.setTurtleAngle(0);
        	Helper.clearOutput();
        }
        outAClrPGraphics(node);
    }
    public void caseAPdsPPencontrol(APdsPPencontrol node)
    {
        inAPdsPPencontrol(node);
        if(node.getPPendown() != null)
        {
            Helper.setPenDown(true);
        }
        outAPdsPPencontrol(node);
    }
    public void caseAPusPPencontrol(APusPPencontrol node)
    {
        inAPusPPencontrol(node);
        if(node.getPPenup() != null)
        {
            Helper.setPenDown(false);
        }
        outAPusPPencontrol(node);
    }
    public void caseASetpcsPPencontrol(ASetpcsPPencontrol node)
    {
        inASetpcsPPencontrol(node);
        if(node.getPSetpencolor() != null)
        {
        	int color = -1;
        	if (node.getPSetpencolor()instanceof ASetpencolorPSetpencolor)
        	{
        		if (((ASetpencolorPSetpencolor)node.getPSetpencolor()).getPColor()instanceof APredefPColor)
        			color = Integer.parseInt(((APredefPColor)(((ASetpencolorPSetpencolor)node.getPSetpencolor()).getPColor())).getInteger().getText());
        		else
        			System.out.println("User defined color");
        	}
        	if (node.getPSetpencolor()instanceof ASetpcPSetpencolor)
        		if (((ASetpcPSetpencolor)node.getPSetpencolor()).getPColor()instanceof APredefPColor)
        			color = Integer.parseInt(((APredefPColor)(((ASetpcPSetpencolor)node.getPSetpencolor()).getPColor())).getInteger().getText());
        		else
        			System.out.println("User defined color");
        			
        	
        	if (color >= 0)
    		switch (color)
    			{
    			case 0:
    				Helper.penColor = Color.black;
    				break;
    			case 1:
    				Helper.penColor = Color.blue;
    				break;
    			case 2:
    				Helper.penColor = Color.green;
    				break;
    			case 3:
    				Helper.penColor = Color.cyan;
    				break;
    			case 4:
    				Helper.penColor = Color.red;
    				break;
    			case 5:
    				Helper.penColor = Color.magenta;
    				break;
    			case 6:
    				Helper.penColor = Color.yellow;
    				break;
    			case 7:
    				Helper.penColor = Color.white;
    				break;
    			case 8://brown
    				Helper.penColor = new Color(107,66,38);
    				break;
    			case 9://bronze
    				Helper.penColor = new Color(166,125,61);
    				break;
    			case 10://forest green
    				Helper.penColor = new Color(34,139,34);
    				break;
    			case 11://aqua
    				Helper.penColor = new Color(2,157,116);
    				break;
    			case 12://salmon
    				Helper.penColor = new Color(250,128,114);
    				break;
    			case 13://purple
    				Helper.penColor = new Color(128,0,128);
    				break;
    			case 14:
    				Helper.penColor = Color.orange;
    				break;
    			case 15:
    				Helper.penColor = Color.gray;
    				break;        			
    			default:
    				Helper.penColor = Color.black;
    			}
    		

        }
        outASetpcsPPencontrol(node);
    }
    public void caseASetpensizePPencontrol(ASetpensizePPencontrol node)
    {
        inASetpensizePPencontrol(node);
        if(node.getPSetpensize() != null)
        {
        	if (node.getPSetpensize()instanceof ASizePSetpensize)
        		Helper.penSize = Integer.parseInt(((ASizePSetpensize) node.getPSetpensize()).getInteger().getText());
        }
        outASetpensizePPencontrol(node);
    }
//	workspace
//  control
    public void caseAPMake(APMake node)
    {
        inAPMake(node);
        if(node.getMake() != null&&node.getIdentifier() != null&&node.getPValue() != null)
        {
        	if (node.getPValue()instanceof AIntPValue)
        		Helper.getVariables().put(node.getIdentifier().getText(), ((AIntPValue)node.getPValue()).getInteger().getText());
        	else
                Helper.getVariables().put(node.getIdentifier().getText(), ((ADobPValue)node.getPValue()).getDouble().getText());
        		
        }
        outAPMake(node);
    }
    public void caseAPRepeat(APRepeat node)
    {
        inAPRepeat(node);
        if(node.getPInstructionlist() != null)
        {
        	for (int i = 0 ; i < Integer.parseInt(node.getInteger().getText()); i++)
        		node.getPInstructionlist().apply(this);
        }
        outAPRepeat(node);
    }
    
    


}