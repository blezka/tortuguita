/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APIfelse extends PPIfelse
{
    private TIfelse _ifelse_;
    private TLPar _lPar_;
    private PPBoolean _pBoolean_;
    private TRPar _rPar_;
    private TLBrk _lBrk_;
    private PPInstructionlist _inst1_;
    private TRBrk _rBrk_;
    private TLBrk _falsel_;
    private PPInstructionlist _inst2_;
    private TRBrk _falser_;

    public APIfelse()
    {
        // Constructor
    }

    public APIfelse(
        @SuppressWarnings("hiding") TIfelse _ifelse_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PPBoolean _pBoolean_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TLBrk _lBrk_,
        @SuppressWarnings("hiding") PPInstructionlist _inst1_,
        @SuppressWarnings("hiding") TRBrk _rBrk_,
        @SuppressWarnings("hiding") TLBrk _falsel_,
        @SuppressWarnings("hiding") PPInstructionlist _inst2_,
        @SuppressWarnings("hiding") TRBrk _falser_)
    {
        // Constructor
        setIfelse(_ifelse_);

        setLPar(_lPar_);

        setPBoolean(_pBoolean_);

        setRPar(_rPar_);

        setLBrk(_lBrk_);

        setInst1(_inst1_);

        setRBrk(_rBrk_);

        setFalsel(_falsel_);

        setInst2(_inst2_);

        setFalser(_falser_);

    }

    @Override
    public Object clone()
    {
        return new APIfelse(
            cloneNode(this._ifelse_),
            cloneNode(this._lPar_),
            cloneNode(this._pBoolean_),
            cloneNode(this._rPar_),
            cloneNode(this._lBrk_),
            cloneNode(this._inst1_),
            cloneNode(this._rBrk_),
            cloneNode(this._falsel_),
            cloneNode(this._inst2_),
            cloneNode(this._falser_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPIfelse(this);
    }

    public TIfelse getIfelse()
    {
        return this._ifelse_;
    }

    public void setIfelse(TIfelse node)
    {
        if(this._ifelse_ != null)
        {
            this._ifelse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifelse_ = node;
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

    public PPInstructionlist getInst1()
    {
        return this._inst1_;
    }

    public void setInst1(PPInstructionlist node)
    {
        if(this._inst1_ != null)
        {
            this._inst1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inst1_ = node;
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

    public TLBrk getFalsel()
    {
        return this._falsel_;
    }

    public void setFalsel(TLBrk node)
    {
        if(this._falsel_ != null)
        {
            this._falsel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._falsel_ = node;
    }

    public PPInstructionlist getInst2()
    {
        return this._inst2_;
    }

    public void setInst2(PPInstructionlist node)
    {
        if(this._inst2_ != null)
        {
            this._inst2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inst2_ = node;
    }

    public TRBrk getFalser()
    {
        return this._falser_;
    }

    public void setFalser(TRBrk node)
    {
        if(this._falser_ != null)
        {
            this._falser_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._falser_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ifelse_)
            + toString(this._lPar_)
            + toString(this._pBoolean_)
            + toString(this._rPar_)
            + toString(this._lBrk_)
            + toString(this._inst1_)
            + toString(this._rBrk_)
            + toString(this._falsel_)
            + toString(this._inst2_)
            + toString(this._falser_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ifelse_ == child)
        {
            this._ifelse_ = null;
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

        if(this._inst1_ == child)
        {
            this._inst1_ = null;
            return;
        }

        if(this._rBrk_ == child)
        {
            this._rBrk_ = null;
            return;
        }

        if(this._falsel_ == child)
        {
            this._falsel_ = null;
            return;
        }

        if(this._inst2_ == child)
        {
            this._inst2_ = null;
            return;
        }

        if(this._falser_ == child)
        {
            this._falser_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ifelse_ == oldChild)
        {
            setIfelse((TIfelse) newChild);
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

        if(this._inst1_ == oldChild)
        {
            setInst1((PPInstructionlist) newChild);
            return;
        }

        if(this._rBrk_ == oldChild)
        {
            setRBrk((TRBrk) newChild);
            return;
        }

        if(this._falsel_ == oldChild)
        {
            setFalsel((TLBrk) newChild);
            return;
        }

        if(this._inst2_ == oldChild)
        {
            setInst2((PPInstructionlist) newChild);
            return;
        }

        if(this._falser_ == oldChild)
        {
            setFalser((TRBrk) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
