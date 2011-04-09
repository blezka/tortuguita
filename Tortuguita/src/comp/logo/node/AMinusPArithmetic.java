/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AMinusPArithmetic extends PPArithmetic
{
    private PPMinus _pMinus_;

    public AMinusPArithmetic()
    {
        // Constructor
    }

    public AMinusPArithmetic(
        @SuppressWarnings("hiding") PPMinus _pMinus_)
    {
        // Constructor
        setPMinus(_pMinus_);

    }

    @Override
    public Object clone()
    {
        return new AMinusPArithmetic(
            cloneNode(this._pMinus_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusPArithmetic(this);
    }

    public PPMinus getPMinus()
    {
        return this._pMinus_;
    }

    public void setPMinus(PPMinus node)
    {
        if(this._pMinus_ != null)
        {
            this._pMinus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pMinus_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pMinus_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pMinus_ == child)
        {
            this._pMinus_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pMinus_ == oldChild)
        {
            setPMinus((PPMinus) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}