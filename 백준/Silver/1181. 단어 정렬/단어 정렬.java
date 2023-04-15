import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i=0; i<N; i++) {
        	arr[i] = br.readLine();
        }
        HashSet<String> hashset = new HashSet<>(Arrays.asList(arr));
        String[] resArr = hashset.toArray(new String[0]);
        char[][] ary = new char[resArr.length][];
        for(int i=0; i<resArr.length; i++) {
            String temp = resArr[i];
            ary[i] = new char[temp.length()];
            for(int j=0; j<temp.length(); j++) {
                ary[i][j] = temp.charAt(j);
            }
        }
        Arrays.sort(ary, new Comparator<char[]>(){
            @Override
            public int compare(char[] o1, char[] o2) {
            	// TODO Auto-generated method stub
            	int result = 0;
            	if(o1.length==o2.length) {
            		if(o1[0] != o2[0]) {
            			result = o1[0]-o2[0];
            		} else if(o1[0] == o2[0] && o1.length != 1 && o2.length !=1) {
            			int i = 1;
            			while(true) {
            				if(o1[i] != o2[i]) {
            					result = o1[i]-o2[i];
            					break;
            				} else {
            					i++;
            				}
            			}
            		}
            	} else {
            		result = o1.length-o2.length;
            	}
            	return result;
            }
        });
        for(int i=0; i<resArr.length; i++) {
        	for(int j=0; j<ary[i].length; j++) {
        		sb.append(ary[i][j]);
        	}
        	sb.append("\n");
        }
        bw.write(sb + "");
        bw.flush();
        bw.close();
    }
}