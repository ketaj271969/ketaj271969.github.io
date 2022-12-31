package playground;

/*
 * http://www.easybatch.org/tutorials/helloworldCSV.html
 */

public class Greeting {

    private int id;

    private String name;

    public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = Id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getGreetingMessage() {
        return "Hi " + name + "! Your id is " + id;
    }

}