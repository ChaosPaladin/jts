package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class ai_dream_border_manager extends citizen {
	protected String my_battle_maker = "";
	protected String room01_maker_name = "";
	protected String room02_maker_name = "";
	protected String room03_maker_name = "";
	protected String room04_maker_name = "";
	protected String room05_maker_name = "";
	protected String room06_maker_name = "";
	protected String room07_maker_name = "";
	protected String room08_maker_name = "";
	protected String room09_maker_name = "";
	protected String room09_box_maker = "";
	protected int InstantZone_ID = -1;
	protected int EnterType = 1;
	protected int room_number = -1;
	protected int chance_item = 15311;

	protected void CREATED() {
myself.AddTimerEx(7800, 10000);
myself.AddTimerEx(7899, 15000);
myself.i_ai3 = 0;
myself.i_ai4 = 0;
myself.i_ai5 = 0;
myself.i_ai6 = 0;
myself.i_ai7 = 0;
myself.i_ai9 = 0;
super;
	}

	protected void TALKED(HandlerParam talker, HandlerParam ask, HandlerParam reply) {
myself.ShowPage(talker, "manager_dream001.htm");
	}

	protected void DEBUG_AI(HandlerParam reply) {
myself.i_ai9 = reply;
	}

	protected void ATTACKED(HandlerParam attacker, HandlerParam i0, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (myself.i_ai9 == 1) {
if (gg.OwnItemCount(attacker, 214) >= 1) {
if (gg.OwnItemCount(attacker, 57) >= 1980 && gg.OwnItemCount(attacker, 57) <= 1988) {
i0 = gg.OwnItemCount(attacker, 57) - 1979;
if (InstantZone_ID >= 127 && InstantZone_ID <= 130) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 치트");

}
if (InstantZone_ID == 127) {
if (i0 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (i0 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (i0 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (i0 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (i0 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (i0 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (i0 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (i0 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (i0 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (i0 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (i0 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (i0 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (i0 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (i0 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (i0 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (i0 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (i0 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (i0 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (i0 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (i0 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else if (InstantZone_ID >= 131 && InstantZone_ID <= 132) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 치트");

}
if (InstantZone_ID == 131) {
if (i0 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i0 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i0 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i0 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i0 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i0 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i0 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i0 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i0 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i0 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i0 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i0 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i0 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i0 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i0 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i0 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i0 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i0 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

}
maker0 = gg.InstantZone_GetNpcMaker(i0, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 치트");

}
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

}

}

}
	}

	protected void MENU_SELECTED(HandlerParam talker, HandlerParam ask, HandlerParam reply, HandlerParam party0, HandlerParam c0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i0, HandlerParam maker0, HandlerParam i4) {
if (ask == -7802) {
if (reply == 1) {
party0 = gg.GetParty(talker);
if (gg.IsNull(party0) == 0) {
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (talker == c0) {
myself.ShowPage(talker, "");
if (gg.OwnItemCount(c0, chance_item) == 1) {
if (InstantZone_ID >= 127 && InstantZone_ID <= 130) {
if (gg.Rand(100) < 10) {
if (room_number != 9) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 1차");

}
myself.i_ai5 = 9;
if (InstantZone_ID == 127) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

}

} else {
i1 = gg.Rand(4) + 1;
if (i1 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 2차");

}
if (InstantZone_ID == 127) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
i2 = gg.Rand(4) + 1;
if (i2 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동");

}
if (InstantZone_ID == 127) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
for (i3 = 1; i3 < 5; i3 = i3 + 1) {
if (i3 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 3차");

}
if (InstantZone_ID == 127) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;
myself.DeleteItem1(c0, chance_item, 1);
myself.i_ai6 = 0;
return;

}

}

}

}

}

} else if (InstantZone_ID >= 131 && InstantZone_ID <= 132) {
if (room_number == 9) {

} else {
i1 = gg.Rand(8) + 1;
if (i1 != room_number) {
if (InstantZone_ID == 131) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i1 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i1 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i1 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i1 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i1 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i1 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i1 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i1 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;
if (myself.i_ai9 == 1) {
myself.Shout("방이동 1차");

}

} else {
i2 = gg.Rand(8) + 1;
if (i2 != room_number) {
if (InstantZone_ID == 131) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i2 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i2 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i2 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i2 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i2 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i2 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i2 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i2 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
for (i3 = 1; i3 < 9; i3 = i3 + 1) {
if (i3 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 2차");

}
if (InstantZone_ID == 131) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i3 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i3 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i3 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i3 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i3 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i3 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i3 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i3 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;
myself.DeleteItem1(c0, chance_item, 1);
return;

}

}

}

}

}

}
myself.DeleteItem1(c0, chance_item, 1);
myself.i_ai6 = 0;

} else if (gg.OwnItemCount(c0, chance_item) == 0) {
myself.ShowPage(talker, "manager_dream001c.htm");

} else if (myself.i_ai9 == 1) {
myself.Shout("방이동을 두 번 이상 하려고 함. 치터!!!!");

}

} else {
myself.ShowPage(talker, "manager_dream001a.htm");

}

} else {
myself.ShowPage(talker, "manager_dream001b.htm");

}

} else if (reply == 2) {
party0 = gg.GetParty(talker);
if (myself.IsNullParty(party0) == 0) {
c0 = myself.GetLeaderOfParty(gg.GetParty(talker));
if (c0 == talker) {
for (i0 = 0; i0 < party0.member_count; i0 = i0 + 1) {
c0 = myself.GetMemberOfParty(party0, i0);
if (myself.IsNullCreature(c0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("막사를 버려라!");

}
myself.InstantZone_Leave(c0);

}

}

} else {
myself.ShowPage(talker, "manager_dream001a.htm");

}

} else {
myself.ShowPage(talker, "manager_dream001b.htm");

}

} else if (reply == 3) {
if (InstantZone_ID >= 127 && InstantZone_ID <= 130) {
if (myself.i_ai9 == 1) {
myself.Shout("방번호 : " + gg.IntToStr(room_number) + " 방 번호 받음 " + gg.IntToStr(myself.i_ai4));

}
if (InstantZone_ID == 127) {
if (myself.i_ai4 == 1) {
myself.InstantTeleport(talker, -122368, -218972, -6720);

} else if (myself.i_ai4 == 2) {
myself.InstantTeleport(talker, -122352, -218044, -6720);

}
if (myself.i_ai4 == 3) {
myself.InstantTeleport(talker, -122368, -220220, -6720);

} else if (myself.i_ai4 == 4) {
myself.InstantTeleport(talker, -121440, -218444, -6720);

} else if (myself.i_ai4 == 9) {
myself.InstantTeleport(talker, -121424, -220124, -6720);

}

} else if (InstantZone_ID == 128) {
if (myself.i_ai4 == 1) {
myself.InstantTeleport(talker, -108960, -218892, -6720);

} else if (myself.i_ai4 == 2) {
myself.InstantTeleport(talker, -108976, -218028, -6720);

}
if (myself.i_ai4 == 3) {
myself.InstantTeleport(talker, -108960, -220204, -6720);

} else if (myself.i_ai4 == 4) {
myself.InstantTeleport(talker, -108032, -218428, -6720);

} else if (myself.i_ai4 == 9) {
myself.InstantTeleport(talker, -108032, -220140, -6720);

}

} else if (InstantZone_ID == 129) {
if (myself.i_ai4 == 1) {
myself.InstantTeleport(talker, -122368, -207820, -6720);

} else if (myself.i_ai4 == 2) {
myself.InstantTeleport(talker, -122368, -206940, -6720);

}
if (myself.i_ai4 == 3) {
myself.InstantTeleport(talker, -122368, -209116, -6720);

} else if (myself.i_ai4 == 4) {
myself.InstantTeleport(talker, -121456, -207356, -6720);

} else if (myself.i_ai4 == 9) {
myself.InstantTeleport(talker, -121440, -209004, -6720);

}

} else if (InstantZone_ID == 130) {
if (myself.i_ai4 == 1) {
myself.InstantTeleport(talker, -108976, -207772, -6720);

} else if (myself.i_ai4 == 2) {
myself.InstantTeleport(talker, -108976, -206972, -6720);

}
if (myself.i_ai4 == 3) {
myself.InstantTeleport(talker, -108960, -209164, -6720);

} else if (myself.i_ai4 == 4) {
myself.InstantTeleport(talker, -108048, -207340, -6720);

} else if (myself.i_ai4 == 9) {
myself.InstantTeleport(talker, -108048, -209020, -6720);

}

}

} else if (InstantZone_ID >= 131 && InstantZone_ID <= 132) {
if (myself.i_ai9 == 1) {
myself.Shout("방번호 : " + gg.IntToStr(room_number) + " 방 번호 받음 " + gg.IntToStr(myself.i_ai4));

}
if (InstantZone_ID == 131) {
if (myself.i_ai4 == 1) {
myself.InstantTeleport(talker, -122368, -153388, -6688);

} else if (myself.i_ai4 == 2) {
myself.InstantTeleport(talker, -122368, -152524, -6688);

}
if (myself.i_ai4 == 3) {
myself.InstantTeleport(talker, -120480, -155116, -6688);

} else if (myself.i_ai4 == 4) {
myself.InstantTeleport(talker, -120480, -154236, -6688);

} else if (myself.i_ai4 == 5) {
myself.InstantTeleport(talker, -121440, -151212, -6688);

}
if (myself.i_ai4 == 6) {
myself.InstantTeleport(talker, -120464, -152908, -6688);

} else if (myself.i_ai4 == 7) {
myself.InstantTeleport(talker, -122368, -154700, -6688);

} else if (myself.i_ai4 == 8) {
myself.InstantTeleport(talker, -121440, -152908, -6688);

} else if (myself.i_ai4 == 9) {
myself.InstantTeleport(talker, -121440, -154572, -6688);

}

} else if (InstantZone_ID == 132) {
if (myself.i_ai4 == 1) {
myself.InstantTeleport(talker, -108976, -153372, -6688);

} else if (myself.i_ai4 == 2) {
myself.InstantTeleport(talker, -108960, -152524, -6688);

}
if (myself.i_ai4 == 3) {
myself.InstantTeleport(talker, -107088, -155052, -6688);

} else if (myself.i_ai4 == 4) {
myself.InstantTeleport(talker, -107104, -154236, -6688);

} else if (myself.i_ai4 == 5) {
myself.InstantTeleport(talker, -108048, -151244, -6688);

}
if (myself.i_ai4 == 6) {
myself.InstantTeleport(talker, -107088, -152956, -6688);

} else if (myself.i_ai4 == 7) {
myself.InstantTeleport(talker, -108992, -154604, -6688);

} else if (myself.i_ai4 == 8) {
myself.InstantTeleport(talker, -108032, -152892, -6688);

} else if (myself.i_ai4 == 9) {
myself.InstantTeleport(talker, -108048, -154572, -6688);

}

}

}

}

}
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0, HandlerParam i0, HandlerParam i1, HandlerParam maker0, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5) {
if (timer_id == 7800) {
myself.LookNeighbor(500);

} else if (timer_id == 7899) {
if (myself.i_ai7 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("전투준비");

}
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
i0 = gg.Rand(110);
if (room_number != 9) {
myself.AddTimerEx(7810, 8 * 60 + i0 * 1000);

} else if (InstantZone_ID >= 131 && InstantZone_ID <= 132) {
myself.InstantZone_AddExtraDuration(1200);

}

} else {
myself.i_ai7 = 1;

}

} else if (timer_id == 7802) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("전투준비");

}
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);
myself.i_ai6 = 1;

}
i0 = gg.Rand(120);
if (room_number != 9) {
myself.AddTimerEx(7810, 8 * 60 + i0 * 1000);

} else if (InstantZone_ID >= 131 && InstantZone_ID <= 132) {
myself.InstantZone_AddExtraDuration(1200);
myself.BroadcastSystemMessageStr(myself.sm, 2000, gg.MakeFString(1800881, "", "", "", "", ""));

}

} else if (timer_id == 7810) {
myself.EarthQuakeByNPC(myself.sm, 20, 10, 1, 0, 0, 0);
myself.AddTimerEx(7811, 5 * 1000);

} else if (timer_id == 7811) {
if (myself.i_ai6 == 1) {
if (InstantZone_ID >= 127 && InstantZone_ID <= 130) {
if (gg.Rand(100) < 10) {
if (room_number != 9) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 시간 1차");

}
myself.i_ai5 = 9;
if (InstantZone_ID == 127) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (myself.i_ai5 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (myself.i_ai5 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (myself.i_ai5 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (myself.i_ai5 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (myself.i_ai5 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

}

} else {
i1 = gg.Rand(4) + 1;
if (i1 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 시간 2차");

}
if (InstantZone_ID == 127) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
i2 = gg.Rand(4) + 1;
if (i2 != room_number) {
if (InstantZone_ID == 127) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
for (i3 = 1; i3 < 5; i3 = i3 + 1) {
if (i3 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 시간 3차");

}
if (InstantZone_ID == 127) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -218972, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122352, -218044, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -220220, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -218444, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121424, -220124, -6720, 50);

}

}

} else if (InstantZone_ID == 128) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -218892, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -218028, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -220204, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -218428, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -220140, -6720, 50);

}

}

} else if (InstantZone_ID == 129) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -207820, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -206940, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -209116, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121456, -207356, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -209004, -6720, 50);

}

}

} else if (InstantZone_ID == 130) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -207772, -6720, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -206972, -6720, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -209164, -6720, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -207340, -6720, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -209020, -6720, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;
myself.i_ai6 = 0;
return;

}

}

}

}

}

} else if (InstantZone_ID >= 131 && InstantZone_ID <= 132) {
if (room_number == 9) {

} else {
i5 = myself.GetLifeTime();
if (i5 > 50 * 60) {
i1 = 9;
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 시간 / 보스전");

}
if (InstantZone_ID == 131) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i1 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i1 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i1 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i1 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i1 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i1 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i1 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i1 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
i1 = gg.Rand(8) + 1;
if (i1 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 시간 1차");

}
if (InstantZone_ID == 131) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i1 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i1 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i1 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i1 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i1 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i1 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i1 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i1 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i1 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i1 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i1 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i1 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i1 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
i2 = gg.Rand(8) + 1;
if (i2 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 시간 2차 ");

}
if (InstantZone_ID == 131) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i2 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i2 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i2 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i2 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i2 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i2 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i2 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i2 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i2 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i2 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i2 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i2 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i2 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;

} else {
for (i3 = 1; i3 < 9; i3 = i3 + 1) {
if (i3 != room_number) {
if (myself.i_ai9 == 1) {
myself.Shout("방이동 : 시간 3차");

}
if (InstantZone_ID == 131) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -153388, -6688, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -152524, -6688, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -155116, -6688, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120480, -154236, -6688, 50);

}

} else if (i3 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -151212, -6688, 50);

}

} else if (i3 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-120464, -152908, -6688, 50);

}

} else if (i3 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-122368, -154700, -6688, 50);

}

} else if (i3 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -152908, -6688, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-121440, -154572, -6688, 50);

}

}

} else if (InstantZone_ID == 132) {
if (i3 == 1) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room01_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108976, -153372, -6688, 50);

}

} else if (i3 == 2) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room02_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108960, -152524, -6688, 50);

}

} else if (i3 == 3) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room03_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -155052, -6688, 50);

}

} else if (i3 == 4) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room04_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107104, -154236, -6688, 50);

}

} else if (i3 == 5) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room05_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -151244, -6688, 50);

}

} else if (i3 == 6) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room06_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-107088, -152956, -6688, 50);

}

} else if (i3 == 7) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room07_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108992, -154604, -6688, 50);

}

} else if (i3 == 8) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room08_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108032, -152892, -6688, 50);

}

} else if (i3 == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_maker_name);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 9274147, 0, 0);
myself.InstantTeleportInMyTerritory(-108048, -154572, -6688, 50);

}

}

}
i4 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i4, my_battle_maker);
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1000, 0, 0);

}
myself.i_ai6 = 0;
myself.i_ai6 = 0;
return;

}

}

}

}

}

}

}
myself.i_ai6 = 0;

}

}
	}

	protected void SCRIPT_EVENT(HandlerParam script_event_arg1, HandlerParam script_event_arg2, HandlerParam script_event_arg3, HandlerParam maker0, HandlerParam i0, HandlerParam party0) {
if (script_event_arg1 == 9274147) {
if (myself.i_ai9 == 1) {
myself.Shout("방번호 : " + gg.IntToStr(room_number) + " 입장");

}
myself.BroadcastScriptEventEx(9274151, room_number, -1, 8000);
myself.AddTimerEx(7802, 15000);

} else if (script_event_arg1 == 9274148) {
if (room_number == 9) {
i0 = myself.InstantZone_GetId();
maker0 = gg.InstantZone_GetNpcMaker(i0, room09_box_maker);
if (gg.IsNull(maker0) == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("박스 스폰");

}
gg.SendMakerScriptEvent(maker0, 1001, 0, 0);

}
myself.AddTimerEx(7811, 60 * 1000);

}

} else if (script_event_arg1 == 9274151) {
if (myself.i_ai9 == 1) {
myself.Shout("방번호 : " + gg.IntToStr(room_number) + " 방 번호 받음 " + gg.IntToStr(script_event_arg2));

}
if (myself.i_ai3 == 0 && script_event_arg3 >= 0) {
if (myself.i_ai9 == 1) {
myself.Shout("방번호 : " + gg.IntToStr(room_number) + " 파티 번호 " + gg.IntToStr(script_event_arg3));

}
myself.i_ai3 = script_event_arg3;

} else if (myself.i_ai9 == 1) {
myself.Shout("방번호 : " + gg.IntToStr(room_number) + " 파티오류 ");

}
myself.i_ai4 = script_event_arg2;

}
super;
	}

	protected void SEE_CREATURE(HandlerParam creature, HandlerParam party0, HandlerParam i0) {
if (creature.is_pc == 0) {

} else if (myself.i_ai7 == 0) {
if (myself.i_ai9 == 1) {
myself.Shout("파티 아이디 : " + gg.IntToStr(myself.i_ai3) + " 전달 ");

}
myself.i_ai6 = 1;
myself.i_ai7 = 1;
myself.i_ai4 = room_number;
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
i0 = party0.id;

}
if (myself.i_ai9 == 1) {
myself.Shout("방번호 : " + gg.IntToStr(room_number) + " 전달 ");

}
if (myself.i_ai9 == 1) {
myself.Shout("파티 아이디 : " + gg.IntToStr(i0) + " 전달 ");

}
myself.BroadcastScriptEventEx(9274151, room_number, i0, 8000);

} else if (myself.i_ai3 != 0) {
party0 = gg.GetParty(creature);
if (myself.IsNullParty(party0) == 0) {
if (party0.id == myself.i_ai3) {
if (myself.i_ai9 == 1) {
myself.Shout("파티 아이디 : " + gg.IntToStr(i0) + " 전달 ");

}

} else {
if (myself.i_ai9 == 1) {
myself.Shout("파티 아이디 : " + gg.IntToStr(party0.id) + " 전달 ");

}
if (myself.i_ai9 == 1) {
myself.Shout("파티가 다름 ");

}
myself.InstantZone_Leave(creature);

}

} else {
if (myself.i_ai9 == 1) {
myself.Shout("파티가 없음 ");

}
myself.InstantZone_Leave(creature);

}

}
super;
	}


}