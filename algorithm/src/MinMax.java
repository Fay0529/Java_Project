import java.io.*;

public class MinMax {
    public static void main(String [] args) throws IOException {
        System.setIn(new FileInputStream("src\\in.txt"));
        System.setOut(new PrintStream(new FileOutputStream("src\\out.txt")) );
        StreamTokenizer in = new
                StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        while(in.nextToken() != StreamTokenizer.TT_EOF){
            int n = (int)in.nval;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            in.nextToken();
            for(int i=0; i<n; i++){
                int tmp = (int)in.nval;
                in.nextToken();
                if(min > tmp) {
                    min = tmp;
                }
                if (max < tmp) {
                    max = tmp;
                }
            }
            out.println(max+" "+min);
            out.flush();

        }

    }

}
