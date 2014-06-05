package eqlogtools;

import java.util.Arrays;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class ClassHandler {

	public static ImageIcon iconName;
	
	public static void getSpellType(String spellName)
	{
		String shield_normIcon[] = 
			{"Courage", "Center", "Daring", "Bravery", "Armor of Protection", 
			"Valor", "Resolution", "Heroic Bond", "Heroism", "Fortitude", "Aegolism",
			"Symbol of Transal", "Symbol of Ryltan", "Symbol of Pinzarn",
			"Symbol of Naltron", "Symbol of Marzin", "Naltron's Mark",
			"Divine Aura", "Divine Barrier", "Endure Fire", "Endure Poison",
			"Endure Cold", "Endure Disease", "Endure Magic", "Resist Fire",
			"Resist Poison", "Resist Cold", "Resist Disease", "Resist Magic",
			"Skin like Wood", "Skin like Rock", "Skin like Steel", "Skin like Diamond",
			"Skin like Nature", "Natureskin", "Protection of the Glades",
			"Thistlecoat", "Barbcoat", "Bramblecoat", "Spikecoat", "Thorncoat",
			"Bladecoat", "Minor Shielding", "Lesser Shielding", "Shielding",
			"Major Shielding", "Greater Shielding", "Arch Shielding", "Shield of the Magi",
			"Haze", "Mist", "Cloud", "Obscure", "Shade", "Shadow", "Umbra",
			"Rune I", "Rune II", "Rune III", "Rune IV", "Rune V",
			"Group Resist Magic", "Phantom Leather", "Phantom Chain", "Phantom Plate",
			"Phantom Armor", "Harmshield", "Quivering Veil of Xarn", "Spirit Armor",
			"Shieldskin", "Leatherskin", "Steelskin", "Diamondskin", "Manaskin",
			"Holy Armor", "Spirit Armor", "Guard", "Armor of Faith", "Shield of Words",
			"Inner Fire", "Talisman of Tnarg", "Talisman of Altuna", "Talisman of Kragg",
			"Focus of Spirit", "Scale Skin", "Turtle Skin", "Protect", "Shifting Shield",
			"Guardian", "Shroud of the Spirits", "Resistant Skin", "Elemental Shield",
			"Elemental Armor", "Manasink", "Sympathetic Aura", "Radiant Visage",
			"Overwhelming Splendor", "Glamour", "Spirit of Snake", "Alluring Aura",
			"Charisma", "Talisman of the Serpent", "Unfailing Reverence",
			"Talisman of Jasinth", "Talisman of Shadoo", "Barrier of Force",
			"Shadow Vortex", "Shroud of Pain"
			};
		
		String bootIcon[] =
			{"Snare", "Ensnare", "Bonds of Tunare", "Spirit of Wolf", "Pack Spirit",
			"Scale of Wolf", "Spirit of Cheetah", "Spirit of Scale", "Languid Pace",
			"Tepid Deeds", "Shiftless Deeds", "Forlorn Deeds", "Expedience", "Velocity",
			"Feet like Cat", "Spirit of Cat", "Nimble", "Agility", "Deliriously Nimble",
			"Talisman of the Cat", "Bonds of Force", "Atol's Spectral Shackles",
			"Drowsy", "Walking Sleep", "Tagar's Insects", "Togor's Insects",
			"Turgur's Insects", "Tigir's Insects"
			};
		
		String breathIcon[] =
			{"Enduring Breath", "Breath of the Dead"
			};
		
		String cycloneIcon[] =
			{"Levitate", "Whirl Till You Hurl", "Dyn`s Dizzying Draught",
			"Suffocating Sphere", "Choke", "Suffocate", "Gasping Embrace", "Asphyxiate",
			"Torment of Argli", "Feedback", "Elemental Maelstrom", "Wrath of the Elements"
			};
		
		String diseaseIcon[] =
			{"Disease Cloud", "Infectious Cloud", "Scourge", "Plague",
			"Sicken", "Affliction", "Pox of Bertoxxulous", "Insidious Fever",
			"Insidious Malady", "Insidious Decay"
			};
		
		String fireIcon[] =
			{"Flame Lick", "Immolate", "Breath of Ro", "Ro's Fiery Sundering",
			"Fixation of Ro", "Shield of Fire", "Shield of Flame", "Inferno Shield",
			"Barrier of Combustion", "Shield of Lava", "Boon of Immolation",
			"Cadeau of Flame", "Aegis of Ro", "Burnout", "Burnout II", "Burnout III",
			"Burnout IV", "Firefist", "O'Keils Flickering Flame", "Circle of Summer"
			};
		
		String hand_blueIcon[] =
			{"Mark of Karn", "Celestial Healing", "Celestial Elixir",
			"Regeneration", "Pack Regeneration", "Chloroplast",
			"Pack Chloroplast", "Regrowth", "Regrowth of the Grove",
			"Celestial Cleansing", "Call of Earth"
			};
		
		String hand_redIcon[] =
			{"Wrath of Nature", "Clinging Darkness", "Engulfing Darkness", "Dooming Darkness",
			"Cascading Darkness", "Devouring Darkness", "Torment of Shadows",
			"Heat Blood", "Boil Blood", "Ignite Blood", "Pyrocruor", "Banshee Aura"
			};
		
		String iceIcon[] =
			{"Circle of Winter"
			};
		
		String mind_blueIcon[] =
			{"Mask of the Hunter", "Wake of Tranquility", "Breeze", "Clarity",
			"Boon of the Clear Mind", "Clarity II", "Gift of Insight",
			"Gift of Pure Thought", "Gift of Brilliance", "Insight", "Brilliance",
			"Enlightenment"
			};
		
		String mind_redIcon[] =
			{"Harmony", "Mesmerize", "Enthrall", "Entrance", "Dazzle",
			"Glamour of Kintaz", "Rapture", "Mesmerization", "Fascination",
			"Largarn's Lamentation", "Color Flux", "Color Shift", "Color Skew",
			"Color Slant", "Lull", "Soothe", "Calm", "Pacify",
			"Numb the Dead", "Rest the Dead", "Call of Sky", "Call of Fire",
			"Tishan's Clash", "Markar's Clash", "Tishan's Discord", "Thunderbold",
			"Markar's Discord", "Calm Animal", "Lull Animal"
			};
		
		String poisonIcon[] =
			{"Poison Bolt", "Venom of the Snake", "Chilling Embrace", "Envenomed Bolt",
			"Tainted Breath", "Envenomed Breath", "Bane of Nife"
			};
		
		String sightIcon[] =
			{"Divine Intervention", "Improved Invisibility to Undead",
			"Invisibility versus Animals", "Improved Superior Camouflage",
			"See Invisible", "Serpent Sight", "Ultravision", "Deadeye", "Shadow Sight",
			"Skin of the Shadow", "Pact of Shadow", "Shadowbond",
			"Invisibility versus Undead", "Eyes of the Cat", "Chill Sight",
			"Eye of Zomm", "Eye of Tallon", "Improved Invisibility", "Shifting Sight",
			"Plainsight", "Heat Sight"
			};
		
		String skull_normIcon[] =
			{"Glamour of Tunare", "Leach", "Vampiric Curse", "Bond of Death", "Vexing Mordinia",
			"Screaming Terror", "Dark Pact", "Allure of Death", "Call of Bones", "Lich",
			"Demi Lich", "Arch Lich", "Dead Man Floating", "Dead Men Floating",
			"Panic Animal", "Vampiric Embrace", "Bobbing Corpse", "Shroud of Death",
			"Shroud of Undeath"
			};
		
		String str_blueIcon[] =
			{"Reckless Strength", "Frenzied Strength", "Quickness", "Alacrity",
			"Celerity", "Swift like the Wind", "Aanya's Quickening", "Augment",
			"Wonderous Rapidity", "Visions of Grandeur", "Speed of the Shissar",
			"Strengthen", "Berserker Strength", "Rampage", "Berserker Spirit", "Bedlam",
			"Adorning Grace", "Intensify Death", "Augment Death", "Augmentation of Death",
			"Yaulp", "Yaulp II", "Yaulp III", "Yaulp IV", "Strength of Nature",
			"Call of the Predator", "Strength of Earth", "Storm Strength",
			"Strengthen Death", "Burst of Strength", "Frenzy", "Fury", "Rage",
			"Voice of the Berserker", "Avatar", "Primal Avatar", "Strengthen", "Spirit Strength",
			"Raging Strength", "Furious Strength", "Tumultuous Strength", "Strength",
			"Maniacal Strength", "Talisman of the Rhino", "Dexterous Aura", "Spirit of Monkey",
			"Rising Dexterity", "Deftness", "Dexterity", "Mortal Deftness", "Talisman of the Raptor",
			"Spirit of Bear", "Spirit of Ox", "Health", "Stamina", "Riotous Health",
			"Talisman of the Brute"
			};
		
		String str_redIcon[] =
			{"Weaken", "Enfeeblement", "Ebbing Strength", "Feckless Might",
			"Insipid Weakness", "Incapacitate", "Weakness", "Cripple",
			"Malaise", "Malaisement", "Malosi", "Malosini", "Mala",
			"Heart Flutter", "Asystole", "Cessation of Cor", "Siphon Strength",
			"Wave of Enfeeblement", "Shroud of Hate", "Grim Aura",
			"Disempower", "Listless Power", "Incapacitate", "Malo"
			};
		
		String thistleIcon[] =
			{"Shield of Thistles", "Shield of Barbs", "Shield of Brambles",
			"Shield of Spikes", "Shield of Thorns", "Legacy of Spike",
			"Shield of Blades", "Legacy of Thorn"
			};
		
		String wandIcon[] =
			{"Treeform", "Spirit of Oak", "Charm", "Beguile", "Cajoling Whispers",
			"Allure", "Boltran`s Agacerie", "Dictate", "Splurt", "Form of the Great Bear"
			};
		
		String wolfIcon[] =
			{"Stinging Swarm", "Creeping Crud", "Drones of Doom", "Drifting Death",
			"Winged Death", "Wolf Form", "Greater Wolf Form", "Share Wolf Form",
			"Form of the Great Wolf", "Form of the Howler", "Form of the Hunter",
			"Feral Spirit", "Savage Spirit", "Tashan", "Tashani", "Tashania",
			"Wind of Tashani", "Tashanian", "Wind of Tashanian"
			};
		
		if (Arrays.asList(shield_normIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/shield_norm.png"));
		}
		else if (Arrays.asList(bootIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/boot.png"));
		}
		else if (Arrays.asList(breathIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/breath.png"));
		}
		else if (Arrays.asList(cycloneIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/cyclone.png"));
		}
		else if (Arrays.asList(diseaseIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/disease.png"));
		}
		else if (Arrays.asList(fireIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/fire.png"));
		}
		else if (Arrays.asList(hand_blueIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/hand_blue.png"));
		}
		else if (Arrays.asList(hand_redIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/hand_red.png"));
		}
		else if (Arrays.asList(iceIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/ice.png"));
		}
		else if (Arrays.asList(mind_blueIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/mind_blue.png"));
		}
		else if (Arrays.asList(mind_redIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/mind_red.png"));
		}
		else if (Arrays.asList(poisonIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/poison.png"));
		}
		else if (Arrays.asList(sightIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/sight.png"));
		}
		else if (Arrays.asList(skull_normIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/skull_norm.png"));
		}
		else if (Arrays.asList(str_blueIcon).contains(spellName))
		{
				iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/str_blue.png"));
		}
		else if (Arrays.asList(str_redIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/str_red.png"));
		}
		else if (Arrays.asList(thistleIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/thistle.png"));
		}
		else if (Arrays.asList(wandIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/wand.png"));
		}
		else if (Arrays.asList(wolfIcon).contains(spellName))
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/wolf.png"));
		}
		else
		{
			iconName = new ImageIcon(EQLogToolsGUI.class.getResource("/res/blank.png"));
		}
	}
	
	public static void classChecker()
	{
			if (EQLogToolsGUI.selectedClass == 1) // Bard
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesBard[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsBard[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 2) // Cleric
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesCleric[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsCleric[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 3) // Druid
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesDruid[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsDruid[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 4) // Enchanter
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesEnchanter[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsEnchanter[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 5) // Magician
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMagician[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMagician[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 6) // Monk
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesMonk[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsMonk[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 7) // Necromancer
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesNecromancer[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsNecromancer[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 8)
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesPaladin[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsPaladin[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 9)
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRanger[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRanger[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 10)
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesRogue[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsRogue[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 11)
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShadowKnight[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShadowKnight[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 12)
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesShaman[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsShaman[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 13)
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWarrior[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWarrior[17])));
			}
			
			if (EQLogToolsGUI.selectedClass == 14)
			{
				EQLogToolsGUI.comboGroup_01.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[0]));
				EQLogToolsGUI.groupLabel_01.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[0])));
				EQLogToolsGUI.comboGroup_02.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[1]));
				EQLogToolsGUI.groupLabel_02.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[1])));
				EQLogToolsGUI.comboGroup_03.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[2]));
				EQLogToolsGUI.groupLabel_03.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[2])));
				EQLogToolsGUI.comboGroup_04.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[3]));
				EQLogToolsGUI.groupLabel_04.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[3])));
				EQLogToolsGUI.comboGroup_05.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[4]));
				EQLogToolsGUI.groupLabel_05.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[4])));
				EQLogToolsGUI.comboGroup_06.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[5]));
				EQLogToolsGUI.groupLabel_06.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[5])));
				EQLogToolsGUI.comboGroup_07.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[6]));
				EQLogToolsGUI.groupLabel_07.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[6])));
				EQLogToolsGUI.comboGroup_08.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[7]));
				EQLogToolsGUI.groupLabel_08.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[7])));
				EQLogToolsGUI.comboGroup_09.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[8]));
				EQLogToolsGUI.groupLabel_09.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[8])));
				EQLogToolsGUI.comboGroup_10.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[9]));
				EQLogToolsGUI.groupLabel_10.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[9])));
				EQLogToolsGUI.comboGroup_11.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[10]));
				EQLogToolsGUI.groupLabel_11.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[10])));
				EQLogToolsGUI.comboGroup_12.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[11]));
				EQLogToolsGUI.groupLabel_12.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[11])));
				EQLogToolsGUI.comboGroup_13.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[12]));
				EQLogToolsGUI.groupLabel_13.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[12])));
				EQLogToolsGUI.comboGroup_14.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[13]));
				EQLogToolsGUI.groupLabel_14.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[13])));
				EQLogToolsGUI.comboGroup_15.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[14]));
				EQLogToolsGUI.groupLabel_15.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[14])));
				EQLogToolsGUI.comboGroup_16.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[15]));
				EQLogToolsGUI.groupLabel_16.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[15])));
				EQLogToolsGUI.comboGroup_17.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[16]));
				EQLogToolsGUI.groupLabel_17.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[16])));
				EQLogToolsGUI.comboGroup_18.setModel(new DefaultComboBoxModel(SpellNames.spellNamesWizard[17]));
				EQLogToolsGUI.groupLabel_18.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource(SpellIcons.spellIconsWizard[17])));
			}
	}
}
