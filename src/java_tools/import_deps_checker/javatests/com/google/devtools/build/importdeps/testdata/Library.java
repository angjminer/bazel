// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.importdeps.testdata;

/** A library class for testing. */
public class Library {

  /** A library class for testing. */
  public static class Class1 {
    public static final Class1 I = new Class1();
  }

  /** A library class for testing. */
  public static class Class2 {}

  /** A library class for testing. */
  public static class Class3 {
    public Class4 field;
  }

  /** A library class for testing. */
  public static class Class4 {
    Class5 createClass5() {
      return new Class5();
    }
  }

  /** A library class for testing. */
  public static class Class5 {
    public Class6 create(Class7 class7) {
      return new Class6();
    }
  }

  /** A library class for testing. */
  public static class Class6 {}

  /** A library class for testing. */
  public static class Class7 {}

  /** A library class for testing. */
  public static class Class8 {}

  /** A library class for testing. */
  public static class Class9 {}

  /** A library class for testing. */
  public static class Class10 extends Class9 {}
}
