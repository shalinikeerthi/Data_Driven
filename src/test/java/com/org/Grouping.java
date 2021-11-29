package com.org;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = "player details")
	private void player_Age() {
	System.out.println("player age");
	}
	@Test(groups = "team details")
	private void team_1()
	{
		System.out.println("csk");
	}
	@Test(groups = "team details")
	private void team_2() {
System.out.println("RCB");
	}
	@Test(groups = "location details")
	private void team1_loc() {
System.out.println("banglore");
	}
	@Test(groups = "location details")
	private void team2_loc() {
System.out.println("Chennai");
	}
}
