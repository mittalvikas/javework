package com.mittalvk.learning.javainterview;

import java.util.HashMap;
import java.util.Map;

public class TinyUrlSolution {

	private Map<String, Long> longUrlMap = new HashMap();
	private Map<Long, String> idToUrlMap = new HashMap();
	private String allowedCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private long id = 1L;

	public static void main(String[] args) {

		TinyUrlSolution solution = new TinyUrlSolution();

		String longUrl = "http://example.com/a/b/d?abc=xyz";
		String shortUrl = solution.getTinyUrl(longUrl);

		System.out.println("Short URL::" + shortUrl);

		String returnLongUrl = solution.getLongUrl(shortUrl);

		System.out.println("Original URL::" + returnLongUrl);

	}

	private String getLongUrl(String shortUrl) {
		String base62Encoded = shortUrl.substring(shortUrl.lastIndexOf("/") + 1);
		long decode = 0;
		for (int i = 0; i < base62Encoded.length(); i++) {
			decode = decode * 62 + allowedCharacters.indexOf("" + base62Encoded.charAt(i));
		}
		return idToUrlMap.get(decode);
	}

	public String getTinyUrl(String longUrl) {
		long urlId;
		// if URL is already in DB
		if (longUrlMap.containsKey(longUrl)) {
			urlId = longUrlMap.get(longUrl);
		} else {
			urlId = ++id;
		}
		idToUrlMap.put(urlId, longUrl);
		longUrlMap.put(longUrl, urlId);
		return encodeNumber(urlId);
	}

	private String encodeNumber(long number) {
		if (number < 0)
			throw new IllegalArgumentException("Number(Base62) must be positive: " + number);
		if (number == 0)
			return "0";
		StringBuilder buf = new StringBuilder();
		while (number != 0) {
			buf.append(allowedCharacters.charAt((int) (number % 62)));
			number /= 62;
		}
		return "http://vikasmittal.com/" + buf.reverse().toString();
	}

}
