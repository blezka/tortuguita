package comp.logo;

import comp.logo.analysis.*;
import comp.logo.node.*;


class Translation extends DepthFirstAdapter
{
	public void caseAListProg(AListProg node)
    {
        inAListProg(node);
        if(node.getPInstructionlist() != null)
        {
        	PPInstructionlist nodo = (PPInstructionlist)node.getPInstructionlist();
        	
        }
        outAListProg(node);
    }
}