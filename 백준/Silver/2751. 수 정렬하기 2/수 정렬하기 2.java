import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        int ary[] = new int[N];
        for(int i=0; i<N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }
        
        for(int k=0; k<ary.length; k++) {
        	heap.add(ary[k]);
        }
        
        for(int z=0; z<ary.length; z++) {
        	ary[z] = heap.poll();
        }
        
        for(int j : ary) {
            sb.append(j + "\n");
        }
        bw.write(sb + "");
        bw.flush();
        bw.close();
    }
}