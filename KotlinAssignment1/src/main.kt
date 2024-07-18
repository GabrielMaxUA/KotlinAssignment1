fun main() {
  // Pass any desired number to the functions below
  val number = 6
  
  // Call the sumsOfNumbers function with the provided number
  sumsOfNumbers(number)
  
  // Call the factorialCalculation function with the provided number
  factorialCalculation(number)
  
  // Call the factorialLambda function with the provided number
  factorialLambda(number)
  
  // Call the factorialRecursive function with the provided number and print the result
  println("The factorial of $number using recursive method is: ${factorialRecursive(number)}")
}

// Function to calculate the sum of numbers from 1 to passed by user 'number'
fun sumsOfNumbers(number: Int): Int {
  var sum = 0
  
  // Loop through numbers from 1 to passed by user 'number' and calculate their sum
  for (i in 1..number) {
      sum += i
  }
  
  // Print the calculated sum
  println("The sum of numbers from 1 to $number is $sum")
  
  // Return the calculated sum
  return sum
}

// Regular function to calculate the factorial of a number
fun factorialCalculation(number: Int): Int {
  var result = 1
  
  // Loop through numbers from 1 to 'number' and calculate the factorial
  for (i in 1..number) {
      result *= i
  }
  
  // Print the calculated factorial
  println("The factorial of $number is $result")
  
  // Return the calculated factorial
  return result
}

// Lambda function to calculate the factorial of a number
val factorialLambda: (Int) -> Int = { number -> 
  var result = 1
  
  // Loop through numbers from 1 to 'number' and calculate the factorial
  for (i in 1..number) {
      result *= i
  }
  
  // Print the calculated factorial
  println("The factorial of $number using Lambda method is $result")
  
  // Return the calculated factorial
  result
}

// Recursive function to calculate the factorial of a number
fun factorialRecursive(number: Int): Int {
  // Base case: if 'number' is less than or equal to 1, return 1
  return if (number <= 1) {
      1
  } else {
      // Recalling function to do multiplication of a number - 1
      number * factorialRecursive(number - 1)
  }
}
