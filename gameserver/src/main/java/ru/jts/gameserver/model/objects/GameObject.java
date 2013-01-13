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

package ru.jts.gameserver.model.objects;

import ru.jts.gameserver.model.territory.Point3D;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author : Camelion
 * @date : 20.08.12  21:58
 * <p/>
 * Основной класс всех игровых объектов,
 * в нём собраны базовые параметры, присущие всем игровым объектам.
 */

@MappedSuperclass
public class GameObject {
    @Id
    @Column(name = "id")
    private int objectId;

    @Embedded
    private Point3D point;

    public Point3D getPoint() {
        return point;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public float getX() {
        return point.getX();
    }

    public float getY() {
        return point.getX();
    }

    public float getZ() {
        return point.getX();
    }
}
