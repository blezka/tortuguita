/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TFalse extends Token
{
    public TFalse()
    {
        super.setText("FALSE");
    }

    public TFalse(int line, int pos)
    {
        super.setText("FALSE");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFalse(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFalse(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFalse text.");
    }
}
