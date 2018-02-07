# Dojo Tennis Score

This Kata is about implementing a simple tennis game score. 

# Getting started

You need [groovy](http://groovy-lang.org/download.html) to run TennisScore.groovy as a script.

# Rules

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

2. If a player has 40 and he/she wins the ball, he/she wins the game, however there are special rules.

3. If both have 40 the players are **deuce**. 
a. If the game is in deuce, the winner of a ball will have advantage and game ball. 
b. If the player with advantage wins the ball he wins the game 
c. If the player without advantage wins they are back at deuce.

4. A game is won by the first player to have won at least four points in total and at least two points more than the opponent.

5. If at least three points have been scored by each player, and the scores are equal, the score is **deuce**.

6. If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is “advantage” for the player in the lead.
