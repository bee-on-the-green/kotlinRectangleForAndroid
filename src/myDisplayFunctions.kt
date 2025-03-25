import kotlin.random.Random
import java.text.NumberFormat
import java.util.Locale
import kotlin.math.roundToInt

// Function to clear screen
fun clearScreen() {
    print("\u001b[H\u001b[2J")
    System.out.flush()
}



// Function to display the matrix (builds a string first to be efficient)
fun myDisplayMatrixFunction(myMatrix: MutableList<MutableList<Char>>,
                            cycles: Int,
                            sleepTime: Long,
                            bigSymbol: Char,
                            percentageBigSymbol: Double,
                            elapsedTime: Long): String {
    // Create a NumberFormat for formatting large numbers with commas
    var numberFormat = NumberFormat.getNumberInstance(Locale.US)

    // Create a StringBuilder to efficiently build the complete output
    var outputBuilder = StringBuilder()

    // Append matrix characters
    for (row in myMatrix) {
        for (char in row) {
            outputBuilder.append(char)
        }
        outputBuilder.append('\n') // Move to the next line after a row
    }

    // Append additional information
    outputBuilder.append("\n")
    outputBuilder.append("Matrix length: $lonGueur\n")
    outputBuilder.append("cycles: ${numberFormat.format(cycles)}\n")
    outputBuilder.append("Refresh: $Hz Hz ($sleepTime ms)\n")
    outputBuilder.append("Elapsed: ${formatElapsedTime(elapsedTime)}\n")
    outputBuilder.append("breakPoint: $breakPoint\n")

    //outputBuilder.append("Loop iteration: $timeElapsedToPerformLoop\n")                                                                         //timeElapsedToPerformLoop
    // Return the entire built string
    return outputBuilder.toString()
}