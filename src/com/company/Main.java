package com.company;

public class Main {
    /** Мы хотим поставить 5 горизонтальных двухпалубных кораблей и 5 вертикальных. Но наш исходных корабль вертикальный,
     * поэтому когда цикл проверяет условие постановки горизонтальных кораблей и доходит до нашего корабля, то он в уже заполненные ячейки
     * опять присваивает значения 1. Так как вокруг нашего корабля 0. И при это а увеличивается на 1. То есть новых кораблей при условии а<5
     * у нас будет только 4. А всего горизонтальных кораблей 5 (а пройдет от 0 до 4)
     *
     *
     */
    public static void main(String[] args) {
	int [][]array=new int [10][10];
	array [2][3]=1;
	array [2][2]=1;
	int a=0;
	int b=0;
    for (int i=1; i<array.length-1; i++)
        for (int j=1; j<array.length-2; j++)
            if (a<5 & array[i-1][j-1]==0 & array[i-1][j]==0 & array[i-1][j+1]==0 & array[i-1][j+2]==0 & array[i][j+2]==0 &
            array[i][j+2]==0 & array[i+1][j+1]==0 & array[i+1][j]==0 & array[i+1][j-1]==0 & array[i][j-1]==0){
                array[i][j]=1;
                array[i][j+1]=1;
                a++;
            }
    for (int i=1; i<array.length-2; i++)
        for(int j=1; j<array.length-1; j++)
            if (array[i-1][j-1]==0 & array[i-1][j]==0 & array[i-1][j+1]==0 & array[i][j+1]==0 & array[i+1][j+1]==0 &
            array[i+1][j]==0 & array[i+1][j-1]==0 & array[i+1][j-1]==0 & array[i][j-1]==0 & b<5 ){
                array[i][j]=1;
                array[i+1][j]=1;
                b++;
            }
    for (int i=0; i<array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
    }
}
