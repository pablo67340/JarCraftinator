package com.cloutteam.jarcraftinator.entity.player;

import com.cloutteam.jarcraftinator.JARCraftinator;
import com.cloutteam.jarcraftinator.protocol.packet.PacketPlayOutKeepAlive;

import java.util.TimerTask;

class PlayerKeepAlive extends TimerTask {

    private PlayerConnection connection;

    public PlayerKeepAlive(PlayerConnection connection){
        this.connection = connection;

        // 50ms = 1 tick
        JARCraftinator.getTimer().schedule(this, 0, 50);
    }

    public void run(){
        // Obviously we don't want to bother
        // sending KeepAlive packets to a connected client.
        if(!connection.isLoggedIn()){
            cancel();
        }

        new PacketPlayOutKeepAlive().send(connection.getOut());
    }

}
