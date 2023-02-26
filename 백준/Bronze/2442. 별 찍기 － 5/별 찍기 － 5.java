import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=(2*N-1)*N; i++) {
            if(i>=(((2*N-1)/2+1)+(2*N-1)*(i/(2*N-1)))-(i/(2*N-1)) && i<=(((2*N-1)/2+1)+(2*N-1)*(i/(2*N-1)))+(i/(2*N-1))) {
                bw.write("*");
            } else if(i<(((2*N-1)/2+1)+(2*N-1)*(i/(2*N-1)))-(i/(2*N-1)) && i%(2*N-1)!=0) {
                bw.write(" ");
            }
            
            if(i%(2*N-1)==0) {
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}