package dev.progames723.hmmm_natives;

import dev.progames723.hmmm_natives.internal.NativeLibraries;

import java.lang.reflect.AccessibleObject;

public class NativeReflectUtils {
	/*JNI
	#ifdef MSVC
	extern "C" int _fltused = 1;
	#endif
	*/
	
	public static native void forceSetAccessible(AccessibleObject o, boolean flag);/*
		env->SetBooleanField(o, env->GetFieldID(env->GetObjectClass(o), "override", "Z"), flag);
	*/
	
	public static native void setStaticIntField(Class<?> cls, String name, int val);/*
		env->SetStaticIntField(cls, env->GetStaticFieldID(cls, name, "I"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticLongField(Class<?> cls, String name, long val);/*
		env->SetStaticLongField(cls, env->GetStaticFieldID(cls, name, "J"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticFloatField(Class<?> cls, String name, float val);/*
		env->SetStaticFloatField(cls, env->GetStaticFieldID(cls, name, "F"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticDoubleField(Class<?> cls, String name, double val);/*
		env->SetStaticDoubleField(cls, env->GetStaticFieldID(cls, name, "D"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticBooleanField(Class<?> cls, String name, boolean val);/*
		env->SetStaticBooleanField(cls, env->GetStaticFieldID(cls, name, "Z"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticByteField(Class<?> cls, String name, byte val);/*
		env->SetStaticByteField(cls, env->GetStaticFieldID(cls, name, "B"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticCharField(Class<?> cls, String name, char val);/*
		env->SetStaticCharField(cls, env->GetStaticFieldID(cls, name, "C"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticShortField(Class<?> cls, String name, short val);/*
		env->SetStaticShortField(cls, env->GetStaticFieldID(cls, name, "S"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setStaticObjectField(Class<?> cls, String name, String signature, Object val);/*
		env->SetStaticObjectField(cls, env->GetStaticFieldID(cls, name, signature), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native int getStaticIntField(Class<?> cls, String name);/*
		auto ret = env->GetStaticIntField(cls, env->GetStaticFieldID(cls, name, "I"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native long getStaticLongField(Class<?> cls, String name, long val);/*
		auto ret = env->GetStaticLongField(cls, env->GetStaticFieldID(cls, name, "J"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native float getStaticFloatField(Class<?> cls, String name, float val);/*
		auto ret = env->GetStaticFloatField(cls, env->GetStaticFieldID(cls, name, "F"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native double getStaticDoubleField(Class<?> cls, String name, double val);/*
		auto ret = env->GetStaticDoubleField(cls, env->GetStaticFieldID(cls, name, "D"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native boolean getStaticBooleanField(Class<?> cls, String name, boolean val);/*
		auto ret = env->GetStaticBooleanField(cls, env->GetStaticFieldID(cls, name, "Z"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native byte getStaticByteField(Class<?> cls, String name, byte val);/*
		auto ret = env->GetStaticByteField(cls, env->GetStaticFieldID(cls, name, "B"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native char getStaticCharField(Class<?> cls, String name, char val);/*
		auto ret = env->GetStaticCharField(cls, env->GetStaticFieldID(cls, name, "C"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native short getStaticShortField(Class<?> cls, String name, short val);/*
		auto ret = env->GetStaticShortField(cls, env->GetStaticFieldID(cls, name, "S"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native Object getStaticObjectField(Class<?> cls, String name, String signature, Object val);/*
		auto ret = env->GetStaticObjectField(cls, env->GetStaticFieldID(cls, name, signature));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native void setIntField(Object o, String name, int val);/*
		env->SetIntField(o, env->GetFieldID(env->GetObjectClass(o), name, "I"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setLongField(Object o, String name, long val);/*
		env->SetLongField(o, env->GetFieldID(env->GetObjectClass(o), name, "J"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setFloatField(Object o, String name, float val);/*
		env->SetFloatField(o, env->GetFieldID(env->GetObjectClass(o), name, "F"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setDoubleField(Object o, String name, double val);/*
		env->SetDoubleField(o, env->GetFieldID(env->GetObjectClass(o), name, "D"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setBooleanField(Object o, String name, boolean val);/*
		env->SetBooleanField(o, env->GetFieldID(env->GetObjectClass(o), name, "Z"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setByteField(Object o, String name, byte val);/*
		env->SetByteField(o, env->GetFieldID(env->GetObjectClass(o), name, "B"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setCharField(Object o, String name, char val);/*
		env->SetCharField(o, env->GetFieldID(env->GetObjectClass(o), name, "C"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setShortField(Object o, String name, short val);/*
		env->SetShortField(o, env->GetFieldID(env->GetObjectClass(o), name, "S"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native void setObjectField(Object o, String name, String signature, Object val);/*
		env->SetObjectField(o, env->GetFieldID(env->GetObjectClass(o), name, signature), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	public static native int getIntField(Object o, String name);/*
		auto ret = env->GetIntField(o, env->GetFieldID(env->GetObjectClass(o), name, "I"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native long getLongField(Object o, String name);/*
		auto ret = env->GetLongField(o, env->GetFieldID(env->GetObjectClass(o), name, "J"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native float getFloatField(Object o, String name);/*
		auto ret = env->GetFloatField(o, env->GetFieldID(env->GetObjectClass(o), name, "F"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native double getDoubleField(Object o, String name);/*
		auto ret = env->GetDoubleField(o, env->GetFieldID(env->GetObjectClass(o), name, "D"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native boolean getBooleanField(Object o, String name);/*
		auto ret = env->GetBooleanField(o, env->GetFieldID(env->GetObjectClass(o), name, "Z"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native byte getByteField(Object o, String name);/*
		auto ret = env->GetByteField(o, env->GetFieldID(env->GetObjectClass(o), name, "B"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native char getCharField(Object o, String name);/*
		auto ret = env->GetCharField(o, env->GetFieldID(env->GetObjectClass(o), name, "C"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native short getShortField(Object o, String name);/*
		auto ret = env->GetShortField(o, env->GetFieldID(env->GetObjectClass(o), name, "S"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	public static native Object getObjectField(Object o, String name, String signature);/*
		auto ret = env->GetObjectField(o, env->GetFieldID(env->GetObjectClass(o), name, signature));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	static {
		NativeLibraries.initIfNeeded();
	}
}
