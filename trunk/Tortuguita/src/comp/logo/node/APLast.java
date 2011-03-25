/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APLast extends PPLast
{
    private TLast _last_;
    private PPThing _pThing_;

    public APLast()
    {
        // Constructor
    }

    public APLast(
        @SuppressWarnings("hiding") TLast _last_,
        @SuppressWarnings("hiding") PPThing _pThing_)
    {
        // Constructor
        setLast(_last_);

        setPThing(_pThing_);

    }

    @Override
    public Object clone()
    {
        return new APLast(
            cloneNode(this._last_),
            cloneNode(this._pThing_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPLast(this);
    }

    public TLast getLast()
    {
        return this._last_;
    }

    public void setLast(TLast node)
    {
        if(this._last_ != null)
        {
            this._last_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._last_ = node;
    }

    public PPThing getPThing()
    {
        return this._pThing_;
    }

    public void setPThing(PPThing node)
    {
        if(this._pThing_ != null)
        {
            this._pThing_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pThing_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._last_)
            + toString(this._pThing_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._last_ == child)
        {
            this._last_ = null;
            return;
        }

        if(this._pThing_ == child)
        {
            this._pThing_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._last_ == oldChild)
        {
            setLast((TLast) newChild);
            return;
        }

        if(this._pThing_ == oldChild)
        {
            setPThing((PPThing) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
