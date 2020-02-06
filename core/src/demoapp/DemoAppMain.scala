package demoapp

import zio.App
import zio.console._

object DemoAppMain extends App {

  val program =
    for {
      _ <- putStrLn("Hello! What is your name?")
      name <- getStrLn
      _ <- putStrLn(s"Hello, ${name}, welcome to ZIO!")
    } yield ()

  def run(args: List[String]) =
    program.fold(_ => 1, _ => 0)
}
