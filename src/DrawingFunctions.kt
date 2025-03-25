import kotlin.random.Random
import java.text.NumberFormat
import java.util.Locale
import kotlin.math.roundToInt



// Function to draw a circle with customizable character and diameter



// Function to draw a circle with customizable characters and diameter
fun drawCircle(matrix: MutableList<MutableList<Char>>, centerX: Int, centerY: Int,
               diameter: Int, poolOfChar: Array<Char>) {
    // Calculate the radius from the diameter
    var radius = diameter / 2

    // Calculate matrix dimensions
    var lineNumber = matrix.size
    var lonGueur = if (lineNumber > 0) matrix[0].size else 0

    // Ensure the circle stays within the matrix bounds
    var yStart = maxOf(centerY - radius, 0)
    var yEnd = minOf(centerY + radius, lineNumber - 1)
    var xStart = maxOf(centerX - radius, 0)
    var xEnd = minOf(centerX + radius, lonGueur - 1)

    // Iterate over the matrix within the bounds of the circle
    for (y in yStart..yEnd) {
        for (x in xStart..xEnd) {
            // Adjust for the aspect ratio (height = width / 2)
            var aspectRatio = 2.0
            var dx = x - centerX
            var dy = (y - centerY) * aspectRatio

            // Check if the current (x, y) is within the circle using the adjusted distance formula
            if (dx * dx + dy * dy <= radius * radius) {
                // Randomly select a character from poolOfChar
                var randomChar = poolOfChar[Random.nextInt(poolOfChar.size)]
                matrix[y][x] = randomChar  // Set the randomly selected character within the circle
            }
        }
    }
}







