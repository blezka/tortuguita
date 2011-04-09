/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ABkPBack extends PPBack
{
    private TBk _bk_;
    private PPValue _pValue_;

    public ABkPBack()
    {
        // Constructor
    }

    public ABkPBack(
        @SuppressWarnings("hiding") TBk _bk_,
        @SuppressWarnings("hiding") PPValue _pValue_)
    {
        // Constructor
        setBk(_bk_);

        setPValue(_pValue_);

    }

    @Override
    public Object clone()
    {
        return new ABkPBack(
            cloneNode(this._bk_),
            cloneNode(this._pValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABkPBack(this);
    }

    public TBk getBk()
    {
        return this._bk_;
    }

    public void setBk(TBk node)
    {
        if(this._bk_ != null)
        {
            this._bk_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bk_ = node;
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
            + toString(this._bk_)
            + toString(this._pValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bk_ == child)
        {
            this._bk_ = null;
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
        if(this._bk_ == oldChild)
        {
            setBk((TBk) newChild);
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