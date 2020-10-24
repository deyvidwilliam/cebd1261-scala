object Ex2 {
  
  // Write a function to compute factorial (5! = 5*4*3*2*1)
  
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
			factorial(s.toInt).toString()
		} 
		catch
		{  
		  case e: NumberFormatException => "NA"
		}  
	}          

	def testing() {
		println("Factorial of 6 is " + try_factorial("6"))
		println("Factorial of 8 is " + try_factorial("8"))
		println("Factorial of 4.52 is " + try_factorial("4.52"))
	}

	def main(args: Array[String])  
	{ 
		testing()
	} 
}