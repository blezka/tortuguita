/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APPower extends PPPower
{
    private TPower _power_;

    public APPower()
    {
        // Constructor
    }

    public APPower(
        @SuppressWarnings("hiding") TPower _power_)
    {
        // Constructor
        setPower(_power_);

    }

    @Override
    public Object clone()
    {
        return new APPower(
            cloneNode(this._power_));
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._power_);
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

        throw new RuntimeException("Not a child.");
    }
}
