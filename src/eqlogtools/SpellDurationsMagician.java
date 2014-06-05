package eqlogtools;

public class SpellDurationsMagician {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// MALO -------------------------------------
	
	public static void startCalc_Magician_Malaise() // 4.8 minutes @L19 to 14 minutes @L65
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
		SpellTimers.spellTimersMagician[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_Malaisement() // 7.8 minutes @L34 to 14 minutes @L65
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
		SpellTimers.spellTimersMagician[0][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_Malosi() // 10.8 minutes @L49 to 14 minutes @L65
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
		SpellTimers.spellTimersMagician[0][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_Malosini() // 18.1 minutes @L57 to 20.5 minutes @L65
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
		SpellTimers.spellTimersMagician[0][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_Mala() // 13 minutes @L60
	{
		SpellTimers.spellTimersMagician[0][5] = 3600;
	}
	
	// DAMAGE SHIELDS -----------------------------
	
	public static void startCalc_Magician_ShieldOfFire() // 8 ticks @L8 to 6.5 minutes @L65
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
		SpellTimers.spellTimersMagician[1][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_ShieldOfFlame() // 2 minutes @L20 to 6.5 minutes @L65
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
		SpellTimers.spellTimersMagician[1][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_InfernoShield() // 1.7 minutes @L29 to 3.9 minutes @L65
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
		SpellTimers.spellTimersMagician[1][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_BarrierOfCombustion() // 2.3 minutes @L39 to 3.9 minutes @L65
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
		SpellTimers.spellTimersMagician[1][4] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_ShieldOfLava() // 4.9 minutes @L49 to 6.5 minutes @L65
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
		SpellTimers.spellTimersMagician[1][5] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_BoonOfImmolation() // 6.3 minutes @L53 to 7.5 minutes @L65
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
		SpellTimers.spellTimersMagician[1][6] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_CadeauOfFlame() // 6.6 minutes @L56 to 7.5 minutes @L65
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
		SpellTimers.spellTimersMagician[1][7] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_AegisOfRo() // 7 mins
	{
		SpellTimers.spellTimersMagician[1][8] = 420;
	}
	
	// SHIELDS ------------------------------------------
	
	public static void startCalc_Magician_MinorShielding() // 27 minutes
	
	{
		SpellTimers.spellTimersMagician[2][1] = 1620;
	}

	public static void startCalc_Magician_LesserShielding() // 24 minutes @L8 to 27 minutes @L9
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
		SpellTimers.spellTimersMagician[2][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_Shielding() // 36 mins
	{
		SpellTimers.spellTimersMagician[2][3] = 2160;
	}
	
	public static void startCalc_Magician_MajorShielding() // 45 mins
	{
		SpellTimers.spellTimersMagician[2][4] = 2700;
	}
	
	public static void startCalc_Magician_GreaterShielding() // 54 mins
	{
		SpellTimers.spellTimersMagician[2][5] = 3240;
	}
	
	public static void startCalc_Magician_ArchShielding() // 72 mins
	{
		SpellTimers.spellTimersMagician[2][6] = 4320;
	}
	
	public static void startCalc_Magician_ShieldOfTheMagi() // 90 mins
	{
		SpellTimers.spellTimersMagician[2][7] = 5400;
	}
	
	// PET BUFFS 1 ------------------------------
	
	public static void startCalc_Magician_Burnout() // 15 mins
	{
		SpellTimers.spellTimersMagician[3][1] = 900;
	}
	
	public static void startCalc_Magician_BurnoutII() // 9.7 minutes @L29 to 15 minutes @L47
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 48)
			{
				currentSpellDuration = ((level * 3) + 10);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersMagician[3][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Magician_BurnoutIII() // 15 mins
	{
		SpellTimers.spellTimersMagician[3][3] = 900;
	}
	
	public static void startCalc_Magician_BurnoutIV() // 15 mins
	{
		SpellTimers.spellTimersMagician[3][4] = 900;
	}
	
	// PET BUFFS 2 ---------------------------------
	
	public static void startCalc_Magician_Expedience() // 12 mins
	{
		SpellTimers.spellTimersMagician[4][1] = 720;
	}
	
	public static void startCalc_Magician_Velocity() // 36 mins
	{
		SpellTimers.spellTimersMagician[4][2] = 2160;
	}
	
	// SELF BUFFS ----------------------------------
	
	public static void startCalc_Magician_PhantomLeather() // 45 mins
	{
		SpellTimers.spellTimersMagician[5][1] = 2700;
	}
	
	public static void startCalc_Magician_PhantomChain() // 55 mins
	{
		SpellTimers.spellTimersMagician[5][2] = 3300;
	}
	
	public static void startCalc_Magician_PhantomPlate() // 72 mins
	{
		SpellTimers.spellTimersMagician[5][3] = 4320;
	}
	
	public static void startCalc_Magician_PhantomArmor() // 90 mins
	{
		SpellTimers.spellTimersMagician[5][4] = 5400;
	}
	
	// MISC BUFFS
	
	public static void startCalc_Magician_SeeInvisible() // 27 mins
	{
		SpellTimers.spellTimersMagician[6][1] = 1620;
	}
	
	public static void startCalc_Magician_ElementalShield() // 27 mins
	{
		SpellTimers.spellTimersMagician[6][2] = 1620;
	}
	
	// DOTS -----------------------------------------
	
	public static void startCalc_Magician_ElementalMaelstrom() // 5 ticks
	{
		SpellTimers.spellTimersMagician[7][1] = 30;
	}
	
	public static void startCalc_Magician_WrathOfTheElements() // 5 ticks
	{
		SpellTimers.spellTimersMagician[7][2] = 30;
	}
}
