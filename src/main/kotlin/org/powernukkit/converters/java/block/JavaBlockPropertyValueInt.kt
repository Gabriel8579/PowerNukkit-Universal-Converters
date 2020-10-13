/*
 * PowerNukkit Universal Worlds & Converters for Minecraft
 *  Copyright (C) 2020  José Roberto de Araújo Júnior
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.powernukkit.converters.java.block

import org.powernukkit.converters.java.JavaPlatform
import org.powernukkit.converters.universal.block.UniversalBlockPropertyValue

/**
 * @author joserobjr
 * @since 2020-10-13
 */
class JavaBlockPropertyValueInt(
    platform: JavaPlatform,
    val value: Int,
    universalValue: UniversalBlockPropertyValue?
) : JavaBlockPropertyValue(platform, universalValue) {
    override val type get() = Type.INT

    override fun stringValue() = value.toString()
    override fun intValue() = value
    override fun booleanValue() = value == 1
}