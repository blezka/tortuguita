/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APRepeat extends PPRepeat
{
    private TRepeat _repeat_;
    private TInteger _integer_;
    private TLBrk _lBrk_;
    private PPInstructionlist _pInstructionlist_;
    private TRBrk _rBrk_;

    public APRepeat()
    {
        // Constructor
    }

    public APRepeat(
        @SuppressWarnings("hiding") TRepeat _repeat_,
        @SuppressWarnings("hiding") TInteger _integer_,
        @SuppressWarnings("hiding") TLBrk _lBrk_,
        @SuppressWarnings("hiding") PPInstructionlist _pInstructionlist_,
        @SuppressWarnings("hiding") TRBrk _rBrk_)
    {
        // Constructor
        setRepeat(_repeat_);

        setInteger(_integer_);

        setLBrk(_lBrk_);

        setPInstructionlist(_pInstructionlist_);

        setRBrk(_rBrk_);

    }

    @Override
    public Object clone()
    {
        return new APRepeat(
            cloneNode(this._repeat_),
            cloneNode(this._integer_),
            cloneNode(this._lBrk_),
            cloneNode(this._pInstructionlist_),
            cloneNode(this._rBrk_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPRepeat(this);
    }

    public TRepeat getRepeat()
    {
        return this._repeat_;
    }

    public void setRepeat(TRepeat node)
    {
        if(this._repeat_ != null)
        {
            this._repeat_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._repeat_ = node;
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

    public TLBrk getLBrk()
    {
        return this._lBrk_;
    }

    public void setLBrk(TLBrk node)
    {
        if(this._lBrk_ != null)
        {
            this._lBrk_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrk_ = node;
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

    public TRBrk getRBrk()
    {
        return this._rBrk_;
    }

    public void setRBrk(TRBrk node)
    {
        if(this._rBrk_ != null)
        {
            this._rBrk_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrk_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._repeat_)
            + toString(this._integer_)
            + toString(this._lBrk_)
            + toString(this._pInstructionlist_)
            + toString(this._rBrk_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repeat_ == child)
        {
            this._repeat_ = null;
            return;
        }

        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        if(this._lBrk_ == child)
        {
            this._lBrk_ = null;
            return;
        }

        if(this._pInstructionlist_ == child)
        {
            this._pInstructionlist_ = null;
            return;
        }

        if(this._rBrk_ == child)
        {
            this._rBrk_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._repeat_ == oldChild)
        {
            setRepeat((TRepeat) newChild);
            return;
        }

        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        if(this._lBrk_ == oldChild)
        {
            setLBrk((TLBrk) newChild);
            return;
        }

        if(this._pInstructionlist_ == oldChild)
        {
            setPInstructionlist((PPInstructionlist) newChild);
            return;
        }

        if(this._rBrk_ == oldChild)
        {
            setRBrk((TRBrk) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
