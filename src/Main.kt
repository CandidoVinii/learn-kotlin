fun main() {
//     val calc = salaryCalc(2000.00)
//      print(calc)
//    val stepCalc = stepsCalc(0.50, 10.00)
//    print(stepCalc)
    val showTheLargeast = showTheLargest(39 , 20)
    print(showTheLargeast)
}

// calculate the 25% increase in the salary received as a parameter
fun salaryCalc(salary: Double): Double {
    val calcIncreaseSalary = (salary * 25) / 100
    val calcFinallySalary = salary + calcIncreaseSalary
    return calcFinallySalary
}

// calculate the many steps will hava to climb height
fun stepsCalc(heightStep: Double, heightReach: Double): Double {
    val result = heightStep / heightReach
    return result
}
// take two numbers and show the largest
fun showTheLargest(a: Int, b: Int): Int{
    return if (a <= b) b else a
}


