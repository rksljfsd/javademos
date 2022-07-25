package stringpool;

public class User {

	int id;
	public String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		User other = (User) obj;
		return this.id == other.id && this.name.equals(other.name);
	}
	
}
