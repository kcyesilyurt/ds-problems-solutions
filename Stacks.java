import java.io.*;
import java.util.*;

class Stacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1= 0; int sum2 = 0; int sum3 =0;
        for(int i = 0; i < h1.size(); i++) sum1 += h1.get(i);
        for(int i = 0; i < h2.size(); i++) sum2 += h2.get(i);
        for(int i = 0; i < h3.size(); i++) sum3 += h3.get(i);
        int i = 0; int k = 0; int j =0;
        while(i < h1.size() && j < h2.size() && k < h3.size()){
            if(sum1 == sum2 && sum2 == sum3) return sum1;
            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= h1.get(i);
                i++;
            }
            else if(sum2 >= sum1 && sum2 >= sum3){
                sum2 -= h2.get(j);
                j++;

            }
            else{
                sum3 -= h3.get(k);
                k++;
            }
        }
        return 0;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = bufferedReader.readLine().trim().split("\\s+");
        int n1 = Integer.parseInt(firstLine[0]);
        int n2 = Integer.parseInt(firstLine[1]);
        int n3 = Integer.parseInt(firstLine[2]);

        List<Integer> h1 = new ArrayList<>();
        List<Integer> h2 = new ArrayList<>();
        List<Integer> h3 = new ArrayList<>();

        String[] a1 = bufferedReader.readLine().trim().split("\\s+");
        String[] a2 = bufferedReader.readLine().trim().split("\\s+");
        String[] a3 = bufferedReader.readLine().trim().split("\\s+");

        for (int i = 0; i < n1; i++) h1.add(Integer.parseInt(a1[i]));
        for (int i = 0; i < n2; i++) h2.add(Integer.parseInt(a2[i]));
        for (int i = 0; i < n3; i++) h3.add(Integer.parseInt(a3[i]));

        int result = Result.equalStacks(h1, h2, h3);
        System.out.println(result);
    }
}
