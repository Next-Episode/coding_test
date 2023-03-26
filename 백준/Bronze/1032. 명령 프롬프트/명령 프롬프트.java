import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String ary[] = br.readLine().split("");
        for(int i=0; i<N-1; i++) {
            String temp[] = br.readLine().split("");
            for(int j=0; j<ary.length; j++) {
                if(!ary[j].equals(temp[j])) {
                    ary[j] = "?";
                }
            }
        }
        for(int i=0; i<ary.length; i++) {
            bw.write(ary[i] + "");
        }
        bw.flush();
        bw.close();
    }
}