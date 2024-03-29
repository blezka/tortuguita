/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ASumPArithmetic extends PPArithmetic
{
    private PPSum _pSum_;

    public ASumPArithmetic()
    {
        // Constructor
    }

    public ASumPArithmetic(
        @SuppressWarnings("hiding") PPSum _pSum_)
    {
        // Constructor
        setPSum(_pSum_);

    }

    @Override
    public Object clone()
    {
        return new ASumPArithmetic(
            cloneNode(this._pSum_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASumPArithmetic(this);
    }

    public PPSum getPSum()
    {
        return this._pSum_;
    }

    public void setPSum(PPSum node)
    {
        if(this._pSum_ != null)
        {
            this._pSum_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pSum_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pSum_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pSum_ == child)
        {
            this._pSum_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pSum_ == oldChild)
        {
            setPSum((PPSum) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
