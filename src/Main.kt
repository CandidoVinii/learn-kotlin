fun main() {
    val calc = salaryCalc(2000.00)
    print(calc)
}

fun salaryCalc(salary: Double): Double {
    val calcIncreaseSalary = (salary * 25) / 100
    val calcFinallySalary = salary + calcIncreaseSalary
    return calcFinallySalary
}
