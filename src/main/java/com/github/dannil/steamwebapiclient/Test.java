package com.github.dannil.steamwebapiclient;

import java.util.Arrays;
import java.util.List;

import com.github.dannil.steamwebapiclient.model.user.Friend;
import com.github.dannil.steamwebapiclient.model.userstats.Achievements;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SteamWebAPIClient client = new SteamWebAPIClient("ED93D9D5B61844132AD85C15DB65E102");

		System.out.println();

		System.out.println(client.getNewsForApp(730, null, null));
		// //
		List<Achievements> achievements = client.getGlobalAchievementPercentagesForApp(730);
		for (Achievements a : achievements) {
			System.out.println(a.getName() + " = " + a.getPercent());
		}
		//
		// System.out.println();
		//
		List<Friend> percent = client.getFriendsList(76561197984676396L, "all");
		for (Friend f : percent) {
			System.out.println(f.getSteamId() + " = " + f.getFriendSince());
		}
		//
		// System.out.println();

		// List<GlobalStats> globalStats = client.getGlobalStatsForGame(730, 100, "", null, null);
		// for (GlobalStats g : globalStats) {
		// System.out.println(g);
		// }

		System.out.println(client.getPlayerSummaries(Arrays.asList(76561197984676396L)));

		System.out.println(client.getPlayerAchievements(730, 76561197984676396L, null));
	}
}
