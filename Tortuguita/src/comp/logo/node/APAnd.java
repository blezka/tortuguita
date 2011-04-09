/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APAnd extends PPAnd
{
    private TAnd _and_;
    private PPBoolean _v1_;
    private PPBoolean _v2_;

    public APAnd()
    {
        // Constructor
    }

    public APAnd(
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PPBoolean _v1_,
        @SuppressWarnings("hiding") PPBoolean _v2_)
    {
        // Constructor
        setAnd(_and_);

        setV1(_v1_);

        setV2(_v2_);

    }

    @Override
    public Object clone()
    {
        return new APAnd(
            cloneNode(this._and_),
            cloneNode(this._v1_),
            cloneNode(this._v2_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPAnd(this);
    }

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    public PPBoolean getV1()
    {
        return this._v1_;
    }

    public void setV1(PPBoolean node)
    {
        if(this._v1_ != null)
        {
            this._v1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._v1_ = node;
    }

    public PPBoolean getV2()
    {
        return this._v2_;
    }

    public void setV2(PPBoolean node)
    {
        if(this._v2_ != null)
        {
            this._v2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._v2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._and_)
            + toString(this._v1_)
            + toString(this._v2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._and_ == child)
        {
            this._and_ = null;
            return;
        }

        if(this._v1_ == child)
        {
            this._v1_ = null;
            return;
        }

        if(this._v2_ == child)
        {
            this._v2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._v1_ == oldChild)
        {
            setV1((PPBoolean) newChild);
            return;
        }

        if(this._v2_ == oldChild)
        {
            setV2((PPBoolean) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
