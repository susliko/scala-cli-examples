//> using toolkit default

import sttp.client4.quick.*

@main def client = 
  val resp = quickRequest.get(uri"http://localhost:8080/hello/jvm-conf")
  println(resp.send().body)
