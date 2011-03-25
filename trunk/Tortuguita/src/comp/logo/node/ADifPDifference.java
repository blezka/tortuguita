/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ADifPDifference extends PPDifference
{
    private TDifference _difference_;
    private PPValue _pValue_;
    private PPValueList _pValueList_;

    public ADifPDifference()
    {
        // Constructor
    }

    public ADifPDifference(
        @SuppressWarnings("hiding") TDifference _difference_,
        @SuppressWarnings("hiding") PPValue _pValue_,
        @SuppressWarnings("hiding") PPValueList _pValueList_)
    {
        // Constructor
        setDifference(_difference_);

        setPValue(_pValue_);

        setPValueList(_pValueList_);

    }

    @Override
    public Object clone()
    {
        return new ADifPDifference(
            cloneNode(this._difference_),
            cloneNode(this._pValue_),
            cloneNode(this._pValueList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADifPDifference(this);
    }

    public TDifference getDifference()
    {
        return this._difference_;
    }

    public void setDifference(TDifference node)
    {
        if(this._difference_ != null)
        {
            this._difference_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._difference_ = node;
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

    public PPValueList getPValueList()
    {
        return this._pValueList_;
    }

    public void setPValueList(PPValueList node)
    {
        if(this._pValueList_ != null)
        {
            this._pValueList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pValueList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._difference_)
            + toString(this._pValue_)
            + toString(this._pValueList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._difference_ == child)
        {
            this._difference_ = null;
            return;
        }

        if(this._pValue_ == child)
        {
            this._pValue_ = null;
            return;
        }

        if(this._pValueList_ == child)
        {
            this._pValueList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._difference_ == oldChild)
        {
            setDifference((TDifference) newChild);
            return;
        }

        if(this._pValue_ == oldChild)
        {
            setPValue((PPValue) newChild);
            return;
        }

        if(this._pValueList_ == oldChild)
        {
            setPValueList((PPValueList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
