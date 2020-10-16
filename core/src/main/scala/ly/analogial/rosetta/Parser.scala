package ly.analogical.rosetta

trait Parser[A] {
  def parse(source: A): Data
}
