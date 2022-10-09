import java.util.Arrays;

public class Main {
    public static void duplicates(char[] S) {
        int n = S.length;


        //pentru un singur caracter sau nule
        if (n < 2) {
            return;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {

            if (S[j] != S[i]) {
                j++;
                S[j] = S[i];
            }
        }
        System.out.println(Arrays.copyOfRange(S, 0, j + 1));

    }
    public static void main(String[] args)
    {
        char S1[] = "abba...metttallica".toCharArray();
        duplicates(S1);

        char S2[] = "aabcca".toCharArray();
        duplicates(S2);
    }

}
