package eqlogtools;

public class SpellDurationsRanger {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// SNARES ----------------------------
	
	public static void startCalc_Ranger_Snare() // "Duration * 3/5"
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			currentSpellDuration = (level * 0.6);
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 60) / 10);
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersRanger[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	

	public static void startCalc_Ranger_Ensnare() // "Level * 2 + 10"
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

		SpellTimers.spellTimersRanger[0][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DOTS --------------------------
	
	public static void startCalc_Ranger_FlameLick() // 1 ticks @L1 to 8 ticks @L14
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
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}

		SpellTimers.spellTimersRanger[1][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_StingingSwarm() // 7 ticks @L14 to 9 ticks @L18
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
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}

		SpellTimers.spellTimersRanger[1][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_Immolate() // 60s
	{
		SpellTimers.spellTimersRanger[1][3] = 60;
	}
	
	public static void startCalc_Ranger_DronesOfDoom() // 60s
	{
		SpellTimers.spellTimersRanger[1][4] = 60;
	}
	
	// LULL ---------------------
	
	public static void startCalc_Ranger_LullAnimal() // 1.2 minutes @L1 to 2 minutes @L5
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 6)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}

		SpellTimers.spellTimersRanger[2][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_CalmAnimal() // 7 ticks
	{
		SpellTimers.spellTimersRanger[2][2] = 420;
	}
	
	// HP BUFFS --------------------------
	
	public static void startCalc_Ranger_SkinLikeWood() // 27 mins
	{
		SpellTimers.spellTimersRanger[3][1] = 1620;
	}
	
	public static void startCalc_Ranger_SkinLikeRock() // 27 mins
	{
		SpellTimers.spellTimersRanger[3][2] = 1620;
	}
	
	public static void startCalc_Ranger_SkinLikeSteel() // 36 mins
	{
		SpellTimers.spellTimersRanger[3][3] = 2160;
	}
	
	public static void startCalc_Ranger_SkinLikeDiamond() // 54 mins
	{
		SpellTimers.spellTimersRanger[3][4] = 3240;
	}
	
	public static void startCalc_Ranger_SkinLikeNature() // 72 mins
	{
		SpellTimers.spellTimersRanger[3][5] = 4320;
	}
	
	// AC BUFFS --------------------------
	
	public static void startCalc_Ranger_Thistlecoat() // 27 minutes @L9 to 3 hours 15 minutes @L60
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

		SpellTimers.spellTimersRanger[4][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_Barbcoat() // 57 minutes @L19 to 3 hours 15 minutes @L65
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

		SpellTimers.spellTimersRanger[4][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_Bramblecoat() // 1 hour 27 minutes @L29 to 3 hours 15 minutes @L65
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

		SpellTimers.spellTimersRanger[4][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_Spikecoat() // 1 hour 57 minutes @L39 to 3 hours 15 minutes @L65
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

		SpellTimers.spellTimersRanger[4][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_Thorncoat() // 2 hours 27 minutes @L49 to 3 hours 15 minutes @L65
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

		SpellTimers.spellTimersRanger[4][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DAMAGE SHIELDS -------------------
	
	public static void startCalc_Ranger_ShieldOfThistles() // 9 ticks @L9 to 6.5 minutes @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}

		SpellTimers.spellTimersRanger[5][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_ShieldOfBrambles() // 2.9 minutes @L29 to 6.5 minutes @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}

		SpellTimers.spellTimersRanger[5][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_ShieldOfSpikes() // 3.9 minutes @L39 to 6.5 minutes @L65
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 66)
			{
				currentSpellDuration = (level);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}

		SpellTimers.spellTimersRanger[5][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// RESIST BUFFS --------------------------
	
	public static void startCalc_Ranger_EndureFire() // 3 minutes @L1 to 27 minutes @L9
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

		SpellTimers.spellTimersRanger[6][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_EndureCold() // 3 minutes @L1 to 27 minutes @L9
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

		SpellTimers.spellTimersRanger[6][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_ResistFire() // 36 mins
	{
		SpellTimers.spellTimersRanger[6][3] = 2160;
	}
	
	public static void startCalc_Ranger_ResistCold() // 36 mins
	{
		SpellTimers.spellTimersRanger[6][4] = 2160;
	}
	
	// ATK 1 -----------
	
	public static void startCalc_Ranger_Firefist() // 12 mins
	{
		SpellTimers.spellTimersRanger[7][1] = 720;
	}
	
	public static void startCalc_Ranger_StrengthOfNature() // 60 mins
	{
		SpellTimers.spellTimersRanger[7][2] = 3600;
	}
	
	// ATK 2 -----------
	
	public static void startCalc_Ranger_CallOfThePredator() // 75 mins
	{
		SpellTimers.spellTimersRanger[8][1] = 4500;
	}
	
	// MOVEMENT BUFFS --------------
	
	public static void startCalc_Ranger_SpiritOfWolf() // 27 minutes @L9 to 36 minutes @L12
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

		SpellTimers.spellTimersRanger[9][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_WolfForm() // 72 mins
	{
		SpellTimers.spellTimersRanger[9][2] = 4320;
	}
	
	public static void startCalc_Ranger_GreaterWolfForm() // 1 hour 42 minutes @L34 to 1 hour 50 minutes @L37
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

		SpellTimers.spellTimersRanger[9][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// STRENGTH BUFFS --------------------
	
	public static void startCalc_Ranger_StrengthOfEarth() // 27 mins
	{
		SpellTimers.spellTimersRanger[10][1] = 1620;
	}
	
	public static void startCalc_Ranger_StormStrength() // 54 mins
	{
		SpellTimers.spellTimersRanger[10][2] = 3240;
	}
	
	// PROC SPELLS -----------------------
	
	public static void startCalc_Ranger_CallOfSky() // 10 mins
	{
		SpellTimers.spellTimersRanger[11][1] = 600;
	}
	
	public static void startCalc_Ranger_CallOfFire() // 10 mins
	{
		SpellTimers.spellTimersRanger[11][2] = 600;
	}
	
	// MISC 1 ----------------------------
	
	public static void startCalc_Ranger_CallOfEarth() // 60 mins
	{
		SpellTimers.spellTimersRanger[12][1] = 3600;
	}
	
	// MISC 2 ----------------------------
	
	public static void startCalc_Ranger_Chloroplast() // 12.7 minutes @L39 to 20.5 minutes @L60
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

		SpellTimers.spellTimersRanger[13][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// MISC 3 ----------------------------
	
	public static void startCalc_Ranger_Levitate() // 5.2 minutes @L14 to 20.5 minutes @L65
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

		SpellTimers.spellTimersRanger[14][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Ranger_EnduringBreath() // 27 mins
	{
		SpellTimers.spellTimersRanger[14][2] = 1620;
	}
	
	// MISC 4 ----------------------------
	
	public static void startCalc_Ranger_EyesOfTheCat() // 27 mins
	{
		SpellTimers.spellTimersRanger[15][1] = 1620;
	}
	
	public static void startCalc_Ranger_ChillSight() // 36 mins
	{
		SpellTimers.spellTimersRanger[15][2] = 2160;
	}
	
	// FEAR ------------------------------
	
	public static void startCalc_Ranger_PanicAnimal() // 18s
	{
		SpellTimers.spellTimersRanger[16][1] = 18;
	}
}
