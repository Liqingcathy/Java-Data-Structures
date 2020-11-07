/*
Write a piece of code that constructs a two-dimensional array of integers named table with 5 rows and 10 columns. 
Fill the array with a multiplication table, so that array element [i][j] contains the value i * j. Use nested for loops to build the array.
*/

int[][] table = new int[5][10];
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 10; j++) {
        table[i][j] = i * j;
    }   
}

/*
expecting output: 
{0 0 0 0 0 0 0 0 0 }
{0 1 2 3 4 5 6 7 8 }
{0 2 4 6 8 10 12 14 16}
{0 3 6 9 12	15 18	21 24}
{0 4 8 12	16 20	24 28	32}
*/
