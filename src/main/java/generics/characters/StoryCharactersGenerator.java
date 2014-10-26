package generics.characters;

import java.util.Iterator;
import java.util.Random;

import generics.Generator;

public class StoryCharactersGenerator implements Generator<StoryCharacters>,
        Iterable<StoryCharacters> {

    @SuppressWarnings("rawtypes")
    private Class[] types = {Morton.class, Frank.class, Harmonica.class, Cheyenne.class};
    private static Random rand = new Random(47);
    private int size;

    public StoryCharactersGenerator() {
    }

    public StoryCharactersGenerator(int sz) {
        size = sz;
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new StoryCharactersIterator();
    }

    class StoryCharactersIterator implements Iterator<StoryCharacters> {
        int count = size;

        public boolean hasNext() {
            return count > 0;
        }

        public StoryCharacters next() {
            count--;
            return StoryCharactersGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    ;

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[rand.nextInt(types.length)]
                    .newInstance();
            // Report programmer errors at run time:
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        StoryCharactersGenerator gen = new StoryCharactersGenerator();
        for (int i = 0; i < 7; i++)
            System.out.println(gen.next());
        for (StoryCharacters c : new StoryCharactersGenerator(7))
            System.out.println(c);
    }

}
