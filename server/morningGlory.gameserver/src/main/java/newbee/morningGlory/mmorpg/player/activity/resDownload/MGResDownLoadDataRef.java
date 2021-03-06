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
package newbee.morningGlory.mmorpg.player.activity.resDownload;

import java.util.ArrayList;
import java.util.List;

import sophia.game.ref.AbstractGameRefObjectBase;
import sophia.mmorpg.player.itemBag.ItemPair;

public class MGResDownLoadDataRef extends AbstractGameRefObjectBase {
	
	private List<ItemPair> reward = new ArrayList<ItemPair>();
	private static final long serialVersionUID = 7856528770683703645L;

	public List<ItemPair> getReward() {
		return reward;
	}


	public void setReward(List<ItemPair> reward) {
		this.reward = reward;
	}
}
