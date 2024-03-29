/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APSety extends PPSety
{
    private TSety _sety_;
    private TInteger _integer_;

    public APSety()
    {
        // Constructor
    }

    public APSety(
        @SuppressWarnings("hiding") TSety _sety_,
        @SuppressWarnings("hiding") TInteger _integer_)
    {
        // Constructor
        setSety(_sety_);

        setInteger(_integer_);

    }

    @Override
    public Object clone()
    {
        return new APSety(
            cloneNode(this._sety_),
            cloneNode(this._integer_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPSety(this);
    }

    public TSety getSety()
    {
        return this._sety_;
    }

    public void setSety(TSety node)
    {
        if(this._sety_ != null)
        {
            this._sety_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sety_ = node;
    }

    public TInteger getInteger()
    {
        return this._integer_;
    }

    public void setInteger(TInteger node)
    {
        if(this._integer_ != null)
        {
            this._integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integer_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._sety_)
            + toString(this._integer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._sety_ == child)
        {
            this._sety_ = null;
            return;
        }

        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._sety_ == oldChild)
        {
            setSety((TSety) newChild);
            return;
        }

        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
