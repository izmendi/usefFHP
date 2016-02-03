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

package energy.usef.dso.workflow.dto;

/**
 * DTO for the NonAggregatorForecast Input Data.
 */
public class PtuNonAggregatorForecastDto {
    private Long power;
    private Long maxLoad;
    private Integer ptuIndex;

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public Long getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Long maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Integer getPtuIndex() {
        return ptuIndex;
    }

    public void setPtuIndex(Integer ptuIndex) {
        this.ptuIndex = ptuIndex;
    }

}
