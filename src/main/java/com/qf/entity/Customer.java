package com.qf.entity;

public class Customer {
    private Integer cid;

    private String cname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
}