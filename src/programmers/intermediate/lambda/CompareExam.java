package programmers.intermediate.lambda;

public class CompareExam {
    public static void compareImpl(Compare compare) {
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        compareImpl((i, j) -> {
            return i-j;
        });
    }

}
