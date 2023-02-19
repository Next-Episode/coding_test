import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            sb3.delete(0, sb3.length());
            for(int j=i+1; j<N; j++) {
                sb3.append(" ");
            }
            sb1.append("*");
            sb2.append(sb3);
            sb2.append(sb1 + "\n");
        }
        bw.write(sb2 + "");
        bw.flush();
        bw.close();
    }
}