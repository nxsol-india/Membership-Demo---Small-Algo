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
		
		System.out.println("47182/22222/35562" + checkMemberShip("47182/22222/35562"));
		System.out.println("37182/22222/35562" + checkMemberShip("37182/22222/35562"));
		System.out.println("57182/22222/35562" + checkMemberShip("57182/22222/35562"));
		
		System.out.println("");
		System.out.println("========Wrong output ");
		System.out.println("");
		System.out.println("512sa-gg727-99213" + checkMemberShip("512sa-gg727-99213"));
		System.out.println("512sa:gg727:99213" + checkMemberShip("512sa:gg727:99213"));
		
		System.out.println("47182-22222-3556a" + checkMemberShip("47182-22222-3556a"));
		System.out.println("37182-22222:3556a" + checkMemberShip("37182-22222-3556a"));
		System.out.println("57182-22222:3556a" + checkMemberShip("57182-22222-3556a"));
		
		System.out.println("47182:22222:3556a" + checkMemberShip("47182:22222:3556a"));
		System.out.println("37182:22222:3556a" + checkMemberShip("37182:22222:3556a"));
		System.out.println("57182:22222:3556a" + checkMemberShip("57182:22222:3556a"));
		
		System.out.println("47182/22222/3556a" + checkMemberShip("47182/22222/3556a"));
		System.out.println("37182/22222/3556a" + checkMemberShip("37182/22222/3556a"));
		System.out.println("57182/22222/3556a" + checkMemberShip("57182/22222/3556a"));
	}

	public static boolean checkMemberShip(String value) {

		//check starting digits - 4 or 37 or 5
		if(!(value.startsWith("4") || value.startsWith("37") || value.startsWith("5"))) {
			return false;
		}
		
		//check 15 digit regular expression ....
		String regexDash = "[0-9]{5}-[0-9]{5}-[0-9]{5}";
		String regexCol = "[0-9]{5}:[0-9]{5}:[0-9]{5}";
		String regexSlash = "[0-9]{5}/[0-9]{5}/[0-9]{5}";

		Pattern patternRegexDash = Pattern.compile(regexDash);
		Pattern patternRegexCol = Pattern.compile(regexCol);
		Pattern patternRegexSalsh = Pattern.compile(regexSlash);
		
		Matcher matcherPatternRegexDash = patternRegexDash.matcher(value);
		Matcher matcherPatternRegexCol = patternRegexCol.matcher(value);
		Matcher matcherPatternRegexSalsh = patternRegexSalsh.matcher(value);
		
		if(matcherPatternRegexDash.matches()) {
			return true;
		}else if(matcherPatternRegexCol.matches()) {
			return true;
		}else if(matcherPatternRegexSalsh.matches()) {
			return true;
		}

		return false;

	}
}
