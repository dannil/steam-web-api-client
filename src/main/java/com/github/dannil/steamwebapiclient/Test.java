package com.github.dannil.steamwebapiclient;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.github.dannil.steamwebapiclient.model.user.Friend;
import com.github.dannil.steamwebapiclient.model.userstats.Achievements;
import com.github.dannil.steamwebapiclient.model.userstats.PlayerStats;
import com.github.dannil.steamwebapiclient.model.userstats.PlayerStatsAchievement;

public class Test {

	private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

	public static void main(String... args) {
		// TODO Auto-generated method stub

		SteamWebAPIClient client = new SteamWebAPIClient("ED93D9D5B61844132AD85C15DB65E102");

		LOGGER.info(client.getNewsForApp(730, null, null).toString());

		List<Achievements> achievements = client.getGlobalAchievementPercentagesForApp(730);
		for (Achievements a : achievements) {
			System.out.println(a.getName() + " = " + a.getPercent());
		}
		//
		// System.out.println();
		//
		List<Friend> percent = client.getFriendsList(76561197984676396L, "all");
		for (Friend f : percent) {
			LOGGER.info(f.getSteamId() + " = " + f.getFriendSince().toString());
		}
		//
		// System.out.println();

		// List<GlobalStats> globalStats = client.getGlobalStatsForGame(730, 100, "", null, null);
		// for (GlobalStats g : globalStats) {
		// System.out.println(g);
		// }

		LOGGER.info(client.getPlayerSummaries(Arrays.asList(76561197984676396L)).toString());

		PlayerStats ps = client.getPlayerAchievements(730, 76561197984676396L, null);
		for (PlayerStatsAchievement psa : ps.getAchievements()) {
			LOGGER.info(psa.toString());
		}
	}
}
