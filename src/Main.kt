fun main() {
    // val calc = salaryCalc(2000.00)
    // print(calc)
    val stepCalc = stepsCalc(0.50, 10.00)
    print(stepCalc)
}


// calculate the 25% increase in the salary received as a parameter
fun salaryCalc(salary: Double): Double {
    val calcIncreaseSalary = (salary * 25) / 100
    val calcFinallySalary = salary + calcIncreaseSalary
    return calcFinallySalary
}

// calculate the many steps will hava to climb height
fun stepsCalc(heightStep: Double, heightReach: Double): Double {
    val result = heightStep / heighStep
    return result
}

