package nl.ru.ai.projects.parrot.dronecontrol;

public interface PolePositionPollInterface {
  /**
   * Retrieves the time stamp of the last retrieved sample of pole positions. 
   * 
   * @return
   */
  public long getPolePositionTimeStamp();
  
  /**
   * Retrieves the last sample of pole positions visible to the camera. 
   * 
   * @return
   *   The array of angles (in rad) to all poles in the scene. The amount of 
   *   returned doubles always equals the amount of poles there 
   *   are in the scene. However, a double can be null, which means that it is not 
   *   visible. If a double is not null it is within the intervals of
   *   [-fov / 2, fov / 2] (fov = field of view of the front camera). A negative
   *   angle indicates that the pole is to the left of the center axis of the drone,
   *   a positive angle indicates that the given pole is to the right.
   *   
   * Notes:
   *   This function gives you a giant load of information. It is capable of 
   *   IDENTIFYING poles that get outside the field of view for a moment (the simulator 
   *   always knows where a every pole is at every time). I do not think that the vision group  
   *   will be capable of reproducing this behavior (they probably do not know all the time
   *   where every pole is at a given time).
   *     What you, however, probably can make use of is using the identity of CONTINOUSLY
   *   VISIBLE poles, which corresponds to a tracking a pole in the field of view. However,
   *   you will have to filter the information on your own (hence, throw away some information).     
   *    
   */
  public Double[] getPolePositions();

  /**
   * Gets the pole distances in meters. Elements are null if the given pole is not visible.
   * 
   * @return
   */
  public Double[] getPoleDistances();
}
