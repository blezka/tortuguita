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
        	AInstPInstructionlist nodo = (AInstPInstructionlist)node.getPInstructionlist();
        	PPInstruction instrucction = nodo.getPInstruction();
        }
        outAListProg(node);
    }
}