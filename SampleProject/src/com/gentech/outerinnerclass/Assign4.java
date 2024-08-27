package com.gentech.outerinnerclass;

class Sport {
	String sportName;

	Sport(String sportName) {
		this.sportName = sportName;
	}

	void displaySportName() {
		System.out.println("Sport: " + sportName);
	}

	static class Team {
		static String teamName = "Default Team";

		static void setTeamName(String name) {
			teamName = name;
		}

		static void displayTeamName() {
			System.out.println("Team: " + teamName);
		}
	}

	// Nested class Player
	static class Player {
		static String playerName = "Default Player";

		static void setPlayerName(String name) {
			playerName = name;
		}

		static void displayPlayerName() {
			System.out.println("Player: " + playerName);
		}
	}
}

public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sport sport = new Sport("Soccer");
		sport.displaySportName();

		Sport.Team.setTeamName("Red Dragons");
		Sport.Team.displayTeamName();

		Sport.Player.setPlayerName("John Doe");
		Sport.Player.displayPlayerName();

	}

}
