package example

class Library {

  def borrowBooks(m: Member):Int = {
    m match {
      case Member("Junior") => 5
      case Member("Senior") => 20
      case Member("Regular") => 20

    }
  }
}
