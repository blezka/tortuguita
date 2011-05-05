/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APPower extends PPPower
{
    private TPower _power_;
    private PPValue _base_;
    private PPValue _exp_;

    public APPower()
    {
        // Constructor
    }

    public APPower(
        @SuppressWarnings("hiding") TPower _power_,
        @SuppressWarnings("hiding") PPValue _base_,
        @SuppressWarnings("hiding") PPValue _exp_)
    {
        // Constructor
        setPower(_power_);

        setBase(_base_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new APPower(
            cloneNode(this._power_),
            cloneNode(this._base_),
            cloneNode(this._exp_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPPower(this);
    }

    public TPower getPower()
    {
        return this._power_;
    }

    public void setPower(TPower node)
    {
        if(this._power_ != null)
        {
            this._power_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._power_ = node;
    }

    public PPValue getBase()
    {
        return this._base_;
    }

    public void setBase(PPValue node)
    {
        if(this._base_ != null)
        {
            this._base_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._base_ = node;
    }

    public PPValue getExp()
    {
        return this._exp_;
    }

    public void setExp(PPValue node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._power_)
            + toString(this._base_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._power_ == child)
        {
            this._power_ = null;
            return;
        }

        if(this._base_ == child)
        {
            this._base_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._power_ == oldChild)
        {
            setPower((TPower) newChild);
            return;
        }

        if(this._base_ == oldChild)
        {
            setBase((PPValue) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PPValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}