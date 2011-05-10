/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APrintPPrint extends PPPrint
{
    private TPrint _print_;
    private TLPar _lPar_;
    private PPIdentList _pIdentList_;
    private TRPar _rPar_;

    public APrintPPrint()
    {
        // Constructor
    }

    public APrintPPrint(
        @SuppressWarnings("hiding") TPrint _print_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PPIdentList _pIdentList_,
        @SuppressWarnings("hiding") TRPar _rPar_)
    {
        // Constructor
        setPrint(_print_);

        setLPar(_lPar_);

        setPIdentList(_pIdentList_);

        setRPar(_rPar_);

    }

    @Override
    public Object clone()
    {
        return new APrintPPrint(
            cloneNode(this._print_),
            cloneNode(this._lPar_),
            cloneNode(this._pIdentList_),
            cloneNode(this._rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrintPPrint(this);
    }

    public TPrint getPrint()
    {
        return this._print_;
    }

    public void setPrint(TPrint node)
    {
        if(this._print_ != null)
        {
            this._print_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._print_ = node;
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

    public PPIdentList getPIdentList()
    {
        return this._pIdentList_;
    }

    public void setPIdentList(PPIdentList node)
    {
        if(this._pIdentList_ != null)
        {
            this._pIdentList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pIdentList_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._print_)
            + toString(this._lPar_)
            + toString(this._pIdentList_)
            + toString(this._rPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._print_ == child)
        {
            this._print_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._pIdentList_ == child)
        {
            this._pIdentList_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._print_ == oldChild)
        {
            setPrint((TPrint) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._pIdentList_ == oldChild)
        {
            setPIdentList((PPIdentList) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}