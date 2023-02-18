import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N];
        int[] result = new int[N];
        int max = 0;
        
        for(int i=0; i<N; i++) {
            ary[i] = Integer.parseInt(br.readLine());
            if(ary[i] > max) {
            	max = ary[i];
            }
        }
        
        int[] counting = new int[max + 1];
        
        for(int i=0; i<ary.length; i++) {
            counting[ary[i]]++;
        }
        
        for(int i=1; i<counting.length; i++) {
            counting[i] += counting[i-1];
        }
        
        for(int i=ary.length - 1; i>=0; i--) {
            int val = ary[i];
            counting[val]--;
            result[counting[val]] = val;
        }
        
        for(int i : result) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}