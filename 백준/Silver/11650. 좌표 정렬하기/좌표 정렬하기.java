import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int ary[][] = new int[N][2];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            ary[i][0] = Integer.parseInt(st.nextToken());
            ary[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ary, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
            	// TODO Auto-generated method stub
            	return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });
        for(int i=0; i<ary.length; i++) {
        	bw.write(ary[i][0] + " " + ary[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}