package com.g6.ex08.jaxb;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Skier {
	// fields
	private Person person;
	private String national_team;
	private Collection major_achievements;

	// constructors
	public Skier() {
	}

	public Skier(Person person, String national_team, Collection<String> major_achievements) {
		setPerson(person);
		setNationalTeam(national_team);
		setMajorAchievements(major_achievements);
	}

	// properties
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getNationalTeam() {
		return national_team;
	}

	public void setNationalTeam(String national_team) {
		this.national_team = national_team;
	}

	public Collection getMajorAchievements() {
		return major_achievements;
	}

	public void setMajorAchievements(Collection major_achievements) {
		this.major_achievements = major_achievements;
	}
}