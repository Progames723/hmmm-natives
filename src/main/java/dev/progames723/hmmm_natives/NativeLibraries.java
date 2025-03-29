package dev.progames723.hmmm_natives;

import dev.progames723.hmmm_natives.shadowed.com.badlogic.gdx.jnigen.loader.SharedLibraryLoader;

class NativeLibraries {
	private static boolean initialized = false;
	
	public static void initIfNeeded() {
		if (!initialized) initialized = true;
		new SharedLibraryLoader().load("hmmm-natives");
	}
}
