/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iggy.client.async.reader;

import java.math.BigInteger;
import java.util.Objects;
import java.util.Optional;

/**
 * The position of one partition of a {@link PartitionReader} in the current generation of the partition. A seek or a
 * new assignment of the partition starts both offsets over.
 *
 * @param consumed the offset of the last message that the reader delivered
 * @param stored the last offset that the reader stored for its consumer
 */
public record PartitionPosition(Optional<BigInteger> consumed, Optional<BigInteger> stored) {
    public PartitionPosition {
        Objects.requireNonNull(consumed, "consumed");
        Objects.requireNonNull(stored, "stored");
    }
}
