/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AAndPLogic extends PPLogic
{
    private PPAnd _pAnd_;

    public AAndPLogic()
    {
        // Constructor
    }

    public AAndPLogic(
        @SuppressWarnings("hiding") PPAnd _pAnd_)
    {
        // Constructor
        setPAnd(_pAnd_);

    }

    @Override
    public Object clone()
    {
        return new AAndPLogic(
            cloneNode(this._pAnd_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndPLogic(this);
    }

    public PPAnd getPAnd()
    {
        return this._pAnd_;
    }

    public void setPAnd(PPAnd node)
    {
        if(this._pAnd_ != null)
        {
            this._pAnd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pAnd_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pAnd_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pAnd_ == child)
        {
            this._pAnd_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pAnd_ == oldChild)
        {
            setPAnd((PPAnd) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
