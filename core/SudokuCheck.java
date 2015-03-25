public class SudokuCheck
{
public static void main(String args[])
{
        int[][] sudoku = {{9, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 8, 2, 6, 0, 0, 0, 0, 0}, {6, 0, 4, 9, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 2, 9, 3, 0, 5}, {0, 7, 0, 0, 0, 0, 0, 1, 0}, {1, 0, 3, 4, 5, 0, 0, 0, 0}, {0, 0, 5, 0, 0, 4, 6, 0, 9,}, {0, 0, 0, 0, 0, 3, 4, 2, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 8}};
        System.out.println("4 can be placed at position [5, 5] : " + isNumberPlacedAtGivenPosition(sudoku, 4, new SudokuPosition(5, 5)));

    }


public static boolean isNumberPlacedAtGivenPosition(int[][] sudoku, int number, SudokuPosition sudokuPosition) 
{ 
int row=sudokuPosition.rowPosition-1;
int col=sudokuPosition.columnPosition-1;
if(sudoku[row][col]!=0)
return false;
int i,j;
for(i=0;i<9;i++)
if(sudoku[i][col]==number)
return false;
for(i=0;i<9;i++)
if(sudoku[row][i]==number)
return false;
if(row<3&&col<3)
for(i=0;i<3;i++)
for(j=0;j<3;j++)
if(sudoku[i][j]==number)
return false;
if(row<3&&(col>2&&col<6))
for(i=0;i<3;i++)
for(j=3;j<6;j++)
if(sudoku[i][j]==number)
return false;
if(row<3&&col>5)
for(i=0;i<3;i++)
for(j=6;i<9;j++)
if(sudoku[i][j]==number)
return false;

if((row>2&&row<6)&&col<3)
for(i=3;i<6;i++)
for(j=0;j<3;j++)
if(sudoku[i][j]==number)
return false;
if((row>2&&row<6)&&(col>2&&col<6))
for(i=3;i<6;i++)
for(j=3;j<6;j++)
if(sudoku[i][j]==number)
return false;
if((row>2&&row<6)&&col>5)
for(i=3;i<6;i++)
for(j=6;i<9;j++)
if(sudoku[i][j]==number)
return false;

if(row>5&&col<3)
for(i=6;i<9;i++)
for(j=0;j<3;j++)
if(sudoku[i][j]==number)
return false;
if(row>5&&(col>2&&col<6))
for(i=6;i<9;i++)
for(j=3;j<6;j++)
if(sudoku[i][j]==number)
return false;
if(row>5&&col>5)
for(i=6;i<9;i++)
for(j=6;i<9;j++)
if(sudoku[i][j]==number)
return false;

return true;
}
}
class SudokuPosition { 
 
int rowPosition; 
int columnPosition; 
 
public SudokuPosition(int rowPosition, int columnPosition) { 
this.rowPosition = rowPosition; 
this.columnPosition = columnPosition; 
} 
}