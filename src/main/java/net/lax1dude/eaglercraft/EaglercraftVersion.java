package net.lax1dude.eaglercraft;

public class EaglercraftVersion {

	//////////////////////////////////////////////////////////////////////

	/// Customize these to fit your fork:

	public static final String projectForkName = "Ayuncraft 1.12";
	public static final String projectForkVersion = "u2";
	public static final String projectForkVendor = "MysticGiggle";

	public static final String projectForkURL = "https://gitea.com/ayuncraftx/AyuncraftX-1.12.2-workspace";

	//////////////////////////////////////////////////////////////////////

	public static final String projectOriginName = "Ayuncraft 1.12";
	public static final String projectOriginAuthor = "MysticGiggle";
	public static final String projectOriginVersion = "u2";

	public static final String projectOriginURL = "https://gitea.com/ayuncraftx/AyuncraftX-1.12.2-workspace";

	// EPK Version Identifier

	public static final String EPKVersionIdentifier = null; // Set to null to disable EPK version check

	// Client brand identification system configuration

	public static final EaglercraftUUID clientBrandUUID = EagUtils.makeClientBrandUUID(projectForkName);

	public static final EaglercraftUUID legacyClientUUIDInSharedWorld = EagUtils
			.makeClientBrandUUIDLegacy(projectOriginName);

	// Miscellaneous variables:

	public static final String mainMenuStringA = "Minecraft 1.12";
	public static final String mainMenuStringB = projectOriginName + " " + projectOriginVersion;
	public static final String mainMenuStringC = "";
	public static final String mainMenuStringD = "Resources Copyright Mojang AB";

	public static final String mainMenuStringE = projectForkName + " " + projectForkVersion;
	public static final String mainMenuStringF = "Made by " + projectForkVendor;

	public static final long demoWorldSeed = (long) "North Carolina".hashCode();

	public static final boolean mainMenuEnableGithubButton = true;

	public static final boolean forceDemoMode = false;

	public static final String localStorageNamespace = "_eaglercraft_1.12";

}
