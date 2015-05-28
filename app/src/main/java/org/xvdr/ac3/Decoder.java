/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.xvdr.ac3;

public class Decoder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Decoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Decoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ac3decoderJNI.delete_Decoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setChannelLayout(int value) {
    ac3decoderJNI.Decoder_channelLayout_set(swigCPtr, this, value);
  }

  public int getChannelLayout() {
    return ac3decoderJNI.Decoder_channelLayout_get(swigCPtr, this);
  }

  public Decoder(int flags) {
    this(ac3decoderJNI.new_Decoder__SWIG_0(flags), true);
  }

  public Decoder() {
    this(ac3decoderJNI.new_Decoder__SWIG_1(), true);
  }

  public SyncInfo getSyncInfo(byte[] BYTE, int offset, int length) {
    return new SyncInfo(ac3decoderJNI.Decoder_getSyncInfo(swigCPtr, this, BYTE, offset, length), true);
  }

  public boolean decode(byte[] BYTE, int offset, int length) {
    return ac3decoderJNI.Decoder_decode(swigCPtr, this, BYTE, offset, length);
  }

  public int getOutput(byte[] BYTE, int offset, int length) {
    return ac3decoderJNI.Decoder_getOutput(swigCPtr, this, BYTE, offset, length);
  }

  public int getChannels() {
    return ac3decoderJNI.Decoder_getChannels(swigCPtr, this);
  }

  public int getSampleRate() {
    return ac3decoderJNI.Decoder_getSampleRate(swigCPtr, this);
  }

  public int getFlags() {
    return ac3decoderJNI.Decoder_getFlags(swigCPtr, this);
  }

  public int getOutputBufferSize() {
    return ac3decoderJNI.Decoder_getOutputBufferSize(swigCPtr, this);
  }

  public final static int layoutStereo = ac3decoderJNI.Decoder_layoutStereo_get();
  public final static int layoutDolby = ac3decoderJNI.Decoder_layoutDolby_get();
  public final static int layout50 = ac3decoderJNI.Decoder_layout50_get();
  public final static int layout51 = ac3decoderJNI.Decoder_layout51_get();

}