package eqlogtools;

public class SpellDurationsShadowKnight {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// SNARES ----------------------------
	
	public static void startCalc_ShadowKnight_ClingingDarkness() // 2 ticks @L4 to 6 ticks @L12
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 13)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_EngulfingDarkness() // Fixed duration, 1 minute (60s)
	{
		SpellTimers.spellTimersShadowKnight[0][2] = 60;
	}
	
	public static void startCalc_ShadowKnight_DoomingDarkness() // 1.4 minutes (84s) @L29 to 1.5 minutes (90s) @L30
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 31)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[0][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_CascadingDarkness() // Fixed duration, 1.6 (96s) minutes
	{
		SpellTimers.spellTimersShadowKnight[0][4] = 96;
	}
	
	// FIRE DOTS -------------------------------
	
	public static void startCalc_ShadowKnight_HeatBlood() // 6 ticks @L12 to 1 minute @L20
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 21)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[1][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_BoilBlood() // 1.4 minutes @L29 to 2.1 minutes @L42
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 43)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[1][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DISEASE DOTS 1 -----------------------
	
	public static void startCalc_ShadowKnight_DiseaseCloud() // 3 minutes @L1 to 6 minutes @L2
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 3)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[2][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DISEASE DOTS 2 -----------------------
	
	public static void startCalc_ShadowKnight_HeartFlutter() // 8 ticks @L16 to 1.2 minutes @L24
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 25)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[3][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_Asystole() // 60s
	{
		SpellTimers.spellTimersShadowKnight[3][2] = 60;
	}
	
	// MISC 1 -----------------------
	
	public static void startCalc_ShadowKnight_VampiricEmbrace() // 1.8 minutes @L8 to 7.5 minutes @L65
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
		SpellTimers.spellTimersShadowKnight[4][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// LEECH -----------------------
	
	public static void startCalc_ShadowKnight_VampiricCurse() // 9 ticks
	{
		SpellTimers.spellTimersShadowKnight[5][1] = 54;
	}
	
	// LULL -----------------------------
	
	public static void startCalc_ShadowKnight_NumbTheDead() // 1.4 minutes @L4 to 2 minutes @L10
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 11)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[6][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_RestTheDead() // 3 mins
	{
		SpellTimers.spellTimersShadowKnight[6][2] = 180;
	}
	
	// AC TAP -------------------------
	
	public static void startCalc_ShadowKnight_ShadowVortex() // 3 minutes @L20 to 7.5 minutes @L65
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
		SpellTimers.spellTimersShadowKnight[7][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_ShroudOfPain() // 10 mins
	{
		SpellTimers.spellTimersShadowKnight[7][2] = 600;
	}
	
	// STR TAP ------------------------------
	
	public static void startCalc_ShadowKnight_SiphonStrength() // 3 minutes @L1 to 6 minutes @L2
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 3)
			{
				currentSpellDuration = (level * 30);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[8][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_WaveOfEnfeeblement() // 2.2 minutes @L12 to 4 minutes @L30
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 31)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[8][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// ATK TAP ------------------------
	
	public static void startCalc_ShadowKnight_ShroudOfHate() // 10 mins
	{
		SpellTimers.spellTimersShadowKnight[9][1] = 600;
	}
	
	// RESIST BUFFS -------------------
	
	public static void startCalc_ShadowKnight_EndureCold() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersShadowKnight[10][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_EndureDisease() // 24.0 mins @L8 to 27.0 mins @L9
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
		SpellTimers.spellTimersShadowKnight[10][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_ResistCold() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShadowKnight[10][3] = 2160;
	}
	
	// MISC 2 ---------------------
	
	public static void startCalc_ShadowKnight_InvisibilityVersusUndead() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersShadowKnight[11][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_BreathOfTheDead() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersShadowKnight[11][2] = 1620;
	}
	
	public static void startCalc_ShadowKnight_Deadeye() // 24 minutes @L8 to 27 minutes @L9
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
		SpellTimers.spellTimersShadowKnight[11][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_ShadowKnight_ShadowSight() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersShadowKnight[11][4] = 1620;
	}
	
	// MISC 3 ------------------------
	
	public static void startCalc_ShadowKnight_BobbingCorpse() // Fixed duration, 63 minutes
	{
		SpellTimers.spellTimersShadowKnight[12][1] = 3780;
	}
	
	// MISC 4 ------------------------
	
	public static void startCalc_ShadowKnight_GrimAura() // 12 minutes @L4 to 27 minutes @L9
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
		SpellTimers.spellTimersShadowKnight[13][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// MISC 5 ------------------------
	
	public static void startCalc_ShadowKnight_BansheeAura() // 4.2 minutes @L16 to 9 minutes @L40
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 41)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShadowKnight[14][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// MISC 6 -------------------------
	
	public static void startCalc_ShadowKnight_Shieldskin() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShadowKnight[15][1] = 2160;
	}
	
	public static void startCalc_ShadowKnight_Steelskin() // Fixed duration, 72 minutes
	{
		SpellTimers.spellTimersShadowKnight[15][2] = 4320;
	}
	
	public static void startCalc_ShadowKnight_Diamondskin() // Fixed duration, 90 minutes
	{
		SpellTimers.spellTimersShadowKnight[15][3] = 5400;
	}
	
	// MISC 7 --------------------------
	
	public static void startCalc_ShadowKnight_ShroudOfDeath() // Fixed duration, 20 minutes
	{
		SpellTimers.spellTimersShadowKnight[16][1] = 1200;
	}
	
	public static void startCalc_ShadowKnight_ShroudOfUndeath() // Fixed duration, 20 minutes
	{
		SpellTimers.spellTimersShadowKnight[16][2] = 1200;
	}
	
	// MISC 8 --------------------------
	
	public static void startCalc_ShadowKnight_StrengthenDeath() // 3.9 minutes @L29 to 7.5 minutes @L65
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
		SpellTimers.spellTimersShadowKnight[17][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
}


