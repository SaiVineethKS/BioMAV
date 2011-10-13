/*
    This file is part of the BioMAV project.

    The BioMAV project is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    The BioMAV project is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with The BioMAV project. If not, see <http://www.gnu.org/licenses/>.
*/
package nl.ru.ai.projects.parrot.dronecontrol;

public interface SensorDataObserver {
  /**
   * Called by {@link SensoryDataInterface} to notify the observer that
   * a new packet of sensor data has been received. This function is called 
   * asynchronously by the simulation thread and should exit as fast as possible. 
   * 
   * @param sender
   */
  public void newSensorData(SensoryDataInterface sender);
}