// 
// Decompiled by Procyon v0.5.36
// 

package vip.radium.event.impl.packet;

import net.minecraft.network.Packet;
import vip.radium.event.CancellableEvent;

public final class PacketSendEvent extends CancellableEvent
{
    private Packet<?> packet;
    
    public PacketSendEvent(final Packet<?> packet) {
        this.packet = packet;
    }
    
    public Packet<?> getPacket() {
        return this.packet;
    }
    
    public void setPacket(final Packet<?> packet) {
        this.packet = packet;
    }
}
