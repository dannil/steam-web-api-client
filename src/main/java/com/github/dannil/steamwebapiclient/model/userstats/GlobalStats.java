package com.github.dannil.steamwebapiclient.model.userstats;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalStats {

	private Integer appId;
	private Integer count;

	@JsonProperty("name[0]")
	private String name;

	@JsonProperty("startdate")
	private Date startDate;

	@JsonProperty("enddate")
	private Date endDate;

	public Integer getAppId() {
		return this.appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GlobalStats [appId=");
		builder.append(this.appId);
		builder.append(", count=");
		builder.append(this.count);
		builder.append(", name=");
		builder.append(this.name);
		builder.append(", startDate=");
		builder.append(this.startDate);
		builder.append(", endDate=");
		builder.append(this.endDate);
		builder.append("]");
		return builder.toString();
	}

}
