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
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

/**
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@ManagedBean
public class FlashBean {

    public String enviarMensajeSinRedirect() {
	Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
	flash.put("mensaje", "SE ENVIA MENSAJE SIN REDIRECT");
	
	return "flashResult";
    }
    
    public String enviarMensajeConRedirect() {
	Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
	flash.put("mensaje", "SE ENVIA MENSAJE CON REDIRECT");
	
	return "flashResult?faces-redirect=true";
    }
}
