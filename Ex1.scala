object Ex1 {
  
  // Write required code in println command to print the following output:
  // - The round value of x is 42.35
  // - The left zero padding version of y is 0003
  
  def main(args: Array[String]) {
    val x : Double = 42.356514; println(f"The round value of x is  $x%1.2f");
    val y : Int = 3; println(f"The left zero padding version of y is $y%04d");  
  } 
}