object Q2 {
  def countLetterOccurrences(words: List[String]): Int = {
    val wordLengths = words.map(_.length)
    val totalOccurrences = wordLengths.reduce(_ + _)
    totalOccurrences
  }

  def main(args: Array[String]): Unit = {
    val inputWords = List("apple", "banana", "cherry", "date")
    val totalOccurrences = countLetterOccurrences(inputWords)
    println(s"Total count of letter occurrences: $totalOccurrences")
  }
}
