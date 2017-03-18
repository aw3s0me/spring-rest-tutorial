package de.akorovin.tuts.hello;

/**
 * Created by korovin on 3/18/2017.
 * Modeling JSON representation:
 * {
 *   "id": 1,
 *   "content": "Hello, World!"
 * }
 */
public class Greeting {
    private final long id;
    // textual representation
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
