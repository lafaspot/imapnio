package com.yahoo.imapnio.async.request;

import javax.annotation.Nonnull;

import com.sun.mail.imap.protocol.MessageSet;
import com.yahoo.imapnio.async.data.MessageNumberSet;

/**
 * This class defines imap copy command from client.
 */
public class CopyMessageCommand extends AbstractMessageActionCommand {

    /** Command name. */
    private static final String COPY = "COPY";

    /**
     * Initializes a @{code CopyMessageCommand} with the message sequence syntax.
     *
     * @param msgsets the set of message set
     * @param targetFolder the targetFolder to be stored
     */
    public CopyMessageCommand(@Nonnull final MessageSet[] msgsets, @Nonnull final String targetFolder) {
        super(COPY, false, msgsets, targetFolder);
    }

    /**
     * Initializes a @{code CopyMessageCommand} with the @{code MessageNumberSet} array.
     *
     * @param msgsets the set of @{code MessageNumberSet}
     * @param targetFolder the targetFolder to be stored
     */
    public CopyMessageCommand(@Nonnull final MessageNumberSet[] msgsets, @Nonnull final String targetFolder) {
        super(COPY, false, msgsets, targetFolder);
    }

    @Override
    public ImapCommandType getCommandType() {
        return ImapCommandType.COPY_MESSAGE;
    }
}
