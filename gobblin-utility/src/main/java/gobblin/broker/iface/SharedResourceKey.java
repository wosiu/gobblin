/*
 * Copyright (C) 2014-2016 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */

package gobblin.broker.iface;

/**
 * A key to differentiate objects generated by the same factory for a {@link SharedResourcesBroker}. The
 * {@link SharedResourcesBroker} is guaranteed to return the same object for the same factory, {@link ScopeInstance},
 * and {@link SharedResourceKey}, but different objects if any of this differ. The key can contain information relevant
 * to the factory.
 *
 * Example: for a file handle factory, the key could specify the path of the file for which the handle is needed.
 */
public interface SharedResourceKey {

  /**
   * @return A serialization of the {@link SharedResourceKey} into a short, sanitized string. Users configure a
   *         shared resource using the value of this method.
   */
  String toConfigurationKey();

}