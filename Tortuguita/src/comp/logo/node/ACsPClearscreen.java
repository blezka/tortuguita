/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ACsPClearscreen extends PPClearscreen
{
    private TCs _cs_;

    public ACsPClearscreen()
    {
        // Constructor
    }

    public ACsPClearscreen(
        @SuppressWarnings("hiding") TCs _cs_)
    {
        // Constructor
        setCs(_cs_);

    }

    @Override
    public Object clone()
    {
        return new ACsPClearscreen(
            cloneNode(this._cs_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACsPClearscreen(this);
    }

    public TCs getCs()
    {
        return this._cs_;
    }

    public void setCs(TCs node)
    {
        if(this._cs_ != null)
        {
            this._cs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cs_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cs_ == child)
        {
            this._cs_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cs_ == oldChild)
        {
            setCs((TCs) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
