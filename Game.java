import java.util.*;
import java.io.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * This file is the driver for the game. The frame and word are passed into methods in this file that runs the game.
 * @author Wei Zhong Tee
 * @since 1 March 2020
 */
public class Game extends JFrame{
  private String word;
  public static final int FRAME_WIDTH = 500;
	public static final int FRAME_HEIGHT = 800;
  /**
   * This is the construtor that creates the frame for the game and sets the size of the frame.
   * @param a is the answer to be used for the hangman game.
   */
  public Game(String[] a){
    JPanel sp = new GameGui(a);
    add(sp);
    setSize(FRAME_WIDTH,FRAME_HEIGHT);
  }

  /**
   * This is the driver for the game. It passes the word for the game into methods for everything to run.
   * @param args Is used to get the word from a textfile via the command line.
   */
  public static void main(String[] args) {
    HangmanProperties run = new HangmanProperties();
    String[] words = run.readFile(args[0]);
    String[] answer = run.getRandomWord(words);
    Game trial = new Game(answer);
    GameGui action = new GameGui(answer);
    trial.setTitle("Hangman");
    trial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    trial.setVisible(true);
  }
}
