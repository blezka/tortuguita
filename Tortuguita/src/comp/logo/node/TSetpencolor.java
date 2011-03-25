/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TSetpencolor extends Token
{
    public TSetpencolor()
    {
        super.setText("SETPENCOLOR");
    }

    public TSetpencolor(int line, int pos)
    {
        super.setText("SETPENCOLOR");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSetpencolor(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSetpencolor(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSetpencolor text.");
    }
}
