# Simple snippet

Some text

Some scala code with error:
```scala
//> using dep org.typelevel::cats-effect:3.5.4

import cats.effect.*

object MarkdownDemo extends IOApp:
  def run(args: List[String]) =
    IO(println("Hello from Scala 3 with CE!")).as(ExitCode.Success)
```

