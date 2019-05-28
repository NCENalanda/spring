package com.nt.command;

public class RegisterCommand {
	private String name;
	private String addrs;
	private int age;
	private String qlfy;
	private String skill;
	private String loc;
	private int expCtc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQlfy() {
		return qlfy;
	}

	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public int getExpCtc() {
		return expCtc;
	}

	public void setExpCtc(int expCtc) {
		this.expCtc = expCtc;
	}

	@Override
	public String toString() {
		return "RegisterCommand [name=" + name + ", addrs=" + addrs + ", age=" + age + ", qlfy=" + qlfy + ", skill="
				+ skill + ", loc=" + loc + ", expCtc=" + expCtc + "]";
	}
	
	
}
