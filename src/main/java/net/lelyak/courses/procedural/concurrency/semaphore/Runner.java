package net.lelyak.courses.procedural.concurrency.semaphore;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>() {
            {
                this.add(new AudioChannel(111));
                this.add(new AudioChannel(222));
                this.add(new AudioChannel(333));
                this.add(new AudioChannel(999));
                this.add(new AudioChannel(555));
            }
        };

        ChannelPool<AudioChannel> pool = new ChannelPool<>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}
