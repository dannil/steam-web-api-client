package com.github.dannil.steamwebapiclient.model.news;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.dannil.steamwebapiclient.utility.UnixTimestampDeserializer;

public class NewsItem {

	private long gid;
	private String title;
	private String url;

	@JsonProperty("is_external_url")
	private boolean isExternalUrl;

	private String author;
	private String contents;

	@JsonProperty("feedlabel")
	private String feedLabel;

	@JsonDeserialize(using = UnixTimestampDeserializer.class)
	private Date date;

	@JsonProperty("feedname")
	private String feedName;

	public NewsItem() {
		// TODO Auto-generated constructor stub
	}

	public long getGid() {
		return this.gid;
	}

	public void setGid(long gid) {
		this.gid = gid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isExternalUrl() {
		return this.isExternalUrl;
	}

	public void setExternalUrl(boolean isExternalUrl) {
		this.isExternalUrl = isExternalUrl;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getFeedLabel() {
		return this.feedLabel;
	}

	public void setFeedLabel(String feedLabel) {
		this.feedLabel = feedLabel;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFeedName() {
		return this.feedName;
	}

	public void setFeedName(String feedName) {
		this.feedName = feedName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewsItem [gid=");
		builder.append(this.gid);
		builder.append(", title=");
		builder.append(this.title);
		builder.append(", url=");
		builder.append(this.url);
		builder.append(", isExternalUrl=");
		builder.append(this.isExternalUrl);
		builder.append(", author=");
		builder.append(this.author);
		builder.append(", contents=");
		builder.append(this.contents);
		builder.append(", feedLabel=");
		builder.append(this.feedLabel);
		builder.append(", date=");
		builder.append(this.date);
		builder.append(", feedName=");
		builder.append(this.feedName);
		builder.append("]");
		return builder.toString();
	}

}
