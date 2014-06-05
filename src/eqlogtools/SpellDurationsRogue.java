package eqlogtools;

public class SpellDurationsRogue {

	static long[][] currentSpellDurationArray = new long[1][66];
	
	public static void startCalc_Rogue_ResistantDiscipline() // 60s
	{
		SpellTimers.spellTimersRogue[0][1] = 60;
	}
	
	public static void startCalc_Rogue_FearlessDiscipline() // 11s
	{
		SpellTimers.spellTimersRogue[1][1] = 11;
	}
	
	public static void startCalc_Rogue_CounterattackDiscipline() // 12s
	{
		SpellTimers.spellTimersRogue[2][1] = 12;
	}
	
	public static void startCalc_Rogue_DeadeyeDiscipline() // 18s
	{
		SpellTimers.spellTimersRogue[3][1] = 18;
	}
	
	public static void startCalc_Rogue_NimbleDiscipline() // 12s
	{
		SpellTimers.spellTimersRogue[4][1] = 12;
	}
	
	public static void startCalc_Rogue_KinestheticsDiscipline() // 18s
	{
		SpellTimers.spellTimersRogue[5][1] = 18;
	}
	
	public static void startCalc_Rogue_BlindingSpeedDiscipline() // 18s
	{
		SpellTimers.spellTimersRogue[6][1] = 18;
	}
	
	public static void startCalc_Rogue_DuelistDiscipline() // 12s
	{
		SpellTimers.spellTimersRogue[7][1] = 12;
	}
}
