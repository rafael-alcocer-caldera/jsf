/**
 * Copyright [2018] [RAFAEL ALCOCER CALDERA]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rafael.alcocer.caldera.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

/**
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@ManagedBean
public class ValueChangeBean {

    public static char[] vocales = { 'A', 'E', 'I', 'O', 'U' };

    private String vocal;
    private String vocalSeleccionada;

    public void cambiarLetra(ValueChangeEvent event) {
	setVocal("" + event.getNewValue());
	System.out.println("##### cambiarLetra...");
	System.out.println("##### getVocal(): " + getVocal());
	setVocalSeleccionada(getVocal());
	System.out.println("##### getVocalSeleccionada(): " + getVocalSeleccionada());
    }

    public String getVocal() {
	return vocal;
    }

    public void setVocal(String vocal) {
	this.vocal = vocal;
    }

    public String getVocalSeleccionada() {
	return vocalSeleccionada;
    }

    public void setVocalSeleccionada(String vocalSeleccionada) {
	this.vocalSeleccionada = vocalSeleccionada;
    }

    public char[] getVocales() {
	return vocales;
    }
}
