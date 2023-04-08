import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = null;
	    int N = Integer.parseInt(br.readLine());
	    boolean ary[][] = new boolean[101][101];
	    int count = 0;
	    for(int i=0; i<N; i++) {
	        st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        for(int j=x; j<x+10; j++) {
	            for(int k=y; k<y+10; k++) {
	                if(ary[j][k]==true) {
	                    continue;
	                }
	                ary[j][k] = true;
	                count++;
	            }
	        }
	    }
	    bw.write(count + "");
	    bw.flush();
	    bw.close();
	}
}