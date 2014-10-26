package generics.tuples;

public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return Tuple.tuple("hi", 47);
    }

    @SuppressWarnings("rawtypes")
    static TwoTuple f2() {
        return Tuple.tuple("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return Tuple.tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return Tuple.tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        TwoTuple<String, Integer> ttsi = f2();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
