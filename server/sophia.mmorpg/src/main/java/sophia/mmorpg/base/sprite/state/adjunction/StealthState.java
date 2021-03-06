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
package sophia.mmorpg.base.sprite.state.adjunction;

import sophia.game.component.communication.GameEvent;
import sophia.mmorpg.base.sprite.FightSprite;
import sophia.mmorpg.base.sprite.state.AdjunctionState;
import sophia.mmorpg.base.sprite.state.action.DeadState;
import sophia.mmorpg.base.sprite.state.gameEvent.StealthStateEnter_GE;
import sophia.mmorpg.base.sprite.state.gameEvent.StealthStateExit_GE;

/**
 * 隐身
 */
public class StealthState extends AdjunctionState {

	public static final short StealthState_Id = 511;
	
	public StealthState() {
		super(StealthState_Id);
		addCrossLayerReplacedState(DeadState.DeadState_Id);
	}
	
	@Override
	public void enter(FightSprite owner) {		
		StealthStateEnter_GE ge = new StealthStateEnter_GE(owner);
		GameEvent<StealthStateEnter_GE> event = GameEvent.getInstance(StealthStateEnter_GE.class.getSimpleName(), ge);
		owner.handleGameEvent(event);
		GameEvent.pool(event);
	}

	@Override
	public void exit(FightSprite owner) {
		
		StealthStateExit_GE ge = new StealthStateExit_GE(owner);
		GameEvent<StealthStateExit_GE> event = GameEvent.getInstance(StealthStateExit_GE.class.getSimpleName(), ge);
		owner.handleGameEvent(event);
		GameEvent.pool(event);
	}

}
