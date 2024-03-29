/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TPd extends Token
{
    public TPd()
    {
        super.setText("PD");
    }

    public TPd(int line, int pos)
    {
        super.setText("PD");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPd(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPd(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPd text.");
    }
}
