import java.util.*;
import java.io.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;
/**
 * This file contains all the properties of the hangman game for checking if certain aspects of the game occur or not.
 * @author Wei Zhong Tee
 * @since 1 March 2020
 */
public class HangmanProperties {
  private String word;
  /**
   * This method reads the textfile puts all the words into an array.
   * @param  file The textfile is passed into the method via command line.
   * @return The value returned is the Array of words from the textfile.
   */
  public String[] readFile(String file) {
    try {
      Scanner s = new Scanner(new File(file));
      int ctr = 0;

      while(s.hasNext()) {
        ctr ++;
        s.next();
      }

      String[] arr = new String[ctr];
      Scanner s1 = new Scanner(new File(file));
      for (int x = 0; x < arr.length; x++) {
        arr[x] = s1.next();
      }
      return arr;
    } catch(Exception e) {
      System.out.print("Error reading file. Program is ending.");
      System.exit(0);
      return null;
    }
  }

  /**
   * The method getRandomWord is used to pull a random word out of the array of words that was taken from the textfile.
   * @param  wordsArray The array of words is passed into this method.
   * @return  A random word is selected and each character is placed as an element into an array and is returned.
   */

  public String[] getRandomWord(String[] wordsArray) {
    Random rand = new Random();
    word = wordsArray[rand.nextInt(wordsArray.length)];
    String answer[] = new String[word.length()];

    for (int x = 0; x < word.length(); x++) {
      answer[x] = String.valueOf(word.charAt(x));
    }
    return answer;
  }

  /**
   * checkValidInput is used to ensure that the user input only one letter and not numbers.
   * @param  input is what the user had input into the textfield.
   * @return a boolean value is returned so the program knows if the user has entered valid input.
   */

  public boolean checkValidInput(String input) {
    boolean incorrect = false;
    if (!(input.trim().equals(""))) {
      if (input.matches("[a-zA-Z]+")) {
        if (input.length() == 1) {
          try {
            Double.parseDouble(input);
          } catch(Exception e) {
            incorrect = true;
          }
        }
      }
    }
    return incorrect;
  }

  /**
   * checkIfGuessed is used for checking if the user has already input a letter that he/she is trying to input again.
   * @param  guessed is an arraylist that contains all the incorrect guesses.
   * @param  input is the user's input.
   * @return a boolean value is returned so the program knows if the user is inputting a new guess or one that has already been attempted.
   */

  public boolean checkIfGuessed(ArrayList <String> guessed, String input) {
    boolean incorrect = true;
    for (int x = 0; x < guessed.size(); x++) {
      if (input.equals(guessed.get(x))) {
        incorrect = false;
        break;
      }
    }
    return incorrect;
  }

  /**
   * checkIfCorrect is used to check if the user's input macthes a character in the array of characters that belong to the answer.
   * @param  input  is the user's input.
   * @param  answer is the array of characters that belong to the answer.
   * @return a boolean is returned so the program knows if the user has input a right or wrong character.
   */

  public boolean checkIfCorrect (String input, String[] answer) {
    boolean incorrect = false;
    for (int x = 0; x < answer.length; x++) {
      if (input.equals(answer[x])) {
        incorrect = true;
      }
    }

    return incorrect;
  }

  /**
   * inputRightAnswer is used to fill in parts of the word with the correct guesses of the user and keep the unguessed characters blank.
   * @param  input  is the user's input.
   * @param  answer is the array of characters that belong to the answer.
   * @param  blank  is the array that is used to store guessed and unguessed letters.
   * @return is the array that contains guessed words and the unguessed words as blanks so the user knows how many more characters there are.
   */

  public String[] inputRightAnswer(String input, String[] answer, String[] blank) {
    for (int x = 0; x < answer.length; x++) {
      if (input.equals(answer[x])) {
        blank[x] = input;
      }
    }
    return blank;
  }

  /**
   * checkIfWon is used to determine if the user has guessed all the characters.
   * @param  blank Is the array that contains what the user has succesfully guessed and how many more unguessed characters there are.
   * @return a boolean is returned so the program knows every character has been guessed as the array would have no more blanks.
   */

  public boolean checkIfWon(String[] blank) {
    boolean incorrect = true;
    for (int x = 0; x < blank.length; x++) {
      if (blank[x] == " _ ") {
        incorrect = false;
        break;
      }
    }

    return incorrect;
  }
}
