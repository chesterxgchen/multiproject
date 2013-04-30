package com.xiaoguangchen.platform.api.sample

import org.testng.annotations.Test

/**
 * simple test

  * author: Chester Chen (chesterxgchen@yahoo,com)
  * Date: 1/22/13 1:42 PM
  */
class HelloWorldTest {


   @Test
   def testHello() {
      assert("hello" == HelloWorld.hello)
    }



}
