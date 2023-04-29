import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] ary = new int[N-1];
        int temp = 0;
        int max_num = 0;
        int min_num = Integer.MAX_VALUE;
        int max = 0;
        int max_temp = 0;
        int count = 0;
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(temp!=0) {
                ary[i-1] = num - temp; 
            }
            temp = num;
            if(max_num<num) {
            	max_num = num;
            }
            if(min_num>num) {
            	min_num = num;
            }
        }
        for(int i=1; i<=ary[0]; i++) {
            max = i;
            for(int j : ary) {
                if(j%i!=0) {
                	max = max_temp;
                    break;
                }
            }
            max_temp = max;
        }
        count = (max_num-min_num)/max - (N-1);
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}