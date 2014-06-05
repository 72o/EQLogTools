package eqlogtools;

public class SpellDurationsWizard {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	// SNARES ------------
	
	public static void startCalc_Wizard_BondsOfForce() // 1.4 minutes @L29 to 2 minutes @L40
	{
		double currentSpellDuration = 0; 
		int level = 1;
		long currentSpellDurationInSeconds;
		int arrayIndexIncrementer = 0;
		while (level <= 66)
		{
			if (level < 41)
			{
				currentSpellDuration = (level / 2);
			}
			currentSpellDurationInSeconds = Math.round(currentSpellDuration);
			currentSpellDurationInSeconds = ((currentSpellDurationInSeconds * 6));
			currentSpellDurationArray[0][arrayIndexIncrementer] = currentSpellDurationInSeconds;
			arrayIndexIncrementer++;
			level++;
		}
		SpellTimers.spellTimersWizard[0][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Wizard_AtolsSpectralShackles() // 2.5 mins
	{
		SpellTimers.spellTimersWizard[0][2] = 150;
	}
	
	// STUNS --------------
	
	public static void startCalc_Wizard_TishansClash() // 5s
	{
		SpellTimers.spellTimersWizard[1][1] = 5;
	}
	
	public static void startCalc_Wizard_MarkarsClash() // 8s
	{
		SpellTimers.spellTimersWizard[1][2] = 8;
	}
	
	public static void startCalc_Wizard_TishansDiscord() // 5s
	{
		SpellTimers.spellTimersWizard[1][3] = 5;
	}
	
	public static void startCalc_Wizard_Thunderbold() // 3s
	{
		SpellTimers.spellTimersWizard[1][4] = 3;
	}
	
	public static void startCalc_Wizard_MarkarsDiscord() // 8s
	{
		SpellTimers.spellTimersWizard[1][5] = 8;
	}
	
	// SHIELDING --------------
	
	public static void startCalc_Wizard_MinorShielding() // 27 minutes
	
	{
		SpellTimers.spellTimersWizard[2][1] = 1620;
	}

	public static void startCalc_Wizard_LesserShielding() // 24 minutes @L8 to 27 minutes @L9
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
		SpellTimers.spellTimersWizard[2][2] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Wizard_Shielding() // 36 mins
	{
		SpellTimers.spellTimersWizard[2][3] = 2160;
	}
	
	public static void startCalc_Wizard_MajorShielding() // 45 mins
	{
		SpellTimers.spellTimersWizard[2][4] = 2700;
	}
	
	public static void startCalc_Wizard_GreaterShielding() // 54 mins
	{
		SpellTimers.spellTimersWizard[2][5] = 3240;
	}
	
	public static void startCalc_Wizard_ArchShielding() // 72 mins
	{
		SpellTimers.spellTimersWizard[2][6] = 4320;
	}
	
	public static void startCalc_Wizard_ShieldOfTheMagi() // 90 mins
	{
		SpellTimers.spellTimersWizard[2][7] = 5400;
	}
	
	// SKIN BUFFS -----------
	
	public static void startCalc_Wizard_Shieldskin() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersWizard[3][1] = 2160;
	}
	
	public static void startCalc_Wizard_Leatherskin() // Fixed duration, 54 minutes
	{
		SpellTimers.spellTimersWizard[3][2] = 3240;
	}
	
	public static void startCalc_Wizard_Steelskin() // Fixed duration, 72 minutes
	{
		SpellTimers.spellTimersWizard[3][3] = 4320;
	}
	
	public static void startCalc_Wizard_Diamondskin() // Fixed duration, 90 minutes
	{
		SpellTimers.spellTimersWizard[3][4] = 5400;
	}
	
	public static void startCalc_Wizard_Manaskin() // Fixed duration, 120 minutes
	{
		SpellTimers.spellTimersWizard[3][5] = 7200;
	}
	
	public static void startCalc_Wizard_BarrierOfForce() // Fixed duration, 100 minutes
	{
		SpellTimers.spellTimersWizard[3][6] = 6000;
	}
	
	// MISC 1 -----------
	
	public static void startCalc_Wizard_Manasink() // Fixed duration, 72 minutes
	{
		SpellTimers.spellTimersWizard[4][1] = 4320;
	}
	
	// DS ----------------
	
	public static void startCalc_Wizard_OKeilsFlickeringFlame() // Fixed duration, 5 minutes
	{
		SpellTimers.spellTimersWizard[5][1] = 300;
	}
	
	// RESISTS -------------
	
	public static void startCalc_Wizard_ResistantSkin() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersWizard[6][1] = 1620;
	}
	
	public static void startCalc_Wizard_ElementalShield() // Fixed duration, 27 minutes
	{
		SpellTimers.spellTimersWizard[6][2] = 1620;
	}
	
	public static void startCalc_Wizard_ElementalArmor() // Fixed duration, 36 minutes
	{
		SpellTimers.spellTimersWizard[6][3] = 2160;
	}
	
	// EYES -------------
	
	public static void startCalc_Wizard_EyeOfZomm() // Fixed duration, 30s
	{
		SpellTimers.spellTimersWizard[7][1] = 30;
	}
	
	public static void startCalc_Wizard_EyeOfTallon() // Fixed duration, 60s
	{
		SpellTimers.spellTimersWizard[7][2] = 60;
	}
	
	// INVIS ------------
	
	public static void startCalc_Wizard_ImprovedInvisibility() // Fixed duration, 10 mins
	{
		SpellTimers.spellTimersWizard[8][1] = 600;
	}
	
	// MISC --------------
	
	public static void startCalc_Wizard_Levitate() // 5.2 minutes @L14 to 20.5 minutes @L65
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
		SpellTimers.spellTimersWizard[9][1] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	// VISION ------------
	
	public static void startCalc_Wizard_SeeInvisible() // 27 mins
	{
		SpellTimers.spellTimersWizard[10][1] = 1620;
	}
	
	public static void startCalc_Wizard_ChillSight() // 36 mins
	{
		SpellTimers.spellTimersWizard[10][2] = 2160;
	}
	
	public static void startCalc_Wizard_ShiftingSight() // 7 minutes @L20 to 20.5 minutes @L65
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
		SpellTimers.spellTimersWizard[10][3] = currentSpellDurationArray[0][EQLogToolsGUI.selectedLevel];
	}
	
	public static void startCalc_Wizard_Plainsight() // 72 mins
	{
		SpellTimers.spellTimersWizard[10][4] = 4320;
	}
	
	public static void startCalc_Wizard_HeatSight() // 27 mins
	{
		SpellTimers.spellTimersWizard[10][5] = 1620;
	}
	
}
