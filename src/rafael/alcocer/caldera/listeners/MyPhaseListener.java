/**
 * Copyright [2018] [RAFAEL ALCOCER CALDERA]
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
package rafael.alcocer.caldera.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Declarando este Listener como @ManagedBean, @Named o sin ninguna anotacion,
 * funciona para <f:phaseListener type="...">.
 * 
 * <h:commandButton value="MyPhaseListener with type" action="index">
 *     <f:phaseListener type="rafael.alcocer.caldera.listeners.MyPhaseListener" />
 * </h:commandButton>
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
public class MyPhaseListener implements PhaseListener {

    public void afterPhase(PhaseEvent arg0) {
        System.out.println("##### MyPhaseListener... afterPhase()..." + arg0.getPhaseId());
    }

    public void beforePhase(PhaseEvent arg0) {
        System.out.println("##### MyPhaseListener... beforePhase()..." + arg0.getPhaseId());
    }

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
