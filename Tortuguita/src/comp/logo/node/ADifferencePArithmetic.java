/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ADifferencePArithmetic extends PPArithmetic
{
    private PPDifference _pDifference_;

    public ADifferencePArithmetic()
    {
        // Constructor
    }

    public ADifferencePArithmetic(
        @SuppressWarnings("hiding") PPDifference _pDifference_)
    {
        // Constructor
        setPDifference(_pDifference_);

    }

    @Override
    public Object clone()
    {
        return new ADifferencePArithmetic(
            cloneNode(this._pDifference_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADifferencePArithmetic(this);
    }

    public PPDifference getPDifference()
    {
        return this._pDifference_;
    }

    public void setPDifference(PPDifference node)
    {
        if(this._pDifference_ != null)
        {
            this._pDifference_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pDifference_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pDifference_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pDifference_ == child)
        {
            this._pDifference_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pDifference_ == oldChild)
        {
            setPDifference((PPDifference) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
