/* This file was generated by SableCC (http://www.sablecc.org/). */

package comp.logo.node;

import comp.logo.analysis.*;

@SuppressWarnings("nls")
public final class AFdPForward extends PPForward
{
    private TFd _fd_;
    private TInteger _integer_;

    public AFdPForward()
    {
        // Constructor
    }

    public AFdPForward(
        @SuppressWarnings("hiding") TFd _fd_,
        @SuppressWarnings("hiding") TInteger _integer_)
    {
        // Constructor
        setFd(_fd_);

        setInteger(_integer_);

    }

    @Override
    public Object clone()
    {
        return new AFdPForward(
            cloneNode(this._fd_),
            cloneNode(this._integer_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFdPForward(this);
    }

    public TFd getFd()
    {
        return this._fd_;
    }

    public void setFd(TFd node)
    {
        if(this._fd_ != null)
        {
            this._fd_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fd_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._fd_)
            + toString(this._integer_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fd_ == child)
        {
            this._fd_ = null;
            return;
        }

        if(this._integer_ == child)
        {
            this._integer_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fd_ == oldChild)
        {
            setFd((TFd) newChild);
            return;
        }

        if(this._integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
