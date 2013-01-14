package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tutorial_quest_npc extends default_npc {
	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam talker) {
if (timer_id <= 1000000) {
return;

}
talker = gg.GetCreatureFromIndex(timer_id - 1000000);
if (myself.IsNullCreature(talker) || talker.alive == 0 || talker.is_pc == 0) {
return;

}
if (gg.GetMemoStateEx(talker, 255, 1) == -2) {
if (talker.occupation == 0) {
myself.VoiceEffect(talker, "tutorial_voice_001a", 2000);
myself.ShowTutorialHTML(talker, "tutorial_human_fighter001.htm");

} else if (talker.occupation == 10) {
myself.VoiceEffect(talker, "tutorial_voice_001b", 2000);
myself.ShowTutorialHTML(talker, "tutorial_human_mage001.htm");

} else if (talker.occupation == 18) {
myself.VoiceEffect(talker, "tutorial_voice_001c", 2000);
myself.ShowTutorialHTML(talker, "tutorial_elven_fighter001.htm");

} else if (talker.occupation == 25) {
myself.VoiceEffect(talker, "tutorial_voice_001d", 2000);
myself.ShowTutorialHTML(talker, "tutorial_elven_mage001.htm");

} else if (talker.occupation == 31) {
myself.VoiceEffect(talker, "tutorial_voice_001e", 2000);
myself.ShowTutorialHTML(talker, "tutorial_delf_fighter001.htm");

} else if (talker.occupation == 38) {
myself.VoiceEffect(talker, "tutorial_voice_001f", 2000);
myself.ShowTutorialHTML(talker, "tutorial_delf_mage001.htm");

} else if (talker.occupation == 44) {
myself.VoiceEffect(talker, "tutorial_voice_001g", 2000);
myself.ShowTutorialHTML(talker, "tutorial_orc_fighter001.htm");

} else if (talker.occupation == 49) {
myself.VoiceEffect(talker, "tutorial_voice_001h", 2000);
myself.ShowTutorialHTML(talker, "tutorial_orc_mage001.htm");

} else if (talker.occupation == 53) {
myself.VoiceEffect(talker, "tutorial_voice_001i", 2000);
myself.ShowTutorialHTML(talker, "tutorial_dwarven_fighter001.htm");

} else if (talker.occupation == 123 || talker.occupation == 124) {
myself.VoiceEffect(talker, "tutorial_voice_001k", 2000);
myself.ShowTutorialHTML(talker, "tutorial_kamael001.htm");

}
if (gg.OwnItemCount(talker, 5588) == 0) {
myself.GiveItem1(talker, 5588, 1);

}
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 30);
myself.SetMemoStateEx(talker, 255, 1, -3);

} else if (gg.GetMemoStateEx(talker, 255, 1) == -3) {
myself.VoiceEffect(talker, "tutorial_voice_002", 1000);

} else if (gg.GetMemoStateEx(talker, 255, 1) == -4) {
myself.VoiceEffect(talker, "tutorial_voice_008", 1000);
myself.SetMemoStateEx(talker, 255, 1, -5);

}
	}

	protected void TUTORIAL_EVENT(HandlerParam talker, HandlerParam event_id, HandlerParam i0, HandlerParam i1) {
i1 = gg.GetMemoState(talker, 255);
i0 = i1 & 2147483632;
if (event_id < 0) {
switch (-event_id) {
case 1: {
myself.CloseTutorialHTML(talker);
myself.VoiceEffect(talker, "tutorial_voice_006", 3500);
myself.ShowQuestionMark(talker, 1);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 30);
if (gg.GetMemoStateEx(talker, 255, 1) < 0) {
myself.SetMemoStateEx(talker, 255, 1, -4);

}
break;

}
case 2: {
myself.VoiceEffect(talker, "tutorial_voice_003", 2000);
myself.ShowTutorialHTML(talker, "tutorial_02.htm");
myself.EnableTutorialEvent(talker, i0 | 1);
if (gg.GetMemoStateEx(talker, 255, 1) < 0) {
myself.SetMemoStateEx(talker, 255, 1, -5);

}
break;

}
case 3: {
myself.ShowTutorialHTML(talker, "tutorial_03.htm");
myself.EnableTutorialEvent(talker, i0 | 2);
break;

}
case 4: {
myself.ShowTutorialHTML(talker, "tutorial_04.htm");
myself.EnableTutorialEvent(talker, i0 | 4);
break;

}
case 5: {
myself.ShowTutorialHTML(talker, "tutorial_05.htm");
myself.EnableTutorialEvent(talker, i0 | 8);
break;

}
case 6: {
myself.ShowTutorialHTML(talker, "tutorial_06.htm");
myself.EnableTutorialEvent(talker, i0 | 16);
break;

}
case 7: {
myself.ShowTutorialHTML(talker, "tutorial_100.htm");
myself.EnableTutorialEvent(talker, i0);
break;

}
case 8: {
myself.ShowTutorialHTML(talker, "tutorial_101.htm");
myself.EnableTutorialEvent(talker, i0);
break;

}
case 9: {
myself.ShowTutorialHTML(talker, "tutorial_102.htm");
myself.EnableTutorialEvent(talker, i0);
break;

}
case 10: {
myself.ShowTutorialHTML(talker, "tutorial_103.htm");
myself.EnableTutorialEvent(talker, i0);
break;

}
case 11: {
myself.ShowTutorialHTML(talker, "tutorial_104.htm");
myself.EnableTutorialEvent(talker, i0);
break;

}
case 12: {
break;

}

}
return;

}
switch (event_id) {
case 1: {
if (talker.level < 6) {
myself.VoiceEffect(talker, "tutorial_voice_004", 1000 * 5);
myself.ShowTutorialHTML2(talker, "tutorial_03.htm", 3, "ItemSound.quest_tutorial");
myself.EnableTutorialEvent(talker, i0 | 2);

}
break;

}
case 2: {
if (talker.level < 6) {
myself.VoiceEffect(talker, "tutorial_voice_005", 1000 * 5);
myself.ShowTutorialHTML2(talker, "tutorial_05.htm", 3, "ItemSound.quest_tutorial");
myself.EnableTutorialEvent(talker, i0 | 8);

}
break;

}
case 8: {
if (talker.level < 6) {
myself.ShowTutorialHTML2(talker, "tutorial_human_fighter007.htm", 3, "ItemSound.quest_tutorial");
if (talker.occupation == 0) {
myself.ShowRadar(talker, -71424, 258336, -3109, 2);

} else if (talker.occupation == 10) {
myself.ShowRadar(talker, -91036, 248044, -3568, 2);

} else if (talker.occupation == 18 || talker.occupation == 25) {
myself.ShowRadar(talker, 46112, 41200, -3504, 2);

} else if (talker.occupation == 31 || talker.occupation == 38) {
myself.ShowRadar(talker, 28384, 11056, -4233, 2);

} else if (talker.occupation == 44 || talker.occupation == 49) {
myself.ShowRadar(talker, -56736, -113680, -672, 2);

} else if (talker.occupation == 53) {
myself.ShowRadar(talker, 108567, -173994, -406, 2);

} else if (talker.occupation == 123 || talker.occupation == 124) {
myself.ShowRadar(talker, -125872, 38016, 1251, 2);

}
myself.VoiceEffect(talker, "tutorial_voice_007", 3500);
myself.SetMemoState(talker, 255, i0 | 2);
if (gg.GetMemoStateEx(talker, 255, 1) < 0) {
myself.SetMemoStateEx(talker, 255, 1, -5);

}

}
break;

}
case 256: {
if (talker.level < 6) {
myself.VoiceEffect(talker, "tutorial_voice_017", 1000);
myself.ShowQuestionMark(talker, 10);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~256);
myself.EnableTutorialEvent(talker, i0 & ~256 | 8388608);

}
break;

}
case 512: {
myself.ShowQuestionMark(talker, 8);
myself.VoiceEffect(talker, "tutorial_voice_016", 1000);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~512);
break;

}
case 1024: {
myself.SetMemoState(talker, 255, i1 & ~1024);
if (talker.occupation == 0) {
myself.ShowRadar(talker, -83020, 242553, -3718, 2);

} else if (talker.occupation == 18) {
myself.ShowRadar(talker, 45061, 52468, -2796, 2);

} else if (talker.occupation == 31) {
myself.ShowRadar(talker, 10447, 14620, -4242, 2);

} else if (talker.occupation == 44) {
myself.ShowRadar(talker, -46389, -113905, -21, 2);

} else if (talker.occupation == 53) {
myself.ShowRadar(talker, 115271, -182692, -1445, 2);

} else if (talker.occupation == 123 || talker.occupation == 124) {
myself.ShowRadar(talker, -118132, 42788, 723, 2);

}
if (myself.IsInCategory(0, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_014", 1000);
myself.ShowQuestionMark(talker, 9);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
myself.EnableTutorialEvent(talker, i0 | 134217728);
myself.SetMemoState(talker, 255, i1 & ~1024);
break;

}
case 134217728: {
myself.ShowQuestionMark(talker, 24);
myself.VoiceEffect(talker, "tutorial_voice_020", 1000);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.EnableTutorialEvent(talker, i0 & ~134217728);
myself.SetMemoState(talker, 255, i1 & ~134217728);
myself.EnableTutorialEvent(talker, i0 | 2048);
break;

}
case 2048: {
if (myself.IsInCategory(1, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_019", 1000);
myself.ShowQuestionMark(talker, 11);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
if (talker.occupation == 10) {
myself.ShowRadar(talker, -84981, 244764, -3726, 2);

} else if (talker.occupation == 25) {
myself.ShowRadar(talker, 45701, 52459, -2796, 2);

} else if (talker.occupation == 38) {
myself.ShowRadar(talker, 10344, 14445, -4242, 2);

} else if (talker.occupation == 49) {
myself.ShowRadar(talker, -46225, -113312, -21, 2);

}
myself.SetMemoState(talker, 255, i1 & ~2048);

}
myself.EnableTutorialEvent(talker, i0 | 268435456);
break;

}
case 268435456: {
if (talker.occupation == 0) {
myself.VoiceEffect(talker, "tutorial_voice_021", 1000);
myself.ShowQuestionMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~268435456);

}
myself.EnableTutorialEvent(talker, i0 | 536870912);
break;

}
case 536870912: {
if (talker.occupation == 53 || talker.occupation == 10 || talker.occupation == 18 || talker.occupation == 25 || talker.occupation == 38 || talker.occupation == 31 || talker.occupation == 123 || talker.occupation == 124) {
myself.VoiceEffect(talker, "tutorial_voice_021", 1000);
myself.ShowQuestionMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~536870912);

} else {
myself.VoiceEffect(talker, "tutorial_voice_030", 1000);
myself.ShowQuestionMark(talker, 27);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~536870912);

}
myself.EnableTutorialEvent(talker, i0 | 1073741824);
break;

}
case 1073741824: {
if (talker.occupation == 44 || talker.occupation == 49) {
myself.VoiceEffect(talker, "tutorial_voice_021", 1000);
myself.ShowQuestionMark(talker, 25);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~1073741824);

}
myself.EnableTutorialEvent(talker, i0 | 67108864);
break;

}
case 67108864: {
myself.ShowQuestionMark(talker, 17);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~67108864);
myself.EnableTutorialEvent(talker, i0 | 4096);
break;

}
case 4096: {
myself.ShowQuestionMark(talker, 13);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~4096);
myself.EnableTutorialEvent(talker, i0 | 16777216);
break;

}
case 16777216: {
if (talker.race != 5) {
myself.VoiceEffect(talker, "tutorial_voice_023", 1000);
myself.ShowQuestionMark(talker, 15);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~16777216);

}
myself.EnableTutorialEvent(talker, i0 | 32);
break;

}
case 16384: {
if (talker.race == 5 && myself.IsInCategory(63, talker.occupation)) {
myself.VoiceEffect(talker, "tutorial_voice_028", 1000);
myself.ShowQuestionMark(talker, 15);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~16384);

}
myself.EnableTutorialEvent(talker, i0 | 64);
break;

}
case 33554432: {
if (myself.GetOneTimeQuestFlag(talker, 234) == 0) {
myself.VoiceEffect(talker, "tutorial_voice_024", 1000);
myself.ShowQuestionMark(talker, 16);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~33554432);

}
myself.EnableTutorialEvent(talker, i0 | 32768);
break;

}
case 32768: {
if (myself.GetOneTimeQuestFlag(talker, 234) == 1) {
myself.ShowQuestionMark(talker, 29);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~32768);

}
break;

}
case 32: {
if (myself.GetOneTimeQuestFlag(talker, 128) == 0) {
myself.ShowQuestionMark(talker, 30);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~32);

}
myself.EnableTutorialEvent(talker, i0 | 16384);
break;

}
case 64: {
if (myself.GetOneTimeQuestFlag(talker, 129) == 0) {
myself.ShowQuestionMark(talker, 31);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~64);

}
myself.EnableTutorialEvent(talker, i0 | 128);
break;

}
case 128: {
if (myself.GetOneTimeQuestFlag(talker, 144) == 0) {
myself.ShowQuestionMark(talker, 32);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~128);

}
myself.EnableTutorialEvent(talker, i0 | 33554432);
break;

}
case 2097152: {
if (talker.level < 6) {
myself.ShowQuestionMark(talker, 23);
myself.VoiceEffect(talker, "tutorial_voice_012", 1000);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~2097152);

}
break;

}
case 1048576: {
if (talker.level < 6) {
myself.ShowQuestionMark(talker, 5);
myself.VoiceEffect(talker, "tutorial_voice_013", 1000);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.SetMemoState(talker, 255, i1 & ~1048576);

}
break;

}
case 8388608: {
if (talker.level < 6) {
myself.VoiceEffect(talker, "tutorial_voice_018", 1000);
myself.ShowTutorialHTML(talker, "tutorial_21z.htm");
myself.SetMemoState(talker, 255, i1 & ~8388608);

}
break;

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
if (ask == 420) {
if (reply == 1) {
myself.ShowTutorialHTML(talker, "tutorial_22g.htm");

} else if (reply == 2) {
myself.ShowTutorialHTML(talker, "tutorial_22w.htm");

} else if (reply == 3) {
myself.ShowTutorialHTML(talker, "tutorial_22ap.htm");

} else if (reply == 4) {
myself.ShowTutorialHTML(talker, "tutorial_22ad.htm");

} else if (reply == 5) {
myself.ShowTutorialHTML(talker, "tutorial_22bt.htm");

} else if (reply == 6) {
myself.ShowTutorialHTML(talker, "tutorial_22bh.htm");

} else if (reply == 7) {
myself.ShowTutorialHTML(talker, "tutorial_22cs.htm");

} else if (reply == 8) {
myself.ShowTutorialHTML(talker, "tutorial_22cn.htm");

} else if (reply == 9) {
myself.ShowTutorialHTML(talker, "tutorial_22cw.htm");

} else if (reply == 10) {
myself.ShowTutorialHTML(talker, "tutorial_22db.htm");

} else if (reply == 11) {
myself.ShowTutorialHTML(talker, "tutorial_22dp.htm");

} else if (reply == 12) {
myself.ShowTutorialHTML(talker, "tutorial_22et.htm");

} else if (reply == 13) {
myself.ShowTutorialHTML(talker, "tutorial_22es.htm");

} else if (reply == 14) {
myself.ShowTutorialHTML(talker, "tutorial_22fp.htm");

} else if (reply == 15) {
myself.ShowTutorialHTML(talker, "tutorial_22fs.htm");

} else if (reply == 16) {
myself.ShowTutorialHTML(talker, "tutorial_22gs.htm");

} else if (reply == 17) {
myself.ShowTutorialHTML(talker, "tutorial_22ge.htm");

} else if (reply == 18) {
myself.ShowTutorialHTML(talker, "tutorial_22ko.htm");

} else if (reply == 19) {
myself.ShowTutorialHTML(talker, "tutorial_22kw.htm");

} else if (reply == 20) {
myself.ShowTutorialHTML(talker, "tutorial_22ns.htm");

} else if (reply == 21) {
myself.ShowTutorialHTML(talker, "tutorial_22nb.htm");

} else if (reply == 22) {
myself.ShowTutorialHTML(talker, "tutorial_22oa.htm");

} else if (reply == 23) {
myself.ShowTutorialHTML(talker, "tutorial_22op.htm");

} else if (reply == 24) {
myself.ShowTutorialHTML(talker, "tutorial_22ps.htm");

} else if (reply == 24) {
myself.ShowTutorialHTML(talker, "tutorial_22pp.htm");

} else if (reply == 26) {
if (talker.occupation == 1) {
myself.ShowTutorialHTML(talker, "tutorial_22.htm");

} else if (talker.occupation == 4) {
myself.ShowTutorialHTML(talker, "tutorial_22a.htm");

} else if (talker.occupation == 7) {
myself.ShowTutorialHTML(talker, "tutorial_22b.htm");

} else if (talker.occupation == 11) {
myself.ShowTutorialHTML(talker, "tutorial_22c.htm");

} else if (talker.occupation == 15) {
myself.ShowTutorialHTML(talker, "tutorial_22d.htm");

} else if (talker.occupation == 19) {
myself.ShowTutorialHTML(talker, "tutorial_22e.htm");

} else if (talker.occupation == 22) {
myself.ShowTutorialHTML(talker, "tutorial_22f.htm");

} else if (talker.occupation == 26) {
myself.ShowTutorialHTML(talker, "tutorial_22g.htm");

} else if (talker.occupation == 29) {
myself.ShowTutorialHTML(talker, "tutorial_22h.htm");

} else if (talker.occupation == 45) {
myself.ShowTutorialHTML(talker, "tutorial_22i.htm");

} else if (talker.occupation == 47) {
myself.ShowTutorialHTML(talker, "tutorial_22j.htm");

} else if (talker.occupation == 50) {
myself.ShowTutorialHTML(talker, "tutorial_22k.htm");

} else if (talker.occupation == 54) {
myself.ShowTutorialHTML(talker, "tutorial_22l.htm");

} else if (talker.occupation == 56) {
myself.ShowTutorialHTML(talker, "tutorial_22m.htm");

} else if (talker.occupation == 32) {
myself.ShowTutorialHTML(talker, "tutorial_22n.htm");

} else if (talker.occupation == 35) {
myself.ShowTutorialHTML(talker, "tutorial_22o.htm");

} else if (talker.occupation == 39) {
myself.ShowTutorialHTML(talker, "tutorial_22p.htm");

} else if (talker.occupation == 42) {
myself.ShowTutorialHTML(talker, "tutorial_22q.htm");

} else {
myself.ShowTutorialHTML(talker, "tutorial_22qe.htm");

}

} else if (reply == 27) {
myself.ShowTutorialHTML(talker, "tutorial_29.htm");

} else if (reply == 28) {
myself.ShowTutorialHTML(talker, "tutorial_28.htm");

} else if (reply == 29) {
myself.ShowTutorialHTML(talker, "tutorial_07a.htm");

} else if (reply == 30) {
myself.ShowTutorialHTML(talker, "tutorial_07b.htm");

} else if (reply == 31) {
if (talker.occupation == 125) {
myself.ShowTutorialHTML(talker, "tutorial_28a.htm");

} else if (talker.occupation == 126) {
myself.ShowTutorialHTML(talker, "tutorial_28b.htm");

}

} else if (reply == 32) {
myself.ShowTutorialHTML(talker, "tutorial_22qa.htm");

} else if (reply == 33) {
if (talker.occupation == 125) {
myself.ShowTutorialHTML(talker, "tutorial_22qb.htm");

} else if (talker.occupation == 126) {
myself.ShowTutorialHTML(talker, "tutorial_22qc.htm");

}

} else if (reply == 34) {
myself.ShowTutorialHTML(talker, "tutorial_22qd.htm");

}

}
	}

	protected void QUESTION_MARK_CLICKED(HandlerParam talker, HandlerParam question_id, HandlerParam i0) {
i0 = gg.GetMemoState(talker, 255) & 2147483392;
switch (question_id) {
case 1: {
myself.VoiceEffect(talker, "tutorial_voice_007", 3500);
if (gg.GetMemoStateEx(talker, 255, 1) < 0) {
myself.SetMemoStateEx(talker, 255, 1, -5);

}
if (talker.occupation == 0) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter007.htm");
myself.ShowRadar(talker, -71424, 258336, -3109, 2);

} else if (talker.occupation == 10) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter007.htm");
myself.ShowRadar(talker, -91036, 248044, -3568, 2);

} else if (talker.occupation == 18 || talker.occupation == 25) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter007.htm");
myself.ShowRadar(talker, 46112, 41200, -3504, 2);

} else if (talker.occupation == 31 || talker.occupation == 38) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter007.htm");
myself.ShowRadar(talker, 28384, 11056, -4233, 2);

} else if (talker.occupation == 44 || talker.occupation == 49) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter007.htm");
myself.ShowRadar(talker, -56736, -113680, -672, 2);

} else if (talker.occupation == 53) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter007.htm");
myself.ShowRadar(talker, 108567, -173994, -406, 2);

} else if (talker.occupation == 123 || talker.occupation == 124) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter007.htm");
myself.ShowRadar(talker, -125872, 38016, 1251, 2);

}
myself.SetMemoState(talker, 255, i0 | 2);
break;

}
case 2: {
if (talker.occupation == 0) {
myself.ShowTutorialHTML(talker, "tutorial_human_fighter008.htm");

} else if (talker.occupation == 10) {
myself.ShowTutorialHTML(talker, "tutorial_human_mage008.htm");

} else if (talker.occupation == 18 || talker.occupation == 25) {
myself.ShowTutorialHTML(talker, "tutorial_elf008.htm");

} else if (talker.occupation == 31 || talker.occupation == 38) {
myself.ShowTutorialHTML(talker, "tutorial_delf008.htm");

} else if (talker.occupation == 44 || talker.occupation == 49) {
myself.ShowTutorialHTML(talker, "tutorial_orc008.htm");

} else if (talker.occupation == 53) {
myself.ShowTutorialHTML(talker, "tutorial_dwarven_fighter008.htm");

} else if (talker.occupation == 123 || talker.occupation == 124) {
myself.ShowTutorialHTML(talker, "tutorial_kamael008.htm");

}
break;

}
case 3: {
myself.ShowTutorialHTML(talker, "tutorial_09.htm");
myself.EnableTutorialEvent(talker, i0 | 1048576);
break;

}
case 4: {
myself.ShowTutorialHTML(talker, "tutorial_10.htm");
break;

}
case 5: {
if (talker.occupation == 0) {
myself.ShowRadar(talker, -71424, 258336, -3109, 2);

} else if (talker.occupation == 10) {
myself.ShowRadar(talker, -91036, 248044, -3568, 2);

} else if (talker.occupation == 18 || talker.occupation == 25) {
myself.ShowRadar(talker, 46112, 41200, -3504, 2);

} else if (talker.occupation == 31 || talker.occupation == 38) {
myself.ShowRadar(talker, 28384, 11056, -4233, 2);

} else if (talker.occupation == 44 || talker.occupation == 49) {
myself.ShowRadar(talker, -56736, -113680, -672, 2);

} else if (talker.occupation == 53) {
myself.ShowRadar(talker, 108567, -173994, -406, 2);

} else if (talker.occupation == 123 || talker.occupation == 124) {
myself.ShowRadar(talker, -125872, 38016, 1251, 2);

}
myself.ShowTutorialHTML(talker, "tutorial_11.htm");
break;

}
case 7: {
myself.ShowTutorialHTML(talker, "tutorial_15.htm");
myself.SetMemoState(talker, 255, i0 | 5);
break;

}
case 8: {
myself.ShowTutorialHTML(talker, "tutorial_18.htm");
break;

}
case 9: {
if (talker.race == 0 || talker.race == 1 || talker.race == 2 && myself.IsInCategory(0, talker.occupation)) {
myself.ShowTutorialHTML(talker, "tutorial_fighter017.htm");

}
if (talker.race == 4 && myself.IsInCategory(0, talker.occupation)) {
myself.ShowTutorialHTML(talker, "tutorial_fighter_dwarf017.htm");

}
if (talker.race == 3 && myself.IsInCategory(0, talker.occupation)) {
myself.ShowTutorialHTML(talker, "tutorial_fighter_orc017.htm");

}
if (talker.race == 5) {
myself.ShowTutorialHTML(talker, "tutorial_kamael017.htm");

}
break;

}
case 10: {
myself.ShowTutorialHTML(talker, "tutorial_19.htm");
break;

}
case 11: {
if (talker.race == 0) {
myself.ShowTutorialHTML(talker, "tutorial_mage020.htm");

}
if (talker.race == 1 || talker.race == 2) {
myself.ShowTutorialHTML(talker, "tutorial_mage_elf020.htm");

}
if (talker.race == 3) {
myself.ShowTutorialHTML(talker, "tutorial_mage_orc020.htm");

}
break;

}
case 12: {
myself.ShowTutorialHTML(talker, "tutorial_15.htm");
break;

}
case 13: {
if (talker.occupation == 0) {
myself.ShowTutorialHTML(talker, "tutorial_21.htm");

} else if (talker.occupation == 10) {
myself.ShowTutorialHTML(talker, "tutorial_21a.htm");

} else if (talker.occupation == 18) {
myself.ShowTutorialHTML(talker, "tutorial_21b.htm");

} else if (talker.occupation == 25) {
myself.ShowTutorialHTML(talker, "tutorial_21c.htm");

} else if (talker.occupation == 44) {
myself.ShowTutorialHTML(talker, "tutorial_21d.htm");

} else if (talker.occupation == 49) {
myself.ShowTutorialHTML(talker, "tutorial_21e.htm");

} else if (talker.occupation == 53) {
myself.ShowTutorialHTML(talker, "tutorial_21f.htm");

} else if (talker.occupation == 31) {
myself.ShowTutorialHTML(talker, "tutorial_21g.htm");

} else if (talker.occupation == 38) {
myself.ShowTutorialHTML(talker, "tutorial_21h.htm");

} else if (talker.occupation == 123) {
myself.ShowTutorialHTML(talker, "tutorial_21i.htm");

} else if (talker.occupation == 124) {
myself.ShowTutorialHTML(talker, "tutorial_21j.htm");

}
break;

}
case 15: {
if (talker.race != 5) {
myself.ShowTutorialHTML(talker, "tutorial_28.htm");

} else if (talker.occupation == 125) {
myself.ShowTutorialHTML(talker, "tutorial_28a.htm");

} else if (talker.occupation == 126) {
myself.ShowTutorialHTML(talker, "tutorial_28b.htm");

}
break;

}
case 16: {
myself.ShowTutorialHTML(talker, "tutorial_30.htm");
break;

}
case 17: {
myself.ShowTutorialHTML(talker, "tutorial_27.htm");
break;

}
case 19: {
myself.ShowTutorialHTML(talker, "tutorial_07.htm");
break;

}
case 20: {
myself.ShowTutorialHTML(talker, "tutorial_14.htm");
break;

}
case 21: {
myself.ShowTutorialHTML(talker, "tutorial_newbie001.htm");
break;

}
case 22: {
myself.ShowTutorialHTML(talker, "tutorial_14.htm");
break;

}
case 23: {
myself.ShowTutorialHTML(talker, "tutorial_24.htm");
break;

}
case 24: {
if (talker.race == 0) {
myself.ShowTutorialHTML(talker, "tutorial_newbie003a.htm");

}
if (talker.race == 1) {
myself.ShowTutorialHTML(talker, "tutorial_newbie003b.htm");

}
if (talker.race == 2) {
myself.ShowTutorialHTML(talker, "tutorial_newbie003c.htm");

}
if (talker.race == 3) {
myself.ShowTutorialHTML(talker, "tutorial_newbie003d.htm");

}
if (talker.race == 4) {
myself.ShowTutorialHTML(talker, "tutorial_newbie003e.htm");

}
if (talker.race == 5) {
myself.ShowTutorialHTML(talker, "tutorial_newbie003f.htm");

}
break;

}
case 25: {
if (talker.occupation == 0) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002a.htm");

}
if (talker.occupation == 10) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002b.htm");

}
if (talker.occupation == 18 || talker.occupation == 25) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002c.htm");

}
if (talker.occupation == 38) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002d.htm");

}
if (talker.occupation == 31) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002e.htm");

}
if (talker.occupation == 53) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002g.htm");

}
if (talker.occupation == 49 || talker.occupation == 44) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002f.htm");

}
if (talker.occupation == 123 || talker.occupation == 124) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002i.htm");

}
break;

}
case 26: {
if (myself.IsInCategory(0, talker.occupation) || talker.occupation == 49) {
myself.ShowTutorialHTML(talker, "tutorial_newbie004a.htm");

} else {
myself.ShowTutorialHTML(talker, "tutorial_newbie004b.htm");

}
break;

}
case 27: {
if (talker.occupation == 0 || talker.occupation == 49 || talker.occupation == 44) {
myself.ShowTutorialHTML(talker, "tutorial_newbie002h.htm");

}
break;

}
case 28: {
myself.ShowTutorialHTML(talker, "tutorial_31.htm");
break;

}
case 29: {
myself.ShowTutorialHTML(talker, "tutorial_32.htm");
break;

}
case 30: {
myself.ShowTutorialHTML(talker, "tutorial_33.htm");
break;

}
case 31: {
myself.ShowTutorialHTML(talker, "tutorial_34.htm");
break;

}
case 32: {
myself.ShowTutorialHTML(talker, "tutorial_35.htm");
break;

}
case 33: {
if (talker.level == 18) {
myself.ShowTutorialHTML(talker, "kanooth_gludio.htm");

}
if (talker.level == 28) {
myself.ShowTutorialHTML(talker, "kanooth_dion.htm");

}
if (talker.level == 38) {
myself.ShowTutorialHTML(talker, "kanooth_heiness.htm");

}
if (talker.level == 48) {
myself.ShowTutorialHTML(talker, "kanooth_oren.htm");

}
if (talker.level == 58) {
myself.ShowTutorialHTML(talker, "kanooth_shuttgart.htm");

}
if (talker.level == 68) {
myself.ShowTutorialHTML(talker, "kanooth_rune.htm");

}
break;

}
case 34: {
if (talker.level == 79) {
myself.ShowTutorialHTML(talker, "ssq_tutorial_q0192_02.htm");

}
break;

}

}
	}

	protected void USER_CONNECTED(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9) {
if (talker.level < 6) {
if (myself.GetOneTimeQuestFlag(talker, 255) != 0) {
return;

}
i0 = gg.GetMemoState(talker, 255);
if (i0 == -1) {
i0 = 0;
i1 = 0;

} else {
i1 = i0 & 255;
i0 = i0 & 2147483392;

}
switch (i1) {
case 0: {
myself.AddTimerEx(gg.GetIndexFromCreature(talker) + 1000000, 1000 * 10);
i0 = 2147483392 & ~8388608 | 1048576;
myself.SetMemoState(talker, 255, 1 | i0);
if (gg.GetMemoStateEx(talker, 255, 1) < 0) {
myself.SetMemoStateEx(talker, 255, 1, -2);

}
break;

}
case 1: {
myself.ShowQuestionMark(talker, 1);
myself.VoiceEffect(talker, "tutorial_voice_006", 1000);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
break;

}
case 2: {
if (gg.HaveMemo(talker, 201) || gg.HaveMemo(talker, 202) || gg.HaveMemo(talker, 203) || gg.HaveMemo(talker, 204) || gg.HaveMemo(talker, 205) || gg.HaveMemo(talker, 206)) {
myself.ShowQuestionMark(talker, 6);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

} else {
myself.ShowQuestionMark(talker, 2);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
break;

}
case 3: {
i3 = 0;
if (gg.OwnItemCount(talker, 6353) == 1) {
i3 = 3;

}
if (gg.GetMemoStateEx(talker, 255, 1) == 2) {
i3 = 1;

} else if (i3 == 1) {
myself.ShowQuestionMark(talker, 3);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

} else if (i3 == 2) {
myself.ShowQuestionMark(talker, 4);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

} else if (i3 == 3) {
myself.ShowQuestionMark(talker, 5);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
break;

}
case 4: {
myself.ShowQuestionMark(talker, 12);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
break;

}

}
myself.EnableTutorialEvent(talker, i0);

} else {
if (talker.level == 18 && gg.HaveMemo(talker, 10276) == 0 && myself.GetOneTimeQuestFlag(talker, 10276) == 0) {
myself.ShowQuestionMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
if (talker.level == 28 && gg.HaveMemo(talker, 10277) == 0 && myself.GetOneTimeQuestFlag(talker, 10277) == 0) {
myself.ShowQuestionMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
if (talker.level == 38 && gg.HaveMemo(talker, 10278) == 0 && myself.GetOneTimeQuestFlag(talker, 10278) == 0) {
myself.ShowQuestionMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
if (talker.level == 48 && gg.HaveMemo(talker, 10279) == 0 && myself.GetOneTimeQuestFlag(talker, 10279) == 0) {
myself.ShowQuestionMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
if (talker.level == 58 && gg.HaveMemo(talker, 10280) == 0 && myself.GetOneTimeQuestFlag(talker, 10280) == 0) {
myself.ShowQuestionMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
if (talker.level == 68 && gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 0) {
myself.ShowQuestionMark(talker, 33);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}
if (talker.level == 79) {
if (gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 0) {
myself.ShowQuestionMark(talker, 34);
myself.SoundEffect(talker, "ItemSound.quest_tutorial");

}

}
i2 = 0;
i3 = 0;
i4 = myself.GetDominionSiegeID(talker);
i5 = gg.GetNRMemoStateEx(talker, 728, 1);
if (i4 > 0 && gg.GetDominionWarState(i4) == 5) {
if (gg.HaveNRMemo(talker, 728) == 0) {
myself.SetNRMemo(talker, 728);
gg.AddLog(1, talker, 728);
myself.SetNRMemoState(talker, 728, 0);
myself.SetNRMemoStateEx(talker, 728, 1, i4);

} else if (i4 != i5) {
myself.SetNRMemoState(talker, 728, 0);
myself.SetNRMemoStateEx(talker, 728, 1, i4);

}
switch (i4) {
case 81: {
if (gg.GetDominionWarState(81) == 5) {
if (gg.HaveNRMemo(talker, 717) == 0) {
myself.SetNRMemo(talker, 717);
gg.AddLog(1, talker, 717);
myself.SetNRMemoState(talker, 717, 0);
myself.SetNRFlagJournal(talker, 717, 1);
myself.ShowQuestMark(talker, 717);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 717);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 82: {
if (gg.GetDominionWarState(82) == 5) {
if (gg.HaveNRMemo(talker, 718) == 0) {
myself.SetNRMemo(talker, 718);
gg.AddLog(1, talker, 718);
myself.SetNRMemoState(talker, 718, 0);
myself.SetNRFlagJournal(talker, 718, 1);
myself.ShowQuestMark(talker, 718);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 718);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 83: {
if (gg.GetDominionWarState(83) == 5) {
if (gg.HaveNRMemo(talker, 719) == 0) {
myself.SetNRMemo(talker, 719);
gg.AddLog(1, talker, 719);
myself.SetNRMemoState(talker, 719, 0);
myself.SetNRFlagJournal(talker, 719, 1);
myself.ShowQuestMark(talker, 719);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 719);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 84: {
if (gg.GetDominionWarState(84) == 5) {
if (gg.HaveNRMemo(talker, 720) == 0) {
myself.SetNRMemo(talker, 720);
gg.AddLog(1, talker, 720);
myself.SetNRMemoState(talker, 720, 0);
myself.SetNRFlagJournal(talker, 720, 1);
myself.ShowQuestMark(talker, 720);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 720);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 85: {
if (gg.GetDominionWarState(85) == 5) {
if (gg.HaveNRMemo(talker, 721) == 0) {
myself.SetNRMemo(talker, 721);
gg.AddLog(1, talker, 721);
myself.SetNRMemoState(talker, 721, 0);
myself.SetNRFlagJournal(talker, 721, 1);
myself.ShowQuestMark(talker, 721);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 721);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 86: {
if (gg.GetDominionWarState(86) == 5) {
if (gg.HaveNRMemo(talker, 722) == 0) {
myself.SetNRMemo(talker, 722);
gg.AddLog(1, talker, 722);
myself.SetNRMemoState(talker, 722, 0);
myself.SetNRFlagJournal(talker, 722, 1);
myself.ShowQuestMark(talker, 722);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 722);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 87: {
if (gg.GetDominionWarState(87) == 5) {
if (gg.HaveNRMemo(talker, 723) == 0) {
myself.SetNRMemo(talker, 723);
gg.AddLog(1, talker, 723);
myself.SetNRMemoState(talker, 723, 0);
myself.SetNRFlagJournal(talker, 723, 1);
myself.ShowQuestMark(talker, 723);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 723);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 88: {
if (gg.GetDominionWarState(88) == 5) {
if (gg.HaveNRMemo(talker, 724) == 0) {
myself.SetNRMemo(talker, 724);
gg.AddLog(1, talker, 724);
myself.SetNRMemoState(talker, 724, 0);
myself.SetNRFlagJournal(talker, 724, 1);
myself.ShowQuestMark(talker, 724);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 724);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}
case 89: {
if (gg.GetDominionWarState(89) == 5) {
if (gg.HaveNRMemo(talker, 725) == 0) {
myself.SetNRMemo(talker, 725);
gg.AddLog(1, talker, 725);
myself.SetNRMemoState(talker, 725, 0);
myself.SetNRFlagJournal(talker, 725, 1);
myself.ShowQuestMark(talker, 725);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else {
myself.ShowQuestMark(talker, 725);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}

}
break;

}

}

} else {
if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 81) {
i6 = gg.GetNRMemoState(talker, 717);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 717);
gg.AddLog(2, talker, 717);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 82) {
i6 = gg.GetNRMemoState(talker, 718);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 718);
gg.AddLog(2, talker, 718);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 83) {
i6 = gg.GetNRMemoState(talker, 719);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 719);
gg.AddLog(2, talker, 719);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 84) {
i6 = gg.GetNRMemoState(talker, 720);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 720);
gg.AddLog(2, talker, 720);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 85) {
i6 = gg.GetNRMemoState(talker, 721);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 721);
gg.AddLog(2, talker, 721);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 86) {
i6 = gg.GetNRMemoState(talker, 722);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 722);
gg.AddLog(2, talker, 722);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 87) {
i6 = gg.GetNRMemoState(talker, 723);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 723);
gg.AddLog(2, talker, 723);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 88) {
i6 = gg.GetNRMemoState(talker, 724);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 724);
gg.AddLog(2, talker, 724);

}

} else if (gg.HaveNRMemo(talker, 728) == 1 && i5 == 89) {
i6 = gg.GetNRMemoState(talker, 725);
i7 = gg.GetNRMemoState(talker, 728);
if (i6 >= 0) {
myself.SetNRMemoState(talker, 728, i6 + i7);
myself.RemoveNRMemo(talker, 725);
gg.AddLog(2, talker, 725);

}

}
if (gg.HaveNRMemo(talker, 739) == 1 && gg.GetNRMemoState(talker, 739) > 0) {
myself.SetNRMemoState(talker, 739, 0);

}
if (gg.HaveNRMemo(talker, 729) == 1) {
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

}
if (gg.HaveNRMemo(talker, 730) == 1) {
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

}
if (gg.HaveNRMemo(talker, 731) == 1) {
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

}
if (gg.HaveNRMemo(talker, 732) == 1) {
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

}
if (gg.HaveNRMemo(talker, 733) == 1) {
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

}

}

}
	}

	protected void LEVEL_UP(HandlerParam talker, HandlerParam reply) {
if (reply == 18) {
if (gg.HaveMemo(talker, 10276) == 0 && myself.GetOneTimeQuestFlag(talker, 10276) == 0) {
myself.ShowTutorialHTML(talker, "kanooth_gludio.htm");
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.ShowRadar(talker, -13900, 123822, -3112, 2);

}

}
if (reply == 28) {
if (gg.HaveMemo(talker, 10277) == 0 && myself.GetOneTimeQuestFlag(talker, 10277) == 0) {
myself.ShowTutorialHTML(talker, "kanooth_dion.htm");
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.ShowRadar(talker, 18199, 146081, -3080, 2);

}

}
if (reply == 38) {
if (gg.HaveMemo(talker, 10278) == 0 && myself.GetOneTimeQuestFlag(talker, 10278) == 0) {
myself.ShowTutorialHTML(talker, "kanooth_heiness.htm");
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.ShowRadar(talker, 108384, 221563, -3592, 2);

}

}
if (reply == 48) {
if (gg.HaveMemo(talker, 10279) == 0 && myself.GetOneTimeQuestFlag(talker, 10279) == 0) {
myself.ShowTutorialHTML(talker, "kanooth_oren.htm");
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.ShowRadar(talker, 81023, 56456, -1552, 2);

}

}
if (reply == 58) {
if (gg.HaveMemo(talker, 10280) == 0 && myself.GetOneTimeQuestFlag(talker, 10280) == 0) {
myself.ShowTutorialHTML(talker, "kanooth_shuttgart.htm");
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.ShowRadar(talker, 85868, -142164, -1342, 2);

}

}
if (reply == 68) {
if (gg.HaveMemo(talker, 10281) == 0 && myself.GetOneTimeQuestFlag(talker, 10281) == 0) {
myself.ShowTutorialHTML(talker, "kanooth_rune.htm");
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.ShowRadar(talker, 42596, -47988, -800, 2);

}

}
if (reply == 79) {
if (gg.HaveMemo(talker, 192) == 0 && myself.GetOneTimeQuestFlag(talker, 192) == 0) {
myself.ShowTutorialHTML(talker, "ssq_tutorial_q0192_02.htm");
myself.SoundEffect(talker, "ItemSound.quest_tutorial");
myself.ShowRadar(talker, 81655, 54736, -1509, 2);

}

}
	}


}