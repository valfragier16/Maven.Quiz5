package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> subStrings = new TreeSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                subStrings.add(string.substring(i, j));

            }
        }
        return subStrings.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> strings1 = new TreeSet<>(Arrays.asList(getAllSubstrings(string1)));
        Set<String> strings2 = new TreeSet<>(Arrays.asList(getAllSubstrings(string2)));
        ArrayList<String> result = new ArrayList<>();
        for (String string: strings1) {
            if(strings2.contains(string)) result.add(string);
        }
        return result.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        int m = string1.length();
        int n = string2.length();

        int max = 0;

        int[][] dp = new int[m][n];
        int endIndex=-1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(string1.charAt(i) == string2.charAt(j)){

                    // If first row or column
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        // Add 1 to the diagonal value
                        dp[i][j] = dp[i-1][j-1]+1;
                    }

                    if(max < dp[i][j])
                    {
                        max = dp[i][j];
                        endIndex=i;
                    }
                }

            }
        }
        // We want String upto endIndex, we are using endIndex+1 in substring.
        return string1.substring(endIndex-max+1,endIndex+1);
    }

}
