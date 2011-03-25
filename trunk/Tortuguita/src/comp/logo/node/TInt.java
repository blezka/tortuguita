/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TInt extends Token
{
    public TInt()
    {
        super.setText("INT");
    }

    public TInt(int line, int pos)
    {
        super.setText("INT");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInt(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInt text.");
    }
}
