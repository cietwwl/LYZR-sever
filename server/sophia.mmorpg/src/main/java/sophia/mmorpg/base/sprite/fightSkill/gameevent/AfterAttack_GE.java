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
package sophia.mmorpg.base.sprite.fightSkill.gameevent;

import sophia.mmorpg.base.sprite.FightSprite;

public class AfterAttack_GE {
	private FightSprite attacker;
	private FightSprite target;
	private int damge;

	public static final String AfterAttackId = AfterAttack_GE.class.getSimpleName();

	public AfterAttack_GE(FightSprite attacker, FightSprite target, int damge) {
		super();
		this.setAttacker(attacker);
		this.setTarget(target);
		this.setDamge(damge);
	}

	public FightSprite getAttacker() {
		return attacker;
	}

	public void setAttacker(FightSprite attacker) {
		this.attacker = attacker;
	}

	public FightSprite getTarget() {
		return target;
	}

	public void setTarget(FightSprite target) {
		this.target = target;
	}

	public int getDamge() {
		return damge;
	}

	public void setDamge(int damge) {
		this.damge = damge;
	}

}
