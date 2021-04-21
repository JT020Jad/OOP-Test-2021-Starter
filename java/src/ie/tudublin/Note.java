package ie.tudublin;

import processing.core.PApplet;


public class Note extends PApplet
{
    // Private fields
    private char note;
    private int duration;

    // Constructor
    public Note(char note, int duration) 
    {
        this.note = note;
        this.duration = duration;
    }


    // Generated toString() method
    @Override
    public String toString() 
    {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }


    public int getDuration() 
    {
        return duration;
    }


    public void setDuration(int duration) 
    {
        this.duration = duration;
    }


    public char getNote() 
    {
        return note;
    }


    public void setNote(char note) 
    {
        this.note = note;
    }
}