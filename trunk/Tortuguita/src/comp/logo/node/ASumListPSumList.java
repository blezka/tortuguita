/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ASumListPSumList extends PPSumList
{
    private TPlus _plus_;
    private PPValue _pValue_;
    private PPSumList _pSumList_;

    public ASumListPSumList()
    {
        // Constructor
    }

    public ASumListPSumList(
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PPValue _pValue_,
        @SuppressWarnings("hiding") PPSumList _pSumList_)
    {
        // Constructor
        setPlus(_plus_);

        setPValue(_pValue_);

        setPSumList(_pSumList_);

    }

    @Override
    public Object clone()
    {
        return new ASumListPSumList(
            cloneNode(this._plus_),
            cloneNode(this._pValue_),
            cloneNode(this._pSumList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASumListPSumList(this);
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
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

    public PPSumList getPSumList()
    {
        return this._pSumList_;
    }

    public void setPSumList(PPSumList node)
    {
        if(this._pSumList_ != null)
        {
            this._pSumList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pSumList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._plus_)
            + toString(this._pValue_)
            + toString(this._pSumList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._pValue_ == child)
        {
            this._pValue_ = null;
            return;
        }

        if(this._pSumList_ == child)
        {
            this._pSumList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._pValue_ == oldChild)
        {
            setPValue((PPValue) newChild);
            return;
        }

        if(this._pSumList_ == oldChild)
        {
            setPSumList((PPSumList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
