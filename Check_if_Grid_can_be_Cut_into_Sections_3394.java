class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int m=rectangles.length;
        if(m==0){
            return false;
        }
      //  int nr=rectangles[0].length;
        int row[][]=new int[m][2];
        int col[][]=new int[m][2];
        // for(int arr[]:rectangles){
        //     row[0]=arr[0];
        //     row[1]=arr[2];
        //     col[0]=arr[1];
        //     col[1]=arr[3];
        // }
        for(int i=0;i<m;i++){
            row[i][0]=rectangles[i][1];
            row[i][1]=rectangles[i][3];
            col[i][0]=rectangles[i][0];
            col[i][1]=rectangles[i][2];
        }
       // Arrays.sort(row, Comparator.comparingInt(a -> a[0]));
       // Arrays.sort(col, Comparator.comparingInt(a -> a[0]));
       Arrays.sort(row, (a, b) -> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
Arrays.sort(col, (a, b) -> (a[0] == b[0]) ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        int rowc=0;
        int en=row[0][1];
        for(int i=0;i<row.length;i++){
            int st=row[i][0];
            int end=row[i][1];
            if(st>=en){
                rowc++;
                if(rowc==2){
                    return true;
                }
                //en=end;
            }
           en=Math.max(en,end);
        }
        int colc=0;
        en=col[0][1];
        for(int i=0;i<col.length;i++){
            int st=col[i][0];
            int end=col[i][1];
            if(st>=en){
                colc++;
                if(colc==2){
                    return true;
                }
            //    en=end;
            }
            en=Math.max(en,end);
        }
        return false;
    }
}


