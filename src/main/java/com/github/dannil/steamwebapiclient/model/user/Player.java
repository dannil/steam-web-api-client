package com.github.dannil.steamwebapiclient.model.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.dannil.steamwebapiclient.utility.UnixTimestampDeserializer;

public class Player {

	@JsonProperty("steamid")
	private Long steamId;

	@JsonProperty("communityvisibilitystate")
	private Integer communityVisibilityState;

	private Integer profileState;
	private String personaName;

	@JsonDeserialize(using = UnixTimestampDeserializer.class)
	private Date lastLogOff;

	private Integer commentPermission;
	private String profileUrl;
	private String avatar;
	private String avatarMedium;
	private String avatarFull;
	private Integer personaState;
	private Long primaryClanId;
	private Date timeCreated;
	private Integer personaStateFlags;
	private String locCountryCode;
	private Integer locStateCode;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Long getSteamId() {
		return this.steamId;
	}

	public void setSteamId(Long steamId) {
		this.steamId = steamId;
	}

	public Integer getCommunityVisibilityState() {
		return this.communityVisibilityState;
	}

	public void setCommunityVisibilityState(Integer communityVisibilityState) {
		this.communityVisibilityState = communityVisibilityState;
	}

	public Integer getProfileState() {
		return this.profileState;
	}

	public void setProfileState(Integer profileState) {
		this.profileState = profileState;
	}

	public String getPersonaName() {
		return this.personaName;
	}

	public void setPersonaName(String personaName) {
		this.personaName = personaName;
	}

	public Date getLastLogOff() {
		return this.lastLogOff;
	}

	public void setLastLogOff(Date lastLogOff) {
		this.lastLogOff = lastLogOff;
	}

	public Integer getCommentPermission() {
		return this.commentPermission;
	}

	public void setCommentPermission(Integer commentPermission) {
		this.commentPermission = commentPermission;
	}

	public String getProfileUrl() {
		return this.profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAvatarMedium() {
		return this.avatarMedium;
	}

	public void setAvatarMedium(String avatarMedium) {
		this.avatarMedium = avatarMedium;
	}

	public String getAvatarFull() {
		return this.avatarFull;
	}

	public void setAvatarFull(String avatarFull) {
		this.avatarFull = avatarFull;
	}

	public Integer getPersonaState() {
		return this.personaState;
	}

	public void setPersonaState(Integer personaState) {
		this.personaState = personaState;
	}

	public Long getPrimaryClanId() {
		return this.primaryClanId;
	}

	public void setPrimaryClanId(Long primaryClanId) {
		this.primaryClanId = primaryClanId;
	}

	public Date getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Integer getPersonaStateFlags() {
		return this.personaStateFlags;
	}

	public void setPersonaStateFlags(Integer personaStateFlags) {
		this.personaStateFlags = personaStateFlags;
	}

	public String getLocCountryCode() {
		return this.locCountryCode;
	}

	public void setLocCountryCode(String locCountryCode) {
		this.locCountryCode = locCountryCode;
	}

	public Integer getLocStateCode() {
		return this.locStateCode;
	}

	public void setLocStateCode(Integer locStateCode) {
		this.locStateCode = locStateCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [steamId=");
		builder.append(this.steamId);
		builder.append(", communityVisibilityState=");
		builder.append(this.communityVisibilityState);
		builder.append(", profileState=");
		builder.append(this.profileState);
		builder.append(", personaName=");
		builder.append(this.personaName);
		builder.append(", lastLogOff=");
		builder.append(this.lastLogOff);
		builder.append(", commentPermission=");
		builder.append(this.commentPermission);
		builder.append(", profileUrl=");
		builder.append(this.profileUrl);
		builder.append(", avatar=");
		builder.append(this.avatar);
		builder.append(", avatarMedium=");
		builder.append(this.avatarMedium);
		builder.append(", avatarFull=");
		builder.append(this.avatarFull);
		builder.append(", personaState=");
		builder.append(this.personaState);
		builder.append(", primaryClanId=");
		builder.append(this.primaryClanId);
		builder.append(", timeCreated=");
		builder.append(this.timeCreated);
		builder.append(", personaStateFlags=");
		builder.append(this.personaStateFlags);
		builder.append(", locCountryCode=");
		builder.append(this.locCountryCode);
		builder.append(", locStateCode=");
		builder.append(this.locStateCode);
		builder.append("]");
		return builder.toString();
	}

}
