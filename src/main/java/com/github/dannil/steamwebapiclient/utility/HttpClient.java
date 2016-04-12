package com.github.dannil.steamwebapiclient.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import com.github.dannil.steamwebapiclient.exception.SteamWebAPIClientException;

public class HttpClient {

	public static String getResponse(String url) throws SteamWebAPIClientException {
		StringBuilder builder = new StringBuilder();
		try (CloseableHttpClient client = HttpClientBuilder.create().build()) {
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);

			// Get the response
			try (BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))) {
				String line = "";
				while ((line = rd.readLine()) != null) {
					builder.append(line);
				}
			}
		} catch (IOException e) {
			throw new SteamWebAPIClientException(e);
		}
		return builder.toString();
	}

}
