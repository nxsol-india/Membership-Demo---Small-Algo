package com.commons;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Membership {

	public static void main(String arg[]) {
		System.out.println("47182-22222-35562" + checkMemberShip("47182-22222-35562"));
		System.out.println("37182-22222:35562" + checkMemberShip("37182-22222-35562"));
		System.out.println("57182-22222:35562" + checkMemberShip("57182-22222-35562"));
		
		System.out.println("47182:22222:35562" + checkMemberShip("47182:22222:35562"));
		System.out.println("37182:22222:35562" + checkMemberShip("37182:22222:35562"));
		System.out.println("57182:22222:35562" + checkMemberShip("57182:22222:35562"));
		
		System.out.println("512sa-gg727-99213" + checkMemberShip("512sa-gg727-99213"));
		System.out.println("512sa:gg727:99213" + checkMemberShip("512sa:gg727:99213"));
	}

	public static boolean checkMemberShip(String value) {

		if(!(value.startsWith("4") || value.startsWith("37") || value.startsWith("5"))) {
			return false;
		}
		String regexDash = "[0-9]{5}-[0-9]{5}-[0-9]{5}";
		String regexCol = "[0-9]{5}:[0-9]{5}:[0-9]{5}";

		Pattern patternRegexDash = Pattern.compile(regexDash);
		Pattern patternRegexCol = Pattern.compile(regexCol);
		
		Matcher matcherPatternRegexDash = patternRegexDash.matcher(value);
		Matcher matcherPatternRegexCol = patternRegexCol.matcher(value);
		
		if(matcherPatternRegexDash.matches()) {
			return true;
		}else if(matcherPatternRegexCol.matches()) {
			return true;
		}

		return false;

	}
}
