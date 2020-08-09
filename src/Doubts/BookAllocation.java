package Doubts;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(); //no of pages
            int m = s.nextInt(); //no of students
            int[] pages = new int[n];
            for (int i = 0; i < pages.length; i++) {
                pages[i] = s.nextInt();
            }
            int lo = 0;
            int hi = 0;
            for (int i = 0; i < pages.length; i++) {
                hi += pages[i];
            }
            int ans = 0;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (isitpossible(pages, n, mid)) {
                    hi=mid-1;
                    ans=mid;
                }
                else{
                    lo=mid+1;
                }
            }
            System.out.println(ans);

        }
    }
    public static boolean isitpossible(int[] page,int nos,int mid){
        int numberstudent=1;
        int pageread=0;
        int i=0;
        while(i<page.length){
            if(page[i]+pageread<=mid){
                pageread+=page[i];
                i++;
            }
            else{
                numberstudent++;
                pageread=0;
            }
            if(numberstudent>nos){
                return false;
            }
        }
        return true;
    }
}


