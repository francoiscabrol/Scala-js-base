package app

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

object Application extends js.JSApp {

  @JSExport
  override def main(): Unit = {
    println("hello world")
  }
}
