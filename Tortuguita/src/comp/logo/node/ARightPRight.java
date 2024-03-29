/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ARightPRight extends PPRight
{
    private TRight _right_;
    private TInteger _integer_;

    public ARightPRight()
    {
        // Constructor
    }

    public ARightPRight(
        @SuppressWarnings("hiding") TRight _right_,
        @SuppressWarnings("hiding") TInteger _integer_)
    {
        // Constructor
        setRight(_right_);

        setInteger(_integer_);

    }

    @Override
    public Object clone()
    {
        return new ARightPRight(
            cloneNode(this._right_),
            cloneNode(this._integer_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARightPRight(this);
    }

    public TRight getRight()
    {
        return this._right_;
    }

    public void setRight(TRight node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    public TInteger getInteger()
    {
        return this._integer_;
    }

    public void setInteger(TInteger node)
    {
        if(this._integer_ != null)
        {
            this._integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integer_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._right_)
            + toString(this._integer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._right_ == oldChild)
        {
            setRight((TRight) newChild);
            return;
        }

        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
