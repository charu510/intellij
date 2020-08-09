package Recursion;
//Also adding the diagnol component
public class MazePath {
    public static void main(String[] args) {
        mazepath("",3,3);
        System.out.println();
        System.out.println(mazepathcnt(3,3));
    }
    public static void mazepath(String processed,int row,int col){
        if(row==1 && col==1){
            System.out.print(processed+" ");
            return;
        }
        if(row>1)
            mazepath(processed+"V",row-1,col);
        if(col>1)
            mazepath(processed+"H",row,col-1);
        if(row==col && row>1 && col>1){
            mazepath(processed+"D",row-1,col-1);
        }
        if(row!=col && row>1 && col>1){
            mazepath(processed+"D",row-1,col-1);
        }
    }
    public static int mazepathcnt(int row,int col){
        if(row==1 || col==1)
            return 1;
        return mazepathcnt(row-1,col)+mazepathcnt(row,col-1)+mazepathcnt(row-1,col-1);
    }
}
