/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APStop extends PPStop
{
    private TStop _stop_;

    public APStop()
    {
        // Constructor
    }

    public APStop(
        @SuppressWarnings("hiding") TStop _stop_)
    {
        // Constructor
        setStop(_stop_);

    }

    @Override
    public Object clone()
    {
        return new APStop(
            cloneNode(this._stop_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPStop(this);
    }

    public TStop getStop()
    {
        return this._stop_;
    }

    public void setStop(TStop node)
    {
        if(this._stop_ != null)
        {
            this._stop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stop_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stop_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stop_ == child)
        {
            this._stop_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stop_ == oldChild)
        {
            setStop((TStop) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
