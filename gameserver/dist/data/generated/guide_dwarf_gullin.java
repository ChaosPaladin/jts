package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class guide_dwarf_gullin extends newbie_guide {
protected Object[][] Position = {
{"Dark Elf Village";12111;16686;-4582;0;0}, {"Talking Island Village";-84081;243227;-3723;0;0}, {"Elven Village";45475;48359;-3060;0;0}, {"Orc Village";-45032;-113598;-192;0;0}, {"Kamael Village";-119697;44532;380;0;0}
};

	protected void TALKED(HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam talker) {
if (_from_choice == 0) {
if (gg.GetMemoStateEx(talker, 255, 1) < 5 && myself.GetOneTimeQuestFlag(talker, 41) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "The Adventurer's Challenge (In Progress)");

}
if (gg.GetMemoStateEx(talker, 255, 1) >= 5 && myself.GetOneTimeQuestFlag(talker, 41) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "The Adventurer's Challenge (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 0);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.GetMemoStateEx(talker, 255, 1) < 5 && myself.GetOneTimeQuestFlag(talker, 41) == 0) {
myself.SetCurrentQuestID(41);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (myself.IsInCategory(0, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 200);
myself.GiveItem1(talker, 8594, 2);
myself.SetMemoStateEx(talker, 255, 1, 5);
if (talker.level <= 1) {
myself.IncrementParam(talker, 0, 68);
myself.IncrementParam(talker, 1, 50);

} else {
myself.IncrementParam(talker, 1, 50);

}

}
if (myself.IsInCategory(1, talker.occupation)) {
if (talker.occupation == 49) {
myself.VoiceEffect(talker, "tutorial_voice_026", 1000);
myself.GiveItem1(talker, 5789, 200);

} else {
myself.VoiceEffect(talker, "tutorial_voice_027", 1000);
myself.GiveItem1(talker, 5790, 100);

}
myself.GiveItem1(talker, 8594, 2);
myself.SetMemoStateEx(talker, 255, 1, 5);
if (talker.level <= 1) {
myself.IncrementParam(talker, 0, 68);
myself.IncrementParam(talker, 1, 50);

} else {
myself.IncrementParam(talker, 1, 50);

}

}
if (talker.level < 6) {
if (gg.GetNRMemoState(talker, 41) % 10 == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_02.htm");
if (talker.level >= 5) {
myself.GiveItem1(talker, 57, 695);
myself.IncrementParam(talker, 0, 3154);
myself.IncrementParam(talker, 1, 127);

} else if (talker.level >= 4) {
myself.GiveItem1(talker, 57, 1041);
myself.IncrementParam(talker, 0, 4870);
myself.IncrementParam(talker, 1, 195);

} else if (talker.level >= 3) {
myself.GiveItem1(talker, 57, 1186);
myself.IncrementParam(talker, 0, 5675);
myself.IncrementParam(talker, 1, 227);

} else {
myself.GiveItem1(talker, 57, 1240);
myself.IncrementParam(talker, 0, 5970);
myself.IncrementParam(talker, 1, 239);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 10);

} else {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10);

}

} else {
if (myself.sm.race == 0) {
myself.ShowPage(talker, "newbie_guide_q0041_01a.htm");
myself.ShowRadar(talker, -84436, 242793, -3729, 2);

} else if (myself.sm.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_01b.htm");
myself.ShowRadar(talker, 42978, 49115, 2994, 2);

} else if (myself.sm.race == 2) {
myself.ShowPage(talker, "newbie_guide_q0041_01c.htm");
myself.ShowRadar(talker, 25790, 10844, -3727, 2);

} else if (myself.sm.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_01d.htm");
myself.ShowRadar(talker, -47360, -113791, -237, 2);

} else if (myself.sm.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_01e.htm");
myself.ShowRadar(talker, 112656, -174864, -611, 2);

} else if (myself.sm.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_01f.htm");
myself.ShowRadar(talker, -119378, 49242, 22, 2);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

} else if (talker.level < 10) {
if (gg.GetNRMemoState(talker, 41) % 1000 / 100 == 1 && gg.GetNRMemoState(talker, 41) % 10000 / 1000 == 1) {
if (talker.race == 0) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, "newbie_guide_q0041_05a.htm");
myself.ShowRadar(talker, -71384, 258304, -3109, 2);

} else {
myself.ShowPage(talker, "newbie_guide_q0041_05b.htm");
myself.ShowRadar(talker, -91008, 248016, -3568, 2);

}

} else if (talker.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_05c.htm");
myself.ShowRadar(talker, 47595, 51569, -2996, 2);

} else if (talker.race == 2) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, "newbie_guide_q0041_05d.htm");
myself.ShowRadar(talker, 10580, 17574, -4554, 2);

} else {
myself.ShowPage(talker, "newbie_guide_q0041_05e.htm");
myself.ShowRadar(talker, 10775, 14190, -4242, 2);

}

} else if (talker.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_05f.htm");
myself.ShowRadar(talker, -46808, -113184, -112, 2);

} else if (talker.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_05g.htm");
myself.ShowRadar(talker, 115717, -183488, -1483, 2);

} else if (talker.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_05h.htm");
myself.ShowRadar(talker, -118080, 42835, 720, 2);

}
if (talker.level >= 9) {
myself.GiveItem1(talker, 57, 5563);
myself.IncrementParam(talker, 0, 16851);
myself.IncrementParam(talker, 1, 711);

} else if (talker.level >= 8) {
myself.GiveItem1(talker, 57, 9290);
myself.IncrementParam(talker, 0, 28806);
myself.IncrementParam(talker, 1, 1207);

} else if (talker.level >= 7) {
myself.GiveItem1(talker, 57, 11567);
myself.IncrementParam(talker, 0, 36942);
myself.IncrementParam(talker, 1, 1541);

} else {
myself.GiveItem1(talker, 57, 12928);
myself.IncrementParam(talker, 0, 42191);
myself.IncrementParam(talker, 1, 1753);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 10000);

} else {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10000);

}

} else if (gg.GetNRMemoState(talker, 41) % 1000 / 100 == 1 && gg.GetNRMemoState(talker, 41) % 10000 / 1000 != 1) {
if (myself.sm.race == 0) {
myself.ShowPage(talker, "newbie_guide_q0041_04a.htm");
myself.ShowRadar(talker, -82236, 241573, -3728, 2);

} else if (myself.sm.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_04b.htm");
myself.ShowRadar(talker, 42812, 51138, -2996, 2);

} else if (myself.sm.race == 2) {
myself.ShowPage(talker, "newbie_guide_q0041_04c.htm");
myself.ShowRadar(talker, 7644, 18048, -4377, 2);

} else if (myself.sm.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_04d.htm");
myself.ShowRadar(talker, -46802, -114011, -112, 2);

} else if (myself.sm.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_04e.htm");
myself.ShowRadar(talker, 116103, -178407, -948, 2);

} else if (myself.sm.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_04f.htm");
myself.ShowRadar(talker, -119378, 49242, 22, 2);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

} else {
myself.ShowPage(talker, "newbie_guide_q0041_03.htm");
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

} else {
myself.ShowPage(talker, "newbie_guide_q0041_06.htm");
myself.SetOneTimeQuestFlag(talker, 41, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

}
break;

}
case 1: {
if (_from_choice == 0 || gg.GetMemoStateEx(talker, 255, 1) >= 5 && myself.GetOneTimeQuestFlag(talker, 41) == 0) {
myself.SetCurrentQuestID(41);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (talker.level < 6) {
if (gg.GetNRMemoState(talker, 41) % 10 == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_08.htm");
if (talker.level >= 5) {
myself.GiveItem1(talker, 57, 695);
myself.IncrementParam(talker, 0, 3154);
myself.IncrementParam(talker, 1, 127);

} else if (talker.level >= 4) {
myself.GiveItem1(talker, 57, 1041);
myself.IncrementParam(talker, 0, 4870);
myself.IncrementParam(talker, 1, 195);

} else if (talker.level >= 3) {
myself.GiveItem1(talker, 57, 1186);
myself.IncrementParam(talker, 0, 5675);
myself.IncrementParam(talker, 1, 227);

} else {
myself.GiveItem1(talker, 57, 1240);
myself.IncrementParam(talker, 0, 5970);
myself.IncrementParam(talker, 1, 239);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 10);

} else {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10);

}

} else {
if (myself.sm.race == 0) {
myself.ShowPage(talker, "newbie_guide_q0041_07a.htm");
myself.ShowRadar(talker, -84436, 242793, -3729, 2);

} else if (myself.sm.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_07b.htm");
myself.ShowRadar(talker, 42978, 49115, 2994, 2);

} else if (myself.sm.race == 2) {
myself.ShowPage(talker, "newbie_guide_q0041_07c.htm");
myself.ShowRadar(talker, 25790, 10844, -3727, 2);

} else if (myself.sm.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_07d.htm");
myself.ShowRadar(talker, -47360, -113791, -237, 2);

} else if (myself.sm.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_07e.htm");
myself.ShowRadar(talker, 112656, -174864, -611, 2);

} else if (myself.sm.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_07f.htm");
myself.ShowRadar(talker, -119378, 49242, 22, 2);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

} else if (talker.level < 10) {
if (gg.GetNRMemoState(talker, 41) % 100000 / 10000 == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_09g.htm");

} else if (gg.GetNRMemoState(talker, 41) % 1000 / 100 == 1 && gg.GetNRMemoState(talker, 41) % 10000 / 1000 == 1 && gg.GetNRMemoState(talker, 41) % 100000 / 10000 != 1) {
if (talker.race == 0) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, "newbie_guide_q0041_10a.htm");
myself.ShowRadar(talker, -71384, 258304, -3109, 2);

} else {
myself.ShowPage(talker, "newbie_guide_q0041_10b.htm");
myself.ShowRadar(talker, -91008, 248016, -3568, 2);

}

} else if (talker.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_10c.htm");
myself.ShowRadar(talker, 47595, 51569, -2996, 2);

} else if (talker.race == 2) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, "newbie_guide_q0041_10d.htm");
myself.ShowRadar(talker, 10580, 17574, -4554, 2);

} else {
myself.ShowPage(talker, "newbie_guide_q0041_10e.htm");
myself.ShowRadar(talker, 10775, 14190, -4242, 2);

}

} else if (talker.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_10f.htm");
myself.ShowRadar(talker, -46808, -113184, -112, 2);

} else if (talker.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_10g.htm");
myself.ShowRadar(talker, 115717, -183488, -1483, 2);

} else if (talker.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_10h.htm");
myself.ShowRadar(talker, -118080, 42835, 720, 2);

}
if (talker.level >= 9) {
myself.GiveItem1(talker, 57, 5563);
myself.IncrementParam(talker, 0, 16851);
myself.IncrementParam(talker, 1, 711);

} else if (talker.level >= 8) {
myself.GiveItem1(talker, 57, 9290);
myself.IncrementParam(talker, 0, 28806);
myself.IncrementParam(talker, 1, 1207);

} else if (talker.level >= 7) {
myself.GiveItem1(talker, 57, 11567);
myself.IncrementParam(talker, 0, 36942);
myself.IncrementParam(talker, 1, 1541);

} else {
myself.GiveItem1(talker, 57, 12928);
myself.IncrementParam(talker, 0, 42191);
myself.IncrementParam(talker, 1, 1753);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 10000);

} else {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 10000);

}

} else if (gg.GetNRMemoState(talker, 41) % 1000 / 100 == 1 && gg.GetNRMemoState(talker, 41) % 10000 / 1000 != 1) {
if (myself.sm.race == 0) {
myself.ShowPage(talker, "newbie_guide_q0041_09a.htm");
myself.ShowRadar(talker, -82236, 241573, -3728, 2);

} else if (myself.sm.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_09b.htm");
myself.ShowRadar(talker, 42812, 51138, -2996, 2);

} else if (myself.sm.race == 2) {
myself.ShowPage(talker, "newbie_guide_q0041_09c.htm");
myself.ShowRadar(talker, 7644, 18048, -4377, 2);

} else if (myself.sm.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_09d.htm");
myself.ShowRadar(talker, -46802, -114011, -112, 2);

} else if (myself.sm.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_09e.htm");
myself.ShowRadar(talker, 116103, -178407, -948, 2);

} else if (myself.sm.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_09f.htm");
myself.ShowRadar(talker, -119378, 49242, 22, 2);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

} else {
myself.ShowPage(talker, "newbie_guide_q0041_08.htm");
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

} else if (talker.level < 15) {
if (gg.GetNRMemoState(talker, 41) % 1000000 / 100000 == 1 && gg.GetNRMemoState(talker, 41) % 10000000 / 1000000 == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_15.htm");

} else if (gg.GetNRMemoState(talker, 41) % 1000000 / 100000 == 1 && gg.GetNRMemoState(talker, 41) % 10000000 / 1000000 != 1) {
if (myself.sm.race == 0) {
myself.ShowPage(talker, "newbie_guide_q0041_11a.htm");
myself.ShowRadar(talker, -84057, 242832, -3729, 2);

} else if (myself.sm.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_11b.htm");
myself.ShowRadar(talker, 45859, 50827, -3058, 2);

} else if (myself.sm.race == 2) {
myself.ShowPage(talker, "newbie_guide_q0041_11c.htm");
myself.ShowRadar(talker, 11258, 14431, -4242, 2);

} else if (myself.sm.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_11d.htm");
myself.ShowRadar(talker, -45863, -112621, -200, 2);

} else if (myself.sm.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_11e.htm");
myself.ShowRadar(talker, 116268, -177524, -914, 2);

} else if (myself.sm.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_11f.htm");
myself.ShowRadar(talker, -125872, 38208, 1251, 2);

}
if (talker.level >= 14) {
myself.GiveItem1(talker, 57, 13002);
myself.IncrementParam(talker, 0, 62876);
myself.IncrementParam(talker, 1, 2891);

} else if (talker.level >= 13) {
myself.GiveItem1(talker, 57, 23468);
myself.IncrementParam(talker, 0, 113137);
myself.IncrementParam(talker, 1, 5161);

} else if (talker.level >= 12) {
myself.GiveItem1(talker, 57, 31752);
myself.IncrementParam(talker, 0, 152653);
myself.IncrementParam(talker, 1, 6914);

} else if (talker.level >= 11) {
myself.GiveItem1(talker, 57, 38180);
myself.IncrementParam(talker, 0, 183128);
myself.IncrementParam(talker, 1, 8242);

} else {
myself.GiveItem1(talker, 57, 43054);
myself.IncrementParam(talker, 0, 206101);
myself.IncrementParam(talker, 1, 9227);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 1000000);

} else {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 1000000);

}

} else if (gg.GetNRMemoState(talker, 41) % 1000000 / 100000 != 1) {
if (talker.race == 0) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, "newbie_guide_q0041_10a.htm");
myself.ShowRadar(talker, -71384, 258304, -3109, 2);

} else {
myself.ShowPage(talker, "newbie_guide_q0041_10b.htm");
myself.ShowRadar(talker, -91008, 248016, -3568, 2);

}

} else if (talker.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_10c.htm");
myself.ShowRadar(talker, 47595, 51569, -2996, 2);

} else if (talker.race == 2) {
if (myself.IsInCategory(0, talker.occupation)) {
myself.ShowPage(talker, "newbie_guide_q0041_10d.htm");
myself.ShowRadar(talker, 10580, 17574, -4554, 2);

} else {
myself.ShowPage(talker, "newbie_guide_q0041_10e.htm");
myself.ShowRadar(talker, 10775, 14190, -4242, 2);

}

} else if (talker.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_10f.htm");
myself.ShowRadar(talker, -46808, -113184, -112, 2);

} else if (talker.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_10g.htm");
myself.ShowRadar(talker, 115717, -183488, -1483, 2);

} else if (talker.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_10h.htm");
myself.ShowRadar(talker, -118080, 42835, 720, 2);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

} else if (talker.level < 18) {
if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 == 1 && gg.GetNRMemoState(talker, 41) % 1000000000 / 100000000 == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_13.htm");
myself.SetOneTimeQuestFlag(talker, 41, 1);

} else if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 == 1 && gg.GetNRMemoState(talker, 41) % 1000000000 / 100000000 != 1) {
if (talker.level >= 17) {
myself.GiveItem1(talker, 57, 22996);
myself.IncrementParam(talker, 0, 113712);
myself.IncrementParam(talker, 1, 5518);

} else if (talker.level >= 16) {
myself.GiveItem1(talker, 57, 10018);
myself.IncrementParam(talker, 0, 208133);
myself.IncrementParam(talker, 1, 42237);

} else {
myself.GiveItem1(talker, 57, 13648);
myself.IncrementParam(talker, 0, 285670);
myself.IncrementParam(talker, 1, 58155);

}
myself.ShowPage(talker, "newbie_guide_q0041_12.htm");
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 100000000);

} else {
i0 = gg.GetNRMemoState(talker, 41);
myself.SetNRMemoState(talker, 41, i0 + 100000000);

}
myself.SetOneTimeQuestFlag(talker, 41, 1);

} else if (gg.GetNRMemoState(talker, 41) % 100000000 / 10000000 != 1) {
if (myself.sm.race == 0) {
myself.ShowPage(talker, "newbie_guide_q0041_11a.htm");
myself.ShowRadar(talker, -84057, 242832, -3729, 2);

} else if (myself.sm.race == 1) {
myself.ShowPage(talker, "newbie_guide_q0041_11b.htm");
myself.ShowRadar(talker, 45859, 50827, -3058, 2);

} else if (myself.sm.race == 2) {
myself.ShowPage(talker, "newbie_guide_q0041_11c.htm");
myself.ShowRadar(talker, 11258, 14431, -4242, 2);

} else if (myself.sm.race == 3) {
myself.ShowPage(talker, "newbie_guide_q0041_11d.htm");
myself.ShowRadar(talker, -45863, -112621, -200, 2);

} else if (myself.sm.race == 4) {
myself.ShowPage(talker, "newbie_guide_q0041_11e.htm");
myself.ShowRadar(talker, 116268, -177524, -914, 2);

} else if (myself.sm.race == 5) {
myself.ShowPage(talker, "newbie_guide_q0041_11f.htm");
myself.ShowRadar(talker, -125872, 38208, 1251, 2);

}
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

} else if (myself.IsInCategory(6, talker.occupation)) {
myself.ShowPage(talker, "newbie_guide_q0041_13.htm");
myself.SetOneTimeQuestFlag(talker, 41, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

} else {
myself.ShowPage(talker, "newbie_guide_q0041_14.htm");
myself.SetOneTimeQuestFlag(talker, 41, 1);
if (gg.HaveNRMemo(talker, 41) == 0) {
myself.SetNRMemo(talker, 41);
myself.SetNRMemoState(talker, 41, 0);

}

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam reply, HandlerParam talker) {
if (ask == 206) {
myself.SetCurrentQuestID(206);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 255) {
if (reply == 10) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04.htm");

} else if (reply == 11) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04a.htm");

} else if (reply == 12) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04b.htm");

} else if (reply == 13) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04c.htm");

} else if (reply == 14) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04d.htm");

} else if (reply == 15) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04e.htm");

} else if (reply == 16) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04f.htm");

} else if (reply == 17) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04g.htm");

} else if (reply == 18) {
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_04h.htm");

} else if (reply == 31) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115072, -178176, -906, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 32) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 117847, -182339, -1537, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 33) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116617, -184308, -1569, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 34) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 117826, -182576, -1537, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 35) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116378, -184308, -1571, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 36) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115183, -176728, -791, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 37) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 114969, -176752, -790, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 38) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 117366, -178725, -1118, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 39) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 117378, -178914, -1120, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 40) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116226, -178529, -948, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 41) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116190, -178441, -948, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 42) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116016, -178615, -948, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 43) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116190, -178615, -948, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 44) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116103, -178407, -948, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 45) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116103, -178653, -948, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 46) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115468, -182446, -1434, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 47) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115315, -182155, -1444, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 48) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115271, -182692, -1445, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 49) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115900, -177316, -915, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 50) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116268, -177524, -914, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 51) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115741, -181645, -1344, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 52) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116192, -181072, -1344, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 53) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115205, -180024, -870, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 54) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 114716, -180018, -871, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 55) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 114832, -179520, -871, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 56) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115717, -183488, -1483, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 57) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115618, -183265, -1483, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 58) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 114348, -178537, -813, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 59) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 114990, -177294, -854, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 60) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 114426, -178672, -812, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 61) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 114409, -178415, -812, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 62) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 117061, -181867, -1413, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 63) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116164, -184029, -1507, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 64) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 115563, -182923, -1448, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 65) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 112656, -174864, -611, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

} else if (reply == 66) {
myself.DeleteAllRadar(talker, 2);
myself.ShowRadar(talker, 116852, -183595, -1566, 2);
myself.ShowPage(talker, "guide_dwarf_gullin_q0255_05.htm");

}

}
super;
	}


}