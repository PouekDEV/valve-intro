package one.pouekdev;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Valveintro implements ModInitializer {
	public static final String MOD_ID = "valve-intro";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier INTRO_ID = Identifier.of("valve-intro:open_your_mind");
	public static SoundEvent INTRO_EVENT = SoundEvent.of(INTRO_ID);

	@Override
	public void onInitialize() {
		Registry.register(Registries.SOUND_EVENT, INTRO_ID, INTRO_EVENT);
		LOGGER.info("Displaying valve intro");
	}
}