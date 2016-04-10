package com.github.dannil.steamwebapiclient;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SteamWebAPIClient client = new SteamWebAPIClient();
		System.out.println(client.getNewsForApp(730, null, null));
	}

}
