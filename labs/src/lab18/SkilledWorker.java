package lab18;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<String> skills = new ArrayList<String>();
	
	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public void addSkill(String skill) {
		skills.add(skill);
	}
	
	@Override
	public String getInfo() {
		String info = super.getInfo();
		info += "Skills: ";
		for (String skill : skills) {
			info += skill + ", ";
		}
		info += "\n";
		return info;
	}
}
