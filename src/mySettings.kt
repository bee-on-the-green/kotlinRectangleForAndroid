import kotlin.random.Random
import java.text.NumberFormat
import java.util.Locale
import kotlin.math.roundToInt

// Define the length of each line and the number of lines
var lonGueur = 100
var lineNumber = (lonGueur * 33) / 71



// Define refresh refresh rate data
var sleepTime: Long = 100L
var Hz: Int = (1000.0 / sleepTime.toDouble()).roundToInt()

var percentageBigSymbol = 37.0 // New variable for percentage threshold
var percentageMainChar: Int = percentageBigSymbol.toInt() // Convert to Int for display

// Define symbols as variables
var bigSymbol = '0'
var smallSymbol = '.'
var symBol = smallSymbol //char to initiate the matrix

// size of the calculated shape (diameter)
var diameterToUse = 10 // Example: diameter varies from 4 to 8

// rectangle length and width

var lengthRectangle = 3
var widthRectangles = 11

