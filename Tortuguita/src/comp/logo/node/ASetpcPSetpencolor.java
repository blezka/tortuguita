/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ASetpcPSetpencolor extends PPSetpencolor
{
    private TSetpc _setpc_;
    private PPColor _pColor_;

    public ASetpcPSetpencolor()
    {
        // Constructor
    }

    public ASetpcPSetpencolor(
        @SuppressWarnings("hiding") TSetpc _setpc_,
        @SuppressWarnings("hiding") PPColor _pColor_)
    {
        // Constructor
        setSetpc(_setpc_);

        setPColor(_pColor_);

    }

    @Override
    public Object clone()
    {
        return new ASetpcPSetpencolor(
            cloneNode(this._setpc_),
            cloneNode(this._pColor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASetpcPSetpencolor(this);
    }

    public TSetpc getSetpc()
    {
        return this._setpc_;
    }

    public void setSetpc(TSetpc node)
    {
        if(this._setpc_ != null)
        {
            this._setpc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setpc_ = node;
    }

    public PPColor getPColor()
    {
        return this._pColor_;
    }

    public void setPColor(PPColor node)
    {
        if(this._pColor_ != null)
        {
            this._pColor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pColor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._setpc_)
            + toString(this._pColor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._setpc_ == child)
        {
            this._setpc_ = null;
            return;
        }

        if(this._pColor_ == child)
        {
            this._pColor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._setpc_ == oldChild)
        {
            setSetpc((TSetpc) newChild);
            return;
        }

        if(this._pColor_ == oldChild)
        {
            setPColor((PPColor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}