public class Game {
    Integer player1ScoreIndex = 0
    Integer player2ScoreIndex = 0
    
    List scores = ['0', '15', '30', '40', '40a', 'w']

    Game() {
        println "*********************************************************************************"

        println " Nadal ${scores[player1ScoreIndex]} x Federer ${scores[player2ScoreIndex]} "

        println "*********************************************************************************"
    }

    public void round(Integer player) {
        if (player == 1) {
            player1ScoreIndex++
            println "Ponto Nadal"
        } else {
            player2ScoreIndex++
            println "Ponto Federer"
        }
        calculateScore()

        println " Nadal ${scores[player1ScoreIndex]} x Federer ${scores[player2ScoreIndex]} "

        if (isStandardGamePoint() || isDeuceGamePoint()) {
            println "Game point!"
        }

        if (player1ScoreIndex == 5) {
            println " Nadal ganhou! "
        } else if (player2ScoreIndex == 5) {
            println " Federer ganhou! "
        }

        println "*********************************************************************************"
    }

    private void calculateScore() {
        if (player1ScoreIndex == 4 && player2ScoreIndex < 3) {
            player1ScoreIndex++
            return
        }

        if (player2ScoreIndex == 4 && player1ScoreIndex < 3) {
            player2ScoreIndex++
            return
        }

        if (player2ScoreIndex == 4 && player1ScoreIndex == 4) {
            player1ScoreIndex--
            player2ScoreIndex--            
            return
        }
    }

    private Boolean isStandardGamePoint() {
        return (player2ScoreIndex == 3 && player1ScoreIndex < 3) || (player1ScoreIndex == 3 && player2ScoreIndex < 3)
    }

    private Boolean isDeuceGamePoint() {
        return player2ScoreIndex == 4 || player1ScoreIndex == 4
    }
}


Game game = new Game()
game.round(1)
game.round(2)
game.round(1)
game.round(2)
game.round(1)
game.round(2)
game.round(1)
game.round(2)
game.round(1)
game.round(1)
