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
package sophia.mmorpg.player.gameEvent;

import sophia.mmorpg.base.sprite.FightSprite;

public final class PlayerRevive_GE {

	private byte reviveType;
	private FightSprite fightSprite;
	
	public PlayerRevive_GE(byte reviveType) {
		this.reviveType = reviveType;
	}
	
	public PlayerRevive_GE(FightSprite fightSprite,byte reviveType) {
		this.fightSprite = fightSprite;
		this.reviveType = reviveType;
	}

	public byte getReviveType() {
		return reviveType;
	}

	public FightSprite getFightSprite() {
		return fightSprite;
	}

	public void setFightSprite(FightSprite fightSprite) {
		this.fightSprite = fightSprite;
	}

}
