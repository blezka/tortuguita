/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APrPPrint extends PPPrint
{
    private PPThingList _pThingList_;

    public APrPPrint()
    {
        // Constructor
    }

    public APrPPrint(
        @SuppressWarnings("hiding") PPThingList _pThingList_)
    {
        // Constructor
        setPThingList(_pThingList_);

    }

    @Override
    public Object clone()
    {
        return new APrPPrint(
            cloneNode(this._pThingList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrPPrint(this);
    }

    public PPThingList getPThingList()
    {
        return this._pThingList_;
    }

    public void setPThingList(PPThingList node)
    {
        if(this._pThingList_ != null)
        {
            this._pThingList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pThingList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pThingList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pThingList_ == child)
        {
            this._pThingList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pThingList_ == oldChild)
        {
            setPThingList((PPThingList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}