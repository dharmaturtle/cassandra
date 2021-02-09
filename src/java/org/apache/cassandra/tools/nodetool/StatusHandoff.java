/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.tools.nodetool;

<<<<<<< HEAD
import io.airlift.airline.Command;
=======
import java.io.PrintStream;

import io.airlift.command.Command;
>>>>>>> aa92e8868800460908717f1a1a9dbb7ac67d79cc

import org.apache.cassandra.tools.NodeProbe;
import org.apache.cassandra.tools.NodeTool.NodeToolCmd;

@Command(name = "statushandoff", description = "Status of storing future hints on the current node")
public class StatusHandoff extends NodeToolCmd
{
    @Override
    public void execute(NodeProbe probe)
    {
        PrintStream out = probe.output().out;
        out.println(String.format("Hinted handoff is %s",
                probe.isHandoffEnabled()
                ? "running"
                : "not running"));

        for (String dc : probe.getHintedHandoffDisabledDCs())
            out.println(String.format("Data center %s is disabled", dc));
    }
}
