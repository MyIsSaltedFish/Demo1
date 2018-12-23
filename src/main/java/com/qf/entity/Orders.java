package com.qf.entity;

import java.util.Date;

public class Orders {
    private Integer oid;

    private Integer cid;

    private Date createtime;

    private String miaoshu;

    private String cname;
    
    private Date date1;
    private Date date2;
    
    public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu == null ? null : miaoshu.trim();
    }

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(Integer oid, Integer cid, Date createtime, String miaoshu, String cname, Date date1, Date date2) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.createtime = createtime;
		this.miaoshu = miaoshu;
		this.cname = cname;
		this.date1 = date1;
		this.date2 = date2;
	}
}