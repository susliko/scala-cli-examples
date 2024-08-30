//> using target.platform native
//> using nativeMode release-size
//> using scala 3.3.3

//> using toolkit 0.4.0


@main def native = 
  val content = os.read(os.pwd / "native.scala")
  println(content)

