package com.github.dannil.steamwebapiclient.model.news;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsItems {

	private long gid;
	private String title;
	private String url;

	@JsonProperty("is_external_url")
	private boolean isExternalUrl;

	private String author;
	private String contents;

	@JsonProperty("feedlabel")
	private String feedLabel;

	private Date date;

	@JsonProperty("feedname")
	private String feedName;

	public NewsItems() {
		// TODO Auto-generated constructor stub
	}

}
