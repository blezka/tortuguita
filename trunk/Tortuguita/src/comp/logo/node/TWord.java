/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class TWord extends Token
{
    public TWord()
    {
        super.setText("WORD");
    }

    public TWord(int line, int pos)
    {
        super.setText("WORD");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TWord(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTWord(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TWord text.");
    }
}
