package com.g6.ex3.client;

import java.util.List;

class TeamClient {
	public static void main(String[] args) {
		TeamsService service = new TeamsService();
		Teams port = service.getTeamsPort();
		List<Team> teams = port.getTeams();
		for (Team team : teams) {
			System.out.println("Team name: " + team.getName() + " (roster count: " + team.getRosterCount() + ")");
			for (Player player : team.getPlayers())
				System.out.println(" Player: " + player.getNickName());
		}
	}
}