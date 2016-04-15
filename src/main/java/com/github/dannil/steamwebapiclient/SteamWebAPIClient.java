package com.github.dannil.steamwebapiclient;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.github.dannil.steamwebapiclient.builder.UrlBuilder;
import com.github.dannil.steamwebapiclient.exception.SteamWebAPIClientException;
import com.github.dannil.steamwebapiclient.model.news.NewsItem;
import com.github.dannil.steamwebapiclient.model.user.Friend;
import com.github.dannil.steamwebapiclient.model.user.Player;
import com.github.dannil.steamwebapiclient.model.userstats.Achievement;
import com.github.dannil.steamwebapiclient.utility.HttpClient;
import com.github.dannil.steamwebapiclient.utility.JsonUtility;

public class SteamWebAPIClient {

	private String baseUrl;

	private Map<String, String> defaultParameters;

	public SteamWebAPIClient() {
		this.baseUrl = "http://api.steampowered.com/";

		this.defaultParameters = new HashMap<String, String>();
	}

	public SteamWebAPIClient(String apiKey) {
		this();

		this.defaultParameters.put("key", apiKey);
	}

	public List<NewsItem> getNewsForApp(Integer appId, Integer count, Integer maxLength)
			throws SteamWebAPIClientException {
		String interfaceUrl = this.baseUrl + "ISteamNews/GetNewsForApp/v0002/";

		Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
		parameters.put("appid", String.valueOf(appId));
		parameters.put("count", String.valueOf(count));
		parameters.put("maxlength", String.valueOf(maxLength));

		String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));

		return JsonUtility.convertValueToList(response, NewsItem.class);
	}

	public List<Achievement> getGlobalAchievementPercentagesForApp(Integer gameId) throws SteamWebAPIClientException {
		String interfaceUrl = this.baseUrl + "ISteamUserStats/GetGlobalAchievementPercentagesForApp/v0002/";

		Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
		parameters.put("gameid", String.valueOf(gameId));

		String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));

		return JsonUtility.convertValueToList(response, Achievement.class);
	}

	// public List<GlobalStats> getGlobalStatsForGame(Integer appId, Integer count, String name,
	// Date startDate,
	// Date endDate) throws SteamWebAPIClientException {
	// String interfaceUrl = this.baseUrl + "ISteamUserStats/GetGlobalStatsForGame/v0001/";
	//
	// Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
	// parameters.put("appid", String.valueOf(appId));
	// parameters.put("count", String.valueOf(count));
	// parameters.put("name[0]", String.valueOf(name));
	// parameters.put("startdate", String.valueOf(startDate));
	// parameters.put("enddate", String.valueOf(endDate));
	//
	// String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));
	//
	// System.out.println(response);
	//
	// return JsonUtility.convertValueToList(response, GlobalStats.class);
	// }

	public List<Player> getPlayerSummaries(Collection<Long> steamIds) {
		String interfaceUrl = createEndpointUrl("ISteamUser/GetPlayerSummaries/v0002/");

		Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
		parameters.put("steamids", StringUtils.join(steamIds, ','));

		String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));

		return JsonUtility.convertValueToList(response, Player.class);
	}

	public List<Friend> getFriendsList(Long steamId, String relationship) throws SteamWebAPIClientException {
		String interfaceUrl = this.baseUrl + "ISteamUser/GetFriendList/v0001/";

		Map<String, String> parameters = new HashMap<String, String>(this.defaultParameters);
		parameters.put("steamid", String.valueOf(steamId));
		parameters.put("relationship", String.valueOf(relationship));

		String response = HttpClient.getResponse(UrlBuilder.build(interfaceUrl, parameters));

		return JsonUtility.convertValueToList(response, Friend.class);
	}

	private String createEndpointUrl(String interfaceUrl) {
		return this.baseUrl + interfaceUrl;
	}

}
