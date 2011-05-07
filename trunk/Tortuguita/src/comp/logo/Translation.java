package comp.logo;

import comp.logo.analysis.*;
import comp.logo.node.*;


class Translation extends DepthFirstAdapter
{
//	primitives
//	communication
//	arithmetic
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
        	Helper.setAngle(180);
        	Integer dist = 0;
            if (node.getPBack() instanceof ABackPBack)
            	dist = Integer.parseInt(((ABackPBack)node.getPBack()).getInteger().getText());
            else
                dist = Integer.parseInt(((ABkPBack)node.getPBack()).getInteger().getText());
            Helper.add(dist);
        	Helper.setAngle(180);
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
        	Helper.setAngle(-degree);
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
        	Helper.setAngle(degree);
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
        		Helper.setAngle(-Helper.getAngle()+Integer.parseInt(((ASetheadingPSetheading)node.getPSetheading()).getInteger().getText()));
        	else
        		Helper.setAngle(-Helper.getAngle()+Integer.parseInt(((ASethPSetheading)node.getPSetheading()).getInteger().getText()));
        }
        outASethsPGraphics(node);
    }
    public void caseAPHome(APHome node)
    {
        inAPHome(node);
        if(node.getHome() != null)
        {
            Helper.setAngle(-Helper.getAngle());
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
        	Helper.add(new myPoint(anterior.X(), anterior.Y(), Integer.parseInt(node.getAngle().getText()),Helper.getAngle(),Integer.parseInt(node.getRadius().getText())));
        }
        outAPArc(node);
    }
    public void caseAClrPGraphics(AClrPGraphics node)
    {
        inAClrPGraphics(node);
        if(node.getPClearscreen() != null)
        {
        	Helper.clearPuntos();
        	Helper.setAngle(0);
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