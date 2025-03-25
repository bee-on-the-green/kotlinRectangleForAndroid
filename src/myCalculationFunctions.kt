import kotlin.random.Random
import java.text.NumberFormat
import java.util.Locale
import kotlin.math.roundToInt


// function to initiate the matrix
fun initiateMyMatrix(symBol: Char): MutableList<MutableList<Char>> {
    val myMatrix: MutableList<MutableList<Char>> = mutableListOf()

    for (i in 1..lineNumber) {
        var row = MutableList(lonGueur) { symBol } // Use the provided symBol as default
        myMatrix.add(row) // Add the row to the matrix
    }

    return myMatrix
}

// Function to select a random coordinate from the matrix
fun selectRandomCoordinate(): Pair<Int, Int> {
    var randomCoordinateY = Random.nextInt(0, lineNumber)
    var randomCoordinateX = Random.nextInt(0, lonGueur)
    return Pair(randomCoordinateX, randomCoordinateY)
}




//
// Function to calculate the percentage of characters from poolOfChar in the matrix
fun calculateCharacterPercentage(matrix: MutableList<MutableList<Char>>, poolOfChar: Array<Char>): Double {
    var count = 0
    var totalCells = matrix.size * matrix[0].size // Calculate total cells in the matrix

    // Count occurrences of any character in poolOfChar
    matrix.forEach { row ->
        row.forEach { char ->
            if (char in poolOfChar) {
                count++
            }
        }
    }

    // Calculate the percentage
    return (count.toDouble() / totalCells) * 100
}








// Function to format elapsed time
fun formatElapsedTime(milliseconds: Long): String {
    var totalSeconds = milliseconds / 1000
    var minutes = totalSeconds / 60
    var seconds = totalSeconds % 60
    return "${minutes}m ${seconds}s"
}

