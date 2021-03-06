package com.cloutteam.jarcraftinator.protocol.packet;

import com.cloutteam.jarcraftinator.utils.VarData;

import java.io.DataOutputStream;
import java.io.IOException;

public class PacketPlayOutKeepAlive extends PacketOut {

    @Override
    public void send(DataOutputStream out) throws IOException {
        byte[] packetId = VarData.getVarInt(MinecraftPacket.PLAY.KEEP_ALIVE.out);

        VarData.writeVarInt(out, 8 + packetId.length);
        out.write(packetId);
        out.writeLong(System.currentTimeMillis());
        System.out.println("PacketPlayOutKeepAlive");
    }

}
