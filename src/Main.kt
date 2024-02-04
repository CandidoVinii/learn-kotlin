fun main() {
//     val calc = salaryCalc(2000.00)
//      print(calc)
//    val stepCalc = stepsCalc(0.50, 10.00)
//    print(stepCalc)
//    val showTheLargest = showTheLargest(39 , 20)
//    print(showTheLargest)
    val calcGrade = calcGrade(7.00, 8.00, 6.00)
    print(calcGrade)
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

fun calcGrade (firstGrade: Double, secondGrade: Double, thirdGrade: Double): Any {
    val gradeResult = (firstGrade + secondGrade + thirdGrade) / 3
    return if(gradeResult < 3.0) {
        "Preapproval"
    } else if (gradeResult >= 3.00 && gradeResult < 7.00 ) {
        "Exam"
    } else if ( gradeResult >= 7.00 && gradeResult <10.00) {
        "Approval"
    } else {
        "Result greater than 10 or less than 0"
    }
}



