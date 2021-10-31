package entity;
import abstracts.PlayerChecker;
public class Player  {

	int id;
	private String name;
	private String surName;
	private String nationalityId;
	private String birthDay;

	 public Player(int id, String name, String surName, String nationalityId, String birthDay) {
		
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.nationalityId = nationalityId;
		this.birthDay = birthDay;
		}
		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

}
