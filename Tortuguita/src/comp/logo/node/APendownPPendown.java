/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APendownPPendown extends PPPendown
{
    private TPendown _pendown_;

    public APendownPPendown()
    {
        // Constructor
    }

    public APendownPPendown(
        @SuppressWarnings("hiding") TPendown _pendown_)
    {
        // Constructor
        setPendown(_pendown_);

    }

    @Override
    public Object clone()
    {
        return new APendownPPendown(
            cloneNode(this._pendown_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPendownPPendown(this);
    }

    public TPendown getPendown()
    {
        return this._pendown_;
    }

    public void setPendown(TPendown node)
    {
        if(this._pendown_ != null)
        {
            this._pendown_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pendown_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pendown_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pendown_ == child)
        {
            this._pendown_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pendown_ == oldChild)
        {
            setPendown((TPendown) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
