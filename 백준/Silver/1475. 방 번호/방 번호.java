import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String ary[] = br.readLine().split("");
        int num[] = new int[10];
        for(int i=0; i<ary.length; i++) {
        	int N = Integer.parseInt(ary[i]);
            if(N==6 && num[6]>num[9]) {
                num[9]++;
            } else if(N==9 && num[9]>num[6]) {
                num[6]++;
            } else {
            	num[N]++;
            }
        }
        Arrays.sort(num);
        bw.write(num[9] + "");
        bw.flush();
        bw.close();
    }
}