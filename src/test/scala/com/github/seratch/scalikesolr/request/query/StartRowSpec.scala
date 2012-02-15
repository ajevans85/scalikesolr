package com.github.seratch.scalikesolr.request.query

import org.scalatest._
import org.scalatest.matchers._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class StartRowSpec extends FlatSpec with ShouldMatchers {

  behavior of "StartRow"

  it should "be available" in {
    val start: Int = 0
    val instance = new StartRow(start)
    instance should not be null
    instance.getKey() should equal("start")
  }

}
