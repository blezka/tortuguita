package comp.logo;

import comp.logo.node.AFalsePBoolean;
import comp.logo.node.ATruePBoolean;
import comp.logo.node.AVarPBoolean;
import comp.logo.node.PPBoolean;

public class myBoolean  {
	
	public static boolean getBoolean(PPBoolean node)
	{
		if (node instanceof ATruePBoolean)
			return true;
		else if (node instanceof AFalsePBoolean)
			return false;
		else
		{
			String var1 = "";
			if (Helper.getVariables().get(((AVarPBoolean)node).getIdentifier().getText())!= null)
				var1 = Helper.getVariables().get(((AVarPBoolean)node).getIdentifier().getText()).toString();
		
			if (var1.trim().equalsIgnoreCase("true"))
	   			return true;
		}
		return false;
	}

		
}
