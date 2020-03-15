package org.jabref.model.entry;

/**
 * IDs are at least 8 digit long. The lowest ID is 00000000, the next would be 00000001.
 * <p/>
 * The generator is thread safe!
 */
public class BibEntryId {

    private String id;

    public BibEntryId(String id) {
        if (id.length() >= 8) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be at least 8 digits long");
        }
    }

    public BibEntryId() {
        this(IdGenerator.next());
    }

    public String getId() {return this.id;}
}
