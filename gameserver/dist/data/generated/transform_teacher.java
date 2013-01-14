package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class transform_teacher extends citizen {
	protected String fnHi1 = "";
	protected String fnHi2 = "";
	protected int quest_num = -1;
	protected int flag_subjob_start = 10255;
	protected int flag_subjob_end = 10266;
	protected int fee_delete_subjob = 10000000;
	protected int skill_acquire = 4;
	protected int multisell = -1;
	protected int skill_acquire2 = 5;
	protected int skill_book_id1 = 0;
	protected int skill_book_id15 = 0;
	protected int skill_book_id16 = 10612;
	protected String fnHi3 = "master_transformation008.htm";
	protected String fnHi4 = "master_transformation008.htm";
	protected String fnHi5 = "master_transformation007.htm";
	protected String fnHi6 = "master_transformation009no.htm";
	protected String fnHi7 = "master_transformation008no.htm";
	protected String fnHi8 = "master_transformation010no.htm";

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam i1) {
if (ask == -299) {
if (reply == 0) {
if (myself.GetOneTimeQuestFlag(talker, quest_num)) {
myself.ShowEtcSkillList(talker, skill_acquire, "");

} else {
myself.ShowPage(talker, fnHi1);

}

} else if (reply == 1) {
if (myself.GetOneTimeQuestFlag(talker, quest_num)) {
if (multisell > -1) {
myself.ShowMultisell(multisell, talker);

}

} else {
myself.ShowPage(talker, fnHi2);

}

}

} else if (ask == -282) {
if (reply == 0) {
i0 = 0;
i1 = 0;
if (talker.subjob_id != 0) {
myself.ShowPage(talker, fnHi3);
return;

}
for (i0 = skill_book_id1; i0 < skill_book_id15 + 1; i0 = i0 + 1) {
if (gg.OwnItemCount(talker, i0) > 0) {
i1 = i1 + 1;

}

}
if (gg.OwnItemCount(talker, skill_book_id16) > 0) {
i1 = i1 + 1;

}
if (i1 == 0) {
myself.ShowPage(talker, fnHi4);
return;

}
if (myself.GetOneTimeQuestFlag(talker, quest_num) == 0) {
myself.ShowPage(talker, fnHi5);
return;

}
myself.ShowEtcSkillList(talker, skill_acquire2, "");

} else if (reply == 1) {
i0 = 0;
i1 = 0;
if (talker.subjob_id != 0) {
myself.ShowPage(talker, fnHi3);
return;

}
if (gg.OwnItemCount(talker, 57) < fee_delete_subjob) {
myself.ShowPage(talker, fnHi7);
return;

}
if (myself.GetOneTimeQuestFlag(talker, quest_num) == 0) {
myself.ShowPage(talker, fnHi5);
return;

}
for (i0 = flag_subjob_start; i0 < flag_subjob_end + 1; i0 = i0 + 1) {
if (myself.GetOneTimeQuestFlag(talker, i0) == 1) {
i1 = i1 + 1;

}

}
if (i1 == 0) {
myself.ShowPage(talker, fnHi8);
return;

}
myself.DeleteItem1(talker, 57, fee_delete_subjob);
for (i0 = skill_book_id1; i0 < skill_book_id15 + 1; i0 = i0 + 1) {
if (gg.OwnItemCount(talker, i0) > 0) {
myself.DeleteItem1(talker, i0, gg.OwnItemCount(talker, i0));

}

}
if (gg.OwnItemCount(talker, skill_book_id16) > 0) {
myself.DeleteItem1(talker, skill_book_id16, gg.OwnItemCount(talker, skill_book_id16));

}
for (i0 = flag_subjob_start; i0 < flag_subjob_end + 1; i0 = i0 + 1) {
if (myself.GetOneTimeQuestFlag(talker, i0) == 1) {
myself.SetOneTimeQuestFlag(talker, i0, 0);

}

}
myself.DeleteAcquireSkills(talker, skill_acquire2);
myself.AddLogByNpc(899, talker, fee_delete_subjob, 0);
myself.ShowPage(talker, fnHi6);

}

}
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest, HandlerParam i0) {
myself.ShowGrowEtcSkillMessage(talker, skill_name_id, i0, "");
	}


}