class A {
  def foo =
    for {
      x <- ???
    } {
      ???
    }

  def noSpacing =
    for{
      x <- ???
    }{
      ???
    }

  def why =
    for

      {
        x <- ???
        y <- ???
        z <- ???
    }

  // yes, it is the body
  {
    ???
  }
}
