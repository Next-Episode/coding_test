import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ary[] = new int[3];        
        ary[0] = Integer.parseInt(st.nextToken());
        ary[1] = Integer.parseInt(st.nextToken());
        ary[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(ary);
        bw.write(ary[0] + " " + ary[1] + " " + ary[2]);
        bw.flush();
        bw.close();
    }
}