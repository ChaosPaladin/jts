package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class monster_keltas extends warrior_basic {
	protected void CREATED(HandlerParam maker0) {
myself.AddTimerEx(1201, 60 * 30 * 1000);
maker0 = gg.GetNpcMaker("gludio11_npc1925_naitive01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_outer01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_gate01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_ntcor01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner02m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner04m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner05m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner06m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298384, 0, 0);

}
myself.Shout(gg.MakeFString(1800076, "", "", "", "", ""));
super;
	}

	protected void TIMER_FIRED_EX(HandlerParam timer_id, HandlerParam maker0) {
if (timer_id == 1201) {
myself.Shout(gg.MakeFString(1800025, "", "", "", "", ""));
maker0 = gg.GetNpcMaker("gludio11_npc1925_naitive01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_outer01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_gate01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_ntcor01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner02m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner04m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner05m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner06m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
myself.Despawn();

}
super;
	}

	protected void MY_DYING(HandlerParam maker0) {
maker0 = gg.GetNpcMaker("gludio11_npc1925_naitive01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_outer01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_gate01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_ntcor01m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner02m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner03m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner04m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner05m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
maker0 = gg.GetNpcMaker("gludio11_1925_nt_inner06m1");
if (gg.IsNull(maker0) == 0) {
gg.SendMakerScriptEvent(maker0, 1298385, 0, 0);

}
super;
	}


}