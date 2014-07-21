package redis.clients.jedis.exceptions;

public final class JedisClusterMaxRedirectionsException extends JedisDataException {
    private static final long serialVersionUID = 3878126572474819403L;

    public JedisClusterMaxRedirectionsException(Throwable cause) {
        super(cause);
    }

    public JedisClusterMaxRedirectionsException(String message, Throwable cause) {
        super(message, cause);
    }

    public JedisClusterMaxRedirectionsException(String message) {
        super(message);
    }
}
