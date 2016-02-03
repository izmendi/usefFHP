/*
 * Copyright 2015 USEF Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package energy.usef.brp.workflow.plan.connection.forecast;

import org.joda.time.LocalDate;

/**
 * Event class to trigger the workflow in charge of deciding whether A-Plans for the given period are accepted.
 */
public class ReceivedAPlanEvent {
    private final LocalDate period;

    /**
     * Constructor with the date.
     *
     * @param period {@link org.joda.time.LocalDate} period.
     */
    public ReceivedAPlanEvent(LocalDate period) {
        this.period = period;
    }

    public LocalDate getPeriod() {
        return period;
    }

    @Override
    public String toString() {
        return "ReceivedAPlanEvent" + "[" +
                "period=" + period +
                "]";
    }
}
