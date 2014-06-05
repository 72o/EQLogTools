package eqlogtools;

public class SpellDurationsNecromancer {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// SNARES ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_ClingingDarkness() // 2 ticks @L4 to 6 ticks @L12
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
		SpellTimers.spellTimersNecromancer[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_EngulfingDarkness() // Fixed duration, 1 minute (60s)
	{
		SpellTimers.spellTimersNecromancer[0][2] = 60;
	}
	
	public static void startCalc_Necromancer_DoomingDarkness() // 1.4 minutes (84s) @L29 to 1.5 minutes (90s) @L30
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
		SpellTimers.spellTimersNecromancer[0][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_CascadingDarkness() // Fixed duration, 1.6 (96s) minutes
	{
		SpellTimers.spellTimersNecromancer[0][4] = 96;
	}
	
	public static void startCalc_Necromancer_DevouringDarkness() // Fixed duration, 1.3 (78s) minutes
	{
		SpellTimers.spellTimersNecromancer[0][5] = 78;
	}
	
	public static void startCalc_Necromancer_TormentOfShadows() // 96s
	{
		SpellTimers.spellTimersNecromancer[0][6] = 96;
	}
	
	// FIRE DOTS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_HeatBlood() // 6 ticks @L12 to 1 minute @L20
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
		SpellTimers.spellTimersNecromancer[1][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_BoilBlood() // 1.4 minutes @L29 to 2.1 minutes @L42
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
		SpellTimers.spellTimersNecromancer[1][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_IgniteBlood() // Fixed duration, 2.1 minutes
	{
		SpellTimers.spellTimersNecromancer[1][3] = 126;
	}
	
	public static void startCalc_Necromancer_Pyrocruor() // Fixed duration, 1.8 minutes
	{
		SpellTimers.spellTimersNecromancer[1][4] = 108;
	}
	
	// POISON DOTS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_PoisonBolt() // 2 ticks @L4 to 7 ticks @L12
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 13)
			{
				currentSpellDuration = (level * 0.6);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersNecromancer[2][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_VenomOfTheSnake() // Fixed duration, 42s
	{
		SpellTimers.spellTimersNecromancer[2][2] = 42;
	}
	
	public static void startCalc_Necromancer_ChillingEmbrace() // Fixed duration, 36s
	{
		SpellTimers.spellTimersNecromancer[2][3] = 36;
	}
	
	public static void startCalc_Necromancer_EnvenomedBolt() // Fixed duration, 42s
	{
		SpellTimers.spellTimersNecromancer[2][4] = 42;
	}
	
	// MUSCULAR DISEASE DOTS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_HeartFlutter() // 8 ticks @L16 to 1.2 minutes @L24
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
		SpellTimers.spellTimersNecromancer[3][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_Asystole() // Fixed duration, 1 minute
	{
		SpellTimers.spellTimersNecromancer[3][2] = 60;
	}
	
	public static void startCalc_Necromancer_CessationOfCor() // Fixed duration, 1 minute
	{
		SpellTimers.spellTimersNecromancer[3][3] = 60;
	}
	
	// LEECH DOTS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_Leach() // 7 ticks @L12 to 9 ticks @L15
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 16)
			{
				currentSpellDuration = (level * 0.6);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersNecromancer[4][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_VampiricCurse() // Fixed duration, 54s
	{
		SpellTimers.spellTimersNecromancer[4][2] = 54;
	}
	
	public static void startCalc_Necromancer_BondOfDeath() // Fixed duration, 54s
	{
		SpellTimers.spellTimersNecromancer[4][3] = 54;
	}
	
	public static void startCalc_Necromancer_VexingMordinia() // Fixed duration, 54s
	{
		SpellTimers.spellTimersNecromancer[4][4] = 54;
	}
	
	// MAGIC DOTS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_Splurt() // Fixed duration, 96s
	{
		SpellTimers.spellTimersNecromancer[5][1] = 96;
	}
	
	// DISEASE DOTS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_DiseaseCloud() // 3 minutes @L1 to 6 minutes @L2
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
		SpellTimers.spellTimersNecromancer[6][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_InfectiousCloud() // Fixed duration, 2.1 minutes
	{
		SpellTimers.spellTimersNecromancer[6][2] = 126;
	}
	
	public static void startCalc_Necromancer_Scourge() // Fixed duration, 2.1 minutes
	{
		SpellTimers.spellTimersNecromancer[6][3] = 126;
	}
	
	public static void startCalc_Necromancer_Plague() // Fixed duration, 2.1 minutes
	{
		SpellTimers.spellTimersNecromancer[6][4] = 126;
	}
	
	// CC SPELLS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_ScreamingTerror() // Fixed duration, 18s
	{
		SpellTimers.spellTimersNecromancer[7][1] = 18;
	}
	
	// LICH SPELLS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_DarkPact() // 1.8 minutes @L8 to 7.5 minutes @L65
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
		SpellTimers.spellTimersNecromancer[8][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_AllureOfDeath() // 5 minutes @L20 to 14 minutes @L65
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
		SpellTimers.spellTimersNecromancer[8][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_CallOfBones() // 11.2 minutes @L34 to 20.5 minutes @L65
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
		SpellTimers.spellTimersNecromancer[8][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_Lich() // 15.7 minutes @L49 to 20.5 minutes @L65
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
		SpellTimers.spellTimersNecromancer[8][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_DemiLich() // Fixed duration, 19 minutes
	{
		SpellTimers.spellTimersNecromancer[8][5] = 1140;
	}
	
	public static void startCalc_Necromancer_ArchLich() // 19 minutes @L60 to 20.5 minutes @L65
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
		SpellTimers.spellTimersNecromancer[8][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// PET BUFFS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_IntensifyDeath() // 3.4 minutes @L24 to 7.5 minutes @L65
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
		SpellTimers.spellTimersNecromancer[9][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_AugmentDeath() // 12.7 minutes @L39 to 15 minutes @L47
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 48)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersNecromancer[9][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_AugmentationOfDeath() // Fixed duration, 1 hour
	{
		SpellTimers.spellTimersNecromancer[9][3] = 3600;
	}
	
	// SHIELDING BUFFS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_MinorShielding() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersNecromancer[10][1] = 1620;
	}
	
	public static void startCalc_Necromancer_LesserShielding() // 24 minutes @L8 to 27 minutes @L9
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
		SpellTimers.spellTimersNecromancer[10][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_Shielding() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersNecromancer[10][3] = 2160;
	}
	
	public static void startCalc_Necromancer_MajorShielding() // Fixed duration, 45 minutes
	{
		SpellTimers.spellTimersNecromancer[10][4] = 2700;
	}
	
	public static void startCalc_Necromancer_GreaterShielding() // Fixed duration, 54 minutes
	{
		SpellTimers.spellTimersNecromancer[10][5] = 3240;
	}
	
	public static void startCalc_Necromancer_ArchShielding() // Fixed duration, 1 hour 12 minutes
	{
		SpellTimers.spellTimersNecromancer[10][6] = 4320;
	}
	
	public static void startCalc_Necromancer_ShieldOfTheMagi() // Fixed duration, 1 hour 30 minutes
	{
		SpellTimers.spellTimersNecromancer[10][7] = 5400;
	}
	
	// MISC BUFFS 1 ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_BreathOfTheDead() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersNecromancer[11][1] = 1620;
	}
	
	public static void startCalc_Necromancer_DeadManFloating() // Fixed duration, 1 hour 12 minutes
	{
		SpellTimers.spellTimersNecromancer[11][2] = 4320;
	}
	
	public static void startCalc_Necromancer_DeadMenFloating() // Fixed duration, 1 hour 12 minutes
	{
		SpellTimers.spellTimersNecromancer[11][3] = 4320;
	}
	
	// HARMSHIELDS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_Harmshield() // Fixed duration, 18s
	{
		SpellTimers.spellTimersNecromancer[12][1] = 18;
	}
	
	public static void startCalc_Necromancer_QuiveringVeilOfXarn() // Fixed duration, 18s
	{
		SpellTimers.spellTimersNecromancer[12][2] = 18;
	}
	
	// RESIST BUFFS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_EndureCold() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersNecromancer[13][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_EndureDisease() // 24.0 mins @L8 to 27.0 mins @L9
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
		SpellTimers.spellTimersNecromancer[13][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_ResistCold() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersNecromancer[13][3] = 2160;
	}
	
	public static void startCalc_Necromancer_ResistDisease() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersNecromancer[13][4] = 2160;
	}
	
	// SKIN BUFFS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_SpiritArmor() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersNecromancer[14][1] = 2160;
	}
	
	public static void startCalc_Necromancer_Shieldskin() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersNecromancer[14][2] = 2160;
	}
	
	public static void startCalc_Necromancer_Leatherskin() // Fixed duration, 54 minutes
	{
		SpellTimers.spellTimersNecromancer[14][3] = 3240;
	}
	
	public static void startCalc_Necromancer_Steelskin() // Fixed duration, 72 minutes
	{
		SpellTimers.spellTimersNecromancer[14][4] = 4320;
	}
	
	public static void startCalc_Necromancer_Diamondskin() // Fixed duration, 90 minutes
	{
		SpellTimers.spellTimersNecromancer[14][5] = 5400;
	}
	
	public static void startCalc_Necromancer_Manaskin() // Fixed duration, 120 minutes
	{
		SpellTimers.spellTimersNecromancer[14][6] = 7200;
	}
	
	// SIGHT BUFFS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Necromancer_Deadeye() // 24 minutes @L8 to 27 minutes @L9
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
		SpellTimers.spellTimersNecromancer[15][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_BansheeAura() // 4.2 minutes @L16 to 9 minutes @L40
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
		SpellTimers.spellTimersNecromancer[15][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_ShadowSight() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersNecromancer[15][3] = 1620;
	}
	
	public static void startCalc_Necromancer_SkinOfTheShadow() // 17.5 minutes @L55 to 20.5 minutes @L65
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
		SpellTimers.spellTimersNecromancer[15][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// HEALS ---------------------------------------
	
	public static void startCalc_Necromancer_ShadowCompact() // 4 ticks
	{
		SpellTimers.spellTimersNecromancer[16][1] = 24;
	}
	
	public static void startCalc_Necromancer_PactOfShadow() // 4 ticks
	{
		SpellTimers.spellTimersNecromancer[16][2] = 24;
	}
	
	public static void startCalc_Necromancer_Shadowbond() // 4 ticks
	{
		SpellTimers.spellTimersNecromancer[16][3] = 24;
	}
	
	// LULL ----------------------------------------
	
	public static void startCalc_Necromancer_NumbTheDead() // 1.4 minutes @L4 to 2 minutes @L10
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
		SpellTimers.spellTimersNecromancer[17][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Necromancer_RestTheDead() // 3 mins
	{
		SpellTimers.spellTimersNecromancer[17][2] = 180;
	}
}