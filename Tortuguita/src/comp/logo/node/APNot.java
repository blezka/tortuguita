/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APNot extends PPNot
{
    private TNot _not_;
    private PPBoolean _v1_;

    public APNot()
    {
        // Constructor
    }

    public APNot(
        @SuppressWarnings("hiding") TNot _not_,
        @SuppressWarnings("hiding") PPBoolean _v1_)
    {
        // Constructor
        setNot(_not_);

        setV1(_v1_);

    }

    @Override
    public Object clone()
    {
        return new APNot(
            cloneNode(this._not_),
            cloneNode(this._v1_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPNot(this);
    }

    public TNot getNot()
    {
        return this._not_;
    }

    public void setNot(TNot node)
    {
        if(this._not_ != null)
        {
            this._not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._not_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._not_)
            + toString(this._v1_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._not_ == child)
        {
            this._not_ = null;
            return;
        }

        if(this._v1_ == child)
        {
            this._v1_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(this._v1_ == oldChild)
        {
            setV1((PPBoolean) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}