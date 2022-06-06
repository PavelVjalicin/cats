package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CatsSpecs extends AnyFlatSpec with Matchers {
    "The Hello object" should "say hello" in {
        "Hello" should be ("Hello")
    }
}
