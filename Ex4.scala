object Ex4 {

	// Write a code that prints out the first 10 values of the Fibonacci sequence.

	def fibonacci(n: Int): Int = 
			if (n < 3) 1 
			else fibonacci(n - 1) + fibonacci(n - 2)

	def main(args: Array[String]) {
		for {i <- List.range(1, 10)} 
		yield { print(fibonacci(i) + ", ") }
	}
}
