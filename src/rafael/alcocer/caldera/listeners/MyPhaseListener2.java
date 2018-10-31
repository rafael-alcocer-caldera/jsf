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

import javax.faces.bean.ManagedBean;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * Declarando este Listener como @ManagedBean o @Named funciona para
 * <f:phaseListener binding="#{...}" />
 * 
 * <h:commandButton value="MyPhaseListener with binding" action="index">
 *     <f:phaseListener binding="#{myPhaseListener2}" />
 * </h:commandButton>
 * 
 * Si no se incluye la anotacion @ManagedBean o @Named no funciona para
 * <f:phaseListener binding="#{...}" />
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@ManagedBean
public class MyPhaseListener2 implements PhaseListener {

    public void afterPhase(PhaseEvent arg0) {
        System.out.println("##### MyPhaseListener2... afterPhase()..." + arg0.getPhaseId());
    }

    public void beforePhase(PhaseEvent arg0) {
        System.out.println("##### MyPhaseListener2... beforePhase()..." + arg0.getPhaseId());
    }

    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
