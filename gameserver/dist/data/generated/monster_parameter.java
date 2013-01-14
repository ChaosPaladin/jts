package ru.jts.nasc_loader.ai;

import ru.jts.gameserver.model.objects.Creature;
import ru.jts.gameserver.model.objects.Player;

public class monster_parameter extends default_npc {
	protected int AttackLowLevel = 0;
	protected int RunAway = 1;
	protected int SetCurse = 0;
	protected int AttackLowHP = 0;
	protected int HelpHeroSilhouette = 0;
	protected String HelpHeroAI = "warrior_hero";
	protected int SetAggressiveTime = -1;
	protected int HalfAggressive = 0;
	protected int RandomAggressive = 0;
	protected int SetHateGroup = -1;
	protected int SetHateGroupRatio = 0;
	protected int SetHateOccupation = -1;
	protected int SetHateOccupationRatio = 0;
	protected int SetHateRace = -1;
	protected int SetHateRaceRatio = 0;
	protected int IsTransform = 0;
	protected int step1 = 1020130;
	protected int step2 = 1020006;
	protected int step3 = 1020853;
	protected int DaggerBackAttack = 458752001;
	protected int IsVs = 0;
	protected int SpecialSkill = 458752001;
	protected int MoveAroundSocial = 0;
	protected int MoveAroundSocial1 = 0;
	protected int MoveAroundSocial2 = 0;
	protected int IsSay = 0;
	protected int ShoutMsg1 = 0;
	protected int ShoutMsg2 = 0;
	protected int ShoutMsg3 = 0;
	protected int ShoutMsg4 = 0;
	protected int SSQLoserTeleport = 0;
	protected int SSQTelPosX = 0;
	protected int SSQTelPosY = 0;
	protected int SSQTelPosZ = 0;
	protected int SwapPosition = 0;
	protected int FriendShip = 0;
	protected int DungeonType = 0;
	protected int DungeonTypeAI = 0;
	protected String DungeonTypePrivate = "";
	protected int ShoutTarget = 0;
	protected int AcceptShoutTarget = 0;
	protected int SelfExplosion = 0;
	protected int FriendShip1 = 0;
	protected int FriendShip2 = 0;
	protected int FriendShip3 = 0;
	protected int FriendShip4 = 0;
	protected int FriendShip5 = 0;
	protected int DungeonType = 0;
	protected int DungeonTypeAI = 0;
	protected String DungeonTypePrivate = "";
	protected int SoulShot = 0;
	protected int SoulShotRate = 0;
	protected int SpiritShot = 0;
	protected int SpiritShotRate = 0;
	protected int SpeedBonus = 0;
	protected int HealBonus = 0;
	protected int CreviceOfDiminsion = 0;
	protected int LongRangeGuardRate = -1;
	protected int SeeCreatureAttackerTime = -1;

	protected void ATTACK_FINISHED(HandlerParam target) {
if (target.alive == 0 && target.is_pc == 0) {
if (myself.IsInCategory(12, target.npc_class_id) != 0) {
myself.AddAttackDesire(target.master, 1, 500);

}

}
	}


}