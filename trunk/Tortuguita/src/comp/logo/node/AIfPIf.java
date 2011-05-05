/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AIfPIf extends PPIf
{
    private TIf _if_;
    private PPBoolean _pBoolean_;
    private PPInstructionlist _pInstructionlist_;

    public AIfPIf()
    {
        // Constructor
    }

    public AIfPIf(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PPBoolean _pBoolean_,
        @SuppressWarnings("hiding") PPInstructionlist _pInstructionlist_)
    {
        // Constructor
        setIf(_if_);

        setPBoolean(_pBoolean_);

        setPInstructionlist(_pInstructionlist_);

    }

    @Override
    public Object clone()
    {
        return new AIfPIf(
            cloneNode(this._if_),
            cloneNode(this._pBoolean_),
            cloneNode(this._pInstructionlist_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfPIf(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PPBoolean getPBoolean()
    {
        return this._pBoolean_;
    }

    public void setPBoolean(PPBoolean node)
    {
        if(this._pBoolean_ != null)
        {
            this._pBoolean_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pBoolean_ = node;
    }

    public PPInstructionlist getPInstructionlist()
    {
        return this._pInstructionlist_;
    }

    public void setPInstructionlist(PPInstructionlist node)
    {
        if(this._pInstructionlist_ != null)
        {
            this._pInstructionlist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pInstructionlist_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._pBoolean_)
            + toString(this._pInstructionlist_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._pBoolean_ == child)
        {
            this._pBoolean_ = null;
            return;
        }

        if(this._pInstructionlist_ == child)
        {
            this._pInstructionlist_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._pBoolean_ == oldChild)
        {
            setPBoolean((PPBoolean) newChild);
            return;
        }

        if(this._pInstructionlist_ == oldChild)
        {
            setPInstructionlist((PPInstructionlist) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}