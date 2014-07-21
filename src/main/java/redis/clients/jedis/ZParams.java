package redis.clients.jedis;

import static redis.clients.jedis.Protocol.Keyword.AGGREGATE;
import static redis.clients.jedis.Protocol.Keyword.WEIGHTS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import redis.clients.util.SafeEncoder;

public final class ZParams {
    public enum Aggregate {
        SUM, MIN, MAX;

        public final byte[] raw;

        Aggregate() {
            raw = SafeEncoder.encode(name());
        }
    }

    private final List<byte[]> params = new ArrayList<>();

    public ZParams weights(final int... weights) {
        params.add(WEIGHTS.raw);
        for (final int weight : weights) {
            params.add(Protocol.toByteArray(weight));
        }

        return this;
    }

    public Collection<byte[]> getParams() {
        return Collections.unmodifiableCollection(params);
    }

    public ZParams aggregate(final Aggregate aggregate) {
        params.add(AGGREGATE.raw);
        params.add(aggregate.raw);
        return this;
    }
}
