import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession
import org.apache.log4j.{Level, Logger}


object test {

  val logger: Logger = Logger.getLogger(this.getClass)

  def main(args: Array[String]): Unit = {

    // 关闭日志输出
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)


    val session: SparkSession = SparkSession
      .builder()
      .master("local[2]")
      .getOrCreate()

    val value: RDD[Int] = session.sparkContext.makeRDD(List(1, 2, 3, 4))

    val ints: String = value.collect().mkString


    // debug level
//    logger.debug("DEBUG(调试)");
    // info level
//    logger.info("INFO(消息)");
    // warning level
//    logger.warn("WARN(警告)");
    // error level
//    logger.error("ERROR(错误)");

    logger.info(ints)

  }

}
