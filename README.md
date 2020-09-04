# Java-GUI-Hangman-Game

Java GUI Hangman Game

Author: Wei Zhong Tee 
Last Updated: 2 March 2020 
Project type: Using GUI and drawing/painting with Java

This is a hangman game is based on Java GUI. The program also draws out the stick figure as users make wrong guesses. The word dictionary textfile has to be passed into the command line when compiling and running the game.

DrawArea.java, Game.java, GameGui.java, HangmanProperties.java and the text file that is going to be passed in through command line must be placed in the same folder.

The text file is passed in after compiling and running Game.java (driver) or *.java(to compile all the java files).
Eg: > means command line input
> javac Game.java
> java Game <NameOfYourTextFile>.txt

or
> javac *.java
> java Game <NameOfYourTextFile>.txt

Decisions I made:
1. The game logic all is executed when the button is pressed, but the program gets the game mechanics from HangmanProperties.java and its methods.
2. I used four files including the main to separately executed different components of the program; the GUI, the game and the drawing.

Issues I faced:
1. I had issues passing the word for the game into GameGui but eventually assigning it its value in the constructor solved the issue.
2. Drawings were not overlapping each other, but being added to the bottom of the JFrame. Eventually a fellow student taught me that a setter had to be used for passing in the amount of time the user had guessed for the drawing to be put over the previous one.
