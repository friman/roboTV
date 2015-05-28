/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.1
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_ac3decoder_WRAP_H_
#define SWIG_ac3decoder_WRAP_H_

class SwigDirector_Decoder : public AC3Decoder, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_Decoder(JNIEnv *jenv, int flags = AC3Decoder::LayoutDolby);
    virtual ~SwigDirector_Decoder();
    virtual void onOutputBuffer(char *BYTE, int length, int flags, int channels);
    virtual void onOutputBufferSwigPublic(char *BYTE, int length, int flags, int channels) {
      AC3Decoder::onOutputBuffer(BYTE,length,flags,channels);
    }
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    bool swig_override[1];
};


#endif
