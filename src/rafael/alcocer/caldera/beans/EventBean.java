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

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

/**
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@ManagedBean
public class EventBean {

    private String estadoProvincia;
    private String pais;
    private Locale[] paises = { Locale.US, Locale.CANADA };
    private String outcome;

    public void cambiarPaisListener(ValueChangeEvent event) {
	for (Locale locale : paises) {
	    if (locale.getCountry().equals(event.getNewValue())) {
		FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
		setEstadoProvincia("" + locale);
	    }
	}
    }

    public void establecerOutcomeActionListener(ActionEvent event) {
	if (outcome != null) {
	    outcome = "index";
	} else {
	    outcome = "error";
	}
    }

    public String getEstadoProvincia() {
	return estadoProvincia;
    }

    public void setEstadoProvincia(String estadoProvincia) {
	this.estadoProvincia = estadoProvincia;
    }

    public String getPais() {
	return pais;
    }

    public void setPais(String pais) {
	this.pais = pais;
    }

    public Locale[] getPaises() {
	return paises;
    }

    public String getOutcome() {
	return outcome;
    }

    public void setOutcome(String outcome) {
	this.outcome = outcome;
    }
}
