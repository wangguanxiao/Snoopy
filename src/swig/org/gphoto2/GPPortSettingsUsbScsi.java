/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public class GPPortSettingsUsbScsi {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public GPPortSettingsUsbScsi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(GPPortSettingsUsbScsi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gphoto2JNI.delete_GPPortSettingsUsbScsi(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPath(String value) {
    gphoto2JNI.GPPortSettingsUsbScsi_path_set(swigCPtr, this, value);
  }

  public String getPath() {
    return gphoto2JNI.GPPortSettingsUsbScsi_path_get(swigCPtr, this);
  }

  public GPPortSettingsUsbScsi() {
    this(gphoto2JNI.new_GPPortSettingsUsbScsi(), true);
  }

}