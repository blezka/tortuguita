/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TSety extends Token
{
    public TSety()
    {
        super.setText("SETY");
    }

    public TSety(int line, int pos)
    {
        super.setText("SETY");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSety(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSety(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSety text.");
    }
}
