package com.github.dannil.steamwebapiclient.model;

import java.util.ArrayList;
import java.util.List;

public class FriendsList {

	private List<Friend> friends;

	public FriendsList() {
		this.friends = new ArrayList<Friend>();
	}

	public List<Friend> getFriends() {
		return this.friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FriendsList [friends=");
		builder.append(this.friends);
		builder.append("]");
		return builder.toString();
	}

}
