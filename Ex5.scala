object Ex5 {
  
  // Write a function that takes the number and says here is the cube of the input:
  // 5 -> 125 is the cube
  // Retry doing it via lambda function

  def cube(x: Int) : Int = {x * x * x}
  
  val lambda_cube = (x:Int) => x * x * x
 
 	def main(args: Array[String]) {
	  
	  println("The cube of 3 is " + cube(3))
	  println("The cube of 3 is " + lambda_cube(3))

	}
  
}