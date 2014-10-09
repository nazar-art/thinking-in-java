package generics.characters;

public class GoodGuys extends StoryCharacters {

	public String toString() {
		return super.toString() + " is a good guy";
	}
}

class Harmonica extends GoodGuys {
}

class Cheyenne extends GoodGuys {
}
