/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TSetheading extends Token
{
    public TSetheading()
    {
        super.setText("SETHEADING");
    }

    public TSetheading(int line, int pos)
    {
        super.setText("SETHEADING");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSetheading(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSetheading(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSetheading text.");
    }
}
