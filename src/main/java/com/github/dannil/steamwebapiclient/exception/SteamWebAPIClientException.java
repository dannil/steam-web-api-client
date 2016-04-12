package com.github.dannil.steamwebapiclient.exception;

public class SteamWebAPIClientException extends RuntimeException {

	private static final long serialVersionUID = 1590406028658550466L;

	public SteamWebAPIClientException() {
		super();
	}

	public SteamWebAPIClientException(String message) {
		super(message);
	}

	public SteamWebAPIClientException(String message, Throwable cause) {
		super(message, cause);
	}

	public SteamWebAPIClientException(Throwable cause) {
		super(cause);
	}

}
