package com.jxufe.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * image
 * @author 
 */
public class Image implements Serializable {
    private Integer resid;

    private String resname;

    private byte[] res;

    private static final long serialVersionUID = 1L;

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public byte[] getRes() {
        return res;
    }

    public void setRes(byte[] res) {
        this.res = res;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Image other = (Image) that;
        return (this.getResid() == null ? other.getResid() == null : this.getResid().equals(other.getResid()))
            && (this.getResname() == null ? other.getResname() == null : this.getResname().equals(other.getResname()))
            && (Arrays.equals(this.getRes(), other.getRes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResid() == null) ? 0 : getResid().hashCode());
        result = prime * result + ((getResname() == null) ? 0 : getResname().hashCode());
        result = prime * result + (Arrays.hashCode(getRes()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resid=").append(resid);
        sb.append(", resname=").append(resname);
        sb.append(", res=").append(res);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}