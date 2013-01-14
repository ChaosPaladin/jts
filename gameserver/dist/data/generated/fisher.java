package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class fisher extends merchant {
	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam i0, HandlerParam fhtml0) {
if (ask == -401) {
if (reply == 1) {
if (myself.GetFishingEventRewardRemainTime() == 0) {
myself.ShowPage(talker, "no_fish_event_reward001.htm");

} else {
myself.GiveFishingEventPrize(talker);
myself.ShowPage(talker, "fish_event_reward001.htm");

}

}

} else if (ask == -402) {
myself.ShowHtmlFishingEventRanking(talker);

} else if (ask == -403) {
i0 = myself.GetFishingEventRanking(talker);
if (i0 == 0) {
myself.Say("순위에 없습니다");

} else {
myself.Say(gg.IntToStr(i0) + "등 입니다");

}

} else if (ask == -404) {
if (reply == 1) {
myself.ShowHtmlFishingEventRanking(talker);

}

}
super;
	}

	protected void LEARN_SKILL_REQUESTED(HandlerParam talker) {
myself.ShowEtcSkillList(talker, 1, "");
	}

	protected void ONE_SKILL_SELECTED(HandlerParam talker, HandlerParam skill_name_id, HandlerParam need_quest) {
myself.ShowGrowEtcSkillMessage(talker, skill_name_id, 1, "");
	}


}