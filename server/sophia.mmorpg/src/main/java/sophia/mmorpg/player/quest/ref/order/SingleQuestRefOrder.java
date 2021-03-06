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
package sophia.mmorpg.player.quest.ref.order;

import java.util.HashSet;
import java.util.Set;

import sophia.mmorpg.player.Player;

public final class SingleQuestRefOrder implements QuestRefOrder {
	private Set<QuestRefOrderItem> orderItemSet = new HashSet<QuestRefOrderItem>();
	
	public SingleQuestRefOrder() {
		
	}
	
	@Override
	public Set<QuestRefOrderItem> getQuestRefOrder(Player player) {
		return orderItemSet;
	}
	
	public void setQuestRefOrder(Set<QuestRefOrderItem> orderItemSet) {
		this.orderItemSet = orderItemSet;
	}
}
