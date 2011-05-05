/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TRt extends Token
{
    public TRt()
    {
        super.setText("RT");
    }

    public TRt(int line, int pos)
    {
        super.setText("RT");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRt text.");
    }
}
