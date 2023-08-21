package com.rays.auction;

import java.text.Bidi;
import java.util.Set;

public class Auctionltem {
	private long id ;
	private Set bids;
	private String description;
	private Bid SuccessfulBid = null;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Set getBids() {
		return bids;
	}
	public void setBids(Set bids) {
		this.bids = bids;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Bid getSuccessfulBid() {
		return SuccessfulBid;
	}
	public void setSuccessfulBid(Bid successfulBid) {
		SuccessfulBid = successfulBid;
	}
	
	

}
