/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AListPThing extends PPThing
{
    private PPList _pList_;

    public AListPThing()
    {
        // Constructor
    }

    public AListPThing(
        @SuppressWarnings("hiding") PPList _pList_)
    {
        // Constructor
        setPList(_pList_);

    }

    @Override
    public Object clone()
    {
        return new AListPThing(
            cloneNode(this._pList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListPThing(this);
    }

    public PPList getPList()
    {
        return this._pList_;
    }

    public void setPList(PPList node)
    {
        if(this._pList_ != null)
        {
            this._pList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._pList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pList_ == child)
        {
            this._pList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._pList_ == oldChild)
        {
            setPList((PPList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
