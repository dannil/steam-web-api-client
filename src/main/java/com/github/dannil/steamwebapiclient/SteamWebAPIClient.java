package com.github.dannil.steamwebapiclient;

import java.util.HashMap;
import java.util.Map;

import com.github.dannil.steamwebapiclient.builder.UrlBuilder;
import com.github.dannil.steamwebapiclient.exception.SteamWebAPIClientException;
import com.github.dannil.steamwebapiclient.model.news.AppNews;
import com.github.dannil.steamwebapiclient.model.user.FriendsList;
import com.github.dannil.steamwebapiclient.model.userstats.AchievementPercentages;
import com.github.dannil.steamwebapiclient.utility.HttpClient;
import com.github.dannil.steamwebapiclient.utility.JsonUtility;

public class SteamWebAPIClient {

	private String apiKey;
	private String baseUrl;

	private Map<String, String> defaultParameters;

	public SteamWebAPIClient() {
		this.baseUrl = "http://api.steampowered.com/";

		this.defaultParameters = new HashMap<String, String>();
	}

	public SteamWebAPIClient(String apiKey) {
		this();
		this.apiKey = apiKey;

		this.defaultParameters.put("key", apiKey);
	}

	public AppNews getNewsForApp(Integer appId, Integer count, Integer maxLength) throws SteamWebAPIClientException {
		String interfaceUrl = this.baseUrl + "ISteamNews/GetNewsForApp/v0002/";

		Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
		parameters.put("appid", String.valueOf(appId));
		parameters.put("count", String.valueOf(count));
		parameters.put("maxlength", String.valueOf(maxLength));

		String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));

		return JsonUtility.convertValue(response, AppNews.class);
	}

	public AchievementPercentages getGlobalAchievementPercentagesForApp(Integer gameId) {
		String interfaceUrl = this.baseUrl + "ISteamUserStats/GetGlobalAchievementPercentagesForApp/v0002/";

		Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
		parameters.put("gameid", String.valueOf(gameId));

		String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));

		return JsonUtility.convertValue(response, AchievementPercentages.class);
	}

	public FriendsList getFriendsList(Long steamId, String relationship) {
		String interfaceUrl = this.baseUrl + "ISteamUser/GetFriendList/v0001/";

		Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
		parameters.put("steamid", String.valueOf(steamId));
		parameters.put("relationship", String.valueOf(relationship));

		String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));

		return JsonUtility.convertValue(response, FriendsList.class);
	}

}
