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

import java.util.Date;

import javax.faces.bean.ManagedBean;

/**
 * Este Bean es para poder mostrar los convertidores propios de la libreria de
 * JSF.
 * 
 * @author Rafael Alcocer Caldera
 * @version 1.0
 *
 */
@ManagedBean
public class StandardConverterBean {

    private Date fecha;
    private Date hora;
    private double cantidad;

    public Date getFecha() {
	return fecha;
    }

    public void setFecha(Date fecha) {
	this.fecha = fecha;
    }

    public Date getHora() {
	return hora;
    }

    public void setHora(Date hora) {
	this.hora = hora;
    }

    public double getCantidad() {
	return cantidad;
    }

    public void setCantidad(double cantidad) {
	this.cantidad = cantidad;
    }

}
