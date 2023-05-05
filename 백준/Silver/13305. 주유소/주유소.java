import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        int ary_distance[] = new int[N-1];
        int ary_price[] = new int[N-1];
        int min_price = Integer.MAX_VALUE;
        int sum_distance = 0;
        int total_price = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sum_distance += temp;
            ary_distance[i] = temp;
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(min_price>temp) {
                min_price = temp;
            }
            ary_price[i] = temp;
        }
        
        
        for(int i=0; i<N-1; i++) {
            if(ary_price[i]==min_price) {
                total_price += ary_price[i]*sum_distance;
                break;
            } else {
                total_price += ary_price[i]*ary_distance[i];
                sum_distance -= ary_distance[i];
            }
        }
        
        bw.write(total_price + "");
        bw.flush();
        bw.close();
    }
}