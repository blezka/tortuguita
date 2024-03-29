/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AIfPIf extends PPIf
{
    private TIf _if_;
    private TLPar _lPar_;
    private PPBoolean _pBoolean_;
    private TRPar _rPar_;
    private TLBrk _lBrk_;
    private PPInstructionlist _pInstructionlist_;
    private TRBrk _rBrk_;

    public AIfPIf()
    {
        // Constructor
    }

    public AIfPIf(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PPBoolean _pBoolean_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TLBrk _lBrk_,
        @SuppressWarnings("hiding") PPInstructionlist _pInstructionlist_,
        @SuppressWarnings("hiding") TRBrk _rBrk_)
    {
        // Constructor
        setIf(_if_);

        setLPar(_lPar_);

        setPBoolean(_pBoolean_);

        setRPar(_rPar_);

        setLBrk(_lBrk_);

        setPInstructionlist(_pInstructionlist_);

        setRBrk(_rBrk_);

    }

    @Override
    public Object clone()
    {
        return new AIfPIf(
            cloneNode(this._if_),
            cloneNode(this._lPar_),
            cloneNode(this._pBoolean_),
            cloneNode(this._rPar_),
            cloneNode(this._lBrk_),
            cloneNode(this._pInstructionlist_),
            cloneNode(this._rBrk_));
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

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
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

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
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
            + toString(this._if_)
            + toString(this._lPar_)
            + toString(this._pBoolean_)
            + toString(this._rPar_)
            + toString(this._lBrk_)
            + toString(this._pInstructionlist_)
            + toString(this._rBrk_);
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

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._pBoolean_ == child)
        {
            this._pBoolean_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
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
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._pBoolean_ == oldChild)
        {
            setPBoolean((PPBoolean) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
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
