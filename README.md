# Card Game

A Java-based card game program that simulates the functionality of a card game, allowing multiple players to participate, interact, and play against a dealer.

## Features

- **Card Class**: Represents individual cards with a face (e.g., Ace, King) and a suit (e.g., Hearts, Spades).
- **DeckOfCards Class**: Implements a standard 52-card deck with shuffling and dealing capabilities.
- **CardGame Class**: Contains the main logic for the game, including player interaction and turn-based gameplay.

## How to Use

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- A Java IDE or text editor of your choice (e.g., IntelliJ IDEA, Eclipse, VS Code).

### Running the Program

1. Clone this repository or download the files.
2. Open the project in your preferred IDE or compile the `.java` files manually using the terminal.
3. Compile the Java files:
   ```bash
   javac cardgame/*.java
   ```
4. Run the main class:
   ```bash
   java cardgame.CardGame
   ```
5. Follow the on-screen prompts to play the game.

## Game Flow

1. The dealer shuffles the deck.
2. Players are asked to input the number of participants.
3. The dealer and players are dealt cards.
4. Players can choose to "hit" or "stand" during their turn.
5. The game continues until all players either win, lose (bust), or stand.
6. The results are displayed at the end of the game.

## Code Structure

### Card.java
Defines the `Card` class with:
- Fields: `face` and `suit`.
- Methods: `getFace`, `getSuit`, and `toString` for representing card details.

### DeckOfCards.java
Implements the `DeckOfCards` class:
- Creates and shuffles a standard 52-card deck.
- Methods for dealing cards and displaying the current card.

### CardGame.java
The main class to execute the game:
- Handles user input and game logic.
- Manages player turns, card dealing, and win/loss conditions.

## Example Output

```
How many players are there?
3
Dealer gets Ace of Hearts
Dealer face up card value is Ace
Player 1 gets Queen of Spades
Player 1 gets Four of Diamonds
Current total is 14 for player 1
...
```

## Future Enhancements

- Add support for additional card games (e.g., Poker, Rummy).
- Implement graphical user interface (GUI) for better user experience.
- Add more detailed rules and scoring mechanisms.

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

Ruben Ramirez
