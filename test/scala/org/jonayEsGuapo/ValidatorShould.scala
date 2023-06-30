package org.jonayEsGuapo

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ValidatorShould extends AnyFlatSpec with should.Matchers {

  "foo" should "be bar" in {
    val foo = "foo"
    foo should be("foo")
  }

//  it should "be bar" in {
//    val passw= "_Ab456789";
//    it should be (true);

  //}
}
