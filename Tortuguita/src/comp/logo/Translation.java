package comp.logo;

import comp.logo.analysis.*;
import comp.logo.node.*;


class Translation extends DepthFirstAdapter
{
    public void caseAFdsPGraphics(AFdsPGraphics node)
    {
        inAFdsPGraphics(node);
        if(node.getPForward() != null)
        {
            Integer dist = 0;
            if (node.getPForward() instanceof AForwardPForward)
            dist = -1*Integer.parseInt(((AForwardPForward)node.getPForward()).getInteger().getText());
            else
            dist = -1*Integer.parseInt(((AFdPForward)node.getPForward()).getInteger().getText());
            Helper.add(new myPoint(0,dist));
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
                dist = -1*Integer.parseInt(((ABkPBack)node.getPBack()).getInteger().getText());
            Helper.add(new myPoint(0,dist));
        }
        outABksPGraphics(node);
    }
    public void caseALtsPGraphics(ALtsPGraphics node)
    {
        inALtsPGraphics(node);
        if(node.getPLeft() != null)
        {
            node.getPLeft().apply(this);
        }
        outALtsPGraphics(node);
    }

	public void caseALeftPLeft(ALeftPLeft node)
    {
        inALeftPLeft(node);
        if(node.getLeft() != null && node.getInteger() != null)
        {
        	Integer integ = Integer.parseInt(node.getInteger().getText());
        	Helper.setAngle(integ);
        }
        outALeftPLeft(node);
    }
	public void caseALtPLeft(ALtPLeft node)
    {
        inALtPLeft(node);
        if(node.getLf() != null && node.getInteger() != null)
        {
        	Integer integ = Integer.parseInt(node.getInteger().getText());
        	Helper.setAngle(integ);
        }
        outALtPLeft(node);
    }

}