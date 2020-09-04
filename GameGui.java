import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;
import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 * This file contains all the GUI for the game and the logic for the game. The game logic is taken from methods from HangmanProperties.java
 * @author Wei Zhong Tee
 * @since 1 March 2020
 */
public class GameGui extends JPanel {
  private JPanel topLinePanel = new JPanel();
  private JLabel introLine = new JLabel("Word to guess: ");
  private JLabel wordToGuess = new JLabel("_____");

  private JPanel secondLinePanel = new JPanel();
  private JLabel howManyLetters = new JLabel("Amount of characters");

  private JPanel thirdLinePanel = new JPanel();
  private JLabel guessALetter = new JLabel("Guess a letter: ");
  private JTextField userInput = new JTextField(10);
  private JButton makeGuess = new JButton("Submit Letter");


  private JPanel fourthlinePanel = new JPanel();
  private JLabel guessedLetters = new JLabel("Guessed Letters: ");
  private JLabel letterGuessed = new JLabel("");
  private String input;
  private String[] answer;
  private String[] blank;
  private String[] words;
  private String blanks;
  private String word;
  private int counter;
  ArrayList <String> guessed = new ArrayList <String>();
  ArrayList <String> guessedRight = new ArrayList <String>();
  HangmanProperties run = new HangmanProperties();

  private JPanel fifthLinePanel = new JPanel();
  private JLabel result = new JLabel("");
  private DrawArea drawArea;


  /**
   * This is the constructor for the GameGUI class. It adds all the Labels, Textfields and Buttons to panels and adds it to the frame. It also takes in the word for the hangman game for from the main.
   * @param a The word used for the hangman game
   */
  public GameGui(String[] a) {

		setBorder(new EmptyBorder(10, 10, 10, 10));
    answer = a;
    blank = new String[answer.length];
    String blanks ="";
    for (int x = 0; x < answer.length; x++) {
      blank[x] = " _ ";
      blanks += blank[x];
    }
    words = new String[answer.length];
    for (int i = 0; i < answer.length; i++) {
      words[i] = " _ ";
    }
    counter = 1;

    wordToGuess.setText(blanks);
    topLinePanel.add(introLine);
    topLinePanel.add(wordToGuess);
    add(topLinePanel);

    howManyLetters.setText("The word has " + blank.length + " characters.");
    secondLinePanel.add(howManyLetters);
    add(secondLinePanel);

    thirdLinePanel.add(guessALetter);
    thirdLinePanel.add(userInput);
    thirdLinePanel.add(makeGuess);
    add(thirdLinePanel);
    ActionListener enter = new EnterGuess();
    makeGuess.addActionListener(enter);


    fourthlinePanel.add(guessedLetters);
    fourthlinePanel.add(letterGuessed);
    add(fourthlinePanel);

    drawArea = new DrawArea(0);
    add(drawArea);

    fifthLinePanel.add(result);
    add(fifthLinePanel);
  }

  /**
   * This method sets the text on the Label to show the user the amount of incorrect guesses
   */
  public void showGuesses() {
    String guesses = "";
    for(int x = 0; x < guessed.size(); x++) {
      guesses += " " + (guessed.get(x));
    }
    letterGuessed.setText(guesses);
  }

  public ArrayList <String> getGuessed() {
    return guessed;
  }

  public void setInput(String a) {
    input = a;
  }

  public String getInput() {
    return input;
  }


  public class EnterGuess implements ActionListener {
    /**
     * This is the action listener for the button. The game logic is also found here and one round runs everytime valid input is entered by pressing the button.
     * @param event Runs when the button is pressed.
     */
    public void actionPerformed(ActionEvent event) {
      String in = userInput.getText();
      in = in.toLowerCase();

      if (!run.checkValidInput(in)) {
        JOptionPane.showMessageDialog(null, "You need to guess one letter.");
        userInput.setText("");
      }

      else if (!run.checkIfGuessed(guessed, in)) {
        JOptionPane.showMessageDialog(null, "You have already guessed that.");
        userInput.setText("");
        if (!run.checkValidInput(in)) {
          JOptionPane.showMessageDialog(null, "You need to guess one letter.");
          userInput.setText("");
        }
      }

      else if (!run.checkIfGuessed(guessedRight, in)) {
        JOptionPane.showMessageDialog(null, "You have already guessed that.");
        userInput.setText("");
        if (!run.checkValidInput(in)) {
          JOptionPane.showMessageDialog(null, "You need to guess one letter.");
          userInput.setText("");
        }
      }

      else if (run.checkIfCorrect(in, answer) == true) {
        word = "";
        words = run.inputRightAnswer(in, answer, words);
        for (int i = 0; i < answer.length; i++) {
          word += words[i] + " ";
        }
        guessedRight.add(in);
        wordToGuess.setText(word);
      }

      else {
        drawArea.DrawShape(counter);
        drawArea.setPreferredSize(new Dimension(600,600));
        revalidate();
        repaint();
        setInput(in);
        guessed.add(in);
        showGuesses();
        counter++;
      }
      userInput.setText("");
      if (guessed.size() == 7) {
        word = "";
        for (int i = 0; i < answer.length; i++) {
          word += answer[i];
        }
        result.setText("You Lose! The word was " + word);
        makeGuess.setEnabled(false);
      }

      if (run.checkIfWon(words) == true) {
        result.setText("You Won!");
        makeGuess.setEnabled(false);
      }
    }
  }
}
