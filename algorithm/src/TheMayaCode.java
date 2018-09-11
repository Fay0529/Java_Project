import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TheMayaCode {


    public static void main(String []args){
        int level=0;
        String buf;
        Scanner in = new Scanner(System.in);
        HashSet<String> st= new HashSet<String>();
        Queue<String> q = new LinkedList<String>();
        loop:while (in.hasNext()) {
            q.clear();
            st.clear();
            int n = in.nextInt();
            buf = in.next();
            if (n < 4) {
                System.out.println(-1);
                continue;
            }
            if (buf.contains("2012")) {
                System.out.println(0);
                continue;
            }
            q.offer(buf);
            st.add(buf);
            level =0;
            while (!q.isEmpty()) {

                int len=q.size();
                while (len > 0) {
                    len--;
                    String str = q.poll();
                    if (str.contains("2012")) {
                        System.out.println(level);
                        continue loop;
                    }
                    for (int i=1;i<n;i++) {
                        char [] sb = str.toCharArray();
                        char tmp = sb[i];
                        sb[i] = sb[i-1];
                        sb[i-1] = tmp;
                        String tmpStr = String.valueOf(sb);
                        if(st.contains(tmpStr)) {
                            continue;
                        }
                        st.add(tmpStr);
                        q.offer(tmpStr);
                    }
                }
                level++;
            }
            System.out.println(-1);
        }
    }
}
