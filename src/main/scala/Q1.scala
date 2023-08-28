object Q1 {
  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9 / 5) + 32)
    val sumFahrenheit = fahrenheitTemperatures.reduce((temp1, temp2) => temp1 + temp2)
    val averageFahrenheit = sumFahrenheit / fahrenheitTemperatures.length
    averageFahrenheit
  }

  def main(args: Array[String]): Unit = {
    val inputTemperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(inputTemperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit°F")
  }
}