package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class tor extends citizen {
	protected void TALK_SELECTED(HandlerParam talker) {
if (_from_choice == 0) {
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) == 0 && gg.OwnItemCount(talker, 3692) == 0) {
_choiceN = _choiceN + 1;
_code = 0;
myself.AddChoice(0, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && talker.level < 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0) {
_choiceN = _choiceN + 1;
_code = 1;
myself.AddChoice(1, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && talker.level >= 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0 && gg.OwnItemCount(talker, 3696) == 0) {
_choiceN = _choiceN + 1;
_code = 2;
myself.AddChoice(2, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && talker.level >= 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0 && gg.OwnItemCount(talker, 3696) == 1) {
_choiceN = _choiceN + 1;
_code = 3;
myself.AddChoice(3, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0) {
_choiceN = _choiceN + 1;
_code = 4;
myself.AddChoice(4, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727)) {
_choiceN = _choiceN + 1;
_code = 5;
myself.AddChoice(5, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3728)) {
_choiceN = _choiceN + 1;
_code = 6;
myself.AddChoice(6, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3729)) {
_choiceN = _choiceN + 1;
_code = 7;
myself.AddChoice(7, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3730)) {
_choiceN = _choiceN + 1;
_code = 8;
myself.AddChoice(8, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3731)) {
_choiceN = _choiceN + 1;
_code = 9;
myself.AddChoice(9, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3732)) {
_choiceN = _choiceN + 1;
_code = 10;
myself.AddChoice(10, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3733)) {
_choiceN = _choiceN + 1;
_code = 11;
myself.AddChoice(11, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3734)) {
_choiceN = _choiceN + 1;
_code = 12;
myself.AddChoice(12, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3735)) {
_choiceN = _choiceN + 1;
_code = 13;
myself.AddChoice(13, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3736)) {
_choiceN = _choiceN + 1;
_code = 14;
myself.AddChoice(14, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3737)) {
_choiceN = _choiceN + 1;
_code = 15;
myself.AddChoice(15, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3738)) {
_choiceN = _choiceN + 1;
_code = 16;
myself.AddChoice(16, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3739)) {
_choiceN = _choiceN + 1;
_code = 17;
myself.AddChoice(17, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3740)) {
_choiceN = _choiceN + 1;
_code = 18;
myself.AddChoice(18, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3741)) {
_choiceN = _choiceN + 1;
_code = 19;
myself.AddChoice(19, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3742)) {
_choiceN = _choiceN + 1;
_code = 20;
myself.AddChoice(20, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3743)) {
_choiceN = _choiceN + 1;
_code = 21;
myself.AddChoice(21, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3744)) {
_choiceN = _choiceN + 1;
_code = 22;
myself.AddChoice(22, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3745)) {
_choiceN = _choiceN + 1;
_code = 23;
myself.AddChoice(23, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3746)) {
_choiceN = _choiceN + 1;
_code = 24;
myself.AddChoice(24, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3747)) {
_choiceN = _choiceN + 1;
_code = 25;
myself.AddChoice(25, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3748)) {
_choiceN = _choiceN + 1;
_code = 26;
myself.AddChoice(26, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3749)) {
_choiceN = _choiceN + 1;
_code = 27;
myself.AddChoice(27, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3750)) {
_choiceN = _choiceN + 1;
_code = 28;
myself.AddChoice(28, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3751)) {
_choiceN = _choiceN + 1;
_code = 29;
myself.AddChoice(29, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3752)) {
_choiceN = _choiceN + 1;
_code = 30;
myself.AddChoice(30, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3753)) {
_choiceN = _choiceN + 1;
_code = 31;
myself.AddChoice(31, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3754)) {
_choiceN = _choiceN + 1;
_code = 32;
myself.AddChoice(32, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3755)) {
_choiceN = _choiceN + 1;
_code = 33;
myself.AddChoice(33, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3756)) {
_choiceN = _choiceN + 1;
_code = 34;
myself.AddChoice(34, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3757)) {
_choiceN = _choiceN + 1;
_code = 35;
myself.AddChoice(35, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3758)) {
_choiceN = _choiceN + 1;
_code = 36;
myself.AddChoice(36, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3759)) {
_choiceN = _choiceN + 1;
_code = 37;
myself.AddChoice(37, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3760)) {
_choiceN = _choiceN + 1;
_code = 38;
myself.AddChoice(38, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3761)) {
_choiceN = _choiceN + 1;
_code = 39;
myself.AddChoice(39, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3762)) {
_choiceN = _choiceN + 1;
_code = 40;
myself.AddChoice(40, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3763)) {
_choiceN = _choiceN + 1;
_code = 41;
myself.AddChoice(41, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3764)) {
_choiceN = _choiceN + 1;
_code = 42;
myself.AddChoice(42, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3765)) {
_choiceN = _choiceN + 1;
_code = 43;
myself.AddChoice(43, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3766)) {
_choiceN = _choiceN + 1;
_code = 44;
myself.AddChoice(44, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3767)) {
_choiceN = _choiceN + 1;
_code = 45;
myself.AddChoice(45, "Song of the Hunter  (In Progress)");

}
if (gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3768)) {
_choiceN = _choiceN + 1;
_code = 46;
myself.AddChoice(46, "Song of the Hunter  (In Progress)");

}
if (_choiceN > 1) {
myself.ShowChoicePage(talker, 1);
return;

}

}
if (_from_choice || _choiceN == 1) {
switch (_code) {
case 0: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) == 0 && gg.OwnItemCount(talker, 3692) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tor_q0335_01a.htm");

}
break;

}
case 1: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && talker.level < 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tor_q0335_01b.htm");

}
break;

}
case 2: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && talker.level >= 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0 && gg.OwnItemCount(talker, 3696) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tor_q0335_03a.htm");

}
break;

}
case 3: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && talker.level >= 45 && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0 && gg.OwnItemCount(talker, 3696) == 1) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tor_q0335_03.htm");

}
break;

}
case 4: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3727) + gg.OwnItemCount(talker, 3728) + gg.OwnItemCount(talker, 3729) + gg.OwnItemCount(talker, 3730) + gg.OwnItemCount(talker, 3731) + gg.OwnItemCount(talker, 3732) + gg.OwnItemCount(talker, 3733) + gg.OwnItemCount(talker, 3734) + gg.OwnItemCount(talker, 3735) + gg.OwnItemCount(talker, 3736) + gg.OwnItemCount(talker, 3737) + gg.OwnItemCount(talker, 3738) + gg.OwnItemCount(talker, 3739) + gg.OwnItemCount(talker, 3740) + gg.OwnItemCount(talker, 3741) + gg.OwnItemCount(talker, 3742) + gg.OwnItemCount(talker, 3743) + gg.OwnItemCount(talker, 3744) + gg.OwnItemCount(talker, 3745) + gg.OwnItemCount(talker, 3746) + gg.OwnItemCount(talker, 3747) + gg.OwnItemCount(talker, 3748) + gg.OwnItemCount(talker, 3749) + gg.OwnItemCount(talker, 3750) + gg.OwnItemCount(talker, 3751) + gg.OwnItemCount(talker, 3752) + gg.OwnItemCount(talker, 3753) + gg.OwnItemCount(talker, 3754) + gg.OwnItemCount(talker, 3755) + gg.OwnItemCount(talker, 3756) + gg.OwnItemCount(talker, 3757) + gg.OwnItemCount(talker, 3758) + gg.OwnItemCount(talker, 3759) + gg.OwnItemCount(talker, 3760) + gg.OwnItemCount(talker, 3761) + gg.OwnItemCount(talker, 3762) + gg.OwnItemCount(talker, 3763) + gg.OwnItemCount(talker, 3764) + gg.OwnItemCount(talker, 3765) + gg.OwnItemCount(talker, 3766) + gg.OwnItemCount(talker, 3767) + gg.OwnItemCount(talker, 3768) == 0) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
myself.ShowPage(talker, "tor_q0335_03b.htm");

}
break;

}
case 5: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3727)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3769) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 2090);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3727, gg.OwnItemCount(talker, 3727));
myself.DeleteItem1(talker, 3769, gg.OwnItemCount(talker, 3769));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 6: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3728)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3770) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 6340);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3728, gg.OwnItemCount(talker, 3728));
myself.DeleteItem1(talker, 3770, gg.OwnItemCount(talker, 3770));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 7: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3729)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3771) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 9480);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3729, gg.OwnItemCount(talker, 3729));
myself.DeleteItem1(talker, 3771, gg.OwnItemCount(talker, 3771));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 8: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3730)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3772) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 9110);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3730, gg.OwnItemCount(talker, 3730));
myself.DeleteItem1(talker, 3772, 30);
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 9: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3731)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3773) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 8690);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3731, gg.OwnItemCount(talker, 3731));
myself.DeleteItem1(talker, 3773, gg.OwnItemCount(talker, 3773));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 10: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3732)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3774) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 9480);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3732, gg.OwnItemCount(talker, 3732));
myself.DeleteItem1(talker, 3774, gg.OwnItemCount(talker, 3774));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 11: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3733)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3775) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 11280);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3733, gg.OwnItemCount(talker, 3733));
myself.DeleteItem1(talker, 3775, gg.OwnItemCount(talker, 3775));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 12: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3734)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3776) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 9640);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3734, gg.OwnItemCount(talker, 3734));
myself.DeleteItem1(talker, 3776, gg.OwnItemCount(talker, 3776));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 13: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3735)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3777) >= 100) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 9180);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3735, gg.OwnItemCount(talker, 3735));
myself.DeleteItem1(talker, 3777, gg.OwnItemCount(talker, 3777));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 14: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3736)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3778) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 5160);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3736, gg.OwnItemCount(talker, 3736));
myself.DeleteItem1(talker, 3778, gg.OwnItemCount(talker, 3778));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 15: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3737)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3779) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 3140);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3737, gg.OwnItemCount(talker, 3737));
myself.DeleteItem1(talker, 3779, gg.OwnItemCount(talker, 3779));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 16: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3738)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3780) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 3160);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3738, gg.OwnItemCount(talker, 3738));
myself.DeleteItem1(talker, 3780, gg.OwnItemCount(talker, 3780));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 17: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3739)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3781) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 6370);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3739, gg.OwnItemCount(talker, 3739));
myself.DeleteItem1(talker, 3781, gg.OwnItemCount(talker, 3781));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 18: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3740)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3782) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 19080);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3740, gg.OwnItemCount(talker, 3740));
myself.DeleteItem1(talker, 3782, gg.OwnItemCount(talker, 3782));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 19: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3741)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3783) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 17730);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3741, gg.OwnItemCount(talker, 3741));
myself.DeleteItem1(talker, 3783, gg.OwnItemCount(talker, 3783));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 20: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3742)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3784) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 5790);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3742, gg.OwnItemCount(talker, 3742));
myself.DeleteItem1(talker, 3784, gg.OwnItemCount(talker, 3784));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 21: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3743)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3785) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 8560);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3743, gg.OwnItemCount(talker, 3743));
myself.DeleteItem1(talker, 3785, gg.OwnItemCount(talker, 3785));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 22: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3744)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3786) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 8320);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3744, gg.OwnItemCount(talker, 3744));
myself.DeleteItem1(talker, 3786, gg.OwnItemCount(talker, 3786));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 23: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3745)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3787) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 30310);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3745, gg.OwnItemCount(talker, 3745));
myself.DeleteItem1(talker, 3787, gg.OwnItemCount(talker, 3787));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 24: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3746)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3788) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 27540);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3746, gg.OwnItemCount(talker, 3746));
myself.DeleteItem1(talker, 3788, gg.OwnItemCount(talker, 3788));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 25: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3692) && gg.OwnItemCount(talker, 3747)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3789) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06a.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 20560);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3747, gg.OwnItemCount(talker, 3747));
myself.DeleteItem1(talker, 3789, gg.OwnItemCount(talker, 3789));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 26: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3748)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3790) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 6850);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3748, gg.OwnItemCount(talker, 3748));
myself.DeleteItem1(talker, 3790, gg.OwnItemCount(talker, 3790));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 27: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3749)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3791) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 7250);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3749, gg.OwnItemCount(talker, 3749));
myself.DeleteItem1(talker, 3791, gg.OwnItemCount(talker, 3791));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 28: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3750)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3792) >= 50) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 7160);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3750, gg.OwnItemCount(talker, 3750));
myself.DeleteItem1(talker, 3792, gg.OwnItemCount(talker, 3792));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 29: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3751)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3793) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 6580);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3751, gg.OwnItemCount(talker, 3751));
myself.DeleteItem1(talker, 3793, gg.OwnItemCount(talker, 3793));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 30: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3752)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3794) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 10100);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3752, gg.OwnItemCount(talker, 3752));
myself.DeleteItem1(talker, 3794, gg.OwnItemCount(talker, 3794));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 31: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3753)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3795) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 13000);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3753, gg.OwnItemCount(talker, 3753));
myself.DeleteItem1(talker, 3795, gg.OwnItemCount(talker, 3795));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 32: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3754)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3796) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 7660);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3754, gg.OwnItemCount(talker, 3754));
myself.DeleteItem1(talker, 3796, gg.OwnItemCount(talker, 3796));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 33: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3755)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3797) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 7660);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3755, gg.OwnItemCount(talker, 3755));
myself.DeleteItem1(talker, 3797, gg.OwnItemCount(talker, 3797));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 34: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3756)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3798) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 11260);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3756, gg.OwnItemCount(talker, 3756));
myself.DeleteItem1(talker, 3798, gg.OwnItemCount(talker, 3798));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 35: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3757)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3799) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 7660);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3757, gg.OwnItemCount(talker, 3757));
myself.DeleteItem1(talker, 3799, gg.OwnItemCount(talker, 3799));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 36: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3758)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3800) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 8810);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3758, gg.OwnItemCount(talker, 3758));
myself.DeleteItem1(talker, 3800, gg.OwnItemCount(talker, 3800));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 37: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3759)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3801) >= 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 7350);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3759, gg.OwnItemCount(talker, 3759));
myself.DeleteItem1(talker, 3801, gg.OwnItemCount(talker, 3801));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 38: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3760)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3802) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 8760);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3760, gg.OwnItemCount(talker, 3760));
myself.DeleteItem1(talker, 3802, gg.OwnItemCount(talker, 3802));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 39: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3761)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3803) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 9380);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3761, gg.OwnItemCount(talker, 3761));
myself.DeleteItem1(talker, 3803, gg.OwnItemCount(talker, 3803));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 40: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3762)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3804) >= 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 17820);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3762, gg.OwnItemCount(talker, 3762));
myself.DeleteItem1(talker, 3804, gg.OwnItemCount(talker, 3804));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 41: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3763)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3805) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 17540);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3763, gg.OwnItemCount(talker, 3763));
myself.DeleteItem1(talker, 3805, gg.OwnItemCount(talker, 3805));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 42: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3764)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3806) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 14160);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3764, gg.OwnItemCount(talker, 3764));
myself.DeleteItem1(talker, 3806, gg.OwnItemCount(talker, 3806));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 43: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3765)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3807) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 15960);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3765, gg.OwnItemCount(talker, 3765));
myself.DeleteItem1(talker, 3807, gg.OwnItemCount(talker, 3807));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 44: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3766)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3808) >= 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 39100);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3766, gg.OwnItemCount(talker, 3766));
myself.DeleteItem1(talker, 3808, gg.OwnItemCount(talker, 3808));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 45: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3767)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3809) >= 1) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 39550);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3767, gg.OwnItemCount(talker, 3767));
myself.DeleteItem1(talker, 3809, gg.OwnItemCount(talker, 3809));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}
case 46: {
if (_from_choice == 0 || gg.HaveMemo(talker, 335) && gg.OwnItemCount(talker, 3693) && gg.OwnItemCount(talker, 3768)) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}
if (gg.OwnItemCount(talker, 3810) >= 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_06b.htm");
myself.GiveItem1(talker, 3694, 1);
myself.GiveItem1(talker, 57, 41200);
myself.SoundEffect(talker, "ItemSound.quest_middle");
myself.SetMemoState(talker, 335, 0);
myself.DeleteItem1(talker, 3768, gg.OwnItemCount(talker, 3768));
myself.DeleteItem1(talker, 3810, gg.OwnItemCount(talker, 3810));
gg.AddLog(3, talker, 335);

}

} else {
myself.ShowPage(talker, "tor_q0335_05.htm");

}

}
break;

}

}
return;

}
super;
	}

	protected void MENU_SELECTED(HandlerParam ask, HandlerParam fhtml0, HandlerParam i0, HandlerParam i1, HandlerParam i2, HandlerParam i3, HandlerParam i4, HandlerParam i5, HandlerParam reply, HandlerParam talker) {
if (ask == 335) {
myself.SetCurrentQuestID(335);
if (myself.GetInventoryInfo(talker, 0) >= myself.GetInventoryInfo(talker, 1) * 0.800000 || myself.GetInventoryInfo(talker, 2) >= myself.GetInventoryInfo(talker, 3) * 0.800000) {
myself.ShowSystemMessage(talker, 1118);
return;

}

}
if (ask == 335) {
if (reply == 1) {
if (gg.OwnItemCount(talker, 3696) == 0) {
myself.ShowPage(talker, "tor_q0335_02.htm");

} else {
myself.ShowPage(talker, "tor_q0335_03.htm");

}

} else if (reply == 2) {
if (gg.GetMemoState(talker, 335) == 0) {
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
while (i0 == i1 || i1 == i2 || i2 == i3 || i3 == i4 || i0 == i4 || i0 == i2 || i0 == i3 || i1 == i3 || i1 == i4 || i2 == i4) {
if (gg.OwnItemCount(talker, 3694) == 0) {
i0 = gg.Rand(12);
i1 = gg.Rand(12);
i2 = gg.Rand(12);
i3 = gg.Rand(12);
i4 = gg.Rand(12);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

} else if (gg.OwnItemCount(talker, 3694) < 4) {
if (gg.Rand(100) < 20) {
i0 = gg.Rand(6) + 12;
i1 = gg.Rand(12);
i2 = gg.Rand(6);
i3 = gg.Rand(6) + 6;
i4 = gg.Rand(12);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

} else {
i0 = gg.Rand(12);
i1 = gg.Rand(12);
i2 = gg.Rand(12);
i3 = gg.Rand(12);
i4 = gg.Rand(12);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

}

} else if (gg.Rand(100) < 20) {
i0 = gg.Rand(6) + 12;
if (gg.Rand(20) == 0) {
i1 = gg.Rand(2) + 18;

} else {
i1 = gg.Rand(12);

}
i2 = gg.Rand(6);
i3 = gg.Rand(6) + 6;
i4 = gg.Rand(12);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

} else {
i0 = gg.Rand(12);
if (gg.Rand(20) == 0) {
i1 = gg.Rand(2) + 18;

} else {
i1 = gg.Rand(12);

}
i2 = gg.Rand(6);
i3 = gg.Rand(6) + 6;
i4 = gg.Rand(12);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

}

}
i0 = 33520 + i0;
i1 = 33520 + i1;
i2 = 33520 + i2;
i3 = 33520 + i3;
i4 = 33520 + i4;
myself.FHTML_SetFileName(fhtml0, "tor_q0335_16.htm");
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i1, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i2, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply4", gg.MakeFString(i3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply5", gg.MakeFString(i4, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

} else {
i5 = gg.GetMemoState(talker, 335);
i0 = i5 % 32;
i5 = i5 / 32;
i1 = i5 % 32;
i5 = i5 / 32;
i2 = i5 % 32;
i5 = i5 / 32;
i3 = i5 % 32;
i5 = i5 / 32;
i4 = i5 % 32;
i5 = i5 / 32;
i0 = 33520 + i0;
i1 = 33520 + i1;
i2 = 33520 + i2;
i3 = 33520 + i3;
i4 = 33520 + i4;
myself.FHTML_SetFileName(fhtml0, "tor_q0335_16.htm");
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i2, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply4", gg.MakeFString(i1, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply5", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

}

} else if (reply == 3) {
myself.ShowPage(talker, "tor_q0335_04.htm");

} else if (reply == 4) {
if (gg.GetMemoState(talker, 335) == 0) {
i0 = 0;
i1 = 0;
i2 = 0;
i3 = 0;
i4 = 0;
i5 = 0;
while (i0 == i1 || i1 == i2 || i2 == i3 || i3 == i4 || i0 == i4 || i0 == i2 || i0 == i3 || i1 == i3 || i1 == i4 || i2 == i4) {
if (gg.OwnItemCount(talker, 3694) == 0) {
i0 = gg.Rand(10);
i1 = gg.Rand(10);
i2 = gg.Rand(5);
i3 = gg.Rand(5) + 5;
i4 = gg.Rand(10);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

} else if (gg.OwnItemCount(talker, 3694) < 4) {
if (gg.Rand(100) < 20) {
i0 = gg.Rand(6) + 10;
i1 = gg.Rand(10);
i2 = gg.Rand(5);
i3 = gg.Rand(5) + 5;
i4 = gg.Rand(10);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

} else {
i0 = gg.Rand(10);
i1 = gg.Rand(10);
i2 = gg.Rand(5);
i3 = gg.Rand(5) + 5;
i4 = gg.Rand(10);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

}

} else if (gg.Rand(100) < 20) {
i0 = gg.Rand(6) + 10;
if (gg.Rand(20) == 0) {
i1 = gg.Rand(3) + 16;

} else {
i1 = gg.Rand(10);

}
i2 = gg.Rand(5);
i3 = gg.Rand(5) + 5;
i4 = gg.Rand(10);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

} else {
i0 = gg.Rand(10);
if (gg.Rand(20) == 0) {
i1 = gg.Rand(3) + 16;

} else {
i1 = gg.Rand(10);

}
i2 = gg.Rand(5);
i3 = gg.Rand(5) + 5;
i4 = gg.Rand(10);
myself.SetMemoState(talker, 335, i0 * 32 * 32 * 32 * 32 + i1 * 32 * 32 * 32 + i2 * 32 * 32 + i3 * 32 * 1 + i4 * 1 * 1);

}

}
i0 = 33520 + i0 + 20;
i1 = 33520 + i1 + 20;
i2 = 33520 + i2 + 20;
i3 = 33520 + i3 + 20;
i4 = 33520 + i4 + 20;
myself.FHTML_SetFileName(fhtml0, "tor_q0335_16.htm");
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i0, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i1, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i2, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply4", gg.MakeFString(i3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply5", gg.MakeFString(i4, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

} else {
i5 = gg.GetMemoState(talker, 335);
i0 = i5 % 32;
i5 = i5 / 32;
i1 = i5 % 32;
i5 = i5 / 32;
i2 = i5 % 32;
i5 = i5 / 32;
i3 = i5 % 32;
i5 = i5 / 32;
i4 = i5 % 32;
i5 = i5 / 32;
i0 = 33520 + i0 + 20;
i1 = 33520 + i1 + 20;
i2 = 33520 + i2 + 20;
i3 = 33520 + i3 + 20;
i4 = 33520 + i4 + 20;
myself.FHTML_SetFileName(fhtml0, "tor_q0335_16.htm");
myself.FHTML_SetStr(fhtml0, "reply1", gg.MakeFString(i4, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply2", gg.MakeFString(i3, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply3", gg.MakeFString(i2, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply4", gg.MakeFString(i1, "", "", "", "", ""));
myself.FHTML_SetStr(fhtml0, "reply5", gg.MakeFString(i0, "", "", "", "", ""));
myself.ShowFHTML(talker, fhtml0);

}

} else if (reply == 48) {
myself.ShowPage(talker, "tor_q0335_05a.htm");

} else if (reply == 49) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_05b.htm");
if (gg.OwnItemCount(talker, 3694) > 0) {
myself.DeleteItem1(talker, 3694, 1);

}
myself.DeleteItem1(talker, 3727, gg.OwnItemCount(talker, 3727));
myself.DeleteItem1(talker, 3728, gg.OwnItemCount(talker, 3728));
myself.DeleteItem1(talker, 3729, gg.OwnItemCount(talker, 3729));
myself.DeleteItem1(talker, 3730, gg.OwnItemCount(talker, 3730));
myself.DeleteItem1(talker, 3731, gg.OwnItemCount(talker, 3731));
myself.DeleteItem1(talker, 3732, gg.OwnItemCount(talker, 3732));
myself.DeleteItem1(talker, 3733, gg.OwnItemCount(talker, 3733));
myself.DeleteItem1(talker, 3734, gg.OwnItemCount(talker, 3734));
myself.DeleteItem1(talker, 3735, gg.OwnItemCount(talker, 3735));
myself.DeleteItem1(talker, 3736, gg.OwnItemCount(talker, 3736));
myself.DeleteItem1(talker, 3737, gg.OwnItemCount(talker, 3737));
myself.DeleteItem1(talker, 3738, gg.OwnItemCount(talker, 3738));
myself.DeleteItem1(talker, 3739, gg.OwnItemCount(talker, 3739));
myself.DeleteItem1(talker, 3740, gg.OwnItemCount(talker, 3740));
myself.DeleteItem1(talker, 3741, gg.OwnItemCount(talker, 3741));
myself.DeleteItem1(talker, 3742, gg.OwnItemCount(talker, 3742));
myself.DeleteItem1(talker, 3743, gg.OwnItemCount(talker, 3743));
myself.DeleteItem1(talker, 3744, gg.OwnItemCount(talker, 3744));
myself.DeleteItem1(talker, 3745, gg.OwnItemCount(talker, 3745));
myself.DeleteItem1(talker, 3746, gg.OwnItemCount(talker, 3746));
myself.DeleteItem1(talker, 3747, gg.OwnItemCount(talker, 3747));
myself.DeleteItem1(talker, 3748, gg.OwnItemCount(talker, 3748));
myself.DeleteItem1(talker, 3749, gg.OwnItemCount(talker, 3749));
myself.DeleteItem1(talker, 3750, gg.OwnItemCount(talker, 3750));
myself.DeleteItem1(talker, 3751, gg.OwnItemCount(talker, 3751));
myself.DeleteItem1(talker, 3752, gg.OwnItemCount(talker, 3752));
myself.DeleteItem1(talker, 3753, gg.OwnItemCount(talker, 3753));
myself.DeleteItem1(talker, 3754, gg.OwnItemCount(talker, 3754));
myself.DeleteItem1(talker, 3755, gg.OwnItemCount(talker, 3755));
myself.DeleteItem1(talker, 3756, gg.OwnItemCount(talker, 3756));
myself.DeleteItem1(talker, 3757, gg.OwnItemCount(talker, 3757));
myself.DeleteItem1(talker, 3758, gg.OwnItemCount(talker, 3758));
myself.DeleteItem1(talker, 3759, gg.OwnItemCount(talker, 3759));
myself.DeleteItem1(talker, 3760, gg.OwnItemCount(talker, 3760));
myself.DeleteItem1(talker, 3761, gg.OwnItemCount(talker, 3761));
myself.DeleteItem1(talker, 3762, gg.OwnItemCount(talker, 3762));
myself.DeleteItem1(talker, 3763, gg.OwnItemCount(talker, 3763));
myself.DeleteItem1(talker, 3764, gg.OwnItemCount(talker, 3764));
myself.DeleteItem1(talker, 3765, gg.OwnItemCount(talker, 3765));
myself.DeleteItem1(talker, 3766, gg.OwnItemCount(talker, 3766));
myself.DeleteItem1(talker, 3767, gg.OwnItemCount(talker, 3767));
myself.DeleteItem1(talker, 3768, gg.OwnItemCount(talker, 3768));
myself.DeleteItem1(talker, 3769, gg.OwnItemCount(talker, 3769));
myself.DeleteItem1(talker, 3770, gg.OwnItemCount(talker, 3770));
myself.DeleteItem1(talker, 3771, gg.OwnItemCount(talker, 3771));
myself.DeleteItem1(talker, 3772, gg.OwnItemCount(talker, 3772));
myself.DeleteItem1(talker, 3773, gg.OwnItemCount(talker, 3773));
myself.DeleteItem1(talker, 3774, gg.OwnItemCount(talker, 3774));
myself.DeleteItem1(talker, 3775, gg.OwnItemCount(talker, 3775));
myself.DeleteItem1(talker, 3776, gg.OwnItemCount(talker, 3776));
myself.DeleteItem1(talker, 3777, gg.OwnItemCount(talker, 3777));
myself.DeleteItem1(talker, 3778, gg.OwnItemCount(talker, 3778));
myself.DeleteItem1(talker, 3779, gg.OwnItemCount(talker, 3779));
myself.DeleteItem1(talker, 3780, gg.OwnItemCount(talker, 3780));
myself.DeleteItem1(talker, 3781, gg.OwnItemCount(talker, 3781));
myself.DeleteItem1(talker, 3782, gg.OwnItemCount(talker, 3782));
myself.DeleteItem1(talker, 3783, gg.OwnItemCount(talker, 3783));
myself.DeleteItem1(talker, 3784, gg.OwnItemCount(talker, 3784));
myself.DeleteItem1(talker, 3785, gg.OwnItemCount(talker, 3785));
myself.DeleteItem1(talker, 3786, gg.OwnItemCount(talker, 3786));
myself.DeleteItem1(talker, 3787, gg.OwnItemCount(talker, 3787));
myself.DeleteItem1(talker, 3788, gg.OwnItemCount(talker, 3788));
myself.DeleteItem1(talker, 3789, gg.OwnItemCount(talker, 3789));
myself.DeleteItem1(talker, 3790, gg.OwnItemCount(talker, 3790));
myself.DeleteItem1(talker, 3791, gg.OwnItemCount(talker, 3791));
myself.DeleteItem1(talker, 3792, gg.OwnItemCount(talker, 3792));
myself.DeleteItem1(talker, 3793, gg.OwnItemCount(talker, 3793));
myself.DeleteItem1(talker, 3794, gg.OwnItemCount(talker, 3794));
myself.DeleteItem1(talker, 3795, gg.OwnItemCount(talker, 3795));
myself.DeleteItem1(talker, 3796, gg.OwnItemCount(talker, 3796));
myself.DeleteItem1(talker, 3797, gg.OwnItemCount(talker, 3797));
myself.DeleteItem1(talker, 3798, gg.OwnItemCount(talker, 3798));
myself.DeleteItem1(talker, 3799, gg.OwnItemCount(talker, 3799));
myself.DeleteItem1(talker, 3800, gg.OwnItemCount(talker, 3800));
myself.DeleteItem1(talker, 3801, gg.OwnItemCount(talker, 3801));
myself.DeleteItem1(talker, 3802, gg.OwnItemCount(talker, 3802));
myself.DeleteItem1(talker, 3803, gg.OwnItemCount(talker, 3803));
myself.DeleteItem1(talker, 3804, gg.OwnItemCount(talker, 3804));
myself.DeleteItem1(talker, 3805, gg.OwnItemCount(talker, 3805));
myself.DeleteItem1(talker, 3806, gg.OwnItemCount(talker, 3806));
myself.DeleteItem1(talker, 3807, gg.OwnItemCount(talker, 3807));
myself.DeleteItem1(talker, 3808, gg.OwnItemCount(talker, 3808));
myself.DeleteItem1(talker, 3809, gg.OwnItemCount(talker, 3809));
myself.DeleteItem1(talker, 3810, gg.OwnItemCount(talker, 3810));

}

} else if (reply == 5) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10a.htm");
myself.GiveItem1(talker, 3727, 1);

}

} else if (reply == 6) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10b.htm");
myself.GiveItem1(talker, 3728, 1);

}

} else if (reply == 7) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10c.htm");
myself.GiveItem1(talker, 3729, 1);

}

} else if (reply == 8) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10d.htm");
myself.GiveItem1(talker, 3730, 1);

}

} else if (reply == 9) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10e.htm");
myself.GiveItem1(talker, 3731, 1);

}

} else if (reply == 10) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10f.htm");
myself.GiveItem1(talker, 3732, 1);

}

} else if (reply == 11) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10g.htm");
myself.GiveItem1(talker, 3733, 1);

}

} else if (reply == 12) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10h.htm");
myself.GiveItem1(talker, 3734, 1);

}

} else if (reply == 13) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10i.htm");
myself.GiveItem1(talker, 3735, 1);

}

} else if (reply == 14) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10j.htm");
myself.GiveItem1(talker, 3736, 1);

}

} else if (reply == 15) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10k.htm");
myself.GiveItem1(talker, 3737, 1);

}

} else if (reply == 16) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_10l.htm");
myself.GiveItem1(talker, 3738, 1);

}

} else if (reply == 17) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_11a.htm");
myself.GiveItem1(talker, 3739, 1);

}

} else if (reply == 18) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_11b.htm");
myself.GiveItem1(talker, 3740, 1);

}

} else if (reply == 19) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_11c.htm");
myself.GiveItem1(talker, 3741, 1);

}

} else if (reply == 20) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_11d.htm");
myself.GiveItem1(talker, 3742, 1);

}

} else if (reply == 21) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_11e.htm");
myself.GiveItem1(talker, 3743, 1);

}

} else if (reply == 22) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_11f.htm");
myself.GiveItem1(talker, 3744, 1);

}

} else if (reply == 23) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_12a.htm");
myself.GiveItem1(talker, 3745, 1);

}

} else if (reply == 24) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_12b.htm");
myself.GiveItem1(talker, 3746, 1);

}

} else if (reply == 25) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_12c.htm");
myself.GiveItem1(talker, 3747, 1);

}

} else if (reply == 26) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13a.htm");
myself.GiveItem1(talker, 3748, 1);

}

} else if (reply == 27) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13b.htm");
myself.GiveItem1(talker, 3749, 1);

}

} else if (reply == 28) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13c.htm");
myself.GiveItem1(talker, 3750, 1);

}

} else if (reply == 29) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13d.htm");
myself.GiveItem1(talker, 3751, 1);

}

} else if (reply == 30) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13e.htm");
myself.GiveItem1(talker, 3752, 1);

}

} else if (reply == 31) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13f.htm");
myself.GiveItem1(talker, 3753, 1);

}

} else if (reply == 32) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13g.htm");
myself.GiveItem1(talker, 3754, 1);

}

} else if (reply == 33) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13h.htm");
myself.GiveItem1(talker, 3755, 1);

}

} else if (reply == 34) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13i.htm");
myself.GiveItem1(talker, 3756, 1);

}

} else if (reply == 35) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13j.htm");
myself.GiveItem1(talker, 3757, 1);

}

} else if (reply == 36) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13k.htm");
myself.GiveItem1(talker, 3758, 1);

}

} else if (reply == 37) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_13l.htm");
myself.GiveItem1(talker, 3759, 1);

}

} else if (reply == 38) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_14a.htm");
myself.GiveItem1(talker, 3760, 1);

}

} else if (reply == 39) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_14b.htm");
myself.GiveItem1(talker, 3761, 1);

}

} else if (reply == 40) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_14c.htm");
myself.GiveItem1(talker, 3762, 1);

}

} else if (reply == 41) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_14d.htm");
myself.GiveItem1(talker, 3763, 1);

}

} else if (reply == 42) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_14e.htm");
myself.GiveItem1(talker, 3764, 1);

}

} else if (reply == 43) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_14f.htm");
myself.GiveItem1(talker, 3765, 1);

}

} else if (reply == 44) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_15a.htm");
myself.GiveItem1(talker, 3766, 1);

}

} else if (reply == 45) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_15b.htm");
myself.GiveItem1(talker, 3767, 1);

}

} else if (reply == 46) {
if (myself.GetCurrentTick() - talker.quest_last_reward_time > 1) {
talker.quest_last_reward_time = myself.GetCurrentTick();
myself.ShowPage(talker, "tor_q0335_15c.htm");
myself.GiveItem1(talker, 3768, 1);

}

}

}
super;
	}


}