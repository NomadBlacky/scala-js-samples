package example

import scala.scalajs.js
import js.annotation.JSExport
import js.annotation.JSExportTopLevel

@JSExportTopLevel("Hoge")
object Hoge {
  @JSExport
  def foo(arg: String): String = {
    println(arg)
    arg
  }
}
