/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TSetpos extends Token
{
    public TSetpos()
    {
        super.setText("SETPOS");
    }

    public TSetpos(int line, int pos)
    {
        super.setText("SETPOS");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSetpos(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSetpos(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSetpos text.");
    }
}