package eqlogtools;

public class SpellDurationsEnchanter {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// SINGLE TARGET MEZ ----------------------------------------------------------------------
	
	public static void startCalc_Enchanter_Mesmerize() // Fixed, 4 ticks
	{
		SpellTimers.spellTimersEnchanter[0][1] = 24;
	}
	
	public static void startCalc_Enchanter_Enthrall() // Fixed, 8 ticks
	{
		SpellTimers.spellTimersEnchanter[0][2] = 48;
	}
	
	public static void startCalc_Enchanter_Entrance() // Fixed, 72s
	{
		SpellTimers.spellTimersEnchanter[0][3] = 72;
	}
	
	public static void startCalc_Enchanter_Dazzle() // Fixed, 96s
	{
		SpellTimers.spellTimersEnchanter[0][4] = 96;
	}
	
	public static void startCalc_Enchanter_GlamourOfKintaz() // Fixed, 54s
	{
		SpellTimers.spellTimersEnchanter[0][5] = 54;
	}
	
	public static void startCalc_Enchanter_Rapture() // Fixed, 42s
	{
		SpellTimers.spellTimersEnchanter[0][6] = 42;
	}
	
	// AE MEZ ----------------------------------------------------------------------
	
	public static void startCalc_Enchanter_Mesmerization() // Fixed, 4 ticks
	{
		SpellTimers.spellTimersEnchanter[1][1] = 24;
	}
	
	public static void startCalc_Enchanter_Fascination() // Fixed, 6 ticks
	{
		SpellTimers.spellTimersEnchanter[1][2] = 36;
	}
	
	// SINGLE TARGET STUNS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_WhirlTillYouHurl() // Fixed, 2 ticks
	{
		SpellTimers.spellTimersEnchanter[2][1] = 12;
	}
	
	public static void startCalc_Enchanter_DynsDizzyingDraught() // Fixed, 2 ticks
	{
		SpellTimers.spellTimersEnchanter[2][2] = 12;
	}
	
	public static void startCalc_Enchanter_LargarnsLamentation() // Fixed, 8.0 seconds
	{
		SpellTimers.spellTimersEnchanter[2][3] = 8;
	}
	
	// AE STUNS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_ColorFlux() // Fixed, 4s
	{
		SpellTimers.spellTimersEnchanter[3][1] = 4;
	}
	
	public static void startCalc_Enchanter_ColorShift() // Fixed, 6s
	{
		SpellTimers.spellTimersEnchanter[3][2] = 6;
	}
	
	public static void startCalc_Enchanter_ColorSkew() // Fixed, 8s
	{
		SpellTimers.spellTimersEnchanter[3][3] = 8;
	}
	
	public static void startCalc_Enchanter_ColorSlant() // Fixed, 8s
	{
		SpellTimers.spellTimersEnchanter[3][4] = 8;
	}
	
	// DEBUFFS 1 -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Tashan() // 1.8 minutes @L4 to 14 minutes @L65
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
		SpellTimers.spellTimersEnchanter[4][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Tashani() // 5 minutes @L20 to 13 minutes @L60
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
		SpellTimers.spellTimersEnchanter[4][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Tashania() // 9.8 minutes @L44 to 14 minutes @L65
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
		SpellTimers.spellTimersEnchanter[4][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_WindOfTashani() // 12 minutes @L55 to 14 minutes @L65
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
		SpellTimers.spellTimersEnchanter[4][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Tashanian() // 12.4 minutes @L57 to 14 minutes @L65
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
		SpellTimers.spellTimersEnchanter[4][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_WindOfTashanian() // 13 minutes @L60 to 14 minutes @L65
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
		SpellTimers.spellTimersEnchanter[4][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DEBUFFS 2 -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Lull() // 1.2 minutes @L1 to 2 minutes @L5
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
		SpellTimers.spellTimersEnchanter[5][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Soothe() // 1.8 minutes @L8 to 2.5 minutes @L15
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 16)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersEnchanter[5][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Calm() // 2.9 minutes @L19 to 3.0 minutes @L20
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 21)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersEnchanter[5][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Pacify() // 7 ticks
	{
		SpellTimers.spellTimersEnchanter[5][4] = 42;
	}
	
	public static void startCalc_Enchanter_WakeOfTranquility() // 7 ticks
	{
		SpellTimers.spellTimersEnchanter[5][5] = 42;
	}
	
	// DEBUFFS 3 -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Weaken() // 1.1 minutes @L1 to 6 minutes @L50
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 51)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersEnchanter[6][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Enfeeblement() // 1.4 minutes @L4 to 6 minutes @L50
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 51)
			{
				currentSpellDuration = (level + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersEnchanter[6][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_EbbingStrength() // 2.2 minutes @L12 to 7.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[6][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_FecklessMight() // 2 minutes @L20 to 6.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[6][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_InsipidWeakness() // 2 minutes @L34 to 3.9 minutes @L65
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
		SpellTimers.spellTimersEnchanter[6][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Incapacitate() // 4.4 minutes @L44 to 6.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[6][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Weakness() // 2.6 minutes @L44 to 3.9 minutes @L65
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
		SpellTimers.spellTimersEnchanter[6][7] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Cripple() // 6.3 minutes @L53 to 7.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[6][8] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DEBUFFS 3 -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Disempower() // 1.4 minutes @L14 to 2 minutes @L20
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
		SpellTimers.spellTimersEnchanter[7][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_ListlessPower() // 2.9 minutes @L29 to 6.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[7][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// DOTS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_SuffocatingSphere() // Fixed, 18s
	{
		SpellTimers.spellTimersEnchanter[8][1] = 18;
	}
	
	public static void startCalc_Enchanter_Choke() // Fixed, 30s
	{
		SpellTimers.spellTimersEnchanter[8][2] = 30;
	}
	
	public static void startCalc_Enchanter_Suffocate() // 1.4 minutes @L29 to 1.8 minutes @L36
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 37)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersEnchanter[8][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_GaspingEmbrace() // Fixed, 48s
	{
		SpellTimers.spellTimersEnchanter[8][4] = 48;
	}
	
	public static void startCalc_Enchanter_Asphyxiate() // Fixed, 2 min
	{
		SpellTimers.spellTimersEnchanter[8][5] = 120;
	}
	
	public static void startCalc_Enchanter_TormentOfArgli() // Fixed, 2 min
	{
		SpellTimers.spellTimersEnchanter[8][6] = 120;
	}
	
	// SLOWS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_LanguidPace() // 6 ticks @L12 to 3.2 minutes @L65
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
		SpellTimers.spellTimersEnchanter[9][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_TepidDeeds() // 1.2 minutes @L24 to 3.2 minutes @L65
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
		SpellTimers.spellTimersEnchanter[9][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_ShiftlessDeeds() // 2.2 minutes @L44 to 3.2 minutes @L65
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
		SpellTimers.spellTimersEnchanter[9][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_ForlornDeeds() // 2.8 minutes @L57 to 3.2 minutes @L65
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
		SpellTimers.spellTimersEnchanter[9][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// CHARMS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Charm() // 4.6 minutes @L12 to 20.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[10][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Beguile() // 8.2 minutes @L24 to 20.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[10][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_CajolingWhispers() // 12.7 minutes @L39 to 20.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[10][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Allure() // 15.7 minutes @L49 to 20.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[10][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_BoltransAgacerie() // 1.3 minutes @L1 to 20.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[10][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Dictate() // Fixed, 8 ticks
	{
		SpellTimers.spellTimersEnchanter[10][6] = 48;
	}
	
	// HASTE BUFFS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Quickness() // 4.2 minutes @L16 to 11 minutes @L50
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
		SpellTimers.spellTimersEnchanter[11][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Alacrity() // 5.8 minutes @L24 to 11 minutes @L50
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
		SpellTimers.spellTimersEnchanter[11][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Celerity() // 12.7 minutes @L39 to 16 minutes @L50
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
		SpellTimers.spellTimersEnchanter[11][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_SwiftLikeTheWind() // 15.7 minutes @L49 to 16 minutes @L50
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
		SpellTimers.spellTimersEnchanter[11][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_AanyasQuickening() // 24 minutes
	{
		SpellTimers.spellTimersEnchanter[11][5] = 1440;
	}
	
	public static void startCalc_Enchanter_Augment() // 36 minutes
	{
		SpellTimers.spellTimersEnchanter[11][6] = 2160;
	}
	
	public static void startCalc_Enchanter_WonderousRapidity() // 18.4 minutes @L58 to 20.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[11][7] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_VisionsOfGrandeur() // 42 minutes
		
		{
			SpellTimers.spellTimersEnchanter[11][8] = 2520;
		}
	
	public static void startCalc_Enchanter_SpeedOfTheShissar() // 20 minutes
	
	{
		SpellTimers.spellTimersEnchanter[11][9] = 1200;
	}
	
	// SELF ONLY HP/AC BUFFS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_MinorShielding() // 27 minutes
		
		{
			SpellTimers.spellTimersEnchanter[12][1] = 1620;
		}
	
	public static void startCalc_Enchanter_LesserShielding() // 24 minutes @L8 to 27 minutes @L9
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
		SpellTimers.spellTimersEnchanter[12][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Shielding() // 36 mins
	{
		SpellTimers.spellTimersEnchanter[12][3] = 2160;
	}
	
	public static void startCalc_Enchanter_MajorShielding() // 45 mins
	{
		SpellTimers.spellTimersEnchanter[12][4] = 2700;
	}
	
	public static void startCalc_Enchanter_GreaterShielding() // 54 mins
	{
		SpellTimers.spellTimersEnchanter[12][5] = 3240;
	}
	
	public static void startCalc_Enchanter_ArchShielding() // 72 mins
	{
		SpellTimers.spellTimersEnchanter[12][6] = 4320;
	}
	
	public static void startCalc_Enchanter_ShieldOfTheMagi() // 90 mins
	{
		SpellTimers.spellTimersEnchanter[12][7] = 5400;
	}
	
	// AC BUFFS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Haze() // 12 minutes @L4 to 27 minutes @L9
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
		SpellTimers.spellTimersEnchanter[13][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Mist() // 27 mins
	{
		SpellTimers.spellTimersEnchanter[13][2] = 1620;
	}
	
	public static void startCalc_Enchanter_Cloud() // 36 mins
	{
		SpellTimers.spellTimersEnchanter[13][3] = 2160;
	}
	
	public static void startCalc_Enchanter_Obscure() // 45 mins
	{
		SpellTimers.spellTimersEnchanter[13][4] = 2700;
	}
	
	public static void startCalc_Enchanter_Shade() // 72 mins
	{
		SpellTimers.spellTimersEnchanter[13][5] = 4320;
	}
	
	public static void startCalc_Enchanter_Shadow() // 90 mins
	{
		SpellTimers.spellTimersEnchanter[13][6] = 5400;
	}
	
	public static void startCalc_Enchanter_Umbra() // 99 mins
	{
		SpellTimers.spellTimersEnchanter[13][7] = 5940;
	}
	
	// MANA REGEN -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Breeze() // 27 mins
	{
		SpellTimers.spellTimersEnchanter[14][1] = 1620;
	}
	
	public static void startCalc_Enchanter_Clarity() // 27 mins
	{
		SpellTimers.spellTimersEnchanter[14][2] = 1620;
	}
	
	public static void startCalc_Enchanter_BoonOfTheClearMind() // 27 mins
	{
		SpellTimers.spellTimersEnchanter[14][3] = 1620;
	}
	
	public static void startCalc_Enchanter_ClarityII() // 35 mins
	{
		SpellTimers.spellTimersEnchanter[14][4] = 2100;
	}
	
	public static void startCalc_Enchanter_GiftOfInsight() // 75 mins
	{
		SpellTimers.spellTimersEnchanter[14][5] = 4500;
	}
	
	public static void startCalc_Enchanter_GiftOfPureThought() // 33 mins
	{
		SpellTimers.spellTimersEnchanter[14][6] = 1980;
	}
	
	public static void startCalc_Enchanter_GiftOfBrilliance() // 100 mins
	{
		SpellTimers.spellTimersEnchanter[14][7] = 6000;
	}
	
	// STRENGTH BUFFS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Strengthen() // 27 mins
	{
		SpellTimers.spellTimersEnchanter[15][1] = 1620;
	}
	
	public static void startCalc_Enchanter_BerserkerStrength() // 2 minutes @L20 to 3 minutes @L30
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 31)
			{
				currentSpellDuration = (level);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersEnchanter[15][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Rampage() // 3.9 minutes @L39 to 6.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[15][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_BerserkerSpirit() // 4.9 minutes @L49 to 5 minutes @L50
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 51)
			{
				currentSpellDuration = (level);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersEnchanter[15][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Bedlam() // 6.8 minutes @L58 to 7.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[15][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// RUNES/RESIST -----------------------------------------------------------
	
	public static void startCalc_Enchanter_RuneI() // 36 min
	{
		SpellTimers.spellTimersEnchanter[16][1] = 2160;
	}
	
	public static void startCalc_Enchanter_RuneII() // 54 min
	{
		SpellTimers.spellTimersEnchanter[16][2] = 3240;
	}
	
	public static void startCalc_Enchanter_RuneIII() // 72 min
	{
		SpellTimers.spellTimersEnchanter[16][3] = 4320;
	}
	
	public static void startCalc_Enchanter_RuneIV() // 90 min
	{
		SpellTimers.spellTimersEnchanter[16][4] = 5400;
	}
	
	public static void startCalc_Enchanter_RuneV() // 110 min
	{
		SpellTimers.spellTimersEnchanter[16][5] = 6600;
	}
	
	public static void startCalc_Enchanter_EndureMagic() // 27 min
	{
		SpellTimers.spellTimersEnchanter[16][6] = 1620;
	}
	
	public static void startCalc_Enchanter_ResistMagic() // 36 min
	{
		SpellTimers.spellTimersEnchanter[16][7] = 2160;
	}
	
	public static void startCalc_Enchanter_GroupResistMagic() // 36 min
	{
		SpellTimers.spellTimersEnchanter[16][8] = 2160;
	}
	
	// MISC BUFFS -----------------------------------------------------------
	
	public static void startCalc_Enchanter_Insight() // 40 min
	{
		SpellTimers.spellTimersEnchanter[17][1] = 2400;
	}
	
	public static void startCalc_Enchanter_Brilliance() // 40 min
	{
		SpellTimers.spellTimersEnchanter[17][2] = 2400;
	}
	
	public static void startCalc_Enchanter_Enlightenment() // 60 min
	{
		SpellTimers.spellTimersEnchanter[17][3] = 3600;
	}
	
	public static void startCalc_Enchanter_EnduringBreath() // 27 min
	{
		SpellTimers.spellTimersEnchanter[17][4] = 1620;
	}
	
	public static void startCalc_Enchanter_SerpentSight() // 27 min
	{
		SpellTimers.spellTimersEnchanter[17][5] = 1620;
	}
	
	public static void startCalc_Enchanter_Ultravision() // 36 min
	{
		SpellTimers.spellTimersEnchanter[17][6] = 2160;
	}
	
	public static void startCalc_Enchanter_Levitate() // 5.2 minutes @L14 to 20.5 minutes @L65
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
		SpellTimers.spellTimersEnchanter[17][7] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_Feedback() // 1.7 minutes @L29 to 3.9 minutes @L65
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
		SpellTimers.spellTimersEnchanter[17][8] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Enchanter_SympatheticAura() // 36 min
	{
		SpellTimers.spellTimersEnchanter[17][9] = 2160;
	}
	
	public static void startCalc_Enchanter_RadiantVisage() // 36 min
	{
		SpellTimers.spellTimersEnchanter[17][10] = 2160;
	}
	
	public static void startCalc_Enchanter_AdorningGrace() // 72 min
	{
		SpellTimers.spellTimersEnchanter[17][11] = 4320;
	}
	
	public static void startCalc_Enchanter_OverwhelmingSplendor() // 81 min
	{
		SpellTimers.spellTimersEnchanter[17][12] = 4860;
	}
}
