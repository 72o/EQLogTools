package eqlogtools;

public class SpellDurationsMonk {
	
	static long[][] currentSpellDurationArray = new long[1][66];
	
	public static void startCalc_Monk_ResistantDiscipline() // 60s
	{
		SpellTimers.spellTimersMonk[0][1] = 60;
	}
	
	public static void startCalc_Monk_FearlessDiscipline() // 11s
	{
		SpellTimers.spellTimersMonk[1][1] = 11;
	}
	
	public static void startCalc_Monk_StonestanceDiscipline() // 12s
	{
		SpellTimers.spellTimersMonk[2][1] = 12;
	}
	
	public static void startCalc_Monk_WhirlwindDiscipline() // 9s
	{
		SpellTimers.spellTimersMonk[3][1] = 9;
	}
	
	public static void startCalc_Monk_VoiddanceDiscipline() // 8s
	{
		SpellTimers.spellTimersMonk[4][1] = 8;
	}
	
	public static void startCalc_Monk_InnerFlameDiscipline() // 12s
	{
		SpellTimers.spellTimersMonk[5][1] = 12;
	}
	
	public static void startCalc_Monk_HundredFistsDiscipline() // 15s
	{
		SpellTimers.spellTimersMonk[6][1] = 15;
	}
}
