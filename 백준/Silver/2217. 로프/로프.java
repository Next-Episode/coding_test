import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int ary[] = new int[N];
        int max = 0;
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            ary[i] = num;
        }
        Arrays.sort(ary);
        for(int j=0; j<ary.length; j++) {
            int sum = ary[j]*(N-j);
            if(max<sum) {
                max = sum;
            }
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}