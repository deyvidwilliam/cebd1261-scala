object Ex3 {

  // Repeat the previous exercise by accepting the double numbers into the factorial
  // function. Convert them to integer before calling the fact function.
  
	def factorial(n: Int): Int = { 

			var x = 1
					for(i <- 1 to n) 
					{ 
						x = x * i; 
					} 

			return x 
	} 

	def try_factorial(s: String): String = { 
		try
		{   
		  var d :Int = s.toDouble.toInt
			factorial(d).toString()
		} 
		catch
		{  
		  case e: NumberFormatException => "NA"
		}  
	}          

	def testing() {
		println("Factorial of 6.3 (6) is " + try_factorial("6.3"))
		println("Factorial of 8.1 (8) is " + try_factorial("8.1"))
		println("Factorial of 4.52 (4) is " + try_factorial("4.52"))
		println("Factorial of xxx is " + try_factorial("xxx"))
	}

	def main(args: Array[String])  
	{ 
		testing()
	} 
}