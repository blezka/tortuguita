/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TPr extends Token
{
    public TPr()
    {
        super.setText("PR");
    }

    public TPr(int line, int pos)
    {
        super.setText("PR");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPr(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPr(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPr text.");
    }
}
