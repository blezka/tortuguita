/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TTrue extends Token
{
    public TTrue()
    {
        super.setText("TRUE");
    }

    public TTrue(int line, int pos)
    {
        super.setText("TRUE");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TTrue(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTrue(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TTrue text.");
    }
}
