package eqlogtools;

public class SpellDurationsWarrior {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	public static void startCalc_Warrior_ResistantDiscipline() // 60s
	{
		SpellTimers.spellTimersWarrior[0][1] = 60;
	}
	
	public static void startCalc_Warrior_FearlessDiscipline() // 11s
	{
		SpellTimers.spellTimersWarrior[1][1] = 11;
	}
	
	public static void startCalc_Warrior_EvasiveDiscipline() // 180s
	{
		SpellTimers.spellTimersWarrior[2][1] = 180;
	}
	
	public static void startCalc_Warrior_ChargeDiscipline() // 14s
	{
		SpellTimers.spellTimersWarrior[3][1] = 14;
	}
	
	public static void startCalc_Warrior_MightyStrikeDiscipline() // 10s
	{
		SpellTimers.spellTimersWarrior[4][1] = 10;
	}
	
	public static void startCalc_Warrior_DefensiveDiscipline() // 180s
	{
		SpellTimers.spellTimersWarrior[5][1] = 180;
	}
	
	public static void startCalc_Warrior_FuriousDiscipline() // 9s
	{
		SpellTimers.spellTimersWarrior[6][1] = 9;
	}
	
	public static void startCalc_Warrior_PrecisionDiscipline() // 180s
	{
		SpellTimers.spellTimersWarrior[7][1] = 180;
	}
	
	public static void startCalc_Warrior_FellstrikeDiscipline() // 12s
	{
		SpellTimers.spellTimersWarrior[8][1] = 12;
	}
	
	public static void startCalc_Warrior_FortitudeDiscipline() // 8s
	{
		SpellTimers.spellTimersWarrior[9][1] = 8;
	}
	
	public static void startCalc_Warrior_AggressiveDiscipline() // 180s
	{
		SpellTimers.spellTimersWarrior[10][1] = 180;
	}
}
