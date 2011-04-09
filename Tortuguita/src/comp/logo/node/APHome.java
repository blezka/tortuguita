/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APHome extends PPHome
{
    private THome _home_;

    public APHome()
    {
        // Constructor
    }

    public APHome(
        @SuppressWarnings("hiding") THome _home_)
    {
        // Constructor
        setHome(_home_);

    }

    @Override
    public Object clone()
    {
        return new APHome(
            cloneNode(this._home_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPHome(this);
    }

    public THome getHome()
    {
        return this._home_;
    }

    public void setHome(THome node)
    {
        if(this._home_ != null)
        {
            this._home_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._home_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._home_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._home_ == child)
        {
            this._home_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._home_ == oldChild)
        {
            setHome((THome) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
