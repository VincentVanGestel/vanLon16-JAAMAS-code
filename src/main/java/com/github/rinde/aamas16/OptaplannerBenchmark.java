/*
 * Copyright (C) 2011-2015 Rinde van Lon, iMinds-DistriNet, KU Leuven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.rinde.aamas16;

import org.optaplanner.benchmark.api.PlannerBenchmark;
import org.optaplanner.benchmark.api.PlannerBenchmarkFactory;

/**
 *
 * @author Rinde van Lon
 */
public class OptaplannerBenchmark {

  /**
   * @param args
   */
  public static void main(String[] args) {

    final PlannerBenchmarkFactory plannerBenchmarkFactory =
      PlannerBenchmarkFactory.createFromXmlResource(
        "com/github/rinde/jaamas16/benchmarkConfig.xml");

    final PlannerBenchmark plannerBenchmark =
      plannerBenchmarkFactory.buildPlannerBenchmark();
    plannerBenchmark.benchmark();

  }

}
