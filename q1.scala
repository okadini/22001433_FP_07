object q1 {
    def main(args:Array[String]) = {

        def filterEvenNumbers(numbers:List[Int]) : List[Int] = {
            numbers.filter(num => num % 2 == 0)
        }

        val input = List(1,2,3,4,5,6,7,8,9,10);
        val output = filterEvenNumbers(input);
        println(output)
    }
}