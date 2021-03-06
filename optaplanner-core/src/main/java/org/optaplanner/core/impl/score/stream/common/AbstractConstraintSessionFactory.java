/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.score.stream.common;

import org.optaplanner.core.impl.domain.solution.descriptor.SolutionDescriptor;
import org.optaplanner.core.impl.score.definition.ScoreDefinition;
import org.optaplanner.core.impl.score.stream.ConstraintSessionFactory;

public abstract class AbstractConstraintSessionFactory<Solution_> implements ConstraintSessionFactory<Solution_> {

    private final ScoreDefinition<?> scoreDefinition;

    protected AbstractConstraintSessionFactory(SolutionDescriptor<Solution_> solutionDescriptor) {
        this.scoreDefinition = solutionDescriptor.getScoreDefinition();
    }

    protected ScoreDefinition<?> getScoreDefinition() {
        return scoreDefinition;
    }

}
