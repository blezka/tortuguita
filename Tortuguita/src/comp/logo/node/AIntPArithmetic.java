/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AIntPArithmetic extends PPArithmetic
{
    private PPInt _pInt_;

    public AIntPArithmetic()
    {
        // Constructor
    }

    public AIntPArithmetic(
        @SuppressWarnings("hiding") PPInt _pInt_)
    {
        // Constructor
        setPInt(_pInt_);

    }

    @Override
    public Object clone()
    {
        return new AIntPArithmetic(
            cloneNode(this._pInt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntPArithmetic(this);
    }

    public PPInt getPInt()
    {
        return this._pInt_;
    }

    public void setPInt(PPInt node)
    {
        if(this._pInt_ != null)
        {
            this._pInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pInt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pInt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pInt_ == child)
        {
            this._pInt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pInt_ == oldChild)
        {
            setPInt((PPInt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
