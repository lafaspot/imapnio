package com.yahoo.imapnio.async.internal;

import com.yahoo.imapnio.async.request.AbstractNoArgsCommand;
import com.yahoo.imapnio.async.request.ImapCommandType;

/**
 * This class defines imap Compress request from client.
 * 
 * @see "RFC 4978"
 */
final class CompressCommand extends AbstractNoArgsCommand {

    /** Command name. */
    private static final String COMPRESS_DEFLATE = "COMPRESS DEFLATE";

    /**
     * Initializes the @{code CompressCommand}. Constructor is only visible to this package so it can only be called by @{code ImapAsyncSessionImpl}.
     * 
     * @see "RFC 4978"
     */
    CompressCommand() {
        super(COMPRESS_DEFLATE);
    }

    @Override
    public ImapCommandType getCommandType() {
        return ImapCommandType.COMPRESS;
    }
}
