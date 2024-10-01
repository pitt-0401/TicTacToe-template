# Assignment 2 - TicTacToe

## Learning objectives
You will practice using reference variables, arrays, and performing operations on arrays.

### Problem
*Your friend wants to implement a Tic-Tac-Toe game in Java. They have already started but got stuck and now ask you for your help to finish it.*

### Your task
Your task is to implement the Tic-Tac-Toe game.

The code template is in the `src` folder of this repository.

The game should allow two players to take turns and make moves on a 3x3 game board.
After each move, the program checks whether the current player has won or whether the game ended in a draw.

## The Game
### **Game Requirements**
*There are TODOs in the code. Make sure to follow them.*
* **`GameBoard`** represents the Tic-Tac-Toe game board.
  * Use a **2D array** to represent the cells on the board
  * Each cell can be empty, contain an `X`, or contain an `O`
  * *Hint: An empty cell could be stored as a `-`. When printing the board, you may show empty cells as `-` or as a blank.*
* **`Player`** represents a player in the game.
  * Store the player's name and symbol (`X` or `O`)
* **Game Logic**: The main game logic should be inside the **`TicTacToe`** class (make use of methods!).
  * Implement `promptPlayerMove()` that asks players to make a move on the game board.
  * Implement the game logic, consider the following:
    * Check if the board is full
    * Check for a win condition
    * Take a player's move and update the board
    * Switch between players **after each move**
* **User Interaction**: 
   * **After each move**, the current board should be printed to the console in a nice, readable format, containing each player's placed symbols
   * Prompt the user to place a move; the input should be used to make a move. A move is entered as the row and the column separated by a space, e.g., `1 2` (rows and columns start at `0`)
   * When the game ends — either because a player has won **or** because the board is full with no winner — display a message announcing the winner or declaring a draw
   * Ask if the players want to play again after each game (yes/no). If they want to play again, start a new game on an empty board automatically (`startGame()` and `playGame()` in `TicTacToe` are a good place for this)
* **Input Validation**: Make sure that all user input is valid and does not cause the game to unexpectedly abort! This includes player names (not empty), moves (two numbers, inside the board, on an empty cell), and the play-again answer (yes/no).

### Other considerations

- Please make sure to provide expressive **comments, print statements, and variable names**.
- **Make sure to follow object-oriented principles and Java best practices!**
- Explanation of the game: https://en.wikipedia.org/wiki/Tic-tac-toe
- If you type 'tic tac toe' in Google, you can play it :-)


### Bonus challenges (*optional*)
* Provide a more user-friendly and more sophisticated way of requesting user input to map to the game board (instead of typing a row and column number such as `0 0` or `2 1`)
* Feel free to add your own (more complex) customization to the project!

**Happy coding!**
