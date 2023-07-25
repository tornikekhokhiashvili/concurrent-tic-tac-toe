package com.epam.rd.autocode.concurrenttictactoe;

import java.util.Arrays;

public class ticTacToeImpl implements TicTacToe{
    private char lastmark='0';
    private char [][] table=new char[3][3];
    public  ticTacToeImpl(){
        for(int i=0;i< table().length;i++){
            Arrays.fill(table[i],' ');
        }
    }
    @Override
    public void setMark(int x, int y, char mark) {
        if(table[x][y]==' '){
            table[x][y]=mark;
        }else {
            throw new IllegalArgumentException("Can not set mark twice");
        }
        lastmark = mark;
    }

    @Override
    public char[][] table() {
        char[][] gameTable = new char[3][3];
        for (int i = 0; i < table.length; i++) {
            gameTable[i] = Arrays.copyOf(table[i], table.length);
        }
        return gameTable;
    }

    @Override
    public char lastMark() {
        return lastmark;
    }
}
