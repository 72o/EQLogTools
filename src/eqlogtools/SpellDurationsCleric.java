package eqlogtools;

public class SpellDurationsCleric {
	
	static long[][] currentSpellDurationArray = new long[1][66];
	
	// LULL ------------------------------------
	
	public static void startCalc_Cleric_Lull() // 1.2 minutes @L1 to 2 minutes @L5
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
		SpellTimers.spellTimersCleric[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Cleric_Soothe() // 1.8 minutes @L8 to 2.5 minutes @L15
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
		SpellTimers.spellTimersCleric[0][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Cleric_Calm() // 2.9 minutes @L19 to 3.0 minutes @L20
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
		SpellTimers.spellTimersCleric[0][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Cleric_Pacify() // 7 ticks
	{
		SpellTimers.spellTimersCleric[0][4] = 42;
	}
	
	// HP/AC BUFFS ------------------------------------
	
	public static void startCalc_Cleric_Courage() // 27 mins
	{
		SpellTimers.spellTimersCleric[1][1] = 1620;
	}
	
	public static void startCalc_Cleric_Center() // 27 mins
	{
		SpellTimers.spellTimersCleric[1][2] = 1620;
	}
	
	public static void startCalc_Cleric_Daring() // 36 mins
	{
		SpellTimers.spellTimersCleric[1][3] = 2160;
	}
	
	public static void startCalc_Cleric_Bravery() // 45 mins
	{
		SpellTimers.spellTimersCleric[1][4] = 2700;
	}
	
	public static void startCalc_Cleric_ArmorOfProtection() // 1 hour 42 minutes @L34 to 2 hours 24 minutes @L48
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
		SpellTimers.spellTimersCleric[1][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Cleric_Valor() // 54 mins
	{
		SpellTimers.spellTimersCleric[1][6] = 3240;
	}
	
	public static void startCalc_Cleric_Resolution() // 63 mins
	{
		SpellTimers.spellTimersCleric[1][7] = 3780;
	}
	
	public static void startCalc_Cleric_HeroicBond() // 72 mins
	{
		SpellTimers.spellTimersCleric[1][8] = 4320;
	}
	
	public static void startCalc_Cleric_Heroism() // 72 mins
	{
		SpellTimers.spellTimersCleric[1][9] = 4320;
	}
	
	public static void startCalc_Cleric_Fortitude() // 144 mins
	{
		SpellTimers.spellTimersCleric[1][10] = 8640;
	}
	
	public static void startCalc_Cleric_Aegolism() // 150 mins
	{
		SpellTimers.spellTimersCleric[1][11] = 9000;
	}
	
	// SYMBOLS ----------------------------------------
	
	public static void startCalc_Cleric_SymbolOfTransal() // 27 mins
	{
		SpellTimers.spellTimersCleric[2][1] = 1620;
	}
	
	public static void startCalc_Cleric_SymbolOfRyltan() // 36 mins
	{
		SpellTimers.spellTimersCleric[2][2] = 2160;
	}
	
	public static void startCalc_Cleric_SymbolOfPinzarn() // 45 mins
	{
		SpellTimers.spellTimersCleric[2][3] = 2700;
	}
	
	public static void startCalc_Cleric_SymbolOfNaltron() // 54 mins
	{
		SpellTimers.spellTimersCleric[2][4] = 3240;
	}
	
	public static void startCalc_Cleric_SymbolOfMarzin() // 63 mins
	{
		SpellTimers.spellTimersCleric[2][5] = 3780;
	}
	
	public static void startCalc_Cleric_NaltronsMark() // 54 mins
	{
		SpellTimers.spellTimersCleric[2][6] = 3240;
	}
	
	// AC BUFFS ----------------------------------------
	
	public static void startCalc_Cleric_HolyArmor() // 15 minutes @L5 to 27 minutes @L9
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
		SpellTimers.spellTimersCleric[3][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Cleric_SpiritArmor() // 36 mins
	{
		SpellTimers.spellTimersCleric[3][2] = 2160;
	}
	
	public static void startCalc_Cleric_Guard() // 45 mins
	{
		SpellTimers.spellTimersCleric[3][3] = 2700;
	}
	
	public static void startCalc_Cleric_ArmorOfFaith() // 63 mins
	{
		SpellTimers.spellTimersCleric[3][4] = 3780;
	}
	
	public static void startCalc_Cleric_ShieldOfWords() // 72 mins
	{
		SpellTimers.spellTimersCleric[3][5] = 4320;
	}
	
	public static void startCalc_Cleric_Aegis() // 144 mins
	{
		SpellTimers.spellTimersCleric[3][6] = 8640;
	}
	
	public static void startCalc_Cleric_BulwarkOfFaith() // 81 mins
	{
		SpellTimers.spellTimersCleric[3][7] = 4860;
	}
	
	// INVULN -------------------------------
	
	public static void startCalc_Cleric_DivineAura() // 18s
	{
		SpellTimers.spellTimersCleric[4][1] = 18;
	}
	
	public static void startCalc_Cleric_DivineBarrier() // 18s
	{
		SpellTimers.spellTimersCleric[4][2] = 18;
	}
	
	// RESIST BUFFS ---------------------------------
	
	public static void startCalc_Cleric_EndureFire() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersCleric[5][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Cleric_EndurePoison() // 27 mins
	{
		SpellTimers.spellTimersCleric[5][2] = 1620;
	}
	
	public static void startCalc_Cleric_EndureCold() // 3 minutes @L1 to 27 minutes @L9
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
		SpellTimers.spellTimersCleric[5][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Cleric_EndureDisease() // 27 mins
	{
		SpellTimers.spellTimersCleric[5][4] = 1620;
	}
	
	public static void startCalc_Cleric_EndureMagic() // 27 mins
	{
		SpellTimers.spellTimersCleric[5][5] = 1620;
	}
	
	public static void startCalc_Cleric_ResistFire() // 36 mins
	{
		SpellTimers.spellTimersCleric[5][6] = 2160;
	}
	
	public static void startCalc_Cleric_ResistPoison() // 36 mins
	{
		SpellTimers.spellTimersCleric[5][7] = 2160;
	}
	
	public static void startCalc_Cleric_ResistCold() // 36 mins
	{
		SpellTimers.spellTimersCleric[5][8] = 2160;
	}
	
	public static void startCalc_Cleric_ResistDisease() // 36 mins
	{
		SpellTimers.spellTimersCleric[5][9] = 2160;
	}
	
	public static void startCalc_Cleric_ResistMagic() // 36 mins
	{
		SpellTimers.spellTimersCleric[5][10] = 2160;
	}
	
	// DOT HEALS --------------------------------------
	
	public static void startCalc_Cleric_CelestialHealing() // 24s
	{
		SpellTimers.spellTimersCleric[6][1] = 24;
	}
	
	public static void startCalc_Cleric_CelestialElixir() // 24s
	{
		SpellTimers.spellTimersCleric[6][2] = 24;
	}
	
	// MISC 1 -----------------------------------------
	
	public static void startCalc_Cleric_RecklessStrength() // 180s
	{
		SpellTimers.spellTimersCleric[7][1] = 180;
	}
	
	public static void startCalc_Cleric_FrenziedStrength() // 180s
	{
		SpellTimers.spellTimersCleric[7][2] = 180;
	}
	
	// MISC 2 -----------------------------------------
	
	public static void startCalc_Cleric_MarkOfKarn() // 210s
	{
		SpellTimers.spellTimersCleric[8][1] = 210;
	}
	
	public static void startCalc_Cleric_DivineIntervention() // 600s
	{
		SpellTimers.spellTimersCleric[8][2] = 600;
	}
	
	// MISC 3 -----------------------------------------
	
	public static void startCalc_Cleric_ImprovedInvisibilityToUndead() // 600s
	{
		SpellTimers.spellTimersCleric[9][1] = 600;
	}
}


