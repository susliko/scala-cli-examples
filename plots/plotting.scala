//> using scala 3
//> using dep org.plotly-scala:plotly-render_2.13:0.8.5

import plotly._, element._, layout._, Plotly._

@main def plotting =
  val x = 0 to 100
  val y1 = x
  val y2 = x.map(_ * 2)

  val plot = Seq(Scatter(x, y1), Scatter(x, y2))
  plot.plot("./plot.html", Layout(title = "My Plot"))

  println("Done!")
