package edu.escuela.gamepz.utils;
public class PersException extends Exception{
    public String msg;
    public int pos;
    public PersException(String msg, int pos){
        this.msg = msg;
        this.pos = pos;
    }
    public int getPos(){
        return pos;
    }
}
