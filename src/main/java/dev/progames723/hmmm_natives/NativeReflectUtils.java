package dev.progames723.hmmm_natives;

import java.lang.reflect.AccessibleObject;

public final class NativeReflectUtils {
	/*JNI
	#ifdef MSVC
	#ifndef _MSVC_FLTUSED
	#define _MSVC_FLTUSED
	extern "C" int _fltused = 1;
	#endif
	#endif
	
	#include <cstdlib>
	
	jvalue* to_jvalue_array(JNIEnv* env, jobjectArray array) {
		jsize len = env->GetArrayLength(array);
		jvalue** arr = reinterpret_cast<jvalue**>(malloc(sizeof(jvalue) * len));
		for (jsize i = 0; i < len; i++) {
			jobject o = env->GetObjectArrayElement(array, i);
			jvalue to_add;
			to_add.l = o;
			(*arr)[i] = to_add;
		}
		jvalue* ret = *arr;
		free(arr);
		return ret;
	}
	*/
	
	/**
	 * sets the {@link AccessibleObject#override} to {@code flag}
	 * @param o the accessible object to make accessible
	 * @param flag if {@code true} the object in question will have all java protection disabled
	 */
	@SuppressWarnings("JavadocReference")
	public static native void forceSetAccessible(AccessibleObject o, boolean flag);/*
		env->SetBooleanField(o, env->GetFieldID(env->FindClass("java/lang/reflect/AccessibleObject"), "override", "Z"), flag);
	*/
	
	/**
	 * sets a static {@code int} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticIntField(Class<?> cls, String name, int val);/*
		env->SetStaticIntField(cls, env->GetStaticFieldID(cls, name, "I"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@code long} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticLongField(Class<?> cls, String name, long val);/*
		env->SetStaticLongField(cls, env->GetStaticFieldID(cls, name, "J"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@code float} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticFloatField(Class<?> cls, String name, float val);/*
		env->SetStaticFloatField(cls, env->GetStaticFieldID(cls, name, "F"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@code double} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticDoubleField(Class<?> cls, String name, double val);/*
		env->SetStaticDoubleField(cls, env->GetStaticFieldID(cls, name, "D"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@code boolean} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticBooleanField(Class<?> cls, String name, boolean val);/*
		env->SetStaticBooleanField(cls, env->GetStaticFieldID(cls, name, "Z"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@code byte} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticByteField(Class<?> cls, String name, byte val);/*
		env->SetStaticByteField(cls, env->GetStaticFieldID(cls, name, "B"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@code char} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticCharField(Class<?> cls, String name, char val);/*
		env->SetStaticCharField(cls, env->GetStaticFieldID(cls, name, "C"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@code short} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setStaticShortField(Class<?> cls, String name, short val);/*
		env->SetStaticShortField(cls, env->GetStaticFieldID(cls, name, "S"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a static {@link Object} field to the provided value, may set final fields
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param val value to set to
	 * @param signature the field's signature(required)
	 */
	public static native void setStaticObjectField(Class<?> cls, String name, String signature, Object val);/*
		env->SetStaticObjectField(cls, env->GetStaticFieldID(cls, name, signature), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * gets a static {@code int} field
	 * @param cls class that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a static {@code long} field
	 * @param cls class that has the field
	 * @param name name of the field
	 */
	public static native long getStaticLongField(Class<?> cls, String name);/*
		auto ret = env->GetStaticLongField(cls, env->GetStaticFieldID(cls, name, "J"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * gets a static {@code float} field
	 * @param cls class that has the field
	 * @param name name of the field
	 */
	public static native float getStaticFloatField(Class<?> cls, String name);/*
		auto ret = env->GetStaticFloatField(cls, env->GetStaticFieldID(cls, name, "F"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * gets a static {@code double} field
	 * @param cls class that has the field
	 * @param name name of the field
	 */
	public static native double getStaticDoubleField(Class<?> cls, String name);/*
		auto ret = env->GetStaticDoubleField(cls, env->GetStaticFieldID(cls, name, "D"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * gets a static {@code boolean} field
	 * @param cls class that has the field
	 * @param name name of the field
	 */
	public static native boolean getStaticBooleanField(Class<?> cls, String name);/*
		auto ret = env->GetStaticBooleanField(cls, env->GetStaticFieldID(cls, name, "Z"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * gets a static {@code byte} field
	 * @param cls class that has the field
	 * @param name name of the field
	 */
	public static native byte getStaticByteField(Class<?> cls, String name);/*
		auto ret = env->GetStaticByteField(cls, env->GetStaticFieldID(cls, name, "B"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * gets a static {@code char} field
	 * @param cls class that has the field
	 * @param name name of the field
	 */
	public static native char getStaticCharField(Class<?> cls, String name);/*
		auto ret = env->GetStaticCharField(cls, env->GetStaticFieldID(cls, name, "C"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * gets a static {@code short} field
	 * @param cls class that has the field
	 * @param name name of the field
	 */
	public static native short getStaticShortField(Class<?> cls, String name);/*
		auto ret = env->GetStaticShortField(cls, env->GetStaticFieldID(cls, name, "S"));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * gets a static {@link Object} field
	 * @param cls class that has the field
	 * @param name name of the field
	 * @param signature the field's signature(required)
	 */
	public static native Object getStaticObjectField(Class<?> cls, String name, String signature);/*
		auto ret = env->GetStaticObjectField(cls, env->GetStaticFieldID(cls, name, signature));
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
            return NULL;
        }
        return ret;
	*/
	
	/**
	 * sets an {@code int} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setIntField(Object o, String name, int val);/*
		env->SetIntField(o, env->GetFieldID(env->GetObjectClass(o), name, "I"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a {@code long} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setLongField(Object o, String name, long val);/*
		env->SetLongField(o, env->GetFieldID(env->GetObjectClass(o), name, "J"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a {@code float} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setFloatField(Object o, String name, float val);/*
		env->SetFloatField(o, env->GetFieldID(env->GetObjectClass(o), name, "F"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a {@code double} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setDoubleField(Object o, String name, double val);/*
		env->SetDoubleField(o, env->GetFieldID(env->GetObjectClass(o), name, "D"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a {@code boolean} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setBooleanField(Object o, String name, boolean val);/*
		env->SetBooleanField(o, env->GetFieldID(env->GetObjectClass(o), name, "Z"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a {@code byte} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setByteField(Object o, String name, byte val);/*
		env->SetByteField(o, env->GetFieldID(env->GetObjectClass(o), name, "B"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a {@code char} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setCharField(Object o, String name, char val);/*
		env->SetCharField(o, env->GetFieldID(env->GetObjectClass(o), name, "C"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets a {@code short} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param val value to set to
	 */
	public static native void setShortField(Object o, String name, short val);/*
		env->SetShortField(o, env->GetFieldID(env->GetObjectClass(o), name, "S"), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * sets an {@link Object} field to the provided value, may set final fields
	 * @param o object that has the field
	 * @param name name of the field
	 * @param signature the field's signature(required)
	 * @param val value to set to
	 */
	public static native void setObjectField(Object o, String name, String signature, Object val);/*
		env->SetObjectField(o, env->GetFieldID(env->GetObjectClass(o), name, signature), val);
		if (env->ExceptionCheck() == JNI_TRUE) {
            env->Throw(env->ExceptionOccurred());
            env->ExceptionClear();
        }
	*/
	
	/**
	 * gets an {@code int} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a {@code long} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a {@code float} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a {@code double} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a {@code boolean} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a {@code byte} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a {@code char} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets a {@code short} field
	 * @param o object that has the field
	 * @param name name of the field
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
	
	/**
	 * gets an {@link Object} field
	 * @param o object that has the field
	 * @param signature the field's signature(required)
	 * @param name name of the field
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
	
	/**
	 * calls a static {@code void} method
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native void callStaticVoidMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		env->CallStaticVoidMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return;
		}
	*/
	
	/**
	 * calls a static method that returns an {@code int}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native int callStaticIntMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticIntMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns a {@code long}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native long callStaticLongMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticLongMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns a {@code float}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native float callStaticFloatMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticFloatMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns a {@code double}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native double callStaticDoubleMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticDoubleMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns a {@code short}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native short callStaticShortMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticShortMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns a {@code char}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native char callStaticCharMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticCharMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns a {@code byte}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native byte callStaticByteMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticByteMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns a {@code boolean}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native boolean callStaticBooleanMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticBooleanMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a static method that returns an {@link Object}
	 * @param cls class that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native Object callStaticObjectMethod(Class<?> cls, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallStaticObjectMethodA(cls, env->GetStaticMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a {@code void} method
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native void callVoidMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		env->CallVoidMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return;
		}
	*/
	
	/**
	 * calls a method that returns an {@code int}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native int callIntMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallIntMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code long}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native long callLongMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallLongMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code float}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native float callFloatMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallFloatMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code double}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native double callDoubleMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallDoubleMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code short}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native short callShortMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallShortMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code char}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native char callCharMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallCharMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code byte}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native byte callByteMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallByteMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code boolean}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native boolean callBooleanMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallBooleanMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns an {@link Object}
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native Object callObjectMethod(Object o, String name, String signature, Object[] args);/*
		jclass cls = env->GetObjectClass(o);
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallObjectMethodA(cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a {@code void} method<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native void callNonVirtualVoidMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		env->CallNonvirtualVoidMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return;
		}
	*/
	
	/**
	 * calls a method that returns an {@code int}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native int callNonVirtualIntMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualIntMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code long}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native long callNonVirtualLongMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualLongMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code float}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native float callNonVirtualFloatMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualFloatMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code double}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native double callNonVirtualDoubleMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualDoubleMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code short}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native short callNonVirtualShortMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualShortMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code char}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native char callNonVirtualCharMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualCharMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code byte}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native byte callNonVirtualByteMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualByteMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns a {@code boolean}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native boolean callNonVirtualBooleanMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualBooleanMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * calls a method that returns an {@link Object}<p>
	 * (basically forces to execute a method from the provided super class/interface)</p>
	 * @param cls class to call the object from
	 * @param o object that has the method
	 * @param name name of the method
	 * @param signature the method's signature(required)
	 * @param args self explanatory ngl
	 */
	public static native Object callNonVirtualObjectMethod(Class<?> cls, Object o, String name, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto result = env->CallNonvirtualObjectMethodA(o, cls, env->GetMethodID(cls, name, signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return result;
	*/
	
	/**
	 * utility method
	 * @param cls class
	 * @return module that the {@code cls} is located in
	 */
	public static native Module getModule(Class<?> cls);/*
		return env->GetModule(cls);
	*/
	
	/**
	 * uh magic methods go brr
	 * @param cls class to create an empty object instance of
	 * @return an empty(allocated) object instance of {@code cls}
	 */
	public static native Object allocateObject(Class<?> cls);/*
		auto allocated = env->AllocObject(cls);
		if (allocated == NULL) {
			env->ThrowNew(env->FindClass("java/lang/IllegalArgumentException"), "Cannot allocate an object for provided class(class cannot be abstract or an interface)");
			return NULL;
		}
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return allocated;
	*/
	
	/**
	 * calls the object constructor... why is this a thing in jni?
	 * @param cls class of the created object
	 * @param signature the signature of the constructor so jni can find it
	 * @param args self explanatory ngl
	 * @return a new instance of {@code cls}
	 */
	public static native Object newObject(Class<?> cls, String signature, Object[] args);/*
		jvalue *args_arr = to_jvalue_array(env, args);
		auto created = env->NewObjectA(cls, env->GetMethodID(cls, "<init>", signature), const_cast<const jvalue*>(args_arr));
		free(args_arr);
		if (created == NULL) {
			env->ThrowNew(env->FindClass("java/lang/IllegalArgumentException"), "Cannot allocate an object for provided class(class cannot be abstract or an interface)");
			return NULL;
		}
		if (env->ExceptionCheck() == JNI_TRUE) {
			return NULL;
		}
		return created;
	*/
	
	static {
		NativeLibraries.initIfNeeded();
	}
}