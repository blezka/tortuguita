/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APArc extends PPArc
{
    private TArc _arc_;
    private TInteger _integer_;
    private PPValue _pValue_;

    public APArc()
    {
        // Constructor
    }

    public APArc(
        @SuppressWarnings("hiding") TArc _arc_,
        @SuppressWarnings("hiding") TInteger _integer_,
        @SuppressWarnings("hiding") PPValue _pValue_)
    {
        // Constructor
        setArc(_arc_);

        setInteger(_integer_);

        setPValue(_pValue_);

    }

    @Override
    public Object clone()
    {
        return new APArc(
            cloneNode(this._arc_),
            cloneNode(this._integer_),
            cloneNode(this._pValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPArc(this);
    }

    public TArc getArc()
    {
        return this._arc_;
    }

    public void setArc(TArc node)
    {
        if(this._arc_ != null)
        {
            this._arc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arc_ = node;
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

    public PPValue getPValue()
    {
        return this._pValue_;
    }

    public void setPValue(PPValue node)
    {
        if(this._pValue_ != null)
        {
            this._pValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arc_)
            + toString(this._integer_)
            + toString(this._pValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arc_ == child)
        {
            this._arc_ = null;
            return;
        }

        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        if(this._pValue_ == child)
        {
            this._pValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arc_ == oldChild)
        {
            setArc((TArc) newChild);
            return;
        }

        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        if(this._pValue_ == oldChild)
        {
            setPValue((PPValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
