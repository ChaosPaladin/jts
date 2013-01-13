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

package ru.jts.gameserver.model.territory;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author : Camelion
 * @date : 20.08.12  22:08
 */
@Embeddable
public final class Point3D {

    @Column(name = "pos_x")
    private float x;
    @Column(name = "pos_y")
    private float y;
    @Column(name = "pos_z")
    private float z;

    public synchronized void update(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
}
