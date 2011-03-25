/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AProdPProduct extends PPProduct
{
    private TProduct _product_;
    private PPValue _pValue_;
    private PPValueList _pValueList_;

    public AProdPProduct()
    {
        // Constructor
    }

    public AProdPProduct(
        @SuppressWarnings("hiding") TProduct _product_,
        @SuppressWarnings("hiding") PPValue _pValue_,
        @SuppressWarnings("hiding") PPValueList _pValueList_)
    {
        // Constructor
        setProduct(_product_);

        setPValue(_pValue_);

        setPValueList(_pValueList_);

    }

    @Override
    public Object clone()
    {
        return new AProdPProduct(
            cloneNode(this._product_),
            cloneNode(this._pValue_),
            cloneNode(this._pValueList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProdPProduct(this);
    }

    public TProduct getProduct()
    {
        return this._product_;
    }

    public void setProduct(TProduct node)
    {
        if(this._product_ != null)
        {
            this._product_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._product_ = node;
    }

    public PPValue getPValue()
    {
        return this._pValue_;
    }

    public void setPValue(PPValue node)
    {
        if(this._pValue_ != null)
        {
            this._pValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pValue_ = node;
    }

    public PPValueList getPValueList()
    {
        return this._pValueList_;
    }

    public void setPValueList(PPValueList node)
    {
        if(this._pValueList_ != null)
        {
            this._pValueList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pValueList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._product_)
            + toString(this._pValue_)
            + toString(this._pValueList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._product_ == child)
        {
            this._product_ = null;
            return;
        }

        if(this._pValue_ == child)
        {
            this._pValue_ = null;
            return;
        }

        if(this._pValueList_ == child)
        {
            this._pValueList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._product_ == oldChild)
        {
            setProduct((TProduct) newChild);
            return;
        }

        if(this._pValue_ == oldChild)
        {
            setPValue((PPValue) newChild);
            return;
        }

        if(this._pValueList_ == oldChild)
        {
            setPValueList((PPValueList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
