trait Base {
  val values = Seq("A", "B", "C")
  /** try evalulating expression `values.map(_.reverse)` in the debugger when inside of the following function */
  def version: String = {
    "CrossFunction"
  }
}
