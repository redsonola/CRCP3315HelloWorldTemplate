package com.example;

/*
 * c2017-2023 Courtney Brown 
 * Class: Main Class for Hello World for CC3 Class Projects streaming MIDI, etc.
 * Description: Demonstration of MIDI file manipulations, etc. & 'MelodyPlayer' sequencer
 * 
 *
 */


import java.util.*; 

//importing the JMusic stuff
import jm.music.data.*;
import jm.JMC;
import jm.util.*;
import jm.midi.*;

import java.io.UnsupportedEncodingException;
import java.net.*;

//import javax.sound.midi.*;

			//make sure this class name matches your file name, if not fix.
public class App {

	//MelodyPlayer player; //play a midi sequence
	//MidiFileToNotes midiNotes; //read a midi file

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setup();


	}

	//doing all the setup stuff
	public static void setup() {

		

		// returns a url
		//String filePath = "mid/gardel_por.mid"; //= getPath("mid/gardel_por.mid");
		System.out.println("This is a test.");

		//playMidiFile(filePath); //use to debug -- this will play the ENTIRE file -- use ONLY to check if you have a valid path & file & it plays
								  //it will NOT let you know whether you have opened file to get the data in the form you need for the assignment

// 		midiNotes = new MidiFileToNotes(filePath); //creates a new MidiFileToNotes -- reminder -- ALL objects in Java must 
// 													//be created with "new". Note how every object is a pointer or reference. Every. single. one.

// //		// which line to read in --> this object only reads one line (or ie, voice or ie, one instrument)'s worth of data from the file
// 		midiNotes.setWhichLine(0);
		

// 		player = new MelodyPlayer(this, 100.0f);

// 		player.setup();
// 		player.setMelody(midiNotes.getPitchArray());
// 		player.setRhythm(midiNotes.getRhythmArray());
	}

	public void draw() {
		//player.play(); //play each note in the sequence -- the player will determine whether is time for a note onset
		
	}

	//this finds the absolute path of a file
	//does not work and does not look it is needed in VSCode
	// String getPath(String path) {

	// 	String filePath = "";
	// 	try {
	// 		filePath = URLDecoder.decode(getClass().getResource(path).getPath(), "UTF-8");

	// 	} catch (UnsupportedEncodingException e) {
	// 		// TODO Auto-generated catch block
	// 		e.printStackTrace();
	// 	}
	// 	return filePath;
	// }

	//this function is not currently called. you may call this from setup() if you want to test
	//this just plays the midi file -- all of it via your software synth. You will not use this function in upcoming projects
	//but it could be a good debug tool.
	void playMidiFile(String filename) {
		Score theScore = new Score("Temporary score");
		Read.midi(theScore, filename);
		Play.midi(theScore);
	}
/* 
	//this starts & restarts the melody.
	public void keyPressed() {
		
		if (key == ' ') {
			player.reset();
			println("Melody started!");
		}
		else if( key == '1' )
		{
			// returns a url
			String filePath = "mid/MaryHadALittleLamb.mid";
			// playMidiFile(filePath); //again, for a limited set of debugging needs

			midiNotes = new MidiFileToNotes(filePath); //creates a new MidiFileToNotes -- reminder -- ALL objects in Java must 
														//be created with "new". Note how every object is a pointer or reference. Every. single. one.

//			// which line to read in --> this object only reads one line (or ie, voice or ie, one instrument)'s worth of data from the file
			midiNotes.setWhichLine(0); //this assumes the melody is midi channel 0 -- this is usually but not ALWAYS the case, so you can try other channels as well, if 0 is not working out for you. 
			
		}
		else if(key=='2') 
		{
			//do something else here -- like unit tests, etc. 
		}
		
			

	}
	*/
}
