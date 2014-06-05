package eqlogtools;

public class SpellDurationsDruid {
	
	static long[][] currentSpellDurationArray = new long[1][66];
	
	// SNARES ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_Snare() // 6 seconds @L1 to 3 minutes 54 seconds @L60
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 0.6);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	

	public static void startCalc_Druid_Ensnare() // "Level * 2 + 10"
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 65)
		{
			currentSpellDuration = ((level * 2) + 10);
			level++;
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDuration = (currentSpellDuration / 10);
			currentSpellDurationInSeconds = currentSpellDurationInSeconds * 6;
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
		}

		SpellTimers.spellTimersDruid[0][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_BondsOfTunare() // Fixed duration, 1.8 minutes
	{
		SpellTimers.spellTimersDruid[0][3] = 108;
	}
	
	// FIRE DOTS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_FlameLick() // "Duration * 3/5"
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 15)
			{
				currentSpellDuration = (level * 0.6);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 60) / 10);
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[1][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Immolate() // Fixed duration, 1 minute
	{
		
		SpellTimers.spellTimersDruid[1][2] = 60;
	}
	
	public static void startCalc_Druid_BreathOfRo() // Fixed duration, 1 minute
	{
		SpellTimers.spellTimersDruid[1][3] = 60;
	}
	
	// MAGIC DOTS 1 ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_StingingSwarm() // 42 seconds @L14, 54 seconds @L18
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 19)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 60) / 10);
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[2][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_CreepingCrud() // Fixed duration, 1 minute
	{
		SpellTimers.spellTimersDruid[2][2] = 60;
	}
	
	public static void startCalc_Druid_DronesOfDoom() // Fixed duration, 1 minute
	{
		SpellTimers.spellTimersDruid[2][3] = 60;
	}
	
	public static void startCalc_Druid_DriftingDeath() // Fixed duration, 1 minute
	{
		SpellTimers.spellTimersDruid[2][4] = 60;
	}
	
	// MAGIC DOTS 2 ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_WingedDeath() // Fixed duration, 1 minute
	{
		SpellTimers.spellTimersDruid[3][1] = 60;
	}
	
	// MOVEMENT BUFFS 1 ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_SpiritOfWolf() // 27 minutes @L9 to 36 minutes @L12
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 13)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[4][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_WolfForm() // Fixed duration, 1 hour 12 minutes
	{
		SpellTimers.spellTimersDruid[4][2] = 4320;
	}
	
	public static void startCalc_Druid_GreaterWolfForm() // 1 hour 42 minutes @L34 to 1 hour 50 minutes @L37
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 38)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[4][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_PackSpirit() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersDruid[4][4] = 2160;
	}
	
	public static void startCalc_Druid_ShareWolfForm() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersDruid[4][5] = 2160;
	}
	
	public static void startCalc_Druid_FormOfTheGreatWolf() // 2 hours 12 minutes (7920s) @L44 to 2 hours 24 minutes (8640s) @L48
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 49)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[4][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_FormOfTheHowler() // Fixed duration, 2 hours 24 minutes (8640s)
	{
		SpellTimers.spellTimersDruid[4][7] = 8640;
	}
	
	public static void startCalc_Druid_FormOfTheHunter() // 3 hours (10800s) @L60 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[4][8] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// MOVEMENT BUFFS 2 ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_ScaleOfWolf() // Fixed duration, 45 minutes (2700s)
	{
		SpellTimers.spellTimersDruid[5][1] = 2700;
	}
	
	public static void startCalc_Druid_SpiritOfCheetah() // Fixed duration, 45 minutes (48s)
	{
		SpellTimers.spellTimersDruid[5][2] = 48;
	}
	
	public static void startCalc_Druid_SpiritOfScale() // Fixed duration, 1 hour 12 minutes (4320s)
	{
		SpellTimers.spellTimersDruid[5][3] = 4320;
	}
	
	// DAMAGE SHIELDS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_ShieldOfThistles() // 9 ticks (54s) @L9 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_ShieldOfBarbs() // 1.9 minutes (114s) @L19 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_ShieldOfBrambles() // 2.9 minutes (174s) @L29 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_ShieldOfSpikes() // 3.9 minutes (234s) @L39 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_ShieldOfThorns() // 4.9 minutes (294s) @L49 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_LegacyOfSpike() // 5.1 minutes (306s) @L51 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_ShieldOfBlades() // 6.8 minutes (408s) @L58 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][7] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_LegacyOfThorn() // 5.9 minutes @L59 to 6.5 minutes (390s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = level;
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[6][8] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// ARMOR/HP BUFFS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_SkinLikeWood() // Fixed duration, 27 minutes (1620s)
	{
		SpellTimers.spellTimersDruid[7][1] = 1620;
	}
	
	public static void startCalc_Druid_SkinLikeRock() // Fixed duration, 27 minutes (1620s)
	{
		SpellTimers.spellTimersDruid[7][2] = 1620;
	}
	
	public static void startCalc_Druid_SkinLikeSteel() // Fixed duration, 36 minutes (2160s)
	{
		SpellTimers.spellTimersDruid[7][3] = 2160;
	}
	
	public static void startCalc_Druid_SkinLikeDiamond() // Fixed duration, 54 minutes (3240s)
	{
		SpellTimers.spellTimersDruid[7][4] = 3240;
	}
	
	public static void startCalc_Druid_SkinLikeNature() // Fixed duration, 72 minutes (4320s)
	{
		SpellTimers.spellTimersDruid[7][5] = 4320;
	}
	
	public static void startCalc_Druid_Natureskin() // Fixed duration, 81 minutes (4860s)
	{
		SpellTimers.spellTimersDruid[7][6] = 4860;
	}
	
	public static void startCalc_Druid_ProtectionOfTheGlades() // Fixed duration, 100 minutes (6000s)
	{
		SpellTimers.spellTimersDruid[7][7] = 6000;
	}
	
	// AC/DAMAGESHIELD BUFFS -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_Thistlecoat() // 27 minutes (1620s) @L9 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[8][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Barbcoat() // 57 minutes (3420s) @L19 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[8][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Bramblecoat() // 1 hour 27 minutes (5220s) @L29 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[8][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Spikecoat() // 1 hour 57 minutes (7020s) @L39 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[8][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Thorncoat() // 2 hours 27 minutes (8820s) @L49 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[8][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Bladecoat() // 2 hours 48 minutes (10080s) @L56 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[8][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// REGEN BUFFS -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_Regeneration() // 8.2 minutes (492s) @L24 to 20.5 minutes (1230s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 3) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[9][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_PackRegeneration() // 8.8 minutes (528s) @L39 to 14 minutes (840s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[9][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Chloroplast() // 12.7 minutes (762s) @L39 to 20.5 minutes (1230s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 3) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[9][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_PackChloroplast() // 10.8 minutes (648s) @L49 to 14 minutes (840s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[9][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Regrowth() // 16.6 minutes (996s) @L52 to 20.5 minutes (1230s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 3) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[9][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_RegrowthOfTheGrove() // 18.4 minutes (1104s) @L58 to 20.5 minutes (1230s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 3) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[9][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// RESIST BUFFS -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_EndureFire() // 3 minutes (180s) @L1 to 27 minutes (1620s) @L9
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 10)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[10][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_EndureCold() // 3 minutes (180s) @L1 to 27 minutes (1620s) @L9
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 10)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[10][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_EndureDisease() // 24.0 mins (1440s) @L8 to 27 minutes (1620s) @L9
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 10)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[10][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_EndurePoison() // 18.0 mins (1080s) @L6 to 27 minutes (1620s) @L9
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 10)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[10][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_ResistFire() // Fixed duration, 36 mins (2160s)
	{
		SpellTimers.spellTimersDruid[10][5] = 2160;
	}
	
	public static void startCalc_Druid_EndureMagic() // Fixed duration, 27 mins (1620s)
	{
		SpellTimers.spellTimersDruid[10][6] = 1620;
	}
	
	public static void startCalc_Druid_ResistCold() // Fixed duration, 36 mins (2160s)
	{
		SpellTimers.spellTimersDruid[10][7] = 2160;
	}
	
	public static void startCalc_Druid_ResistDisease() // Fixed duration, 36 mins (2160s)
	{
		SpellTimers.spellTimersDruid[10][8] = 2160;
	}
	
	public static void startCalc_Druid_ResistPoison() // Fixed duration, 36 mins (2160s)
	{
		SpellTimers.spellTimersDruid[10][9] = 2160;
	}
	
	public static void startCalc_Druid_ResistMagic() // Fixed duration, 36 mins (2160s)
	{
		SpellTimers.spellTimersDruid[10][10] = 2160;
	}
	
	public static void startCalc_Druid_CircleOfWinter() // Fixed duration, 36 mins (2160s)
	{
		SpellTimers.spellTimersDruid[10][11] = 2160;
	}
	
	public static void startCalc_Druid_CircleOfSummer() // Fixed duration, 36 mins (2160s)
	{
		SpellTimers.spellTimersDruid[10][12] = 2160;
	}
	
	// PET BUFFS -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_FeralSpirit() // 2.9 minutes (174s) @L19 to 7.5 minutes (450s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[11][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_SavageSpirit() // 5.4 minutes (324s) @L44 to 7.5 minutes (450s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[11][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// MISC DEBUFFS -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_Harmony() // 3 ticks (18s) @L5 to 2 minutes (120s) @L34
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 35)
			{
				currentSpellDuration = (level * 0.6);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = (((currentSpellDurationInSeconds * 60) / 10) + 3); // adding 3 seconds due to 3 second cast time. Harmony has no "landed" text
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[12][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_RosFierySundering() // 1.9 minutes (114s) @L39 to 3.2 minutes (192s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[12][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_FixationOfRo() // 9.8 minutes (588s) @L44 to 10 minutes (600s) @L45
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 46)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[12][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_GlamourofTunare() // 16.9 minutes (1014s) @L53 to 20.5 minutes (1230s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[12][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// INVIS -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_InvisibilityVersusAnimals() // 27 minutes (1620s) @L9 to 36 minutes (2160s) @L12
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 13)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[13][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_ImprovedSuperiorCamouflage() // Fixed duration, 10 minutes (600s)
	{
		SpellTimers.spellTimersDruid[13][2] = 600;
	}
	
	// MISC BUFFS 1 -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_Treeform() // 27 minutes (1620s) @L9 to 36 minutes (2160s) @L12
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 13)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[14][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_Levitate() // 5.2 minutes (312s) @L14 to 20.5 minutes (1230s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = ((level * 3) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[14][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Druid_SpiritOfOak() // Fixed duration, 36 minutes (2160s)
	{
		SpellTimers.spellTimersDruid[14][3] = 2160;
	}
	
	// MISC BUFFS 2 -----------------------------------------------------------------------------------------
	
	public static void startCalc_Druid_SeeInvisible() // Fixed duration, 27 minutes (1620s)
	{
		SpellTimers.spellTimersDruid[15][1] = 1620;
	}
	
	public static void startCalc_Druid_MaskOfTheHunter() // 3 hours (10800s) @L60 to 3 hours 15 minutes (11700s) @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersDruid[15][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// EPIC
	
	public static void startCalc_Druid_WrathOfNature() // Fixed duration, 3 minutes
	{
		SpellTimers.spellTimersDruid[16][1] = 180;
	}
}
