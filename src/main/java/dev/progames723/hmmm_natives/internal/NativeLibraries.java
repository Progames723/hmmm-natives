package dev.progames723.hmmm_natives.internal;

import com.badlogic.gdx.jnigen.loader.SharedLibraryLoader;

public class NativeLibraries {
	private static boolean initialized = false;
	
	public static void initIfNeeded() {
		if (!initialized) initialized = true;
		new SharedLibraryLoader().load("hmmm-natives");
	}
}
