import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int numOfMultipleOfFive = getNumOfMultipleOfFive(n);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(numOfMultipleOfFive));
        bw.flush();
        bw.close();
    }

    private static int getNumOfMultipleOfFive(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            while (tmp % 5 == 0) {
                cnt++;
                tmp /= 5;
            }
        }
        return cnt;
    }
}
