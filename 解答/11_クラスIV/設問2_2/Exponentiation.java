public class Exponentiation implements Calcurator {
    public int calc(int x, int y) {
        int answer = 1;
        for (int i = 0; i < y; i++) {
            answer *= x;
        }
        return answer;
    }
}