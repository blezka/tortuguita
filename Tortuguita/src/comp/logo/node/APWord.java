/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class APWord extends PPWord
{
    private TWord _word_;
    private TIdentifier _identifier_;
    private PPIdentList _pIdentList_;

    public APWord()
    {
        // Constructor
    }

    public APWord(
        @SuppressWarnings("hiding") TWord _word_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") PPIdentList _pIdentList_)
    {
        // Constructor
        setWord(_word_);

        setIdentifier(_identifier_);

        setPIdentList(_pIdentList_);

    }

    @Override
    public Object clone()
    {
        return new APWord(
            cloneNode(this._word_),
            cloneNode(this._identifier_),
            cloneNode(this._pIdentList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPWord(this);
    }

    public TWord getWord()
    {
        return this._word_;
    }

    public void setWord(TWord node)
    {
        if(this._word_ != null)
        {
            this._word_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._word_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._word_)
            + toString(this._identifier_)
            + toString(this._pIdentList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._word_ == child)
        {
            this._word_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._pIdentList_ == child)
        {
            this._pIdentList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._word_ == oldChild)
        {
            setWord((TWord) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._pIdentList_ == oldChild)
        {
            setPIdentList((PPIdentList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
