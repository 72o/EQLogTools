package eqlogtools;

public class SpellDurationsPaladin {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// LULL SPELLS ------------------------------------------------
	
	public static void startCalc_Paladin_Lull() // 1.2 minutes @L1 to 2 minutes @L5
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
		SpellTimers.spellTimersPaladin[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Paladin_Soothe() // 1.8 minutes @L8 to 2.5 minutes @L15
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
		SpellTimers.spellTimersPaladin[0][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Paladin_Calm() // 2.9 minutes @L19 to 3.0 minutes @L20
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
		SpellTimers.spellTimersPaladin[0][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Paladin_Pacify() // 7 ticks
	{
		SpellTimers.spellTimersPaladin[0][4] = 42;
	}
	
	// ------------------------------------------
	
	public static void startCalc_Paladin_Courage() // 27 min
	{
		SpellTimers.spellTimersPaladin[1][1] = 1620;
	}
	
	public static void startCalc_Paladin_Center() // 27 min
	{
		SpellTimers.spellTimersPaladin[1][2] = 1620;
	}
	
	public static void startCalc_Paladin_Daring() // 36 min
	{
		SpellTimers.spellTimersPaladin[1][3] = 2160;
	}
	
	public static void startCalc_Paladin_Valor() // 54 min
	{
		SpellTimers.spellTimersPaladin[1][4] = 3240;
	}
	
	public static void startCalc_Paladin_Resolution() // 63 min
	{
		SpellTimers.spellTimersPaladin[1][5] = 3780;
	}
	
	// SYMBOLS ----------------------------------
	
	public static void startCalc_Paladin_SymbolOfTransal() // 27 min
	{
		SpellTimers.spellTimersPaladin[2][1] = 1620;
	}
	
	public static void startCalc_Paladin_SymbolOfRyltan() // 36 min
	{
		SpellTimers.spellTimersPaladin[2][2] = 2160;
	}
	
	public static void startCalc_Paladin_SymbolOfPinzarn() // 45 min
	{
		SpellTimers.spellTimersPaladin[2][3] = 2700;
	}
	
	public static void startCalc_Paladin_SymbolOfNaltron() // 54 min
	{
		SpellTimers.spellTimersPaladin[2][4] = 3240;
	}
	
	// AC BUFFS ---------------------------------
	
	public static void startCalc_Paladin_HolyArmor() // 15 minutes @L5 to 27 minutes @L9
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
		SpellTimers.spellTimersPaladin[3][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Paladin_SpiritArmor() // 36 min
	{
		SpellTimers.spellTimersPaladin[3][2] = 2160;
	}
	
	public static void startCalc_Paladin_Guard() // 45 min
	{
		SpellTimers.spellTimersPaladin[3][3] = 2700;
	}
	
	public static void startCalc_Paladin_ArmorOfFaith() // 63 min
	{
		SpellTimers.spellTimersPaladin[3][4] = 3780;
	}
	
	public static void startCalc_Paladin_ShieldOfWords() // 72 min
	{
		SpellTimers.spellTimersPaladin[3][5] = 4320;
	}
	
	// RESIST BUFFS ----------------------------------
	
	public static void startCalc_Paladin_EndurePoison() // 27 min
	{
		SpellTimers.spellTimersPaladin[4][1] = 1620;
	}
	
	public static void startCalc_Paladin_EndureDisease() // 27 min
	{
		SpellTimers.spellTimersPaladin[4][2] = 1620;
	}
	
	// STRENGTH BUFFS ---------------------------------
	
	public static void startCalc_Paladin_RecklessStrength() // 3 min
	{
		SpellTimers.spellTimersPaladin[5][1] = 180;
	}
	
	public static void startCalc_Paladin_FrenziedStrength() // 3 min
	{
		SpellTimers.spellTimersPaladin[5][2] = 180;
	}
	
	// YAULP ------------------------------------------
	
	public static void startCalc_Paladin_Yaulp() // 4 ticks
	{
		SpellTimers.spellTimersPaladin[6][1] = 24;
	}
	
	public static void startCalc_Paladin_YaulpII() // 4 ticks
	{
		SpellTimers.spellTimersPaladin[6][2] = 24;
	}
	
	public static void startCalc_Paladin_YaulpIII() // 4 ticks
	{
		SpellTimers.spellTimersPaladin[6][3] = 24;
	}
	
	public static void startCalc_Paladin_YaulpIV() // 4 ticks
	{
		SpellTimers.spellTimersPaladin[6][4] = 24;
	}
	
	// INVIS TO UNDEAD --------------------------------
	
	public static void startCalc_Paladin_InvisibilityVersusUndead() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersPaladin[7][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// INVULN ----------------------------------------
	
	public static void startCalc_Paladin_DivineAura() // 3 ticks
	{
		SpellTimers.spellTimersPaladin[8][1] = 18;
	}
	// MISC 1 ----------------------------------------
	
	public static void startCalc_Paladin_DivineMight() // 1 hr
	{
		SpellTimers.spellTimersPaladin[9][1] = 3600;
	}
	
	// MISC 2 ----------------------------------------
	
	public static void startCalc_Paladin_DivineFavor() // 5 mins
	{
		SpellTimers.spellTimersPaladin[10][1] = 300;
	}
	
	// MISC 3 ----------------------------------------
	
	public static void startCalc_Paladin_DivineStrength() // 50 mins
	{
		SpellTimers.spellTimersPaladin[11][1] = 3000;
	}
	
	// MISC 4 ----------------------------------------
	
	public static void startCalc_Paladin_DivinePurpose() // 15 mins
	{
		SpellTimers.spellTimersPaladin[12][1] = 900;
	}
	
	// MISC 5 ----------------------------------------
	
	public static void startCalc_Paladin_CelestialCleansing() // 4 ticks
	{
		SpellTimers.spellTimersPaladin[13][1] = 24;
	}
}
