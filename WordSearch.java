public class WordSearch {
	public static void main(String args[]){
		char word[][]={{'b'},{'a'},{'b'}};
		System.out.println(new WordSearch().exist(word,"bbabab"));
	}
    public boolean exist(char[][] board, String word) {
       return exist(board,word,0,0,0);
    }
    public boolean exist(char[][] board,String word,int r,int c,int index){
        if(index==word.length())
            return true;
        if(r>=board.length||c>=board.length||index>=word.length())
            return false;
		System.out.println("INDEX:"+index+" r:"+
        if(word.charAt(index)==board[r][c])
            return exist(board,word,r+1,c,index+1)||exist(board,word,r,c+1,index+1);
        return exist(board,word,r+1,c,index)||exist(board,word,r,c+1,index);
    }
}