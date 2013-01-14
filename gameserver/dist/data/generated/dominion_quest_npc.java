package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class dominion_quest_npc extends default_npc {
	protected void CREATED() {
gg.LoadDBSavingMap(myself.sm, 19);
gg.LoadDBSavingMap(myself.sm, 20);
gg.LoadDBSavingMap(myself.sm, 21);
gg.LoadDBSavingMap(myself.sm, 22);
gg.LoadDBSavingMap(myself.sm, 23);
	}

	protected void DOMINION_SIEGE_START(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3) {
gg.RegisterDBSavingMap(19, 111111111);
gg.RegisterDBSavingMap(20, 111111111);
gg.RegisterDBSavingMap(21, 111111111);
gg.RegisterDBSavingMap(22, 111111111);
gg.RegisterDBSavingMap(23, 111111111);
i1 = gg.GetNRMemoStateEx(talker, 728, 1);
i2 = myself.GetCurrentTick();
if (gg.HaveNRMemo(talker, 728) == 0) {
myself.SetNRMemo(talker, 728);
gg.AddLog(1, talker, 728);
myself.SetNRMemoState(talker, 728, 0);
myself.SetNRMemoStateEx(talker, 728, 1, i0);

} else if (i0 != i1) {
myself.SetNRMemoState(talker, 728, 0);
myself.SetNRMemoStateEx(talker, 728, 1, i0);

}
if (gg.HaveNRMemo(talker, 729) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 729);
myself.SetNRMemoState(talker, 729, i0);
myself.SetNRMemoStateEx(talker, 729, 1, i2);
gg.AddLog(1, talker, 729);
myself.SetNRFlagJournal(talker, 729, 1);
myself.ShowQuestMark(talker, 729);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 729) == 1) {
myself.SetNRMemoState(talker, 729, i0);
myself.SetNRMemoStateEx(talker, 729, 1, i2);
gg.AddLog(1, talker, 729);
myself.ShowQuestMark(talker, 729);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
switch (i0) {
case 81: {
if (gg.HaveNRMemo(talker, 717) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 717);
gg.AddLog(1, talker, 717);
myself.SetNRMemoState(talker, 717, 0);
myself.SetNRFlagJournal(talker, 717, 1);
myself.ShowQuestMark(talker, 717);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 717) == 1) {
myself.ShowQuestMark(talker, 717);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 82: {
if (gg.HaveNRMemo(talker, 718) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 718);
gg.AddLog(1, talker, 718);
myself.SetNRMemoState(talker, 718, 0);
myself.SetNRFlagJournal(talker, 718, 1);
myself.ShowQuestMark(talker, 718);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 718) == 1) {
myself.ShowQuestMark(talker, 718);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 83: {
if (gg.HaveNRMemo(talker, 719) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 719);
gg.AddLog(1, talker, 719);
myself.SetNRMemoState(talker, 719, 0);
myself.SetNRFlagJournal(talker, 719, 1);
myself.ShowQuestMark(talker, 719);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 719) == 1) {
myself.ShowQuestMark(talker, 719);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 84: {
if (gg.HaveNRMemo(talker, 720) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 720);
gg.AddLog(1, talker, 720);
myself.SetNRMemoState(talker, 720, 0);
myself.SetNRFlagJournal(talker, 720, 1);
myself.ShowQuestMark(talker, 720);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 720) == 1) {
myself.ShowQuestMark(talker, 720);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 85: {
if (gg.HaveNRMemo(talker, 721) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 721);
gg.AddLog(1, talker, 721);
myself.SetNRMemoState(talker, 721, 0);
myself.SetNRFlagJournal(talker, 721, 1);
myself.ShowQuestMark(talker, 721);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 721) == 1) {
myself.ShowQuestMark(talker, 721);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 86: {
if (gg.HaveNRMemo(talker, 722) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 722);
gg.AddLog(1, talker, 722);
myself.SetNRMemoState(talker, 722, 0);
myself.SetNRFlagJournal(talker, 722, 1);
myself.ShowQuestMark(talker, 722);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 722) == 1) {
myself.ShowQuestMark(talker, 722);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 87: {
if (gg.HaveNRMemo(talker, 723) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 723);
gg.AddLog(1, talker, 723);
myself.SetNRMemoState(talker, 723, 0);
myself.SetNRFlagJournal(talker, 723, 1);
myself.ShowQuestMark(talker, 723);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 723) == 1) {
myself.ShowQuestMark(talker, 723);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 88: {
if (gg.HaveNRMemo(talker, 724) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 724);
gg.AddLog(1, talker, 724);
myself.SetNRMemoState(talker, 724, 0);
myself.SetNRFlagJournal(talker, 724, 1);
myself.ShowQuestMark(talker, 724);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 724) == 1) {
myself.ShowQuestMark(talker, 724);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}
case 89: {
if (gg.HaveNRMemo(talker, 725) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 725);
gg.AddLog(1, talker, 725);
myself.SetNRMemoState(talker, 725, 0);
myself.SetNRFlagJournal(talker, 725, 1);
myself.ShowQuestMark(talker, 725);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 725) == 1) {
myself.ShowQuestMark(talker, 725);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
break;

}

}
	}

	protected void DOMINION_SIEGE_END(HandlerParam talker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9) {
i9 = 0;
if (gg.HaveNRMemo(talker, 728) == 0) {
myself.SetNRMemo(talker, 728);
gg.AddLog(1, talker, 728);

}
if (gg.HaveNRMemo(talker, 739) == 1 && gg.GetNRMemoState(talker, 739) > 0) {
myself.SetNRMemoState(talker, 739, 0);

}
switch (i0) {
case 81: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 10 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 10 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 10 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 10 == 0) {
i9 = i9 + 1;
i4 = 10;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 10 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 10 == 0) {
i9 = i9 + 1;
i5 = 10;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 10 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 10 == 0) {
i9 = i9 + 1;
i6 = 10;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 10 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 10 == 0) {
i9 = i9 + 1;
i7 = 10;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 717) == 1) {
i1 = gg.GetNRMemoState(talker, 717);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 717);
gg.AddLog(2, talker, 717);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 82: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 100 / 10 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 100 / 10 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 100 / 10 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 100 / 10 == 0) {
i9 = i9 + 1;
i4 = 10;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 100 / 10 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 100 / 10 == 0) {
i9 = i9 + 1;
i5 = 10;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 100 / 10 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 100 / 10 == 0) {
i9 = i9 + 1;
i6 = 10;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 100 / 10 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 100 / 10 == 0) {
i9 = i9 + 1;
i7 = 10;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 718) == 1) {
i1 = gg.GetNRMemoState(talker, 718);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 718);
gg.AddLog(2, talker, 718);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 83: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 1000 / 100 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 1000 / 100 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 1000 / 100 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 1000 / 100 == 0) {
i9 = i9 + 1;
i4 = 10;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 1000 / 100 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 1000 / 100 == 0) {
i9 = i9 + 1;
i5 = 10;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 1000 / 100 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 1000 / 100 == 0) {
i9 = i9 + 1;
i6 = 10;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 1000 / 100 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 1000 / 100 == 0) {
i9 = i9 + 1;
i7 = 10;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 719) == 1) {
i1 = gg.GetNRMemoState(talker, 719);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 719);
gg.AddLog(2, talker, 719);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 84: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 10000 / 1000 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 10000 / 1000 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 10000 / 1000 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 10000 / 1000 == 0) {
i9 = i9 + 1;
i4 = 30;

} else {
i4 = 30;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 10000 / 1000 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 10000 / 1000 == 0) {
i9 = i9 + 1;
i5 = 10;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 10000 / 1000 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 10000 / 1000 == 0) {
i9 = i9 + 1;
i6 = 10;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 10000 / 1000 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 10000 / 1000 == 0) {
i9 = i9 + 1;
i7 = 10;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 720) == 1) {
i1 = gg.GetNRMemoState(talker, 720);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 720);
gg.AddLog(2, talker, 720);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 85: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 100000 / 10000 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 100000 / 10000 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 100000 / 10000 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 100000 / 10000 == 0) {
i9 = i9 + 1;
i4 = 10;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 100000 / 10000 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 100000 / 10000 == 0) {
i9 = i9 + 1;
i5 = 10;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 100000 / 10000 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 100000 / 10000 == 0) {
i9 = i9 + 1;
i6 = 10;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 100000 / 10000 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 100000 / 10000 == 0) {
i9 = i9 + 1;
i7 = 10;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 721) == 1) {
i1 = gg.GetNRMemoState(talker, 721);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 721);
gg.AddLog(2, talker, 721);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 86: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 1000000 / 100000 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 1000000 / 100000 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 1000000 / 100000 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 1000000 / 100000 == 0) {
i9 = i9 + 1;
i4 = 10;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 1000000 / 100000 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 1000000 / 100000 == 0) {
i9 = i9 + 1;
i5 = 10;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 1000000 / 100000 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 1000000 / 100000 == 0) {
i9 = i9 + 1;
i6 = 10;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 1000000 / 100000 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 1000000 / 100000 == 0) {
i9 = i9 + 1;
i7 = 10;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 722) == 1) {
i1 = gg.GetNRMemoState(talker, 722);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 722);
gg.AddLog(2, talker, 722);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 87: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 10000000 / 1000000 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 10000000 / 1000000 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 10000000 / 1000000 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 10000000 / 1000000 == 0) {
i9 = i9 + 1;
i4 = 10;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 10000000 / 1000000 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 10000000 / 1000000 == 0) {
i9 = i9 + 1;
i5 = 10;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 10000000 / 1000000 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 10000000 / 1000000 == 0) {
i9 = i9 + 1;
i6 = 10;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 10000000 / 1000000 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 10000000 / 1000000 == 0) {
i9 = i9 + 1;
i7 = 10;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 723) == 1) {
i1 = gg.GetNRMemoState(talker, 723);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 723);
gg.AddLog(2, talker, 723);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 88: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 100000000 / 10000000 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) % 100000000 / 10000000 == 0) {
i9 = i9 + 1;
i3 = 50;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 100000000 / 10000000 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) % 100000000 / 10000000 == 0) {
i4 = 10;
i9 = i9 + 1;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 100000000 / 10000000 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) % 100000000 / 10000000 == 0) {
i5 = 10;
i9 = i9 + 1;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 100000000 / 10000000 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) % 100000000 / 10000000 == 0) {
i6 = 10;
i9 = i9 + 1;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 100000000 / 10000000 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) % 100000000 / 10000000 == 0) {
i7 = 10;
i9 = i9 + 1;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 724) == 1) {
i1 = gg.GetNRMemoState(talker, 724);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 724);
gg.AddLog(2, talker, 724);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}
case 89: {
if (gg.HaveNRMemo(talker, 729) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) / 100000000 == 1) {
i3 = 100;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 729, 1) > 360 && gg.GetDBSavingMap(19) / 100000000 == 0) {
i3 = 50;
i9 = i9 + 1;

} else {
i3 = 50;

}
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);

} else {
i3 = 0;

}
if (gg.HaveNRMemo(talker, 730) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) / 100000000 == 1) {
i4 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 730, 1) > 360 && gg.GetDBSavingMap(20) / 100000000 == 0) {
i4 = 10;
i9 = i9 + 1;

} else {
i4 = 10;

}
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);

} else {
i4 = 0;

}
if (gg.HaveNRMemo(talker, 731) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) / 100000000 == 1) {
i5 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 731, 1) > 360 && gg.GetDBSavingMap(21) / 100000000 == 0) {
i5 = 10;
i9 = i9 + 1;

} else {
i5 = 10;

}
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);

} else {
i5 = 0;

}
if (gg.HaveNRMemo(talker, 732) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) / 100000000 == 1) {
i6 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 732, 1) > 360 && gg.GetDBSavingMap(22) / 100000000 == 0) {
i6 = 10;
i9 = i9 + 1;

} else {
i6 = 10;

}
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);

} else {
i6 = 0;

}
if (gg.HaveNRMemo(talker, 733) == 1) {
if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) / 100000000 == 1) {
i7 = 40;
i9 = i9 + 2;

} else if (myself.GetCurrentTick() - gg.GetNRMemoStateEx(talker, 733, 1) > 360 && gg.GetDBSavingMap(23) / 100000000 == 0) {
i7 = 10;
i9 = i9 + 1;

} else {
i7 = 10;

}
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);

} else {
i7 = 0;

}
if (gg.HaveNRMemo(talker, 725) == 1) {
i1 = gg.GetNRMemoState(talker, 725);
i2 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i1 + i2 + i3 + i4 + i5 + i6 + i7);
myself.RemoveNRMemo(talker, 725);
gg.AddLog(2, talker, 725);
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000 * i9);
myself.IncrementParam(talker, 1, 13500 * i9);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000 * i9);
myself.IncrementParam(talker, 1, 11000 * i9);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000 * i9);
myself.IncrementParam(talker, 1, 8500 * i9);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000 * i9);
myself.IncrementParam(talker, 1, 6500 * i9);

} else {
myself.IncrementParam(talker, 0, 75000 * i9);
myself.IncrementParam(talker, 1, 5000 * i9);

}

}
break;

}

}
	}

	protected void DOMINION_SCRIPT_EVENT(HandlerParam talker, HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam c0, HandlerParam c1, HandlerParam c2) {
c0 = gg.GetCreatureFromIndex(script_event_arg1);
i0 = myself.GetDominionSiegeID(talker);
i1 = script_event_arg3 % 100;
i2 = script_event_arg3 / 100;
i3 = myself.GetCurrentTick();
if (i0 == script_event_arg2) {
if (gg.GetDominionWarState(script_event_arg2) == 5) {
if (i1 == 1) {
if (i2 == 729) {
if (gg.HaveNRMemo(talker, 729) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 729);
myself.SetNRMemoState(talker, 729, i0);
myself.SetNRMemoStateEx(talker, 729, 1, i3);
gg.AddLog(1, talker, 729);
myself.SetNRFlagJournal(talker, 729, 1);
myself.ShowQuestMark(talker, 729);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 729) == 1) {
myself.SetNRMemoState(talker, 729, i0);
myself.SetNRMemoStateEx(talker, 729, 1, i3);
gg.AddLog(1, talker, 729);
myself.ShowQuestMark(talker, 729);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72951, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72952, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72953, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72954, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72955, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72956, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72957, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72958, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72959, "", "", "", "", ""));
break;

}

}

} else if (i2 == 730) {
if (gg.HaveNRMemo(talker, 730) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 730);
myself.SetNRMemoState(talker, 730, i0);
myself.SetNRMemoStateEx(talker, 730, 1, i3);
gg.AddLog(1, talker, 730);
myself.SetNRFlagJournal(talker, 730, 1);
myself.ShowQuestMark(talker, 730);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 730) == 1) {
myself.SetNRMemoState(talker, 730, i0);
myself.SetNRMemoStateEx(talker, 730, 1, i3);
gg.AddLog(1, talker, 730);
myself.ShowQuestMark(talker, 730);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73051, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73052, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73053, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73054, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73055, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73056, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73057, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73058, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73059, "", "", "", "", ""));
break;

}

}

} else if (i2 == 731) {
if (gg.HaveNRMemo(talker, 731) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 731);
myself.SetNRMemoState(talker, 731, i0);
myself.SetNRMemoStateEx(talker, 731, 1, i3);
gg.AddLog(1, talker, 731);
myself.SetNRFlagJournal(talker, 731, 1);
myself.ShowQuestMark(talker, 731);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 731) == 1) {
myself.SetNRMemoState(talker, 731, i0);
myself.SetNRMemoStateEx(talker, 731, 1, i3);
gg.AddLog(1, talker, 731);
myself.ShowQuestMark(talker, 731);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73151, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73152, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73153, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73154, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73155, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73156, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73157, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73158, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73159, "", "", "", "", ""));
break;

}

}

} else if (i2 == 732) {
if (gg.HaveNRMemo(talker, 732) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 732);
myself.SetNRMemoState(talker, 732, i0);
myself.SetNRMemoStateEx(talker, 732, 1, i3);
gg.AddLog(1, talker, 732);
myself.SetNRFlagJournal(talker, 732, 1);
myself.ShowQuestMark(talker, 732);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 732) == 1) {
myself.SetNRMemoState(talker, 732, i0);
myself.SetNRMemoStateEx(talker, 732, 1, i3);
gg.AddLog(1, talker, 732);
myself.ShowQuestMark(talker, 732);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73251, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73252, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73253, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73254, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73255, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73256, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73257, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73258, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73259, "", "", "", "", ""));
break;

}

}

} else if (i2 == 733) {
if (gg.HaveNRMemo(talker, 733) == 0 && talker.level >= 40 && myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation)) {
myself.SetNRMemo(talker, 733);
myself.SetNRMemoState(talker, 733, i0);
myself.SetNRMemoStateEx(talker, 733, 1, i3);
gg.AddLog(1, talker, 733);
myself.SetNRFlagJournal(talker, 733, 1);
myself.ShowQuestMark(talker, 733);
myself.SoundEffect(talker, "ItemSound.quest_middle");

} else if (gg.HaveNRMemo(talker, 733) == 1) {
myself.SetNRMemoState(talker, 733, i0);
myself.SetNRMemoStateEx(talker, 733, 1, i3);
gg.AddLog(1, talker, 733);
myself.ShowQuestMark(talker, 733);
myself.SoundEffect(talker, "ItemSound.quest_middle");

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73351, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73352, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73353, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73354, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73355, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73356, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73357, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73358, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73359, "", "", "", "", ""));
break;

}

}

}

} else if (i1 == 2) {
if (i2 == 729) {
if (gg.HaveNRMemo(talker, 729) == 1) {
myself.RemoveNRMemo(talker, 729);
gg.AddLog(2, talker, 729);
if (gg.HaveNRMemo(talker, 728) == 1) {
i4 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i4 + 50);

} else {
myself.SetNRMemoState(talker, 728, 50);

}
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000);
myself.IncrementParam(talker, 1, 13500);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000);
myself.IncrementParam(talker, 1, 11000);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000);
myself.IncrementParam(talker, 1, 8500);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000);
myself.IncrementParam(talker, 1, 6500);

} else {
myself.IncrementParam(talker, 0, 75000);
myself.IncrementParam(talker, 1, 5000);

}

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72961, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72962, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72963, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72964, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72965, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72966, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72967, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72968, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(72969, "", "", "", "", ""));
break;

}

}

} else if (i2 == 730) {
if (gg.HaveNRMemo(talker, 730) == 1) {
myself.RemoveNRMemo(talker, 730);
gg.AddLog(2, talker, 730);
if (gg.HaveNRMemo(talker, 728) == 1) {
i4 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i4 + 10);

} else {
myself.SetNRMemoState(talker, 728, 10);

}
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000);
myself.IncrementParam(talker, 1, 13500);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000);
myself.IncrementParam(talker, 1, 11000);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000);
myself.IncrementParam(talker, 1, 8500);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000);
myself.IncrementParam(talker, 1, 6500);

} else {
myself.IncrementParam(talker, 0, 75000);
myself.IncrementParam(talker, 1, 5000);

}

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73061, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73062, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73063, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73064, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73065, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73066, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73067, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73068, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73069, "", "", "", "", ""));
break;

}

}

} else if (i2 == 731) {
if (gg.HaveNRMemo(talker, 731) == 1) {
myself.RemoveNRMemo(talker, 731);
gg.AddLog(2, talker, 731);
if (gg.HaveNRMemo(talker, 728) == 1) {
i4 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i4 + 10);

} else {
myself.SetNRMemoState(talker, 728, 10);

}
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000);
myself.IncrementParam(talker, 1, 13500);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000);
myself.IncrementParam(talker, 1, 11000);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000);
myself.IncrementParam(talker, 1, 8500);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000);
myself.IncrementParam(talker, 1, 6500);

} else {
myself.IncrementParam(talker, 0, 75000);
myself.IncrementParam(talker, 1, 5000);

}

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73161, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73162, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73163, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73164, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73165, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73166, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73167, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73168, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73169, "", "", "", "", ""));
break;

}

}

} else if (i2 == 732) {
if (gg.HaveNRMemo(talker, 732) == 1) {
myself.RemoveNRMemo(talker, 732);
gg.AddLog(2, talker, 732);
if (gg.HaveNRMemo(talker, 728) == 1) {
i4 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i4 + 10);

} else {
myself.SetNRMemoState(talker, 728, 10);

}
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000);
myself.IncrementParam(talker, 1, 13500);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000);
myself.IncrementParam(talker, 1, 11000);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000);
myself.IncrementParam(talker, 1, 8500);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000);
myself.IncrementParam(talker, 1, 6500);

} else {
myself.IncrementParam(talker, 0, 75000);
myself.IncrementParam(talker, 1, 5000);

}

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73261, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73262, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73263, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73264, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73265, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73266, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73267, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73268, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73269, "", "", "", "", ""));
break;

}

}

} else if (i2 == 733) {
if (gg.HaveNRMemo(talker, 733) == 1) {
myself.RemoveNRMemo(talker, 733);
gg.AddLog(2, talker, 733);
if (gg.HaveNRMemo(talker, 728) == 1) {
i4 = gg.GetNRMemoState(talker, 728);
myself.SetNRMemoState(talker, 728, i4 + 10);

} else {
myself.SetNRMemoState(talker, 728, 10);

}
if (talker.level >= 75) {
myself.IncrementParam(talker, 0, 135000);
myself.IncrementParam(talker, 1, 13500);

} else if (talker.level >= 61) {
myself.IncrementParam(talker, 0, 125000);
myself.IncrementParam(talker, 1, 11000);

} else if (talker.level >= 52) {
myself.IncrementParam(talker, 0, 105000);
myself.IncrementParam(talker, 1, 8500);

} else if (talker.level >= 45) {
myself.IncrementParam(talker, 0, 85000);
myself.IncrementParam(talker, 1, 6500);

} else {
myself.IncrementParam(talker, 0, 75000);
myself.IncrementParam(talker, 1, 5000);

}

}
switch (script_event_arg2) {
case 81: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73361, "", "", "", "", ""));
break;

}
case 82: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73362, "", "", "", "", ""));
break;

}
case 83: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73363, "", "", "", "", ""));
break;

}
case 84: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73364, "", "", "", "", ""));
break;

}
case 85: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73365, "", "", "", "", ""));
break;

}
case 86: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73366, "", "", "", "", ""));
break;

}
case 87: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73367, "", "", "", "", ""));
break;

}
case 88: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73368, "", "", "", "", ""));
break;

}
case 89: {
gg.ShowOnScreenMsgStr(talker, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73369, "", "", "", "", ""));
break;

}

}

}

} else if (i1 == 3) {
if (i2 == 729) {
if (gg.HaveNRMemo(talker, 729) == 1) {
myself.SetNRMemoState(talker, 729, 100);

}

} else if (i2 == 730) {
if (gg.HaveNRMemo(talker, 730) == 1) {
myself.SetNRMemoState(talker, 730, 100);

}

} else if (i2 == 731) {
if (gg.HaveNRMemo(talker, 731) == 1) {
myself.SetNRMemoState(talker, 731, 100);

}

} else if (i2 == 732) {
if (gg.HaveNRMemo(talker, 732) == 1) {
myself.SetNRMemoState(talker, 732, 100);

}

} else if (i2 == 733) {
if (gg.HaveNRMemo(talker, 733) == 1) {
myself.SetNRMemoState(talker, 733, 100);

}

}

}

}

}
	}

	protected void DOMINION_SUPPLY_DESTRUCTED(HandlerParam attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0, HandlerParam c1) {
if (i0 == 81) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 10 >= 1) {
i2 = i1 - 1;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 82) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 100 >= 10) {
i2 = i1 - 10;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 83) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 1000 >= 100) {
i2 = i1 - 100;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 84) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 10000 >= 1000) {
i2 = i1 - 1000;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 85) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 100000 >= 10000) {
i2 = i1 - 10000;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 86) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 1000000 >= 100000) {
i2 = i1 - 100000;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 87) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 10000000 >= 1000000) {
i2 = i1 - 1000000;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 88) {
i1 = gg.GetDBSavingMap(19);
if (i1 % 100000000 >= 10000000) {
i2 = i1 - 10000000;
gg.RegisterDBSavingMap(19, i2);

}

} else if (i0 == 89) {
i1 = gg.GetDBSavingMap(19);
if (i1 >= 100000000) {
i2 = i1 - 100000000;
gg.RegisterDBSavingMap(19, i2);

}

}
i1 = gg.GetIndexFromCreature(myself.sm);
if (gg.IsNull(attacker) == 0) {
if (attacker.master) {
c0 = attacker.master;

} else {
c0 = attacker;

}
if (myself.IsNullCreature(c0) == 0) {
i3 = gg.Party_GetCount(c0);
if (i3 > 0) {
for (i4 = 0; i4 < i3; i4 = i4 + 1) {
c1 = gg.Party_GetCreature(c0, i4);
if (myself.IsNullCreature(c1) == 0 && myself.GetDominionSiegeID(c1) != i0) {
i5 = myself.GetDominionSiegeID(c1);
i2 = i5 + 636;
if (gg.GetDominionWarState(i5) == 5) {
if (gg.HaveNRMemo(c1, i2) == 1) {
i6 = gg.GetNRMemoState(c1, i2);
if (gg.GetNRMemoStateEx(c1, i2, 1) == 0) {
myself.SetNRFlagJournal(c1, i2, 2);
myself.ShowQuestMark(c1, i2);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c1, i2, 1, 1);
myself.SetNRMemoState(c1, i2, i6 + 90);

} else if (gg.GetNRMemoStateEx(c1, i2, 1) == 10) {
myself.SetNRFlagJournal(c1, i2, 7);
myself.ShowQuestMark(c1, i2);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c1, i2, 1, 11);
myself.SetNRMemoState(c1, i2, i6 + 90);

} else if (gg.GetNRMemoStateEx(c1, i2, 1) == 100) {
myself.SetNRFlagJournal(c1, i2, 9);
myself.ShowQuestMark(c1, i2);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c1, i2, 1, 101);
myself.SetNRMemoState(c1, i2, i6 + 90);

} else if (gg.GetNRMemoStateEx(c1, i2, 1) == 110) {
myself.SetNRFlagJournal(c1, i2, 11);
myself.ShowQuestMark(c1, i2);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c1, i2, 1, 111);
myself.SetNRMemoState(c1, i2, i6 + 90);
if (c1.level >= 80) {
myself.IncrementParam(c1, 0, 460000);
myself.IncrementParam(c1, 1, 47000);

} else if (c1.level >= 75) {
myself.IncrementParam(c1, 0, 450000);
myself.IncrementParam(c1, 1, 45000);

} else if (c1.level >= 61) {
myself.IncrementParam(c1, 0, 420000);
myself.IncrementParam(c1, 1, 37000);

} else if (c1.level >= 52) {
myself.IncrementParam(c1, 0, 360000);
myself.IncrementParam(c1, 1, 32000);

} else if (c1.level >= 45) {
myself.IncrementParam(c1, 0, 290000);
myself.IncrementParam(c1, 1, 22000);

} else {
myself.IncrementParam(c1, 0, 250000);
myself.IncrementParam(c1, 1, 17000);

}

}

}
if (gg.HaveMemo(c1, 147) == 1 && gg.GetMemoState(c1, 147) == 1 || gg.GetMemoState(c1, 147) == 11 && myself.GetOneTimeQuestFlag(c1, 147) == 0) {
i7 = gg.GetMemoState(c1, 147);
myself.SetMemoState(c1, 147, i7 + 100);
if (gg.GetMemoState(c1, 147) == 11) {
myself.SetFlagJournal(c1, 147, 4);
myself.ShowQuestMark(c1, 147);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SetFlagJournal(c1, 147, 3);
myself.ShowQuestMark(c1, 147);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

} else if (gg.HaveMemo(c1, 148) == 1 && gg.GetMemoState(c1, 148) == 1 || gg.GetMemoState(c1, 148) == 11 && myself.GetOneTimeQuestFlag(c1, 148) == 0) {
i7 = gg.GetMemoStateEx(c1, 148, 1);
i8 = gg.GetMemoState(c1, 148);
if (i7 == 0) {
myself.SetMemoStateEx(c1, 148, 1, 1);

} else {
myself.SetMemoState(c1, 148, i8 + 100);
if (gg.GetMemoState(c1, 148) == 11) {
myself.SetFlagJournal(c1, 148, 4);
myself.ShowQuestMark(c1, 148);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SetFlagJournal(c1, 148, 3);
myself.ShowQuestMark(c1, 148);
myself.SoundEffect(c1, "ItemSound.quest_middle");

}

}

}

}

}

}

} else if (myself.IsNullCreature(c0) == 0 && myself.GetDominionSiegeID(c0) != i0) {
i5 = myself.GetDominionSiegeID(c0);
i2 = i5 + 636;
if (gg.GetDominionWarState(i5) == 5) {
if (gg.HaveNRMemo(c0, i2) == 1) {
i6 = gg.GetNRMemoState(c0, i2);
if (gg.GetNRMemoStateEx(c0, i2, 1) == 0) {
myself.SetNRFlagJournal(c0, i2, 2);
myself.ShowQuestMark(c0, i2);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c0, i2, 1, 1);
myself.SetNRMemoState(c0, i2, i6 + 90);

} else if (gg.GetNRMemoStateEx(c0, i2, 1) == 10) {
myself.SetNRFlagJournal(c0, i2, 7);
myself.ShowQuestMark(c0, i2);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c0, i2, 1, 11);
myself.SetNRMemoState(c0, i2, i6 + 90);

} else if (gg.GetNRMemoStateEx(c0, i2, 1) == 100) {
myself.SetNRFlagJournal(c0, i2, 9);
myself.ShowQuestMark(c0, i2);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c0, i2, 1, 101);
myself.SetNRMemoState(c0, i2, i6 + 90);

} else if (gg.GetNRMemoStateEx(c0, i2, 1) == 110) {
myself.SetNRFlagJournal(c0, i2, 11);
myself.ShowQuestMark(c0, i2);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetNRMemoStateEx(c0, i2, 1, 111);
myself.SetNRMemoState(c0, i2, i6 + 90);
if (c0.level >= 80) {
myself.IncrementParam(c0, 0, 460000);
myself.IncrementParam(c0, 1, 47000);

} else if (c0.level >= 75) {
myself.IncrementParam(c0, 0, 450000);
myself.IncrementParam(c0, 1, 45000);

} else if (c0.level >= 61) {
myself.IncrementParam(c0, 0, 420000);
myself.IncrementParam(c0, 1, 37000);

} else if (c0.level >= 52) {
myself.IncrementParam(c0, 0, 360000);
myself.IncrementParam(c0, 1, 32000);

} else if (c0.level >= 45) {
myself.IncrementParam(c0, 0, 290000);
myself.IncrementParam(c0, 1, 22000);

} else {
myself.IncrementParam(c0, 0, 250000);
myself.IncrementParam(c0, 1, 17000);

}

}

}
if (gg.HaveMemo(c0, 147) == 1 && gg.GetMemoState(c0, 147) == 1 || gg.GetMemoState(c0, 147) == 11 && myself.GetOneTimeQuestFlag(c0, 147) == 0) {
i7 = gg.GetMemoState(c0, 147);
if (gg.GetMemoState(c0, 147) == 11) {
myself.SetFlagJournal(c0, 147, 4);
myself.ShowQuestMark(c0, 147);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 147, i7 + 100);

} else {
myself.SetFlagJournal(c0, 147, 3);
myself.ShowQuestMark(c0, 147);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 147, i7 + 100);

}

} else if (gg.HaveMemo(c0, 148) == 1 && gg.GetMemoState(c0, 148) == 1 || gg.GetMemoState(c0, 148) == 11 && myself.GetOneTimeQuestFlag(c0, 148) == 0) {
i7 = gg.GetMemoStateEx(c0, 148, 1);
i8 = gg.GetMemoState(c0, 148);
if (i7 == 0) {
myself.SetMemoStateEx(c0, 148, 1, 1);

} else {
myself.SetMemoState(c0, 148, i8 + 100);
if (gg.GetMemoState(c0, 148) == 11) {
myself.SetFlagJournal(c0, 148, 4);
myself.ShowQuestMark(c0, 148);
myself.SoundEffect(c0, "ItemSound.quest_middle");

} else {
myself.SetFlagJournal(c0, 148, 3);
myself.ShowQuestMark(c0, 148);
myself.SoundEffect(c0, "ItemSound.quest_middle");

}

}

}

}

}

}

}
if (gg.GetDominionWarState(i0) == 5) {
gg.SendDominionScriptEvent(i1, i0, 72902);

}
	}

	protected void DOMINION_SIEGE_PC_KILLED(HandlerParam talker, HandlerParam attacker, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam i6, HandlerParam i7, HandlerParam i8, HandlerParam i9, HandlerParam c0, HandlerParam c1) {
i4 = 0;
if (gg.IsNull(attacker) == 0) {
if (attacker.master) {
c0 = attacker.master;

} else {
c0 = attacker;

}
if (myself.IsNullCreature(c0) == 0) {
i3 = gg.Party_GetCount(c0);
if (i3 != 0) {
for (i4 = 0; i4 < i3; i4 = i4 + 1) {
c1 = gg.Party_GetCreature(c0, i4);
if (myself.IsNullCreature(c1) == 0 && myself.GetDominionSiegeID(c1) != myself.GetDominionSiegeID(talker) && myself.GetDominionSiegeID(c1) > 0 && myself.GetDominionSiegeID(talker) > 0 && talker.level >= 40) {
if (gg.HaveMemo(c1, 147) == 1 && gg.GetMemoState(c1, 147) == 1 || gg.GetMemoState(c1, 147) == 101 && myself.GetOneTimeQuestFlag(c1, 147) == 0) {
i1 = gg.GetMemoStateEx(c1, 147, 1);
i2 = gg.GetMemoState(c1, 147);
if (i1 >= 9) {
myself.SetMemoState(c1, 147, i2 + 10);
myself.SetFlagJournal(c1, 147, 2);
myself.ShowQuestMark(c1, 147);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SetMemoStateEx(c1, 147, 1, i1 + 1);

}

} else if (gg.HaveMemo(c1, 148) == 1 && gg.GetMemoState(c1, 148) == 1 || gg.GetMemoState(c1, 148) == 101 && myself.GetOneTimeQuestFlag(c1, 148) == 0) {
i1 = gg.GetMemoStateEx(c1, 148, 1);
i2 = gg.GetMemoState(c1, 148);
if (i1 >= 29) {
myself.SetMemoState(c1, 148, i2 + 10);
myself.SetFlagJournal(c1, 148, 2);
myself.ShowQuestMark(c1, 148);
myself.SoundEffect(c1, "ItemSound.quest_middle");

} else {
myself.SetMemoStateEx(c1, 148, 1, i1 + 1);

}

}
if (gg.HaveMemo(c1, 176) == 1 && gg.GetMemoState(c1, 176) == 1 && gg.GetMemoStateEx(c1, 176, 1) < 9 && myself.GetOneTimeQuestFlag(c1, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c1, 176, 1);
myself.SetMemoStateEx(c1, 176, 1, i1 + 1);
if (i1 >= 8) {
myself.SetFlagJournal(c1, 176, 2);
myself.ShowQuestMark(c1, 176);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetMemoState(c1, 176, 2);

}

} else if (gg.HaveMemo(c1, 176) == 1 && gg.GetMemoState(c1, 176) == 3 && gg.GetMemoStateEx(c1, 176, 1) < 18 && myself.GetOneTimeQuestFlag(c1, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c1, 176, 1);
myself.SetMemoStateEx(c1, 176, 1, i1 + 1);
if (i1 >= 17) {
myself.SetFlagJournal(c1, 176, 4);
myself.ShowQuestMark(c1, 176);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetMemoState(c1, 176, 4);

}

} else if (gg.HaveMemo(c1, 176) == 1 && gg.GetMemoState(c1, 176) == 5 && gg.GetMemoStateEx(c1, 176, 1) < 27 && myself.GetOneTimeQuestFlag(c1, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c1, 176, 1);
myself.SetMemoStateEx(c1, 176, 1, i1 + 1);
if (i1 >= 26) {
myself.SetFlagJournal(c1, 176, 6);
myself.ShowQuestMark(c1, 176);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetMemoState(c1, 176, 6);

}

} else if (gg.HaveMemo(c1, 176) == 1 && gg.GetMemoState(c1, 176) == 7 && gg.GetMemoStateEx(c1, 176, 1) < 36 && myself.GetOneTimeQuestFlag(c1, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c1, 176, 1);
myself.SetMemoStateEx(c1, 176, 1, i1 + 1);
if (i1 >= 35) {
myself.SetFlagJournal(c1, 176, 8);
myself.ShowQuestMark(c1, 176);
myself.SoundEffect(c1, "ItemSound.quest_middle");
myself.SetMemoState(c1, 176, 8);

}

}
if (myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation) && talker.level >= 61 && myself.IsInCategory(8, c1.occupation) || myself.IsInCategory(9, c1.occupation) && c1.level >= 40) {
if (myself.IsInCategory(0, talker.occupation)) {
if (talker.occupation == 57 || talker.occupation == 118) {
i5 = gg.Rand(4) + 3;
i6 = gg.GetNRMemoState(c1, 738);
i7 = gg.GetNRMemoStateEx(c1, 738, 1);
i8 = gg.GetNRMemoState(c1, 728);
i9 = gg.GetNRMemoState(c1, 739);
if (gg.HaveNRMemo(c1, 738) == 0) {
if (i9 % 100 / 10 != 1) {
if (gg.GetDailyQuestFlag(c1, 738) == 1) {
myself.SetNRMemo(c1, 738);
gg.AddLog(1, c1, 738);
myself.SetNRMemoState(c1, 738, i5);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73851, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c1, 738);
gg.SetDailyQuestFlag(c1, 738);
gg.AddLog(2, c1, 738);
myself.SetNRMemoState(c1, 728, i8 + i6 * 10);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73862, "", "", "", "", ""));
if (gg.HaveNRMemo(c1, 739) == 0) {
myself.SetNRMemo(c1, 739);
gg.AddLog(1, c1, 739);
myself.SetNRMemoState(c1, 739, 10);

} else {
myself.SetNRMemoState(c1, 739, i9 + 10);

}
if (c1.level >= 85) {
myself.IncrementParam(c1, 0, 587000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 84) {
myself.IncrementParam(c1, 0, 582000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 83) {
myself.IncrementParam(c1, 0, 576000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 82) {
myself.IncrementParam(c1, 0, 570000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 81) {
myself.IncrementParam(c1, 0, 565000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 80) {
myself.IncrementParam(c1, 0, 559000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 79) {
myself.IncrementParam(c1, 0, 555000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 78) {
myself.IncrementParam(c1, 0, 551000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 77) {
myself.IncrementParam(c1, 0, 548000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 76) {
myself.IncrementParam(c1, 0, 545000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 75) {
myself.IncrementParam(c1, 0, 543000);
myself.IncrementParam(c1, 1, 54000);

} else if (c1.level >= 70) {
myself.IncrementParam(c1, 0, 534000);
myself.IncrementParam(c1, 1, 51000);

} else if (c1.level >= 61) {
myself.IncrementParam(c1, 0, 505000);
myself.IncrementParam(c1, 1, 45000);

} else if (c1.level >= 55) {
myself.IncrementParam(c1, 0, 462000);
myself.IncrementParam(c1, 1, 38000);

} else if (c1.level >= 50) {
myself.IncrementParam(c1, 0, 413000);
myself.IncrementParam(c1, 1, 32000);

} else if (c1.level >= 45) {
myself.IncrementParam(c1, 0, 358000);
myself.IncrementParam(c1, 1, 26000);

} else {
myself.IncrementParam(c1, 0, 301000);
myself.IncrementParam(c1, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c1, 738, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73861, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else if (talker.occupation == 5 || talker.occupation == 6 || talker.occupation == 20 || talker.occupation == 33 || talker.occupation == 90 || talker.occupation == 91 || talker.occupation == 99 || talker.occupation == 106) {
i5 = gg.Rand(5) + 4;
i6 = gg.GetNRMemoState(c1, 734);
i7 = gg.GetNRMemoStateEx(c1, 734, 1);
i8 = gg.GetNRMemoState(c1, 728);
i9 = gg.GetNRMemoState(c1, 739);
if (gg.HaveNRMemo(c1, 734) == 0) {
if (i9 % 10 != 1) {
if (gg.GetDailyQuestFlag(c1, 734) == 1) {
myself.SetNRMemo(c1, 734);
gg.AddLog(1, c1, 734);
myself.SetNRMemoState(c1, 734, i5);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73451, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c1, 734);
gg.SetDailyQuestFlag(c1, 734);
gg.AddLog(2, c1, 734);
myself.SetNRMemoState(c1, 728, i8 + i6 * 9);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73462, "", "", "", "", ""));
if (gg.HaveNRMemo(c1, 739) == 0) {
myself.SetNRMemo(c1, 739);
gg.AddLog(1, c1, 739);
myself.SetNRMemoState(c1, 739, 1);

} else {
myself.SetNRMemoState(c1, 739, i9 + 1);

}
if (c1.level >= 85) {
myself.IncrementParam(c1, 0, 587000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 84) {
myself.IncrementParam(c1, 0, 582000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 83) {
myself.IncrementParam(c1, 0, 576000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 82) {
myself.IncrementParam(c1, 0, 570000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 81) {
myself.IncrementParam(c1, 0, 565000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 80) {
myself.IncrementParam(c1, 0, 559000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 79) {
myself.IncrementParam(c1, 0, 555000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 78) {
myself.IncrementParam(c1, 0, 551000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 77) {
myself.IncrementParam(c1, 0, 548000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 76) {
myself.IncrementParam(c1, 0, 545000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 75) {
myself.IncrementParam(c1, 0, 543000);
myself.IncrementParam(c1, 1, 54000);

} else if (c1.level >= 70) {
myself.IncrementParam(c1, 0, 534000);
myself.IncrementParam(c1, 1, 51000);

} else if (c1.level >= 61) {
myself.IncrementParam(c1, 0, 505000);
myself.IncrementParam(c1, 1, 45000);

} else if (c1.level >= 55) {
myself.IncrementParam(c1, 0, 462000);
myself.IncrementParam(c1, 1, 38000);

} else if (c1.level >= 50) {
myself.IncrementParam(c1, 0, 413000);
myself.IncrementParam(c1, 1, 32000);

} else if (c1.level >= 45) {
myself.IncrementParam(c1, 0, 358000);
myself.IncrementParam(c1, 1, 26000);

} else {
myself.IncrementParam(c1, 0, 301000);
myself.IncrementParam(c1, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c1, 734, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73461, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else {
i5 = gg.Rand(10) + 9;
i6 = gg.GetNRMemoState(c1, 735);
i7 = gg.GetNRMemoStateEx(c1, 735, 1);
i8 = gg.GetNRMemoState(c1, 728);
i9 = gg.GetNRMemoState(c1, 739);
if (gg.HaveNRMemo(c1, 735) == 0) {
if (i9 / 10000 != 1) {
if (gg.GetDailyQuestFlag(c1, 735) == 1) {
myself.SetNRMemo(c1, 735);
gg.AddLog(1, c1, 735);
myself.SetNRMemoState(c1, 735, i5);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73551, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c1, 735);
gg.SetDailyQuestFlag(c1, 735);
gg.AddLog(2, c1, 735);
myself.SetNRMemoState(c1, 728, i8 + i6 * 7);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73562, "", "", "", "", ""));
if (gg.HaveNRMemo(c1, 739) == 0) {
myself.SetNRMemo(c1, 739);
gg.AddLog(1, c1, 739);
myself.SetNRMemoState(c1, 739, 10000);

} else {
myself.SetNRMemoState(c1, 739, i9 + 10000);

}
if (c1.level >= 85) {
myself.IncrementParam(c1, 0, 587000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 84) {
myself.IncrementParam(c1, 0, 582000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 83) {
myself.IncrementParam(c1, 0, 576000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 82) {
myself.IncrementParam(c1, 0, 570000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 81) {
myself.IncrementParam(c1, 0, 565000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 80) {
myself.IncrementParam(c1, 0, 559000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 79) {
myself.IncrementParam(c1, 0, 555000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 78) {
myself.IncrementParam(c1, 0, 551000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 77) {
myself.IncrementParam(c1, 0, 548000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 76) {
myself.IncrementParam(c1, 0, 545000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 75) {
myself.IncrementParam(c1, 0, 543000);
myself.IncrementParam(c1, 1, 54000);

} else if (c1.level >= 70) {
myself.IncrementParam(c1, 0, 534000);
myself.IncrementParam(c1, 1, 51000);

} else if (c1.level >= 61) {
myself.IncrementParam(c1, 0, 505000);
myself.IncrementParam(c1, 1, 45000);

} else if (c1.level >= 55) {
myself.IncrementParam(c1, 0, 462000);
myself.IncrementParam(c1, 1, 38000);

} else if (c1.level >= 50) {
myself.IncrementParam(c1, 0, 413000);
myself.IncrementParam(c1, 1, 32000);

} else if (c1.level >= 45) {
myself.IncrementParam(c1, 0, 358000);
myself.IncrementParam(c1, 1, 26000);

} else {
myself.IncrementParam(c1, 0, 301000);
myself.IncrementParam(c1, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c1, 735, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73561, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

}

} else if (myself.IsInCategory(1, talker.occupation)) {
if (talker.occupation == 51 || talker.occupation == 115) {
i5 = gg.Rand(4) + 3;
i6 = gg.GetNRMemoState(c1, 738);
i7 = gg.GetNRMemoStateEx(c1, 738, 1);
i8 = gg.GetNRMemoState(c1, 728);
i9 = gg.GetNRMemoState(c1, 739);
if (gg.HaveNRMemo(c1, 738) == 0) {
if (i9 % 100 / 10 != 1) {
if (gg.GetDailyQuestFlag(c1, 738) == 1) {
myself.SetNRMemo(c1, 738);
gg.AddLog(1, c1, 738);
myself.SetNRMemoState(c1, 738, i5);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73851, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c1, 738);
gg.SetDailyQuestFlag(c1, 738);
gg.AddLog(2, c1, 738);
myself.SetNRMemoState(c1, 728, i8 + i6 * 10);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73862, "", "", "", "", ""));
if (gg.HaveNRMemo(c1, 739) == 0) {
myself.SetNRMemo(c1, 739);
gg.AddLog(1, c1, 739);
myself.SetNRMemoState(c1, 739, 10);

} else {
myself.SetNRMemoState(c1, 739, i9 + 10);

}
if (c1.level >= 85) {
myself.IncrementParam(c1, 0, 587000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 84) {
myself.IncrementParam(c1, 0, 582000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 83) {
myself.IncrementParam(c1, 0, 576000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 82) {
myself.IncrementParam(c1, 0, 570000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 81) {
myself.IncrementParam(c1, 0, 565000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 80) {
myself.IncrementParam(c1, 0, 559000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 79) {
myself.IncrementParam(c1, 0, 555000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 78) {
myself.IncrementParam(c1, 0, 551000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 77) {
myself.IncrementParam(c1, 0, 548000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 76) {
myself.IncrementParam(c1, 0, 545000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 75) {
myself.IncrementParam(c1, 0, 543000);
myself.IncrementParam(c1, 1, 54000);

} else if (c1.level >= 70) {
myself.IncrementParam(c1, 0, 534000);
myself.IncrementParam(c1, 1, 51000);

} else if (c1.level >= 61) {
myself.IncrementParam(c1, 0, 505000);
myself.IncrementParam(c1, 1, 45000);

} else if (c1.level >= 55) {
myself.IncrementParam(c1, 0, 462000);
myself.IncrementParam(c1, 1, 38000);

} else if (c1.level >= 50) {
myself.IncrementParam(c1, 0, 413000);
myself.IncrementParam(c1, 1, 32000);

} else if (c1.level >= 45) {
myself.IncrementParam(c1, 0, 358000);
myself.IncrementParam(c1, 1, 26000);

} else {
myself.IncrementParam(c1, 0, 301000);
myself.IncrementParam(c1, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c1, 738, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73861, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else if (talker.occupation == 52 || talker.occupation == 43 || talker.occupation == 30 || talker.occupation == 17 || talker.occupation == 16 || talker.occupation == 97 || talker.occupation == 98 || talker.occupation == 105 || talker.occupation == 112 || talker.occupation == 116) {
i5 = gg.Rand(6) + 5;
i6 = gg.GetNRMemoState(c1, 737);
i7 = gg.GetNRMemoStateEx(c1, 737, 1);
i8 = gg.GetNRMemoState(c1, 728);
i9 = gg.GetNRMemoState(c1, 739);
if (gg.HaveNRMemo(c1, 737) == 0) {
if (i9 % 1000 / 100 != 1) {
if (gg.GetDailyQuestFlag(c1, 737) == 1) {
myself.SetNRMemo(c1, 737);
gg.AddLog(1, c1, 737);
myself.SetNRMemoState(c1, 737, i5);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73751, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c1, 737);
gg.SetDailyQuestFlag(c1, 737);
gg.AddLog(2, c1, 737);
myself.SetNRMemoState(c1, 728, i8 + i6 * 8);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73762, "", "", "", "", ""));
if (gg.HaveNRMemo(c1, 739) == 0) {
myself.SetNRMemo(c1, 739);
gg.AddLog(1, c1, 739);
myself.SetNRMemoState(c1, 739, 100);

} else {
myself.SetNRMemoState(c1, 739, i9 + 100);

}
if (c1.level >= 85) {
myself.IncrementParam(c1, 0, 587000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 84) {
myself.IncrementParam(c1, 0, 582000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 83) {
myself.IncrementParam(c1, 0, 576000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 82) {
myself.IncrementParam(c1, 0, 570000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 81) {
myself.IncrementParam(c1, 0, 565000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 80) {
myself.IncrementParam(c1, 0, 559000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 79) {
myself.IncrementParam(c1, 0, 555000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 78) {
myself.IncrementParam(c1, 0, 551000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 77) {
myself.IncrementParam(c1, 0, 548000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 76) {
myself.IncrementParam(c1, 0, 545000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 75) {
myself.IncrementParam(c1, 0, 543000);
myself.IncrementParam(c1, 1, 54000);

} else if (c1.level >= 70) {
myself.IncrementParam(c1, 0, 534000);
myself.IncrementParam(c1, 1, 51000);

} else if (c1.level >= 61) {
myself.IncrementParam(c1, 0, 505000);
myself.IncrementParam(c1, 1, 45000);

} else if (c1.level >= 55) {
myself.IncrementParam(c1, 0, 462000);
myself.IncrementParam(c1, 1, 38000);

} else if (c1.level >= 50) {
myself.IncrementParam(c1, 0, 413000);
myself.IncrementParam(c1, 1, 32000);

} else if (c1.level >= 45) {
myself.IncrementParam(c1, 0, 358000);
myself.IncrementParam(c1, 1, 26000);

} else {
myself.IncrementParam(c1, 0, 301000);
myself.IncrementParam(c1, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c1, 737, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73761, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else {
i5 = gg.Rand(10) + 9;
i6 = gg.GetNRMemoState(c1, 736);
i7 = gg.GetNRMemoStateEx(c1, 736, 1);
i8 = gg.GetNRMemoState(c1, 728);
i9 = gg.GetNRMemoState(c1, 739);
if (gg.HaveNRMemo(c1, 736) == 0) {
if (i9 % 10000 / 1000 != 1) {
if (gg.GetDailyQuestFlag(c1, 736) == 1) {
myself.SetNRMemo(c1, 736);
gg.AddLog(1, c1, 736);
myself.SetNRMemoState(c1, 736, i5);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73651, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c1, 736);
gg.SetDailyQuestFlag(c1, 736);
gg.AddLog(2, c1, 736);
myself.SetNRMemoState(c1, 728, i8 + i6 * 7);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73662, "", "", "", "", ""));
if (gg.HaveNRMemo(c1, 739) == 0) {
myself.SetNRMemo(c1, 739);
gg.AddLog(1, c1, 739);
myself.SetNRMemoState(c1, 739, 1000);

} else {
myself.SetNRMemoState(c1, 739, i9 + 1000);

}
if (c1.level >= 85) {
myself.IncrementParam(c1, 0, 587000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 84) {
myself.IncrementParam(c1, 0, 582000);
myself.IncrementParam(c1, 1, 59000);

} else if (c1.level >= 83) {
myself.IncrementParam(c1, 0, 576000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 82) {
myself.IncrementParam(c1, 0, 570000);
myself.IncrementParam(c1, 1, 58000);

} else if (c1.level >= 81) {
myself.IncrementParam(c1, 0, 565000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 80) {
myself.IncrementParam(c1, 0, 559000);
myself.IncrementParam(c1, 1, 57000);

} else if (c1.level >= 79) {
myself.IncrementParam(c1, 0, 555000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 78) {
myself.IncrementParam(c1, 0, 551000);
myself.IncrementParam(c1, 1, 56000);

} else if (c1.level >= 77) {
myself.IncrementParam(c1, 0, 548000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 76) {
myself.IncrementParam(c1, 0, 545000);
myself.IncrementParam(c1, 1, 55000);

} else if (c1.level >= 75) {
myself.IncrementParam(c1, 0, 543000);
myself.IncrementParam(c1, 1, 54000);

} else if (c1.level >= 70) {
myself.IncrementParam(c1, 0, 534000);
myself.IncrementParam(c1, 1, 51000);

} else if (c1.level >= 61) {
myself.IncrementParam(c1, 0, 505000);
myself.IncrementParam(c1, 1, 45000);

} else if (c1.level >= 55) {
myself.IncrementParam(c1, 0, 462000);
myself.IncrementParam(c1, 1, 38000);

} else if (c1.level >= 50) {
myself.IncrementParam(c1, 0, 413000);
myself.IncrementParam(c1, 1, 32000);

} else if (c1.level >= 45) {
myself.IncrementParam(c1, 0, 358000);
myself.IncrementParam(c1, 1, 26000);

} else {
myself.IncrementParam(c1, 0, 301000);
myself.IncrementParam(c1, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c1, 736, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c1, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73661, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

}

}

}

}

}

} else if (myself.IsNullCreature(c0) == 0 && myself.GetDominionSiegeID(c0) != myself.GetDominionSiegeID(talker) && myself.GetDominionSiegeID(c0) > 0 && myself.GetDominionSiegeID(talker) > 0 && talker.level >= 40) {
if (gg.HaveMemo(c0, 147) == 1 && gg.GetMemoState(c0, 147) == 1 || gg.GetMemoState(c0, 147) == 101 && myself.GetOneTimeQuestFlag(c0, 147) == 0) {
i1 = gg.GetMemoStateEx(c0, 147, 1);
i2 = gg.GetMemoState(c0, 147);
if (i1 >= 9) {
myself.SetMemoState(c0, 147, i2 + 10);
myself.SetFlagJournal(c0, 147, 2);
myself.ShowQuestMark(c0, 147);
myself.SoundEffect(c0, "ItemSound.quest_middle");

} else {
myself.SetMemoStateEx(c0, 147, 1, i1 + 1);

}

} else if (gg.HaveMemo(c0, 148) == 1 && gg.GetMemoState(c0, 148) == 1 || gg.GetMemoState(c0, 148) == 101 && myself.GetOneTimeQuestFlag(c0, 148) == 0) {
i1 = gg.GetMemoStateEx(c0, 148, 1);
i2 = gg.GetMemoState(c0, 148);
if (i1 >= 29) {
myself.SetMemoState(c0, 148, i2 + 10);
myself.SetFlagJournal(c0, 148, 2);
myself.ShowQuestMark(c0, 148);
myself.SoundEffect(c0, "ItemSound.quest_middle");

} else {
myself.SetMemoStateEx(c0, 148, 1, i1 + 1);

}

}
if (gg.HaveMemo(c0, 176) == 1 && gg.GetMemoState(c0, 176) == 1 && gg.GetMemoStateEx(c0, 176, 1) < 9 && myself.GetOneTimeQuestFlag(c0, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c0, 176, 1);
myself.SetMemoStateEx(c0, 176, 1, i1 + 1);
if (i1 >= 8) {
myself.SetFlagJournal(c0, 176, 2);
myself.ShowQuestMark(c0, 176);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 176, 2);

}

} else if (gg.HaveMemo(c0, 176) == 1 && gg.GetMemoState(c0, 176) == 3 && gg.GetMemoStateEx(c0, 176, 1) < 18 && myself.GetOneTimeQuestFlag(c0, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c0, 176, 1);
myself.SetMemoStateEx(c0, 176, 1, i1 + 1);
if (i1 >= 17) {
myself.SetFlagJournal(c0, 176, 4);
myself.ShowQuestMark(c0, 176);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 176, 4);

}

} else if (gg.HaveMemo(c0, 176) == 1 && gg.GetMemoState(c0, 176) == 5 && gg.GetMemoStateEx(c0, 176, 1) < 27 && myself.GetOneTimeQuestFlag(c0, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c0, 176, 1);
myself.SetMemoStateEx(c0, 176, 1, i1 + 1);
if (i1 >= 26) {
myself.SetFlagJournal(c0, 176, 6);
myself.ShowQuestMark(c0, 176);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 176, 6);

}

} else if (gg.HaveMemo(c0, 176) == 1 && gg.GetMemoState(c0, 176) == 7 && gg.GetMemoStateEx(c0, 176, 1) < 36 && myself.GetOneTimeQuestFlag(c0, 176) == 0 && talker.level >= 61) {
i1 = gg.GetMemoStateEx(c0, 176, 1);
myself.SetMemoStateEx(c0, 176, 1, i1 + 1);
if (i1 >= 35) {
myself.SetFlagJournal(c0, 176, 8);
myself.ShowQuestMark(c0, 176);
myself.SoundEffect(c0, "ItemSound.quest_middle");
myself.SetMemoState(c0, 176, 8);

}

}
if (myself.IsInCategory(8, talker.occupation) || myself.IsInCategory(9, talker.occupation) && talker.level >= 61 && myself.IsInCategory(8, c0.occupation) || myself.IsInCategory(9, c0.occupation) && c0.level >= 40) {
if (myself.IsInCategory(0, talker.occupation)) {
if (talker.occupation == 57 || talker.occupation == 118) {
i5 = gg.Rand(4) + 3;
i6 = gg.GetNRMemoState(c0, 738);
i7 = gg.GetNRMemoStateEx(c0, 738, 1);
i8 = gg.GetNRMemoState(c0, 728);
i9 = gg.GetNRMemoState(c0, 739);
if (gg.HaveNRMemo(c0, 738) == 0) {
if (i9 % 100 / 10 != 1) {
if (gg.GetDailyQuestFlag(c0, 738) == 1) {
myself.SetNRMemo(c0, 738);
gg.AddLog(1, c0, 738);
myself.SetNRMemoState(c0, 738, i5);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73851, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c0, 738);
gg.SetDailyQuestFlag(c0, 738);
gg.AddLog(2, c0, 738);
myself.SetNRMemoState(c0, 728, i8 + i6 * 10);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73862, "", "", "", "", ""));
if (gg.HaveNRMemo(c0, 739) == 0) {
myself.SetNRMemo(c0, 739);
gg.AddLog(1, c0, 739);
myself.SetNRMemoState(c0, 739, 10);

} else {
myself.SetNRMemoState(c0, 739, i9 + 10);

}
if (c0.level >= 85) {
myself.IncrementParam(c0, 0, 587000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 84) {
myself.IncrementParam(c0, 0, 582000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 83) {
myself.IncrementParam(c0, 0, 576000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 82) {
myself.IncrementParam(c0, 0, 570000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 81) {
myself.IncrementParam(c0, 0, 565000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 80) {
myself.IncrementParam(c0, 0, 559000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 79) {
myself.IncrementParam(c0, 0, 555000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 78) {
myself.IncrementParam(c0, 0, 551000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 77) {
myself.IncrementParam(c0, 0, 548000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 76) {
myself.IncrementParam(c0, 0, 545000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 75) {
myself.IncrementParam(c0, 0, 543000);
myself.IncrementParam(c0, 1, 54000);

} else if (c0.level >= 70) {
myself.IncrementParam(c0, 0, 534000);
myself.IncrementParam(c0, 1, 51000);

} else if (c0.level >= 61) {
myself.IncrementParam(c0, 0, 505000);
myself.IncrementParam(c0, 1, 45000);

} else if (c0.level >= 55) {
myself.IncrementParam(c0, 0, 462000);
myself.IncrementParam(c0, 1, 38000);

} else if (c0.level >= 50) {
myself.IncrementParam(c0, 0, 413000);
myself.IncrementParam(c0, 1, 32000);

} else if (c0.level >= 45) {
myself.IncrementParam(c0, 0, 358000);
myself.IncrementParam(c0, 1, 26000);

} else {
myself.IncrementParam(c0, 0, 301000);
myself.IncrementParam(c0, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c0, 738, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73861, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else if (talker.occupation == 5 || talker.occupation == 6 || talker.occupation == 20 || talker.occupation == 33 || talker.occupation == 90 || talker.occupation == 91 || talker.occupation == 99 || talker.occupation == 106) {
i5 = gg.Rand(5) + 4;
i6 = gg.GetNRMemoState(c0, 734);
i7 = gg.GetNRMemoStateEx(c0, 734, 1);
i8 = gg.GetNRMemoState(c0, 728);
i9 = gg.GetNRMemoState(c0, 739);
if (gg.HaveNRMemo(c0, 734) == 0) {
if (i9 % 10 != 1) {
if (gg.GetDailyQuestFlag(c0, 734) == 1) {
myself.SetNRMemo(c0, 734);
gg.AddLog(1, c0, 734);
myself.SetNRMemoState(c0, 734, i5);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73451, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c0, 734);
gg.SetDailyQuestFlag(c0, 734);
gg.AddLog(2, c0, 734);
myself.SetNRMemoState(c0, 728, i8 + i6 * 9);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73462, "", "", "", "", ""));
if (gg.HaveNRMemo(c0, 739) == 0) {
myself.SetNRMemo(c0, 739);
gg.AddLog(1, c0, 739);
myself.SetNRMemoState(c0, 739, 1);

} else {
myself.SetNRMemoState(c0, 739, i9 + 1);

}
if (c0.level >= 85) {
myself.IncrementParam(c0, 0, 587000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 84) {
myself.IncrementParam(c0, 0, 582000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 83) {
myself.IncrementParam(c0, 0, 576000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 82) {
myself.IncrementParam(c0, 0, 570000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 81) {
myself.IncrementParam(c0, 0, 565000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 80) {
myself.IncrementParam(c0, 0, 559000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 79) {
myself.IncrementParam(c0, 0, 555000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 78) {
myself.IncrementParam(c0, 0, 551000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 77) {
myself.IncrementParam(c0, 0, 548000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 76) {
myself.IncrementParam(c0, 0, 545000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 75) {
myself.IncrementParam(c0, 0, 543000);
myself.IncrementParam(c0, 1, 54000);

} else if (c0.level >= 70) {
myself.IncrementParam(c0, 0, 534000);
myself.IncrementParam(c0, 1, 51000);

} else if (c0.level >= 61) {
myself.IncrementParam(c0, 0, 505000);
myself.IncrementParam(c0, 1, 45000);

} else if (c0.level >= 55) {
myself.IncrementParam(c0, 0, 462000);
myself.IncrementParam(c0, 1, 38000);

} else if (c0.level >= 50) {
myself.IncrementParam(c0, 0, 413000);
myself.IncrementParam(c0, 1, 32000);

} else if (c0.level >= 45) {
myself.IncrementParam(c0, 0, 358000);
myself.IncrementParam(c0, 1, 26000);

} else {
myself.IncrementParam(c0, 0, 301000);
myself.IncrementParam(c0, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c0, 734, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73461, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else {
i5 = gg.Rand(10) + 9;
i6 = gg.GetNRMemoState(c0, 735);
i7 = gg.GetNRMemoStateEx(c0, 735, 1);
i8 = gg.GetNRMemoState(c0, 728);
i9 = gg.GetNRMemoState(c0, 739);
if (gg.HaveNRMemo(c0, 735) == 0) {
if (i9 / 10000 != 1) {
if (gg.GetDailyQuestFlag(c0, 735) == 1) {
myself.SetNRMemo(c0, 735);
gg.AddLog(1, c0, 735);
myself.SetNRMemoState(c0, 735, i5);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73551, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c0, 735);
gg.SetDailyQuestFlag(c0, 735);
gg.AddLog(2, c0, 735);
myself.SetNRMemoState(c0, 728, i8 + i6 * 7);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73562, "", "", "", "", ""));
if (gg.HaveNRMemo(c0, 739) == 0) {
myself.SetNRMemo(c0, 739);
gg.AddLog(1, c0, 739);
myself.SetNRMemoState(c0, 739, 10000);

} else {
myself.SetNRMemoState(c0, 739, i9 + 10000);

}
if (c0.level >= 85) {
myself.IncrementParam(c0, 0, 587000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 84) {
myself.IncrementParam(c0, 0, 582000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 83) {
myself.IncrementParam(c0, 0, 576000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 82) {
myself.IncrementParam(c0, 0, 570000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 81) {
myself.IncrementParam(c0, 0, 565000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 80) {
myself.IncrementParam(c0, 0, 559000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 79) {
myself.IncrementParam(c0, 0, 555000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 78) {
myself.IncrementParam(c0, 0, 551000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 77) {
myself.IncrementParam(c0, 0, 548000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 76) {
myself.IncrementParam(c0, 0, 545000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 75) {
myself.IncrementParam(c0, 0, 543000);
myself.IncrementParam(c0, 1, 54000);

} else if (c0.level >= 70) {
myself.IncrementParam(c0, 0, 534000);
myself.IncrementParam(c0, 1, 51000);

} else if (c0.level >= 61) {
myself.IncrementParam(c0, 0, 505000);
myself.IncrementParam(c0, 1, 45000);

} else if (c0.level >= 55) {
myself.IncrementParam(c0, 0, 462000);
myself.IncrementParam(c0, 1, 38000);

} else if (c0.level >= 50) {
myself.IncrementParam(c0, 0, 413000);
myself.IncrementParam(c0, 1, 32000);

} else if (c0.level >= 45) {
myself.IncrementParam(c0, 0, 358000);
myself.IncrementParam(c0, 1, 26000);

} else {
myself.IncrementParam(c0, 0, 301000);
myself.IncrementParam(c0, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c0, 735, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73561, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

}

} else if (myself.IsInCategory(1, talker.occupation)) {
if (talker.occupation == 51 || talker.occupation == 115) {
i5 = gg.Rand(4) + 3;
i6 = gg.GetNRMemoState(c0, 738);
i7 = gg.GetNRMemoStateEx(c0, 738, 1);
i8 = gg.GetNRMemoState(c0, 728);
i9 = gg.GetNRMemoState(c0, 739);
if (gg.HaveNRMemo(c0, 738) == 0) {
if (i9 % 100 / 10 != 1) {
if (gg.GetDailyQuestFlag(c0, 738) == 1) {
myself.SetNRMemo(c0, 738);
gg.AddLog(1, c0, 738);
myself.SetNRMemoState(c0, 738, i5);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73851, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c0, 738);
gg.SetDailyQuestFlag(c0, 738);
gg.AddLog(2, c0, 738);
myself.SetNRMemoState(c0, 728, i8 + i6 * 10);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73862, "", "", "", "", ""));
if (gg.HaveNRMemo(c0, 739) == 0) {
myself.SetNRMemo(c0, 739);
gg.AddLog(1, c0, 739);
myself.SetNRMemoState(c0, 739, 10);

} else {
myself.SetNRMemoState(c0, 739, i9 + 10);

}
if (c0.level >= 85) {
myself.IncrementParam(c0, 0, 587000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 84) {
myself.IncrementParam(c0, 0, 582000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 83) {
myself.IncrementParam(c0, 0, 576000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 82) {
myself.IncrementParam(c0, 0, 570000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 81) {
myself.IncrementParam(c0, 0, 565000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 80) {
myself.IncrementParam(c0, 0, 559000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 79) {
myself.IncrementParam(c0, 0, 555000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 78) {
myself.IncrementParam(c0, 0, 551000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 77) {
myself.IncrementParam(c0, 0, 548000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 76) {
myself.IncrementParam(c0, 0, 545000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 75) {
myself.IncrementParam(c0, 0, 543000);
myself.IncrementParam(c0, 1, 54000);

} else if (c0.level >= 70) {
myself.IncrementParam(c0, 0, 534000);
myself.IncrementParam(c0, 1, 51000);

} else if (c0.level >= 61) {
myself.IncrementParam(c0, 0, 505000);
myself.IncrementParam(c0, 1, 45000);

} else if (c0.level >= 55) {
myself.IncrementParam(c0, 0, 462000);
myself.IncrementParam(c0, 1, 38000);

} else if (c0.level >= 50) {
myself.IncrementParam(c0, 0, 413000);
myself.IncrementParam(c0, 1, 32000);

} else if (c0.level >= 45) {
myself.IncrementParam(c0, 0, 358000);
myself.IncrementParam(c0, 1, 26000);

} else {
myself.IncrementParam(c0, 0, 301000);
myself.IncrementParam(c0, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c0, 738, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73861, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else if (talker.occupation == 52 || talker.occupation == 43 || talker.occupation == 30 || talker.occupation == 17 || talker.occupation == 16 || talker.occupation == 97 || talker.occupation == 98 || talker.occupation == 105 || talker.occupation == 112 || talker.occupation == 116) {
i5 = gg.Rand(6) + 5;
i6 = gg.GetNRMemoState(c0, 737);
i7 = gg.GetNRMemoStateEx(c0, 737, 1);
i8 = gg.GetNRMemoState(c0, 728);
i9 = gg.GetNRMemoState(c0, 739);
if (gg.HaveNRMemo(c0, 737) == 0) {
if (i9 % 1000 / 100 != 1) {
if (gg.GetDailyQuestFlag(c0, 737) == 1) {
myself.SetNRMemo(c0, 737);
gg.AddLog(1, c0, 737);
myself.SetNRMemoState(c0, 737, i5);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73751, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c0, 737);
gg.SetDailyQuestFlag(c0, 737);
gg.AddLog(2, c0, 737);
myself.SetNRMemoState(c0, 728, i8 + i6 * 8);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73762, "", "", "", "", ""));
if (gg.HaveNRMemo(c0, 739) == 0) {
myself.SetNRMemo(c0, 739);
gg.AddLog(1, c0, 739);
myself.SetNRMemoState(c0, 739, 100);

} else {
myself.SetNRMemoState(c0, 739, i9 + 100);

}
if (c0.level >= 85) {
myself.IncrementParam(c0, 0, 587000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 84) {
myself.IncrementParam(c0, 0, 582000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 83) {
myself.IncrementParam(c0, 0, 576000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 82) {
myself.IncrementParam(c0, 0, 570000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 81) {
myself.IncrementParam(c0, 0, 565000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 80) {
myself.IncrementParam(c0, 0, 559000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 79) {
myself.IncrementParam(c0, 0, 555000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 78) {
myself.IncrementParam(c0, 0, 551000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 77) {
myself.IncrementParam(c0, 0, 548000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 76) {
myself.IncrementParam(c0, 0, 545000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 75) {
myself.IncrementParam(c0, 0, 543000);
myself.IncrementParam(c0, 1, 54000);

} else if (c0.level >= 70) {
myself.IncrementParam(c0, 0, 534000);
myself.IncrementParam(c0, 1, 51000);

} else if (c0.level >= 61) {
myself.IncrementParam(c0, 0, 505000);
myself.IncrementParam(c0, 1, 45000);

} else if (c0.level >= 55) {
myself.IncrementParam(c0, 0, 462000);
myself.IncrementParam(c0, 1, 38000);

} else if (c0.level >= 50) {
myself.IncrementParam(c0, 0, 413000);
myself.IncrementParam(c0, 1, 32000);

} else if (c0.level >= 45) {
myself.IncrementParam(c0, 0, 358000);
myself.IncrementParam(c0, 1, 26000);

} else {
myself.IncrementParam(c0, 0, 301000);
myself.IncrementParam(c0, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c0, 737, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73761, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

} else {
i5 = gg.Rand(10) + 9;
i6 = gg.GetNRMemoState(c0, 736);
i7 = gg.GetNRMemoStateEx(c0, 736, 1);
i8 = gg.GetNRMemoState(c0, 728);
i9 = gg.GetNRMemoState(c0, 739);
if (gg.HaveNRMemo(c0, 736) == 0) {
if (i9 % 10000 / 1000 != 1) {
if (gg.GetDailyQuestFlag(c0, 736) == 1) {
myself.SetNRMemo(c0, 736);
gg.AddLog(1, c0, 736);
myself.SetNRMemoState(c0, 736, i5);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73651, gg.IntToStr(i5), "", "", "", ""));

}

}

} else if (i6 - i7 <= 1) {
myself.RemoveNRMemo(c0, 736);
gg.SetDailyQuestFlag(c0, 736);
gg.AddLog(2, c0, 736);
myself.SetNRMemoState(c0, 728, i8 + i6 * 7);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73662, "", "", "", "", ""));
if (gg.HaveNRMemo(c0, 739) == 0) {
myself.SetNRMemo(c0, 739);
gg.AddLog(1, c0, 739);
myself.SetNRMemoState(c0, 739, 1000);

} else {
myself.SetNRMemoState(c0, 739, i9 + 1000);

}
if (c0.level >= 85) {
myself.IncrementParam(c0, 0, 587000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 84) {
myself.IncrementParam(c0, 0, 582000);
myself.IncrementParam(c0, 1, 59000);

} else if (c0.level >= 83) {
myself.IncrementParam(c0, 0, 576000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 82) {
myself.IncrementParam(c0, 0, 570000);
myself.IncrementParam(c0, 1, 58000);

} else if (c0.level >= 81) {
myself.IncrementParam(c0, 0, 565000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 80) {
myself.IncrementParam(c0, 0, 559000);
myself.IncrementParam(c0, 1, 57000);

} else if (c0.level >= 79) {
myself.IncrementParam(c0, 0, 555000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 78) {
myself.IncrementParam(c0, 0, 551000);
myself.IncrementParam(c0, 1, 56000);

} else if (c0.level >= 77) {
myself.IncrementParam(c0, 0, 548000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 76) {
myself.IncrementParam(c0, 0, 545000);
myself.IncrementParam(c0, 1, 55000);

} else if (c0.level >= 75) {
myself.IncrementParam(c0, 0, 543000);
myself.IncrementParam(c0, 1, 54000);

} else if (c0.level >= 70) {
myself.IncrementParam(c0, 0, 534000);
myself.IncrementParam(c0, 1, 51000);

} else if (c0.level >= 61) {
myself.IncrementParam(c0, 0, 505000);
myself.IncrementParam(c0, 1, 45000);

} else if (c0.level >= 55) {
myself.IncrementParam(c0, 0, 462000);
myself.IncrementParam(c0, 1, 38000);

} else if (c0.level >= 50) {
myself.IncrementParam(c0, 0, 413000);
myself.IncrementParam(c0, 1, 32000);

} else if (c0.level >= 45) {
myself.IncrementParam(c0, 0, 358000);
myself.IncrementParam(c0, 1, 26000);

} else {
myself.IncrementParam(c0, 0, 301000);
myself.IncrementParam(c0, 1, 20000);

}

} else {
myself.SetNRMemoStateEx(c0, 736, 1, i7 + 1);
gg.ShowOnScreenMsgStr(c0, 2, 0, 0, 0, 1, 0, 5000, 0, gg.MakeFString(73661, gg.IntToStr(i6), gg.IntToStr(i7 + 1), "", "", ""));

}

}

}

}

}

}

}
	}


}