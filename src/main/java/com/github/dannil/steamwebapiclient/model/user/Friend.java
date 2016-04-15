package com.github.dannil.steamwebapiclient.model.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.dannil.steamwebapiclient.utility.UnixTimestampDeserializer;

public class Friend {

	private Long steamId;

	private String relationship;

	@JsonProperty("friend_since")
	// @JsonSerialize(using = UnixTimestampSerializer.class)
	@JsonDeserialize(using = UnixTimestampDeserializer.class)
	private Date friendSince;

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Long getSteamId() {
		return this.steamId;
	}

	public void setSteamId(Long steamId) {
		this.steamId = steamId;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Date getFriendSince() {
		return this.friendSince;
	}

	public void setFriendSince(Date friendSince) {
		this.friendSince = friendSince;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Friend [steamId=");
		builder.append(this.steamId);
		builder.append(", relationship=");
		builder.append(this.relationship);
		builder.append(", friendSince=");
		builder.append(this.friendSince);
		builder.append("]");
		return builder.toString();
	}

}
