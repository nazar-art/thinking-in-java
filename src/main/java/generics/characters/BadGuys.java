package generics.characters;

public class BadGuys extends StoryCharacters {
	
	public String toString() {
		return super.toString() + " is a bad guy";
		}
}

class Morton extends BadGuys {}

class Frank extends BadGuys {}
