//> using packaging.dockerFrom openjdk:21
//> using packaging.dockerImageTag latest

//> using dep org.http4s::http4s-dsl::1.0.0-M41
//> using dep org.http4s::http4s-ember-server::1.0.0-M41
//> using dep org.typelevel::log4cats-slf4j::2.7.0

import cats.effect._
import com.comcast.ip4s._
import org.http4s.HttpRoutes
import org.http4s.dsl.io._
import org.http4s.implicits._
import org.http4s.ember.server._
import org.typelevel.log4cats.LoggerFactory
import org.typelevel.log4cats.slf4j.Slf4jFactory

object Main extends IOApp {

  implicit val loggerFactory: LoggerFactory[IO] = Slf4jFactory.create[IO]

  val helloWorldService = HttpRoutes
    .of[IO] { case GET -> Root / "hello" / name =>
      IO.println("Received request!") *> Ok(s"Hello, $name.")
    }
    .orNotFound

  def run(args: List[String]): IO[ExitCode] =
    EmberServerBuilder
      .default[IO]
      .withHost(ipv4"0.0.0.0")
      .withPort(port"8080")
      .withHttpApp(helloWorldService)
      .build
      .use(_ => IO.never)
      .as(ExitCode.Success)
}
