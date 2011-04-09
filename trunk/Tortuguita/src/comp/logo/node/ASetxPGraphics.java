/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ASetxPGraphics extends PPGraphics
{
    private PPSetx _pSetx_;

    public ASetxPGraphics()
    {
        // Constructor
    }

    public ASetxPGraphics(
        @SuppressWarnings("hiding") PPSetx _pSetx_)
    {
        // Constructor
        setPSetx(_pSetx_);

    }

    @Override
    public Object clone()
    {
        return new ASetxPGraphics(
            cloneNode(this._pSetx_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASetxPGraphics(this);
    }

    public PPSetx getPSetx()
    {
        return this._pSetx_;
    }

    public void setPSetx(PPSetx node)
    {
        if(this._pSetx_ != null)
        {
            this._pSetx_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pSetx_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pSetx_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pSetx_ == child)
        {
            this._pSetx_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pSetx_ == oldChild)
        {
            setPSetx((PPSetx) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
