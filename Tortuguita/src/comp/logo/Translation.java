package comp.logo;

import java.awt.Color;
import java.util.Vector;

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
        	String concat = node.getIdentifier().getText().trim();
        	if (node.getPIdentList() instanceof AIdentListPIdentList)
        	{
        		AIdentListPIdentList list = (AIdentListPIdentList)node.getPIdentList();
        		while (list.getPIdentList() instanceof AIdentListPIdentList)
        		{
        			concat+=list.getIdentifier().getText().trim();
        			list = (AIdentListPIdentList) list.getPIdentList();        			
        		}
        		concat+=list.getIdentifier().getText().trim();
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
        	Vector<String> lista = new Vector<String>();
//        	lista.add(node.getIdentifier().getText().trim());
        	PPIdentList l = node.getPIdentList();
        	while (l instanceof AIdentListPIdentList)
        	{
        		lista.add(((AIdentListPIdentList)l).getIdentifier().getText().trim());
        		l = ((AIdentListPIdentList)l).getPIdentList();
        	}
        	lista.add(((AIdentPIdentList)l).getIdentifier().getText().trim());
        	Helper.setOutput(lista.toString());
            Helper.getVariables().put(node.getIdentifier().getText().trim(), lista);
        }
        outAPList(node);
    }
    @SuppressWarnings("unchecked")
	public void caseAPFirst(APFirst node)
    {
        inAPFirst(node);
        if(node.getFirst() != null&&node.getIdentifier() != null)
        {
        	if (Helper.getVariables().get(node.getIdentifier().getText().trim())!=null)
        	{
        		if (Helper.getVariables().get(node.getIdentifier().getText().trim())instanceof Vector)
        		{
        			Vector<String> lista = (Vector<String>)(Helper.getVariables().get(node.getIdentifier().getText().trim()));
        			Helper.setOutput(""+lista.get(0));
        		}
        		else
        			Helper.setOutput(""+Helper.getVariables().get(node.getIdentifier().getText().trim()).toString().charAt(0));
        	}
        	else
        		Helper.setOutput(""+(node.getIdentifier().getText().trim().length()>0?node.getIdentifier().getText().trim().charAt(0):""));
        }
        outAPFirst(node);
    }
    @SuppressWarnings("unchecked")
	public void caseAButfirstsPSelectors(AButfirstsPSelectors node)
    {
        inAButfirstsPSelectors(node);
        if(node.getPButfirst() != null)
        {
        	if (node.getPButfirst() instanceof AButfirstPButfirst)
            	if (Helper.getVariables().get(((AButfirstPButfirst)node.getPButfirst()).getIdentifier().getText().trim())!=null)
            		if (Helper.getVariables().get(((AButfirstPButfirst)node.getPButfirst()).getIdentifier().getText().trim())instanceof Vector)
            		{
            			Vector<String> lista = new Vector<String>((Vector<String>)(Helper.getVariables().get(((AButfirstPButfirst)node.getPButfirst()).getIdentifier().getText().trim())));
            			lista.remove(0);
            			Helper.setOutput(""+lista);
            		}
            		else
            			Helper.setOutput(""+Helper.getVariables().get(((AButfirstPButfirst)node.getPButfirst()).getIdentifier().getText().trim()).toString().substring(1));
            	else
            		Helper.setOutput(""+(((AButfirstPButfirst)node.getPButfirst()).getIdentifier().getText().trim().length()>1?((AButfirstPButfirst)node.getPButfirst()).getIdentifier().getText().trim().substring(1):""));
        	else
            	if (Helper.getVariables().get(((ABfPButfirst)node.getPButfirst()).getIdentifier().getText().trim())!=null)
            		if (Helper.getVariables().get(((ABfPButfirst)node.getPButfirst()).getIdentifier().getText().trim())instanceof Vector)
            		{
            			Vector<String> lista = new Vector<String>( (Vector<String>)(Helper.getVariables().get(((ABfPButfirst)node.getPButfirst()).getIdentifier().getText().trim())));
            			lista.remove(0);
            			Helper.setOutput(""+lista);
            		}
            		else
            			Helper.setOutput(""+Helper.getVariables().get(((ABfPButfirst)node.getPButfirst()).getIdentifier().getText().trim()).toString().substring(1));
            	else
            		Helper.setOutput(""+(((ABfPButfirst)node.getPButfirst()).getIdentifier().getText().trim().length()>1?((ABfPButfirst)node.getPButfirst()).getIdentifier().getText().trim().substring(1):""));
        		
        }
        outAButfirstsPSelectors(node);
    }
    @SuppressWarnings("unchecked")
	public void caseAPLast(APLast node)
    {
        inAPLast(node);
        if(node.getLast() != null&&node.getIdentifier() != null)
        {
        	if (Helper.getVariables().get(node.getIdentifier().getText().trim())!=null)
        	{
        		if (Helper.getVariables().get(node.getIdentifier().getText().trim())instanceof Vector)
        		{
        			Vector<String> lista = (Vector<String>)(Helper.getVariables().get(node.getIdentifier().getText().trim()));
        			Helper.setOutput(""+lista.get(lista.size()-1));
        		}
        		else
        		{
	        		String item = Helper.getVariables().get(node.getIdentifier().getText().trim()).toString().trim();
	        		Helper.setOutput(""+item.charAt(item.length()-1));
        		}
        	}
        	else
        		Helper.setOutput(""+(
        				node.getIdentifier().getText().trim().length()>0?
        						node.getIdentifier().getText().trim().charAt(
        								(node.getIdentifier().getText().trim().length()-1)):""));
        }
        outAPLast(node);
    }
    @SuppressWarnings("unchecked")
	public void caseAPSetitem(APSetitem node)
    {
        inAPSetitem(node);
        if(node.getSetitem() != null&&node.getInteger() != null&&node.getIdentifier() != null&&node.getPValue() != null)
        {
            if (Helper.getVariables().get(node.getIdentifier().getText().trim())!= null)
            {
            	if (Helper.getVariables().get(node.getIdentifier().getText().trim()) instanceof Vector)
            	{
                	Vector<String> lista =(Vector<String>) Helper.getVariables().get(node.getIdentifier().getText().trim()) ;
            		if (Integer.parseInt(node.getInteger().getText().trim()) < lista.size())
            		lista.set(Integer.parseInt(node.getInteger().getText().trim()), node.getPValue().toString());
            	}
            }
            else
            	Helper.setOutput(node.getIdentifier().getText().trim()+" list not found");
        }
        outAPSetitem(node);
    }
//	communication
    public void caseAPrsPCommunication(APrsPCommunication node)
    {
        inAPrsPCommunication(node);
        if(node.getPPrint() != null)
        {
        	if (node.getPPrint() instanceof APrintPPrint)        	
        	{
        	if ((((APrintPPrint)node.getPPrint()).getPIdentList() instanceof AIdentListPIdentList))
        	{
            	AIdentListPIdentList list = (AIdentListPIdentList)((APrintPPrint)node.getPPrint()).getPIdentList();
            	//Recorre cada elemento de la lista
	        	while (list.getPIdentList() instanceof AIdentListPIdentList)
	        	{
	        		if (Helper.getVariables().get(list.getIdentifier().getText().trim())!= null)
	        			Helper.setOutput(""+Helper.getVariables().get(list.getIdentifier().getText().trim()));
	        		else
	        			Helper.setOutput(""+list.getIdentifier().getText().trim());
	        		list = (AIdentListPIdentList) list.getPIdentList();	        		
	        	}
	        	//penultimo
        		if (Helper.getVariables().get(list.getIdentifier().getText().trim())!= null)
        			Helper.setOutput(""+Helper.getVariables().get(list.getIdentifier().getText().trim()));
        		else
        			Helper.setOutput(""+list.getIdentifier().getText().trim());
        		//ultimo
        		if (Helper.getVariables().get(((AIdentPIdentList)list.getPIdentList()).getIdentifier().getText().trim())!= null)
        			Helper.setOutput(""+Helper.getVariables().get(((AIdentPIdentList)list.getPIdentList()).getIdentifier().getText().trim()));
        		else
        			Helper.setOutput(""+((AIdentPIdentList)list.getPIdentList()).getIdentifier().getText().trim());
        	}        	
        	//solo 1 elemnto
        	else if (((APrintPPrint)node.getPPrint()).getPIdentList() instanceof AIdentPIdentList)
	    		if (Helper.getVariables().get(((AIdentPIdentList)((APrintPPrint)node.getPPrint()).getPIdentList()).getIdentifier().getText().trim())!= null)
	    			Helper.setOutput(""+Helper.getVariables().get(((AIdentPIdentList)((APrintPPrint)node.getPPrint()).getPIdentList()).getIdentifier().getText().trim()));
	    		else
	    			Helper.setOutput(""+((AIdentPIdentList)((APrintPPrint)node.getPPrint()).getPIdentList()).getIdentifier().getText().trim());
        	}
        	else
        	{
            	if ((((APrPPrint)node.getPPrint()).getPIdentList() instanceof AIdentListPIdentList))
            	{
                	AIdentListPIdentList list = (AIdentListPIdentList)((APrPPrint)node.getPPrint()).getPIdentList();
                	//Recorre cada elemento de la lista
    	        	while (list.getPIdentList() instanceof AIdentListPIdentList)
    	        	{
    	        		if (Helper.getVariables().get(list.getIdentifier().getText().trim())!= null)
    	        			Helper.setOutput(""+Helper.getVariables().get(list.getIdentifier().getText().trim()));
    	        		else
    	        			Helper.setOutput(""+list.getIdentifier().getText().trim());
    	        		list = (AIdentListPIdentList) list.getPIdentList();	        		
    	        	}
    	        	//penultimo
            		if (Helper.getVariables().get(list.getIdentifier().getText().trim())!= null)
            			Helper.setOutput(""+Helper.getVariables().get(list.getIdentifier().getText().trim()));
            		else
            			Helper.setOutput(""+list.getIdentifier().getText().trim());
            		//ultimo
            		if (Helper.getVariables().get(((AIdentPIdentList)list.getPIdentList()).getIdentifier().getText().trim())!= null)
            			Helper.setOutput(""+Helper.getVariables().get(((AIdentPIdentList)list.getPIdentList()).getIdentifier().getText().trim()));
            		else
            			Helper.setOutput(""+((AIdentPIdentList)list.getPIdentList()).getIdentifier().getText().trim());
            	}        	
            	//solo 1 elemnto
            	else if (((APrPPrint)node.getPPrint()).getPIdentList() instanceof AIdentPIdentList)
    	    		if (Helper.getVariables().get(((AIdentPIdentList)((APrPPrint)node.getPPrint()).getPIdentList()).getIdentifier().getText().trim())!= null)
    	    			Helper.setOutput(""+Helper.getVariables().get(((AIdentPIdentList)((APrPPrint)node.getPPrint()).getPIdentList()).getIdentifier().getText().trim()));
    	    		else
    	    			Helper.setOutput(""+((AIdentPIdentList)((APrPPrint)node.getPPrint()).getPIdentList()).getIdentifier().getText().trim());

        	}
        }
        outAPrsPCommunication(node);
    }
//	arithmetic
	public void caseASumPSum(ASumPSum node)
    {
        inASumPSum(node);
        if(node.getSum() != null&&node.getPValue() != null&&node.getPValueList() != null)
        {
        	double sum = 0;
        	if (node.getPValue()instanceof AIntPValue)
        		sum += Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim());
        	else
        		sum += Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim());
        	if (node.getPValueList()instanceof AValueListPValueList)
        	{
        		AValueListPValueList list = (AValueListPValueList)node.getPValueList();
        		while (list.getPValueList() instanceof AValueListPValueList)
        		{
                	if (list.getPValue()instanceof AIntPValue)
                		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
                	else
                		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());
        			
        			list = (AValueListPValueList) list.getPValueList();
        		}
            	if (list.getPValue()instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
            	else
            		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());

            	if (((AValuePValueList)list.getPValueList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((AValuePValueList)list.getPValueList()).getPValue()).getInteger().getText().trim());
            	else
            		sum += Double.parseDouble(((ADobPValue)((AValuePValueList)list.getPValueList()).getPValue()).getDouble().getText().trim());

        	}
        	else
        	{
        		if (((AValuePValueList)node.getPValueList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((AValuePValueList)node.getPValueList()).getPValue()).getInteger().getText().trim());
            	else
            		sum += Double.parseDouble(((ADobPValue)((AValuePValueList)node.getPValueList()).getPValue()).getDouble().getText().trim());

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
        		sum += Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim());
        	else
        		sum += Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim());
            if (node.getPSumList() instanceof ASumListPSumList)
        	{
            	ASumListPSumList list = (ASumListPSumList)node.getPSumList();
        		while (list.getPSumList() instanceof ASumListPSumList)
        		{
        			if (list.getPValue()instanceof AIntPValue)
                		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
                	else
                		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());
        			
        			list = (ASumListPSumList) list.getPSumList();
        		}
        		if (list.getPValue()instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
            	else
            		sum += Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());

        		if (((ASumValPSumList)list.getPSumList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((ASumValPSumList)list.getPSumList()).getPValue()).getInteger().getText().trim());
            	else
            		sum += Double.parseDouble(((ADobPValue)((ASumValPSumList)list.getPSumList()).getPValue()).getDouble().getText().trim());

        	}
            else
        	{
        		if (((ASumValPSumList)node.getPSumList()).getPValue() instanceof AIntPValue)
            		sum += Integer.parseInt(((AIntPValue)((ASumValPSumList)node.getPSumList()).getPValue()).getInteger().getText().trim());
            	else
            		sum += Double.parseDouble(((ADobPValue)((ASumValPSumList)node.getPSumList()).getPValue()).getDouble().getText().trim());

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
        		dif = Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim());
        	else
        		dif = Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim());
        	if (node.getPValueList()instanceof AValueListPValueList)
        	{
        		AValueListPValueList list = (AValueListPValueList)node.getPValueList();
        		while (list.getPValueList() instanceof AValueListPValueList)
        		{
                	if (list.getPValue()instanceof AIntPValue)
                		dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
                	else
                		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());
        			
        			list = (AValueListPValueList) list.getPValueList();
        		}
            	if (list.getPValue()instanceof AIntPValue)
            		dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
            	else
            		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());

            	if (((AValuePValueList)list.getPValueList()).getPValue() instanceof AIntPValue)
            		dif -= Integer.parseInt(((AIntPValue)((AValuePValueList)list.getPValueList()).getPValue()).getInteger().getText().trim());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((AValuePValueList)list.getPValueList()).getPValue()).getDouble().getText().trim());

        	}
        	else
        	{
        		if (((AValuePValueList)node.getPValueList()).getPValue() instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)((AValuePValueList)node.getPValueList()).getPValue()).getInteger().getText().trim());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((AValuePValueList)node.getPValueList()).getPValue()).getDouble().getText().trim());

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
        		dif = Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim());
        	else
        		dif = Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim());
            if (node.getPDifList() instanceof ADifListPDifList)
        	{
            	ADifListPDifList list = (ADifListPDifList)node.getPDifList();
        		while (list.getPDifList() instanceof ADifListPDifList)
        		{
        			if (list.getPValue()instanceof AIntPValue)
                		dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
                	else
                		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());
        			
        			list = (ADifListPDifList) list.getPDifList();
        		}
        		if (list.getPValue()instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
            	else
            		dif -= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());

        		if (((ADifValPDifList)list.getPDifList()).getPValue() instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)((ADifValPDifList)list.getPDifList()).getPValue()).getInteger().getText().trim());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((ADifValPDifList)list.getPDifList()).getPValue()).getDouble().getText().trim());

        	}
            else
        	{
        		if (((ADifValPDifList)node.getPDifList()).getPValue() instanceof AIntPValue)
        			dif -= Integer.parseInt(((AIntPValue)((ADifValPDifList)node.getPDifList()).getPValue()).getInteger().getText().trim());
            	else
            		dif -= Double.parseDouble(((ADobPValue)((ADifValPDifList)node.getPDifList()).getPValue()).getDouble().getText().trim());

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
        		Helper.setOutput(""+-1*Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim()));
        	else
        		Helper.setOutput(""+-1*Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim()));
        }
        outAMinusPMinus(node);
    }
    public void caseAMinPMinus(AMinPMinus node)
    {
        inAMinPMinus(node);
        if(node.getMin() != null&&node.getPValue() != null)
        {
        	if (node.getPValue() instanceof AIntPValue)
        		Helper.setOutput(""+-1*Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim()));
        	else
        		Helper.setOutput(""+-1*Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim()));        }
        outAMinPMinus(node);
    }
    public void caseAProdPProduct(AProdPProduct node)
    {
        inAProdPProduct(node);
        if(node.getProduct() != null&&node.getPValue() != null&&node.getPValueList() != null)
        {
        	double prod = 0;
        	if (node.getPValue()instanceof AIntPValue)
        		prod = Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim());
        	else
        		prod = Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim());
        	if (node.getPValueList()instanceof AValueListPValueList)
        	{
        		AValueListPValueList list = (AValueListPValueList)node.getPValueList();
        		while (list.getPValueList() instanceof AValueListPValueList)
        		{
                	if (list.getPValue()instanceof AIntPValue)
                		prod *= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
                	else
                		prod *= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());
        			
        			list = (AValueListPValueList) list.getPValueList();
        		}
            	if (list.getPValue()instanceof AIntPValue)
            		prod *= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
            	else
            		prod *= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());

            	if (((AValuePValueList)list.getPValueList()).getPValue() instanceof AIntPValue)
            		prod *= Integer.parseInt(((AIntPValue)((AValuePValueList)list.getPValueList()).getPValue()).getInteger().getText().trim());
            	else
            		prod *= Double.parseDouble(((ADobPValue)((AValuePValueList)list.getPValueList()).getPValue()).getDouble().getText().trim());

        	}
        	else
        	{
        		if (((AValuePValueList)node.getPValueList()).getPValue() instanceof AIntPValue)
        			prod *= Integer.parseInt(((AIntPValue)((AValuePValueList)node.getPValueList()).getPValue()).getInteger().getText().trim());
            	else
            		prod *= Double.parseDouble(((ADobPValue)((AValuePValueList)node.getPValueList()).getPValue()).getDouble().getText().trim());

        	}
        	Helper.setOutput(""+prod);
        		
        }
        outAProdPProduct(node);
    }
    public void caseAMultPProduct(AMultPProduct node)
    {
        inAMultPProduct(node);
        if(node.getPValue() != null&&node.getPMultList() != null)
        {
        	int prod = 1;
        	if (node.getPValue()instanceof AIntPValue)
        		prod *= Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim());
        	else
        		prod *= Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim());
            if (node.getPMultList() instanceof AMultListPMultList)
        	{
            	AMultListPMultList list = (AMultListPMultList)node.getPMultList();
        		while (list.getPMultList() instanceof AMultListPMultList)
        		{
        			if (list.getPValue()instanceof AIntPValue)
        				prod *= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
                	else
                		prod *= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());
        			
        			list = (AMultListPMultList) list.getPMultList();
        		}
        		if (list.getPValue()instanceof AIntPValue)
        			prod *= Integer.parseInt(((AIntPValue)list.getPValue()).getInteger().getText().trim());
            	else
            		prod *= Double.parseDouble(((ADobPValue)list.getPValue()).getDouble().getText().trim());

        		if (((AMultValPMultList)list.getPMultList()).getPValue() instanceof AIntPValue)
        			prod *= Integer.parseInt(((AIntPValue)((AMultValPMultList)list.getPMultList()).getPValue()).getInteger().getText().trim());
            	else
            		prod *= Double.parseDouble(((ADobPValue)((AMultValPMultList)list.getPMultList()).getPValue()).getDouble().getText().trim());

        	}
            else
        	{
        		if (((AMultValPMultList)node.getPMultList()).getPValue() instanceof AIntPValue)
        			prod *= Integer.parseInt(((AIntPValue)((AMultValPMultList)node.getPMultList()).getPValue()).getInteger().getText().trim());
            	else
            		prod *= Double.parseDouble(((ADobPValue)((AMultValPMultList)node.getPMultList()).getPValue()).getDouble().getText().trim());

        	}
        	Helper.setOutput(""+prod);
        }
        outAMultPProduct(node);
    }
    public void caseAPModulo(APModulo node)
    {
        inAPModulo(node);
        if(node.getModulo() != null&&node.getDiv() != null&&node.getDivd() != null)
        {
        	Helper.setOutput(""+(int)(Integer.parseInt(node.getDiv().getText().trim())%Integer.parseInt(node.getDivd().getText().trim())));
        }
        outAPModulo(node);
    }    
    public void caseAPInt(APInt node)
    {
        inAPInt(node);
        if(node.getInt() != null&&node.getPValue() != null)
        {
        	if (node.getPValue()instanceof AIntPValue)
        		Helper.setOutput(""+Math.round(Math.floor(Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim()))));
        	else
        		Helper.setOutput(""+Math.round(Math.floor(Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim()))));
        }
        outAPInt(node);
    }
    public void caseAPRound(APRound node)
    {
        inAPRound(node);
        if(node.getRound() != null && node.getPValue() != null)
        {
            if (node.getPValue() instanceof AIntPValue )
            	Helper.setOutput(((AIntPValue)node.getPValue()).getInteger().getText().trim());
            else
            	Helper.setOutput(""+Math.round(Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim())));
            
        }
        outAPRound(node);
    }
    public void caseAPSqrt(APSqrt node)
    {
        inAPSqrt(node);
        if(node.getSqrt() != null&&node.getPValue() != null)
        {
        	if (node.getPValue() instanceof AIntPValue )
            	Helper.setOutput(""+Math.sqrt(Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim())));
            else
            	Helper.setOutput(""+Math.sqrt(Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim())));
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
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((AIntPValue)node.getBase()).getInteger().getText().trim()), Double.parseDouble(((AIntPValue)node.getExp()).getInteger().getText().trim())));
                else
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((AIntPValue)node.getBase()).getInteger().getText().trim()), Double.parseDouble(((ADobPValue)node.getExp()).getDouble().getText().trim())));
            else
            	if (node.getExp() instanceof AIntPValue )
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((ADobPValue)node.getBase()).getDouble().getText().trim()), Double.parseDouble(((AIntPValue)node.getExp()).getInteger().getText().trim())));
                else
                	Helper.setOutput(""+Math.pow(Double.parseDouble(((ADobPValue)node.getBase()).getDouble().getText().trim()), Double.parseDouble(((ADobPValue)node.getExp()).getDouble().getText().trim())));
        	
        }
        outAPPower(node);
    }
    public void caseAPExp(APExp node)
    {
        inAPExp(node);
        if(node.getExp() != null&&node.getPValue() != null)
        {
        	if (node.getPValue() instanceof AIntPValue )
            	Helper.setOutput(""+Math.pow(Math.E, (Integer.parseInt(((AIntPValue)node.getPValue()).getInteger().getText().trim()))));
            else
            	Helper.setOutput(""+Math.pow(Math.E, (Double.parseDouble(((ADobPValue)node.getPValue()).getDouble().getText().trim()))));
        }
        outAPExp(node);
    }
//	logic
    public void caseAPAnd(APAnd node)
    {
        inAPAnd(node);
        if(node.getAnd() != null&&node.getV1() != null&&node.getV2() != null)
        {
        	if (myBoolean.getBoolean(node.getV1()) && myBoolean.getBoolean(node.getV2()))
        		Helper.setOutput("true");
        	else
        		Helper.setOutput("false");
        }
        outAPAnd(node);
    }
    public void caseAPOr(APOr node)
    {
        inAPOr(node);
        if(node.getOr() != null&&node.getV1() != null&&node.getV2() != null)
        {
        	if (myBoolean.getBoolean(node.getV1())|| myBoolean.getBoolean(node.getV2()))
        		Helper.setOutput("true");
        	else
        		Helper.setOutput("false");    		
        }
        outAPOr(node);
    }
    public void caseAPNot(APNot node)
    {
        inAPNot(node);
        if(node.getNot() != null&&node.getV1() != null)
        {
    		if (myBoolean.getBoolean(node.getV1()))
       			Helper.setOutput("false");
    		else
        		Helper.setOutput("true");        	
        }
        outAPNot(node);
    }
//	graphics
    public void caseAFdsPGraphics(AFdsPGraphics node)
    {
        inAFdsPGraphics(node);
        if(node.getPForward() != null)
        {
            Integer dist = 0;
            if (node.getPForward() instanceof AForwardPForward)
            dist = Integer.parseInt(((AForwardPForward)node.getPForward()).getInteger().getText().trim());
            else
            dist = Integer.parseInt(((AFdPForward)node.getPForward()).getInteger().getText().trim());
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
            	dist = Integer.parseInt(((ABackPBack)node.getPBack()).getInteger().getText().trim());
            else
                dist = Integer.parseInt(((ABkPBack)node.getPBack()).getInteger().getText().trim());
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
        		degree = Integer.parseInt(((ALeftPLeft)node.getPLeft()).getInteger().getText().trim());
        	else
        		degree = Integer.parseInt(((ALtPLeft)node.getPLeft()).getInteger().getText().trim());
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
        		degree = Integer.parseInt(((ARightPRight)node.getPRight()).getInteger().getText().trim());
        	else
        		degree = Integer.parseInt(((ARtPRight)node.getPRight()).getInteger().getText().trim());
        	Helper.setTurtleAngle(degree);
        }
        outARtsPGraphics(node);
    }
    @SuppressWarnings("unchecked")
	public void caseAPSetpos(APSetpos node)
    {
        inAPSetpos(node);
        if(node.getSetpos() != null && node.getIdentifier() != null)
        {
        	if (Helper.getVariables().get(node.getIdentifier().getText().trim())!= null)
        	{
        		if (Helper.getVariables().get(node.getIdentifier().getText().trim())instanceof Vector)
        		{
        			Vector<String> lista = (Vector<String>)(Helper.getVariables().get(node.getIdentifier().getText().trim()));
        			if (lista.size()>=2)
        			{
        				try{
        					int x = Integer.parseInt(lista.get(0).trim());
        					int y = Integer.parseInt(lista.get(1).trim());
        		        	Helper.add(new myPoint(x,y, false));        				
        				}catch(Exception e){Helper.setOutput("Error: La lista no contiene números");}
        			}
        			else
        			Helper.setOutput("Error: La lista no contiene suficientes elementos");
        		}
        	}
        }
        outAPSetpos(node);
    }
    public void caseAPSetxy(APSetxy node)
    {
        inAPSetxy(node);
        if(node.getSetxy() != null && node.getX() != null && node.getY() != null)
        {
        	Helper.add(new myPoint(Helper.centerX+Integer.parseInt(node.getX().getText().trim()),Helper.centerY+Integer.parseInt(node.getY().getText().trim()), false));
        }
        outAPSetxy(node);
    }  
    public void caseAPSetx(APSetx node)
    {
        inAPSetx(node);
        if(node.getSetx() != null && node.getInteger() != null)
        {
        	Helper.add(new myPoint(Helper.centerX+Integer.parseInt(node.getInteger().getText().trim()),Helper.getPuntos().get(Helper.getPuntos().size()-1).Y(),false));
        }
        outAPSetx(node);
    }
    public void caseAPSety(APSety node)
    {
        inAPSety(node);
        if(node.getSety() != null && node.getInteger() != null)
        {
        	Helper.add(new myPoint(Helper.getPuntos().get(Helper.getPuntos().size()-1).X(),Helper.centerY+Integer.parseInt(node.getInteger().getText().trim()),false));
        }
        outAPSety(node);
    }
    public void caseASethsPGraphics(ASethsPGraphics node)
    {
        inASethsPGraphics(node);
        if(node.getPSetheading() != null)
        {
        	if (node.getPSetheading()instanceof ASetheadingPSetheading)
        		Helper.setTurtleAngle(-Helper.getTurtleAngle()+Integer.parseInt(((ASetheadingPSetheading)node.getPSetheading()).getInteger().getText().trim()));
        	else
        		Helper.setTurtleAngle(-Helper.getTurtleAngle()+Integer.parseInt(((ASethPSetheading)node.getPSetheading()).getInteger().getText().trim()));
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
        	Helper.add(new myPoint(anterior.X(), anterior.Y(), Integer.parseInt(node.getAngle().getText().trim()),Helper.getTurtleAngle(),Integer.parseInt(node.getRadius().getText().trim())));
        }
        outAPArc(node);
    }
    public void caseAClrPGraphics(AClrPGraphics node)
    {
        inAClrPGraphics(node);
        if(node.getPClearscreen() != null)
        {
        	myPoint turtlepos = Helper.getPuntos().get(Helper.getCantPuntos()-1);
        	turtlepos = new myPoint(turtlepos.X(), turtlepos.Y(), false);
        	Helper.clearPuntos();
        	Helper.add(turtlepos);
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
        			color = Integer.parseInt(((APredefPColor)(((ASetpencolorPSetpencolor)node.getPSetpencolor()).getPColor())).getInteger().getText().trim());
        		else
        		{
        			Helper.penColor = Helper.getColor(((ALstPColor)(((ASetpencolorPSetpencolor)node.getPSetpencolor()).getPColor())).getIdentifier().getText().trim());
        			System.out.println(Helper.penColor);
        			color = -1;
        		}

        	}
        	if (node.getPSetpencolor()instanceof ASetpcPSetpencolor)
        		if (((ASetpcPSetpencolor)node.getPSetpencolor()).getPColor()instanceof APredefPColor)
        			color = Integer.parseInt(((APredefPColor)(((ASetpcPSetpencolor)node.getPSetpencolor()).getPColor())).getInteger().getText().trim());
        		else
        		{
        			Helper.penColor = Helper.getColor(((ALstPColor)(((ASetpcPSetpencolor)node.getPSetpencolor()).getPColor())).getIdentifier().getText().trim());
        			System.out.println(Helper.penColor);
        			color = -1;
        		}
        			
        	
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
        		Helper.penSize = Integer.parseInt(((ASizePSetpensize) node.getPSetpensize()).getInteger().getText().trim());
        }
        outASetpensizePPencontrol(node);
    }
//	workspace
    public void caseAPTo(APTo node)
    {
        inAPTo(node);
        if(node.getTo() != null&&node.getIdentifier() != null&&node.getPInstructionlist() != null&&node.getEnd() != null)
        {
        	if (Helper.getFunciones().get(node.getIdentifier().getText().trim().trim()) == null)
        		Helper.getFunciones().put(node.getIdentifier().getText().trim().trim(), node.getPInstructionlist());
        }
        outAPTo(node);
    }
    public void caseACalltofunctionPInstruction(ACalltofunctionPInstruction node) //to exectute TO
    {
        inACalltofunctionPInstruction(node);
        if(node.getIdentifier() != null)
        {
        	System.out.println(Helper.getFunciones());
    		Object obj= Helper.getFunciones().get(node.getIdentifier().getText().trim().trim());
        	if (obj != null)
        	{
        		if (obj instanceof AInstPInstructionlist)
        			((AInstPInstructionlist)obj).apply(this);
        		if (obj instanceof AListaPInstructionlist)
        			((AListaPInstructionlist)obj).apply(this);
        	}
        	else
        		Helper.setOutput(node.getIdentifier().getText().trim()+" function not found");
        }
        outACalltofunctionPInstruction(node);
    }
    public void caseAMakesPWorkspace(AMakesPWorkspace node)
    {
        inAMakesPWorkspace(node);
        if(node.getPMake() != null)
    	{
        	if (node.getPMake()instanceof AVarnumPMake)
        	{
        		if(((AVarnumPMake)node.getPMake()).getValor() instanceof AIntPValue)
        			Helper.getVariables().put(((AVarnumPMake)node.getPMake()).getVar().getText().trim(), Integer.parseInt(((AIntPValue)((AVarnumPMake)node.getPMake()).getValor()).getInteger().getText().trim()));
        		else
        			Helper.getVariables().put(((AVarnumPMake)node.getPMake()).getVar().getText().trim(), Double.parseDouble(((ADobPValue)((AVarnumPMake)node.getPMake()).getValor()).getDouble().getText().trim()));
        	}
        	else
//        		if (((AVarwordPMake)node.getPMake()).getValor().toString().trim().equalsIgnoreCase("true") ||
//        				((AVarwordPMake)node.getPMake()).getValor().toString().trim().equalsIgnoreCase("false"))
        			Helper.getVariables().put(((AVarwordPMake)node.getPMake()).getVar().getText().trim(),((AVarwordPMake)node.getPMake()).getValor().toString());
//        		else
//        			Helper.setOutput("Cannot create variable "+((AVarwordPMake)node.getPMake()).getVar().getText().trim());
    		System.out.println(Helper.getVariables());
        		
        		
        }
        outAMakesPWorkspace(node);
    }
//  control
    public void caseARunPInstructionlist(ARunPInstructionlist node)
    {
        inARunPInstructionlist(node);
        if(node.getRun() != null&&node.getLKey() != null&&node.getPInstructionlist() != null&&node.getRKey() != null&&node.getSemi() != null)
        {
            node.getPInstructionlist().apply(this);
        }
        outARunPInstructionlist(node);
    }
    public void caseAPRepeat(APRepeat node)
    {
        inAPRepeat(node);
        if(node.getPInstructionlist() != null)
        {
        	for (int i = 0 ; i < Integer.parseInt(node.getInteger().getText().trim()); i++)
        		node.getPInstructionlist().apply(this);
        }
        outAPRepeat(node);
    }
    public void caseAIfPIf(AIfPIf node)
    {
        inAIfPIf(node);
        if(node.getIf() != null&&node.getLPar() != null&&node.getPBoolean() != null&&node.getRPar() != null&&node.getLBrk() != null&&node.getPInstructionlist() != null&&node.getRBrk() != null)
        {
        	if (myBoolean.getBoolean(node.getPBoolean()))
        		node.getPInstructionlist().apply(this);
        }
        outAIfPIf(node);
    }
    public void caseAIfelsePIf(AIfelsePIf node)
    {
        inAIfelsePIf(node);
        if(node.getIf() != null&&node.getLPar() != null&&node.getPBoolean() != null
        		&&node.getRPar() != null&&node.getLBrk() != null&&node.getTrue() != null&&node.getRBrk() != null
        		&&node.getFalsel() != null&&node.getFalse() != null&&node.getFalser() != null)
        {
            if (myBoolean.getBoolean(node.getPBoolean()))
            	node.getTrue().apply(this);
            else
            	node.getFalse().apply(this);
        }
        outAIfelsePIf(node);
    }
    public void caseAPIfelse(APIfelse node)
    {
        inAPIfelse(node);
        if(node.getIfelse() != null&&node.getLPar() != null&&node.getPBoolean() != null
        		&&node.getRPar() != null&&node.getLBrk() != null&&node.getInst1() != null
        		&&node.getRBrk() != null&&node.getFalsel() != null&&node.getInst2() != null&&node.getFalser() != null)
        {
        	if (myBoolean.getBoolean(node.getPBoolean()))
        		node.getInst1().apply(this);
        	else
        		node.getInst2().apply(this);
        }
        outAPIfelse(node);
    }
    public void caseAStopPControlStructures(AStopPControlStructures node)
    {
        inAStopPControlStructures(node);
        if(node.getPStop() != null)
        {
        	Node darkvader = node.parent();
        	while (darkvader.parent() != null)
        		darkvader = darkvader.parent();
        	Helper.setOutput(darkvader+": yo soy tu padre ");
        	Helper.setOutput("Luke says : NOOOOOOOOOOOOOOOOP!!!");
        	return;
        }
        outAStopPControlStructures(node);
    }
    public void caseAPGoto(APGoto node)
    {
        inAPGoto(node);
        if(node.getGoto() != null&&node.getIdentifier() != null)
        {
        	Helper.setOutput("GOOOOOOOOOOOOOOOO!!!");
        	
        }
        outAPGoto(node);
    }

}