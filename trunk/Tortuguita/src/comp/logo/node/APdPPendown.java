/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APdPPendown extends PPPendown
{
    private TPd _pd_;

    public APdPPendown()
    {
        // Constructor
    }

    public APdPPendown(
        @SuppressWarnings("hiding") TPd _pd_)
    {
        // Constructor
        setPd(_pd_);

    }

    @Override
    public Object clone()
    {
        return new APdPPendown(
            cloneNode(this._pd_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPdPPendown(this);
    }

    public TPd getPd()
    {
        return this._pd_;
    }

    public void setPd(TPd node)
    {
        if(this._pd_ != null)
        {
            this._pd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pd_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pd_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pd_ == child)
        {
            this._pd_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pd_ == oldChild)
        {
            setPd((TPd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}