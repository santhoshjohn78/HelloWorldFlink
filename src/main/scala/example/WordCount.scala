package example

import org.apache.flink.api.java.ExecutionEnvironment


object WordCount {
  case class WordWithCount(word: String, count: Long)
  def main(args:Array[String]):Unit = {

    val text = Seq("To be, or not to be,--that is the question:--",
          "Whether 'tis nobler in the mind to suffer", "The slings and arrows of outrageous fortune",
          "Or to take arms against a sea of troubles,")
    // get input data
//    val text = env.fromElements("To be, or not to be,--that is the question:--",
//      "Whether 'tis nobler in the mind to suffer", "The slings and arrows of outrageous fortune",
//      "Or to take arms against a sea of troubles,")

    val counts = text.flatMap(_.toLowerCase.split("\\W+"))
//      .flatMap { _.toLowerCase.split("\\W+") }
      .map { (_, 1) }

    println(counts)



  }
}
