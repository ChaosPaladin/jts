/*
 * Copyright 2012 jts
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.jts.gameserver.model;

import ru.jts.gameserver.model.objects.Creature;

/**
 * @author : Camelion
 * @date : 31.08.12  17:43
 */
public class AIController {
    public Creature sm;

    /**
     * @param talker - Player
     * @param html   - String
     */
    public void ShowPage(Object talker, Object html) {
        // TODO: Показывает страницу "html" игроку "talker"
    }

    /**
     * @param creature - Creature
     * @param message  - String
     */
    public void Whisper(Object creature, String message) {
        // TODO
    }

    public AbnormalType Skill_GetAbnormalType(int skill_name_id) {
        // TODO: Возвращает уровень скила по id скилла
        return AbnormalType.none;
    }

    /**
     * @param sm           - Creature
     * @param abnormalType - int
     */
    public void Dispel(Creature sm, AbnormalType abnormalType) {
        // TODO: Снимает эффект данного типа с персонажа
    }

    /**
     * @param creature - Creature
     * @return - int
     */
    public int GetDirectionToTarget(Object creature) {
        //TODO: Возвращает угол до цели
        return 0;
    }


    public void AddTimerEx(int timer_id, int time) {
        // TODO: Запускает таймер (timer_id) с временем time, по истечении которого вызывается TIMER_FIRED_EX(timer_id)
    }

    public void CreateOnePrivateEx(int silhouette, String ai_type, int respawn_time, int random_respawn, int x, int y, int z,
                                   int heading, int param1, int param2, int param3) {
        //TODO: Спануит монстра - миниона
    }

    public void AddEffectActionDesire(Creature sm, int action_id, int time, int unk) {
        //TODO: Добавляет действие в очеред
    }


    public int getPState() {
        return 0; // TODO: Неизвестно
    }

    public int Castle_GetPledgeId() {
        return 0; // ClanId
    }

    /**
     * @param html      - String
     * @param file_name - String
     */
    public void FHTML_SetFileName(String html, String file_name) {

    }

    public String Castle_GetPledgeName() {
        return ""; // Имя клана
    }

    /**
     * @param html  - String
     * @param str   - String
     * @param param - String
     */
    public void FHTML_SetStr(String html, String str, String param) {
        //TODO, заменяет параметр str в html, на param
    }

    public String Castle_GetOwnerName() {
        return ""; // Имя владельца замка
    }

    public int Residence_GetTaxRateCurrent() {
        return 0;// Возвращает TaxRate текущей резиденции
    }

    public void FHTML_SetInt(String html, String str, int param) {
        //TODO, заменяет параметр str в html, на param
    }

    /**
     * @param talker - Player
     * @param fhtml
     */
    public void ShowFHTML(Object talker, String fhtml) {
        // TODO Отображает HTML игроку talker
    }

    public enum AbnormalType {
        none
    }
}
