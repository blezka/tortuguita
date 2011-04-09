/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ALtPLeft extends PPLeft
{
    private TLf _lf_;
    private PPValue _pValue_;

    public ALtPLeft()
    {
        // Constructor
    }

    public ALtPLeft(
        @SuppressWarnings("hiding") TLf _lf_,
        @SuppressWarnings("hiding") PPValue _pValue_)
    {
        // Constructor
        setLf(_lf_);

        setPValue(_pValue_);

    }

    @Override
    public Object clone()
    {
        return new ALtPLeft(
            cloneNode(this._lf_),
            cloneNode(this._pValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALtPLeft(this);
    }

    public TLf getLf()
    {
        return this._lf_;
    }

    public void setLf(TLf node)
    {
        if(this._lf_ != null)
        {
            this._lf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lf_ = node;
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
            + toString(this._lf_)
            + toString(this._pValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lf_ == child)
        {
            this._lf_ = null;
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
        if(this._lf_ == oldChild)
        {
            setLf((TLf) newChild);
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