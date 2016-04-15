package com.github.dannil.steamwebapiclient.model.userstats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerStatsAchievement {

	@JsonProperty("apiname")
	private String apiName;
	
	private boolean achieved;

	public PlayerStatsAchievement() {
		// TODO Auto-generated constructor stub
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public boolean isAchieved() {
		return this.achieved;
	}

	public void setAchieved(boolean achieved) {
		this.achieved = achieved;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Achievements [apiName=");
		builder.append(this.apiName);
		builder.append(", achieved=");
		builder.append(this.achieved);
		builder.append("]");
		return builder.toString();
	}

}
