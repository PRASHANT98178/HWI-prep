class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                char ch = board[i][j];
                if(ch >= '1' && ch <= '9'){
                    if(!set.contains(ch)){
                        set.add(ch);
                    }
                    else return false;
                }
                else if(ch == '.') continue;

                else{
                    return false;
                }
            }
            set.clear();
        }

        for(int j=0; j<board[0].length; j++){
            for(int i=0; i<board.length; i++){
                char ch = board[i][j];
                if(ch >= '1' && ch <= '9'){
                    if(!set.contains(ch)){
                        set.add(ch);
                    }
                    else return false;
                }
                else if(ch == '.') continue;

                else{
                    return false;
                }
            }
            set.clear();
        }

        set.clear();

        // for(int i=0; i<3; i++){
        //     for(int l=0; l<3; l++){
        
        //         for(int j=i*3; j<i*3+3; j++){
        //             for(int k=i*3; k<l*3+3; k++){
        //                 char ch = board[j][k];
        //                 if(ch >= '1' && ch <= '9'){
        //                     if(!set.contains(ch)){
        //                         set.add(ch);
        //                     }
        //                     else return false;
        //                 }
        //                 else if(ch == '.') continue;

        //                 else{
        //                     return false;
        //                 }
        //             }
        //         }
        //         set.clear();
        //     }
        // }
        // return true;

        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int blockCol = 0; blockCol < 3; blockCol++) {
                set.clear();
                for (int i = blockRow * 3; i < blockRow * 3 + 3; i++) {
                    for (int j = blockCol * 3; j < blockCol * 3 + 3; j++) {
                        char ch = board[i][j];
                        if (ch >= '1' && ch <= '9') {
                            if (!set.add(ch)) return false;
                        } else if (ch != '.') {
                            return false;
                        }
                    }
                }
            }
        }
        return true;

    }
}