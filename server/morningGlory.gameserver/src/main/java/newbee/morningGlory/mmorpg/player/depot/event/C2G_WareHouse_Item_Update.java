/**
 *   Copyright 2013-2015 Sophia
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package newbee.morningGlory.mmorpg.player.depot.event;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;

public class C2G_WareHouse_Item_Update extends ActionEventBase {
	private byte type;
	private short gridId;

	public C2G_WareHouse_Item_Update() {
		this.actionEventId = PlayerDepotEventDefines.C2G_WareHouse_Item_Update;
	}

	@Override
	public void unpackBody(IoBuffer buffer) {
		this.setType(buffer.get());
		this.setGridId(buffer.getShort());

	}

	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		buffer.put(type);
		buffer.putShort(gridId);
		return buffer;
	}

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public short getGridId() {
		return gridId;
	}

	public void setGridId(short gridId) {
		this.gridId = gridId;
	}

}
