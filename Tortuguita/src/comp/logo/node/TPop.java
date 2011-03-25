/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TPop extends Token
{
    public TPop()
    {
        super.setText("POP");
    }

    public TPop(int line, int pos)
    {
        super.setText("POP");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPop(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPop(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPop text.");
    }
}
