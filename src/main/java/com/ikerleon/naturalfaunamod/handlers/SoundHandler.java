package com.ikerleon.naturalfaunamod.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {
	
	private static int size=0;

	public static SoundEvent CAPERCAILLIE_LEKKING;
	public static SoundEvent CAPERCAILLIE_FEMALE_LIVING;
	public static SoundEvent AVOCET_LIVING;
	public static SoundEvent AVOCET_HURT;
	public static SoundEvent HYENA_LIVING;
	public static SoundEvent HYENA_HURT;
	public static SoundEvent HYENA_DEATH;
	public static SoundEvent GNU_LIVING;
	public static SoundEvent GNU_HURT;
	public static SoundEvent COURSER_HURT;
	public static SoundEvent SEAL_LIVING;
	public static SoundEvent LITTLE_BUSTARD_SONG;
	public static SoundEvent ROE_DEER_LIVING;
	public static SoundEvent ROE_DEER_HURT;
	public static SoundEvent OSTRICH_BOOMING;
	public static SoundEvent PUMA_HURT;
	public static SoundEvent BUSHBUCK_HURT;
	public static SoundEvent GAZELLE_HURT;
	public static SoundEvent CHEETAH_CHIRP;
	public static SoundEvent PUFFIN_CALL;
	public static SoundEvent KORIBUSTARD_FLYING;
	public static SoundEvent CAPERCAILLIE_FLYING;
	public static SoundEvent HORNBILL_LIVING;
	public static SoundEvent HORNBILL_HURT;
	public static SoundEvent TURACO_FLYING;
	public static SoundEvent TURACO_LIVING;
	public static SoundEvent TURACO_LIVING2;
	public static SoundEvent TROPICBIRD_FLYING;
	public static SoundEvent FALCON_HURT;
	public static SoundEvent FALCON_FLYING;
	public static SoundEvent PTARMIGAN_HURT;
	public static SoundEvent PTARMIGAN_SONG;
	public static SoundEvent GROUNDHORNBILL_LIVING;
	
	public static SoundEvent MALE_CAPERCAILLIE_STREAM;
	public static SoundEvent FEMALE_CAPERCAILLIE_STREAM;
	public static SoundEvent AVOCET_STREAM;
	public static SoundEvent COURSER_STREAM;
	public static SoundEvent KORIBUSTARD_STREAM;
	public static SoundEvent LITTLEBUSTARD_STREAM;
	public static SoundEvent OSTRICH_STREAM;
	public static SoundEvent PUFFIN_STREAM;
	public static SoundEvent HORNBILL_STREAM;
	public static SoundEvent TURACO_STREAM;
	public static SoundEvent TROPICBIRD_STREAM;
	public static SoundEvent FALCON_STREAM;
	public static SoundEvent PTARMIGAN_STREAM;
	public static SoundEvent GROUNDHORNBILL_STREAM;

	
	public static void registerSounds() {
		
		size=SoundEvent.REGISTRY.getKeys().size();
		
		CAPERCAILLIE_LEKKING = registerSound("entity.capercaillie.lekking");
		CAPERCAILLIE_FEMALE_LIVING = registerSound("entity.capercaillie.female_living");
		AVOCET_LIVING = registerSound("entity.avocet.ambient");
		AVOCET_HURT = registerSound("entity.avocet.hurt");
		HYENA_LIVING = registerSound("entity.hyena.ambient");
		HYENA_HURT = registerSound("entity.hyena.hurt");
		HYENA_DEATH = registerSound("entity.hyena.death");
		GNU_LIVING = registerSound("entity.gnu.living");
		GNU_HURT = registerSound("entity.gnu.hurt");
		COURSER_HURT = registerSound("entity.courser.hurt");
		SEAL_LIVING = registerSound("entity.greyseal.living");
		LITTLE_BUSTARD_SONG = registerSound("entity.littlebustard.song");
		ROE_DEER_LIVING = registerSound("entity.roedeer.living");
		ROE_DEER_HURT = registerSound("entity.roedeer.hurt");
		OSTRICH_BOOMING = registerSound("entity.ostrich.booming");
		PUMA_HURT = registerSound("entity.puma.hurt");
		BUSHBUCK_HURT = registerSound("entity.bushbuck.hurt");
		GAZELLE_HURT = registerSound("entity.gazelle.hurt");
		CHEETAH_CHIRP = registerSound("entity.cheetah.chirp");
		PUFFIN_CALL = registerSound("entity.puffin.living");
		KORIBUSTARD_FLYING = registerSound("entity.koribustard.flying");
		CAPERCAILLIE_FLYING = registerSound("entity.capercaillie.flying");
		HORNBILL_LIVING = registerSound("entity.hornbill.living");
		HORNBILL_HURT = registerSound("entity.hornbill.hurt");
		TURACO_LIVING = registerSound("entity.turaco.living");
		TURACO_LIVING2 = registerSound("entity.turaco.living2");
		TURACO_FLYING = registerSound("entity.turaco.flying");
		TROPICBIRD_FLYING = registerSound("entity.tropicbird.flying");
		FALCON_FLYING = registerSound("entity.falcon.flying");
		FALCON_HURT = registerSound("entity.falcon.hurt");
		PTARMIGAN_HURT = registerSound("entity.ptarmigan.flying");
		PTARMIGAN_SONG = registerSound("entity.ptarmigan.song");
		GROUNDHORNBILL_LIVING = registerSound("entity.groundhornbill.living");
		
		MALE_CAPERCAILLIE_STREAM = registerSound("record.male_capercaillie_record");
		FEMALE_CAPERCAILLIE_STREAM = registerSound("record.female_capercaillie_record");
		AVOCET_STREAM = registerSound("record.avocet_record");
		COURSER_STREAM = registerSound("record.courser_record");
		KORIBUSTARD_STREAM = registerSound("record.koribustard_record");
		LITTLEBUSTARD_STREAM = registerSound("record.littlebustard_record");
		OSTRICH_STREAM = registerSound("record.ostrich_record");
		PUFFIN_STREAM = registerSound("record.puffin_record");
		HORNBILL_STREAM = registerSound("record.hornbill_record");
		TURACO_STREAM = registerSound("record.turaco_record");
		TROPICBIRD_STREAM = registerSound("record.tropicbird_record");
		FALCON_STREAM = registerSound("record.falcon_record");
		PTARMIGAN_STREAM = registerSound("record.ptarmigan_record");
		GROUNDHORNBILL_STREAM = registerSound("record.groundhornbill_record");
	}
	
	  private static SoundEvent registerSound(String s) { ResourceLocation l = new ResourceLocation("faunanatural:" + s);
	    SoundEvent event = new SoundEvent(l);
	    event.setRegistryName(s);
	    ForgeRegistries.SOUND_EVENTS.register(event);
	    return event;
	  }

}
