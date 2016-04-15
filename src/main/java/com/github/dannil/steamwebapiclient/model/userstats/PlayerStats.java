package com.github.dannil.steamwebapiclient.model.userstats;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerStats {

	@JsonProperty("steamID")
	private Long steamId;

	private String gameName;
	private boolean success;

	private List<PlayerStatsAchievement> achievements;

	public PlayerStats() {
		// TODO Auto-generated constructor stub
	}

	public Long getSteamId() {
		return this.steamId;
	}

	public void setSteamId(Long steamId) {
		this.steamId = steamId;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public List<PlayerStatsAchievement> getAchievements() {
		return this.achievements;
	}

	public void setAchievements(List<PlayerStatsAchievement> achievements) {
		this.achievements = achievements;
	}

	public boolean isSuccess() {
		return this.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlayerStats [steamId=");
		builder.append(this.steamId);
		builder.append(", gameName=");
		builder.append(this.gameName);
		builder.append(", success=");
		builder.append(this.success);
		builder.append(", achievements=");
		builder.append(this.achievements);
		builder.append("]");
		return builder.toString();
	}

}
