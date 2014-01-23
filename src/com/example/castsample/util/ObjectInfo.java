package com.example.castsample.util;

import com.google.cast.ApplicationSession;
import com.google.cast.MediaProtocolCommand;

import java.io.IOException;

/**
 * An utility class to provide debug information on object that does not support "toString" method.
 */
public final class ObjectInfo {
    // Util class
    private ObjectInfo() {
    }

    /**
     * String representation of {@link com.google.cast.MediaProtocolCommand}.
     * 
     * @param protocolCommand Media protocol command object.
     * @return To string representation of object.
     */
    public static String toString(final MediaProtocolCommand protocolCommand) {
        if (protocolCommand == null) {
            return "";
        }
        return String.format("MediaProtocolCommand[Type=%s, ErrorCode=%d, ErrorDomain=%s, ErrorInfo=%s]",
                protocolCommand.getType(), protocolCommand.getErrorCode(), protocolCommand.getErrorDomain(),
                protocolCommand.getErrorInfo());
    }

    /**
     * String representation of {@link com.google.cast.ApplicationSession}.
     * @param session Session instance.
     * @return To string representation of object.
     */
    public static String toString(final ApplicationSession session) {
        if (session == null) {
            return "";
        }
        try {
            return String
                    .format("ApplicationSession[Url=%s, Channel=%s, MetaData=%s, Options=%d, Device=%s, Resumable?=%b, Starting?=%b]",
                            session.getApplicationInstanceUrl(), session.getChannel(),
                            session.getApplicationMetadata(), session.getApplicationOptions(), session.getDevice(),
                            session.isResumable(), session.isStarting());
        } catch (IOException e) {
            return "ApplicationSession[Found Exception]";
        }
    }

}
