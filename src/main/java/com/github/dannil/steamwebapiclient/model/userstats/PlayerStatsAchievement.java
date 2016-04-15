package com.github.dannil.steamwebapiclient.model.userstats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerStatsAchievement {

	@JsonProperty("apiname")
	private String apiName;

	private boolean achieved;
	private String name;
	private String description;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(128);
		builder.append("PlayerStatsAchievement [apiName=");
		builder.append(this.apiName);
		builder.append(", achieved=");
		builder.append(this.achieved);
		builder.append(", name=");
		builder.append(this.name);
		builder.append(", description=");
		builder.append(this.description);
		builder.append(']');
		return builder.toString();
	}

}
