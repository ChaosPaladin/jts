package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_pavel_atlanta extends citizen {
	protected void SEE_CREATURE(HandlerParam creature) {
if (gg.HaveMemo(creature, 114) == 1 && gg.GetMemoState(creature, 114) == 8 && gg.OwnItemCount(creature, 8090) >= 1) {
myself.DeleteItem1(creature, 8090, gg.OwnItemCount(creature, 8090));
myself.GiveItem1(creature, 8091, 1);
myself.SetFlagJournal(creature, 114, 18);
myself.ShowQuestMark(creature, 114);
myself.SoundEffect(creature, "ItemSound.quest_middle");
gg.ShowOnScreenMsgStr(creature, 2, 0, 0, 0, 0, 0, 4500, 12, gg.MakeFString(11453, "", "", "", "", ""));

}
	}


}