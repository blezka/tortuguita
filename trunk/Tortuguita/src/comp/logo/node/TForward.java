/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TForward extends Token
{
    public TForward()
    {
        super.setText("FORWARD");
    }

    public TForward(int line, int pos)
    {
        super.setText("FORWARD");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TForward(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTForward(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TForward text.");
    }
}