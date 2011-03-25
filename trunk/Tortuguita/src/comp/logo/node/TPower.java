/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TPower extends Token
{
    public TPower()
    {
        super.setText("POWER");
    }

    public TPower(int line, int pos)
    {
        super.setText("POWER");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPower(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPower(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPower text.");
    }
}
