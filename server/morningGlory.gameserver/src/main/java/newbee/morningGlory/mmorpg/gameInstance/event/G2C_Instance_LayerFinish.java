package newbee.morningGlory.mmorpg.gameInstance.event;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;

public class G2C_Instance_LayerFinish extends ActionEventBase {

	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		return buffer;
	}

	@Override
	public void unpackBody(IoBuffer buffer) {
		
	}

}
