package comp.logo;

import comp.logo.analysis.*;
import comp.logo.node.*;


class Translation extends DepthFirstAdapter
{
//	primitives
//	communication
//	arithmetic
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
            Helper.add(dist);
        }
        outAFdsPGraphics(node);
    }
    public void caseABksPGraphics(ABksPGraphics node)
    {
        inABksPGraphics(node);
        if(node.getPBack() != null)
        {
        	Helper.setTurtleAngle(180);
        	Integer dist = 0;
            if (node.getPBack() instanceof ABackPBack)
            	dist = Integer.parseInt(((ABackPBack)node.getPBack()).getInteger().getText());
            else
                dist = Integer.parseInt(((ABkPBack)node.getPBack()).getInteger().getText());
            Helper.add(dist);
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
        	Helper.add(new myPoint(Helper.centerX+Integer.parseInt(node.getX().getText()),Helper.centerY+Integer.parseInt(node.getY().getText()), Helper.transp));
        }
        outAPSetxy(node);
    }  
    public void caseAPSetx(APSetx node)
    {
        inAPSetx(node);
        if(node.getSetx() != null && node.getInteger() != null)
        {
        	Helper.add(new myPoint(Helper.centerX+Integer.parseInt(node.getInteger().getText()),Helper.getPuntos().get(Helper.getPuntos().size()-1).Y(),Helper.transp));
        }
        outAPSetx(node);
    }
    public void caseAPSety(APSety node)
    {
        inAPSety(node);
        if(node.getSety() != null && node.getInteger() != null)
        {
        	Helper.add(new myPoint(Helper.getPuntos().get(Helper.getPuntos().size()-1).X(),Helper.centerY+Integer.parseInt(node.getInteger().getText()),Helper.transp));
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
            Helper.add(new myPoint(Helper.centerX,Helper.centerY, Helper.transp));
        }
        outAPHome(node);
    }
    public void caseAPArc(APArc node)
    {
        inAPArc(node);
        if(node.getArc() != null && node.getAngle() != null && node.getRadius() != null)
        {
        	myPoint anterior = Helper.getPuntos().get(Helper.getCantPuntos()-1);
        	//radius = angle ; angle = radius;
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
        }
        outAClrPGraphics(node);
    }

//	workspace
//  control
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