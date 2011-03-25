/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TRound extends Token
{
    public TRound()
    {
        super.setText("ROUND");
    }

    public TRound(int line, int pos)
    {
        super.setText("ROUND");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRound(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRound(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRound text.");
    }
}
