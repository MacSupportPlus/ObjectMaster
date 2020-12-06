package com.macsupport.objects.characters;

public class Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	public Human () {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health >=0) {
		this.health = health;
		}
	}
	public int displayHealth() {
		System.out.println(this.health);
		return this.health;
	}
	public void attack() {
		System.out.println("ahh I've been attacked");
		this.health -= this.strength; 
	}
}