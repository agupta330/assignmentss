package specs2

import org.specs2.mutable._

class Test01 extends Specification {

  "The integer 1" should {
    "equal 1" in {
      1 === 1
    }
  }

  "The 'Hello world' string" should {
    "contain 11 characters" in {
      "Hello world" must have size(11)
    }
  }
    
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
}