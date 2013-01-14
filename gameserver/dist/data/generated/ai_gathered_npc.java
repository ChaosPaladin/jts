package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_gathered_npc extends default_npc {
	protected int effective_skill = 458752001;
	protected int GiveItem1 = -1;
	protected int GiveItem1Rate = 0;
	protected int give_item1 = -1;
	protected int seed_type = -1;

	protected void WAS_COLLECTED(HandlerParam attacker, HandlerParam i0, HandlerParam i1) {
if (gg.HaveMemo(attacker, 692) == 1 && gg.GetMemoState(attacker, 692) == 3) {
i1 = gg.Rand(1000);
if (i1 < 800) {
if (seed_type == 1) {
myself.GiveItem1(attacker, 13867, 1);
myself.SoundEffect(attacker, "ItemSound.quest_itemget");

} else if (seed_type == 2) {
myself.GiveItem1(attacker, 13866, 1);
myself.SoundEffect(attacker, "ItemSound.quest_itemget");

} else if (seed_type == 3) {
myself.GiveItem1(attacker, 15535, 1);
myself.SoundEffect(attacker, "ItemSound.quest_itemget");

}

}

}
	}

	protected void SPELLED(HandlerParam speller, HandlerParam skill_name_id) {
if (skill_name_id == 172359681) {
if (gg.OwnItemCount(speller, 13844) >= 1) {
if (myself.sm.class_id == 1018684) {
myself.GiveItem1(speller, 13858, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018685) {
myself.GiveItem1(speller, 13858, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018686) {
myself.GiveItem1(speller, 13858, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018687) {
myself.GiveItem1(speller, 13859, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018688) {
myself.GiveItem1(speller, 13859, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018689) {
myself.GiveItem1(speller, 13859, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018690) {
myself.GiveItem1(speller, 13860, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018691) {
myself.GiveItem1(speller, 13860, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}
if (myself.sm.class_id == 1018692) {
myself.GiveItem1(speller, 13860, 1);
myself.SoundEffect(speller, "ItemSound.quest_itemget");
myself.DeleteItem1(speller, 13844, 1);
myself.Despawn();

}

}

}
	}


}