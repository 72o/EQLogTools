package eqlogtools;

public class SpellDurationsShaman {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// SLOWS ------------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_Drowsy() // 2 ticks @L5 to 3.2 minutes @L65
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
		SpellTimers.spellTimersShaman[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_WalkingSleep() // 7 ticks @L14 to 3.2 minutes @L65
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
		SpellTimers.spellTimersShaman[0][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_TagarsInsects() // 1.4 minutes @L29 to 3.2 minutes @L65
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
		SpellTimers.spellTimersShaman[0][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_TogorsInsects() // 1.9 minutes @L39 to 3.2 minutes @L65
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
		SpellTimers.spellTimersShaman[0][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_TurgursInsects() // 5.1 minutes @L51 to 6.5 minutes @L65
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
		SpellTimers.spellTimersShaman[0][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_TigirsInsects() // 2.9 minutes @L58 to 3.2 minutes @L65
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
		SpellTimers.spellTimersShaman[0][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DISEASE DOTS ---------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_Sicken() // 1.5 minutes @L5 to 2.1 minutes @L11
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 12)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShaman[1][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Affliction() // Fixed duration? 2.1 minutes
	{
		SpellTimers.spellTimersShaman[1][2] = 126;
	}
	
	public static void startCalc_Shaman_InfectiousCloud() // Fixed duration? 2.1 minutes
	{
		SpellTimers.spellTimersShaman[1][3] = 126;
	}
	
	public static void startCalc_Shaman_Scourge() // Fixed duration? 2.1 minutes
	{
		SpellTimers.spellTimersShaman[1][4] = 126;
	}
	
	public static void startCalc_Shaman_Plague() // Fixed duration? 2.1 minutes
	{
		SpellTimers.spellTimersShaman[1][5] = 126;
	}
	
	public static void startCalc_Shaman_PoxOfBertoxxulous() // Fixed duration? 2.1 minutes
	{
		SpellTimers.spellTimersShaman[1][6] = 126;
	}
	
	// POISON DOTS ---------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_TaintedBreath() // Fixed duration? 7 ticks
	{
		SpellTimers.spellTimersShaman[2][1] = 42;
	}
	
	public static void startCalc_Shaman_EnvenomedBreath() // Fixed duration? 7 ticks
	{
		SpellTimers.spellTimersShaman[2][2] = 42;
	}
	
	public static void startCalc_Shaman_VenomOfTheSnake() // Fixed duration? 7 ticks
	{
		SpellTimers.spellTimersShaman[2][3] = 42;
	}
	
	public static void startCalc_Shaman_EnvenomedBolt() // Fixed duration? 7 ticks
	{
		SpellTimers.spellTimersShaman[2][4] = 42;
	}
	
	public static void startCalc_Shaman_BaneOfNife() // Fixed duration? 7 ticks
	{
		SpellTimers.spellTimersShaman[2][5] = 42;
	}
	
	// STAT DEBUFFS ---------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_Disempower() // 1.4 minutes @L14 to 2 minutes @L20
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 21)
			{
				currentSpellDuration = (level);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShaman[3][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_ListlessPower() // 2.9 minutes @L29 to 6.5 minutes @L65
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
		SpellTimers.spellTimersShaman[3][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Incapacitate() // 4.4 minutes @L44 to 6.5 minutes @L65
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
		SpellTimers.spellTimersShaman[3][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Cripple() // 6.3 minutes @L53 to 7.5 minutes @L65
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
		SpellTimers.spellTimersShaman[3][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DISEASE DEBUFFS ---------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_InsidiousFever() // 4.8 minutes @L19 to 14 minutes @L65
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
		SpellTimers.spellTimersShaman[4][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_InsidiousMalady() // 8.8 minutes @L39 to 14 minutes @L65
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
		SpellTimers.spellTimersShaman[4][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_InsidiousDecay() // 11.4 minutes @L52 to 14 minutes @L65
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
		SpellTimers.spellTimersShaman[4][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// RESIST DEBUFFS ------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_Malaise() // 4.8 minutes @L19 to 14 minutes @L65
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
		SpellTimers.spellTimersShaman[5][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Malaisement() // 7.8 minutes @L34 to 14 minutes @L65
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
		SpellTimers.spellTimersShaman[5][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Malosi() // 10.8 minutes @L49 to 14 minutes @L65
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
		SpellTimers.spellTimersShaman[5][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Malosini() // 18.1 minutes @L57 to 20.5 minutes @L65
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
		SpellTimers.spellTimersShaman[5][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Malo() // 13.0 mins @L60 to 14.0 mins @L65
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
		SpellTimers.spellTimersShaman[5][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// HASTE BUFFS  ------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_Quickness() // 4.2 minutes @L16 to 11 minutes @L50
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 51)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShaman[6][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Alacrity() // 5.8 minutes @L24 to 11 minutes @L50
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 51)
			{
				currentSpellDuration = ((level * 2) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShaman[6][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Celerity() // 12.7 minutes @L39 to 16 minutes @L50
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 51)
			{
				currentSpellDuration = ((level * 3) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersShaman[6][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}

	// MOVEMENT BUFFS ------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_SpiritOfWolf() // 27 minutes @L9 to 36 minutes @L12
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
		SpellTimers.spellTimersShaman[7][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_SpiritOfCheetah() // Fixed duration, 8 ticks
	{
		SpellTimers.spellTimersShaman[7][2] = 48;
	}
	
	public static void startCalc_Shaman_ScaleOfWolf() // Fixed duration, 45 mins
	{
		SpellTimers.spellTimersShaman[7][3] = 2700;
	}
	
	public static void startCalc_Shaman_SpiritOfScale() // Fixed duration, 72 mins
	{
		SpellTimers.spellTimersShaman[7][4] = 4320;
	}
	
	// STAT BUFFS  ------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_BurstOfStrength() // Fixed duration, 3 ticks
	{
		SpellTimers.spellTimersShaman[8][1] = 18;
	}
	
	public static void startCalc_Shaman_Frenzy() // 6.7 minutes @L19 to 20.5 minutes @L65
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
		SpellTimers.spellTimersShaman[8][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Fury() // 11.2 minutes @L34 to 20.5 minutes @L65
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
		SpellTimers.spellTimersShaman[8][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Rage() // 15.7 minutes @L49 to 20.5 minutes @L65
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
		SpellTimers.spellTimersShaman[8][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_VoiceOfTheBerserker() // 18.7 minutes @L59 to 20.5 minutes @L65
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
		SpellTimers.spellTimersShaman[8][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Avatar() // 6 minutes @L60 to 6.5 minutes @L65
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
		SpellTimers.spellTimersShaman[8][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_PrimalAvatar() // 6 minutes @L60 to 6.5 minutes @L65
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
		SpellTimers.spellTimersShaman[8][7] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// STRENGTH BUFFS  ------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_Strengthen() // Fixed duration, 27 mins
	{
		SpellTimers.spellTimersShaman[9][1] = 1620;
	}
	
	public static void startCalc_Shaman_SpiritStrength() // Fixed duration, 36 mins
	{
		SpellTimers.spellTimersShaman[9][2] = 2160;
	}
	
	public static void startCalc_Shaman_RagingStrength() // Fixed duration, 45 mins
	{
		SpellTimers.spellTimersShaman[9][3] = 2700;
	}
	
	public static void startCalc_Shaman_FuriousStrength() // Fixed duration, 54 mins
	{
		SpellTimers.spellTimersShaman[9][4] = 3240;
	}
	
	public static void startCalc_Shaman_TumultuousStrength() // Fixed duration, 46 mins
	{
		SpellTimers.spellTimersShaman[9][5] = 2760;
	}
	
	public static void startCalc_Shaman_Strength() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[9][6] = 3780;
	}
	
	public static void startCalc_Shaman_ManiacalStrength() // Fixed duration, 90 mins
	{
		SpellTimers.spellTimersShaman[9][7] = 5400;
	}
	
	public static void startCalc_Shaman_TalismanOfTheRhino() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[9][8] = 3780;
	}
	
	// AGI BUFFS  ------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_FeetLikeCat() // Fixed duration, 36 mins
	{
		SpellTimers.spellTimersShaman[10][1] = 2160;
	}
	
	public static void startCalc_Shaman_SpiritOfCat() // Fixed duration, 45 mins
	{
		SpellTimers.spellTimersShaman[10][2] = 2700;
	}
	
	public static void startCalc_Shaman_Nimble() // Fixed duration, 54 mins
	{
		SpellTimers.spellTimersShaman[10][3] = 3240;
	}
	
	public static void startCalc_Shaman_Agility() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[10][4] = 3780;
	}
	
	public static void startCalc_Shaman_DeliriouslyNimble() // Fixed duration, 72 mins
	{
		SpellTimers.spellTimersShaman[10][5] = 4320;
	}
	
	public static void startCalc_Shaman_TalismanOfTheCat() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[10][6] = 3780;
	}
	
	// DEX BUFFS  ------------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_DexterousAura() // Fixed duration, 27 mins
	{
		SpellTimers.spellTimersShaman[11][1] = 1620;
	}
	
	public static void startCalc_Shaman_SpiritOfMonkey() // Fixed duration, 36 mins
	{
		SpellTimers.spellTimersShaman[11][2] = 2160;
	}
	
	public static void startCalc_Shaman_RisingDexterity() // Fixed duration, 45 mins
	{
		SpellTimers.spellTimersShaman[11][3] = 2700;
	}
	
	public static void startCalc_Shaman_Deftness() // Fixed duration, 54 mins
	{
		SpellTimers.spellTimersShaman[11][4] = 3240;
	}
	
	public static void startCalc_Shaman_Dexterity() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[11][5] = 3780;
	}
	
	public static void startCalc_Shaman_MortalDeftness() // Fixed duration, 72 mins
	{
		SpellTimers.spellTimersShaman[11][6] = 4320;
	}
	
	public static void startCalc_Shaman_TalismanOfTheRaptor() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[11][7] = 3780;
	}
	
	// STA BUFFS  --------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_SpiritOfBear() // 27 minutes @L9 to 36 minutes @L12
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
		SpellTimers.spellTimersShaman[12][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_SpiritOfOx() // Fixed duration, 45 mins
	{
		SpellTimers.spellTimersShaman[12][2] = 2700;
	}
	
	public static void startCalc_Shaman_Health() // Fixed duration, 54 mins
	{
		SpellTimers.spellTimersShaman[12][3] = 3240;
	}
	
	public static void startCalc_Shaman_Stamina() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[12][4] = 3780;
	}
	
	public static void startCalc_Shaman_RiotousHealth() // Fixed duration, 72 mins
	{
		SpellTimers.spellTimersShaman[12][5] = 4320;
	}
	
	public static void startCalc_Shaman_TalismanOfTheBrute() // Fixed duration, 63 mins
	{
		SpellTimers.spellTimersShaman[12][6] = 3780;
	}
	
	// RESIST BUFFS --------------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_EndureCold() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersShaman[13][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_EndureFire() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersShaman[13][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_EndureDisease() // 24.0 mins @L8 to 27.0 mins @L9
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
		SpellTimers.spellTimersShaman[13][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_EndurePoison() // 18.0 mins @L6 to 27.0 mins @L9
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
		SpellTimers.spellTimersShaman[13][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_EndureMagic() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersShaman[13][5] = 1620;
	}
	
	public static void startCalc_Shaman_ResistCold() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShaman[13][6] = 2160;
	}
	
	public static void startCalc_Shaman_ResistFire() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShaman[13][7] = 2160;
	}
	
	public static void startCalc_Shaman_ResistDisease() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShaman[13][8] = 2160;
	}
	
	public static void startCalc_Shaman_ResistPoison() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShaman[13][9] = 2160;
	}
	
	public static void startCalc_Shaman_ResistMagic() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShaman[13][10] = 2160;
	}
	
	public static void startCalc_Shaman_TalismanOfJasinth() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShaman[13][11] = 2160;
	}
	
	public static void startCalc_Shaman_TalismanOfShadoo() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersShaman[13][12] = 2160;
	}
	
	// REGEN BUFFS --------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_Regeneration() // 8.2 minutes @L24 to 20.5 minutes @L65
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
		SpellTimers.spellTimersShaman[14][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Chloroplast() // 12.7 minutes @L39 to 20.5 minutes @L60
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
		SpellTimers.spellTimersShaman[14][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Regrowth() // 16.6 minutes @L52 to 20.5 minutes @L65
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
		SpellTimers.spellTimersShaman[14][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_FormOfTheGreatBear() // Fixed, 2 hours 24 minutes
	{
		SpellTimers.spellTimersShaman[14][4] = 8640;
	}
	
	// HP BUFFS --------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_InnerFire() // Fixed, 27 minutes
	{
		SpellTimers.spellTimersShaman[15][1] = 1620;
	}
	
	public static void startCalc_Shaman_TalismanOfTnarg() // Fixed, 72 minutes
	{
		SpellTimers.spellTimersShaman[15][2] = 4320;
	}
	
	public static void startCalc_Shaman_TalismanOfAltuna() // Fixed, 72 minutes
	{
		SpellTimers.spellTimersShaman[15][3] = 4320;
	}
	
	public static void startCalc_Shaman_TalismanOfKragg() // Fixed, 72 minutes
	{
		SpellTimers.spellTimersShaman[15][4] = 4320;
	}
	
	public static void startCalc_Shaman_FocusOfSpirit() // Fixed, 100 minutes
	{
		SpellTimers.spellTimersShaman[15][5] = 6000;
	}
	
	// AC BUFFS --------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_ScaleSkin() // 15 minutes @L5 to 27 minutes @L9
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
		SpellTimers.spellTimersShaman[16][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_TurtleSkin() // 33 mins @L11 to 36 mins @L12.
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
		SpellTimers.spellTimersShaman[16][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_Protect() // Fixed, 36 minutes
	{
		SpellTimers.spellTimersShaman[16][3] = 2160;
	}
	
	public static void startCalc_Shaman_ShiftingShield() // Fixed, 45 minutes
	{
		SpellTimers.spellTimersShaman[16][4] = 2700;
	}
	
	public static void startCalc_Shaman_Guardian() // Fixed, 63 minutes
	{
		SpellTimers.spellTimersShaman[16][5] = 3780;
	}
	
	public static void startCalc_Shaman_ShroudOfTheSpirits() // Fixed, 72 minutes
	{
		SpellTimers.spellTimersShaman[16][6] = 4320;
	}
	
	// MISC BUFFS --------------------------------------------------------------------------------
	
	public static void startCalc_Shaman_SpiritOfSnake() // 30.0 mins @L10 to 36.0 mins @L12.
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
		SpellTimers.spellTimersShaman[17][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_AlluringAura() // Fixed, 45 minutes
	{
		SpellTimers.spellTimersShaman[17][2] = 2700;
	}
	
	public static void startCalc_Shaman_Glamour() // Fixed, 54 minutes
	{
		SpellTimers.spellTimersShaman[17][3] = 3240;
	}
	
	public static void startCalc_Shaman_Charisma() // Fixed, 63 minutes
	{
		SpellTimers.spellTimersShaman[17][4] = 3780;
	}
	
	public static void startCalc_Shaman_TalismanOfTheSerpent() // Fixed, 63 minutes
	{
		SpellTimers.spellTimersShaman[17][5] = 3780;
	}
	
	public static void startCalc_Shaman_UnfailingReverence() // Fixed, 72 minutes
	{
		SpellTimers.spellTimersShaman[17][6] = 4320;
	}
	
	public static void startCalc_Shaman_Ultravision() // Fixed, 36 minutes
	{
		SpellTimers.spellTimersShaman[17][7] = 2160;
	}
	
	public static void startCalc_Shaman_Acumen() // Fixed, 63 minutes
	{
		SpellTimers.spellTimersShaman[17][8] = 3780;
	}
	
	public static void startCalc_Shaman_Levitate() // 4.0 mins @L10 to 20.5 mins @L65
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
		SpellTimers.spellTimersShaman[17][9] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_EnduringBreath() // 18.0 mins @L6 to 27.0 mins @L9
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
		SpellTimers.spellTimersShaman[17][10] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_SpiritQuickening() // 6 minutes @L50 to 7.5 minutes @L65
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
		SpellTimers.spellTimersShaman[17][11] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Shaman_CurseOfTheSpirits() // 84s
	{
		SpellTimers.spellTimersShaman[17][12] = 84;
	}
}
