package com.sandbox.chapter10_Traits.layeredTraits

/**
 * Created by Jolin&Vash on 2014/8/27.
 */
trait AnotherShortLogger extends Logged {
  val maxLength = 15 // See Section 10.8 on fields in traits
  override def log(msg: String) {
    println("AnotherShortLogger")
//    super.log(
//      if (msg.length <= maxLength) msg else msg.substring(0, maxLength - 3) + "...")
  }
}
