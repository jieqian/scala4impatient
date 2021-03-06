package com.sandbox.chapter7_PackagesAndImports.packageVisibility

/**
 * Created by Jolin&Vash on 2014/8/6.
 */
package com.horstmann.impatient

package object people {
  val defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName // A constant from the package
    private[impatient] def description = "A person with name " + name
  }
}
