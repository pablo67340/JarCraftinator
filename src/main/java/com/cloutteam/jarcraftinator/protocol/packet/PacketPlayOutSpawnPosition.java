package com.cloutteam.jarcraftinator.protocol.packet;

import com.cloutteam.jarcraftinator.utils.VarData;

import java.io.DataOutputStream;
import java.io.IOException;

public class PacketPlayOutSpawnPosition extends PacketOut {

    private int x;
    private int y;
    private int z;

    public PacketPlayOutSpawnPosition(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public void send(DataOutputStream out) throws IOException {
        byte[] packetId = VarData.getVarInt(MinecraftPacket.PLAY.SPAWN_POSITION.out);
        VarData.writeVarInt(out, packetId.length + 4);
        out.write(packetId);
        VarData.writePosition(out, 0, 0, 0);
        out.flush();
    }
}
