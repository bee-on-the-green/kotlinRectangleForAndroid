import kotlin.random.Random
import java.text.NumberFormat
import java.util.Locale
import kotlin.math.roundToInt



var breakPoint = 30

fun main() {

    var poolOfChar = arrayOf('{', '}')
    var poolOfChar2 = arrayOf('.', '·')




    // built the matrix
    var myMatrix = initiateMyMatrix(symBol)




    fun countPoolOfCharInMatrix(matrix: MutableList<MutableList<Char>>, poolOfChar: Array<Char>): Int {
        var count = 0
        for (row in matrix) {
            for (cell in row) {
                if (cell in poolOfChar) {
                    count++
                }
            }
        }
        return count
    }


// while loop:

    var cycles = 0
    var startTime = System.currentTimeMillis()


    while (true) {



        // Clear the screen once at the beginning of each iteration
        clearScreen()

        // Select a random coordinate
        var (myRandomX, myRandomY) = selectRandomCoordinate()



        // Draw the shape with the chosen parameters
        drawCircle(myMatrix, myRandomX, myRandomY, diameterToUse, poolOfChar)




        // Get the current percentage of bigSymbol characters in the matrix
        var mainCharPercentageAtCurrentTime = calculateCharacterPercentage(myMatrix, poolOfChar)



// Count the total number of poolOfChar characters in the matrix
        var totalPoolOfCharCount = countPoolOfCharInMatrix(myMatrix, poolOfChar2)

// Choose character and diameter based on the percentage
        if (mainCharPercentageAtCurrentTime > breakPoint) {
            // Draw the shape with the chosen parameters
            drawCircle(myMatrix, myRandomX, myRandomY, diameterToUse, poolOfChar2)
        }










        // Calculate elapsed time
        var currentTime = System.currentTimeMillis()
        var elapsedTime = currentTime - startTime

        // Display the matrix and update cycle count
        var completeOutput = myDisplayMatrixFunction(
            myMatrix,
            cycles,
            sleepTime,
            bigSymbol,
            percentageBigSymbol,
            elapsedTime
        )
        print(completeOutput)
        println("current percentage is $mainCharPercentageAtCurrentTime%")

        cycles++

        Thread.sleep(sleepTime)
    }
}
