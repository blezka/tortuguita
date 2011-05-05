/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class ALeftPLeft extends PPLeft
{
    private TLeft _left_;
    private TInteger _integer_;

    public ALeftPLeft()
    {
        // Constructor
    }

    public ALeftPLeft(
        @SuppressWarnings("hiding") TLeft _left_,
        @SuppressWarnings("hiding") TInteger _integer_)
    {
        // Constructor
        setLeft(_left_);

        setInteger(_integer_);

    }

    @Override
    public Object clone()
    {
        return new ALeftPLeft(
            cloneNode(this._left_),
            cloneNode(this._integer_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeftPLeft(this);
    }

    public TLeft getLeft()
    {
        return this._left_;
    }

    public void setLeft(TLeft node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
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
            + toString(this._left_)
            + toString(this._integer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
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
        if(this._left_ == oldChild)
        {
            setLeft((TLeft) newChild);
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
