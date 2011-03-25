/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TStop extends Token
{
    public TStop()
    {
        super.setText("STOP");
    }

    public TStop(int line, int pos)
    {
        super.setText("STOP");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStop(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStop(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStop text.");
    }
}
