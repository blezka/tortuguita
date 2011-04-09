/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AModuloPArithmetic extends PPArithmetic
{
    private PPModulo _pModulo_;

    public AModuloPArithmetic()
    {
        // Constructor
    }

    public AModuloPArithmetic(
        @SuppressWarnings("hiding") PPModulo _pModulo_)
    {
        // Constructor
        setPModulo(_pModulo_);

    }

    @Override
    public Object clone()
    {
        return new AModuloPArithmetic(
            cloneNode(this._pModulo_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAModuloPArithmetic(this);
    }

    public PPModulo getPModulo()
    {
        return this._pModulo_;
    }

    public void setPModulo(PPModulo node)
    {
        if(this._pModulo_ != null)
        {
            this._pModulo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pModulo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pModulo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pModulo_ == child)
        {
            this._pModulo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pModulo_ == oldChild)
        {
            setPModulo((PPModulo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
