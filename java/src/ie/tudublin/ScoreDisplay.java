package ie.tudublin;

import java.util.ArrayList;
import java.util.*;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	
	void loadScore()
	{
		// Parsing the string into a character array
		String delimiters = "";
		String[] parsedScore = score.split(delimiters);


		// Printing elements of the character array to console to ensure it's working
		for(int i = 0; i < parsedScore.length; i++)
		{
			System.out.println(parsedScore[i]);

			for(int j = 0; j < parsedScore.length; j++)
			{
				
			}
		}

		//Collections.addAll(notes, parsedScore);
	}


	void drawNotes()
	{
		// D note
		line(85, 260, 100, 280);
		line(85, 260, 85, 420);
		fill(0);
		circle(65, 420, 40);


	}

	void drawStaves()
	{
		int x1 = 50;
		int x2 = 950;

		int y1 = 50;
		int y2 = 50;

		// Drawing the staves
		for(int i = 0; i < 5; i++)
		{
			y1 = y1 + 70;
			y2 = y2 + 70;
			line(x1, y1, x2, y2);
		} 


		/* Old implementation of the staves

		// Stave 1
		line(50, 120, 950, 120);

		// Stave 2
		line(50, 190, 950, 190);

		// Stave 3
		line(50, 260, 950, 260);

		// Stave 4
		line(50, 330, 950, 330);

		// Stave 5
		line(50, 400, 950, 400);
		*/
	}


	public void settings()
	{
		size(1000, 500);

		/* How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
		*/
	}

	public void setup() 
	{
		loadScore();
	}

	public void draw()
	{
		background(255);
		stroke(0);
		strokeWeight(3);

		drawStaves();
		drawNotes();
	}
}
